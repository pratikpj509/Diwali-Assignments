package com.demo.test;

import java.io.*;
import java.util.*;
import com.demo.beans.Student;
import com.demo.exception.LowAttendanceException;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> slist = new ArrayList<>();

        // Creating 10 student objects
        slist.add(new Student(1, "Pratik", "IT", 85, 92));
        slist.add(new Student(2, "Priya", "CS", 75, 80));
        slist.add(new Student(3, "Priyalll", "ENTC", 59, 88));  // < 60% attendance
        slist.add(new Student(4, "Prakash", "IT", 90, 95));
        slist.add(new Student(5, "Amit", "CS", 70, 72));
        slist.add(new Student(6, "Prema", "IT", 95, 99));
        slist.add(new Student(7, "Arjun", "MECH", 65, 67));
        slist.add(new Student(8, "Tina", "CS", 78, 85));
        slist.add(new Student(9, "Riya", "CIVIL", 82, 91));
        slist.add(new Student(10, "Dev", "ENTC", 50, 76));  // < 60% attendance

        // Serializing students to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            for (Student s : slist) {
                oos.writeObject(s);
            }
            System.out.println(" Students serialized successfully to students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
     // --- DESERIALIZATION ---
        List<Student> loadedList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.txt"))) {
            while (true) { // keep reading until EOF
                try {
                    Student s = (Student) ois.readObject();
                    loadedList.add(s);
                } catch (EOFException e) {
                    break; // end of file reached
                }
            }
            System.out.println("\n Students deserialized successfully from students.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Sort students in decreasing order of attendance
        //It calls the compareTo method in student class
        //first we have to implements Comparable<Student>
        // Sort students in decreasing order of attendance
        Collections.sort(loadedList);
        System.out.println("\n Students sorted by attendance (descending):");
        for (Student s : loadedList) {
            System.out.println(s);
        }

        // Test grade calculation with exception handling
        System.out.println("\n Grade Calculation:");
        for (Student s : loadedList) {
            try {
                String grade = s.calculateGrade();
                System.out.println(s.getRollno() + " -> Grade: " + grade);
            } catch (LowAttendanceException e) {
                System.out.println(s.getRollno() + " -> " + e.getMessage());
            }
        }
        
    }
}
