package com.demo.beans;

import java.io.Serializable;

import com.demo.exception.LowAttendanceException;

public class Student implements Serializable, Comparable<Student> {
	 private int rollno;
	    private String sname;
	    private String course;
	    private double attendance_percentage;
	    private double score;
		public Student() {
			super();
		}
		public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
			super();
			this.rollno = rollno;
			this.sname = sname;
			this.course = course;
			this.attendance_percentage = attendance_percentage;
			this.score = score;
		}
		 // Method to calculate grade
	    public String calculateGrade() throws LowAttendanceException {
	        if (attendance_percentage < 60) {
	            throw new LowAttendanceException("Attendance below 60%. Not eligible for grading!");
	        }

	        if (score >= 90)
	            return "A+";
	        else if (score >= 80)
	            return "A";
	        else if (score >= 70)
	            return "B";
	        else if (score >= 60)
	            return "C";
	        else
	            return "D";
	    }

	    public int getRollno() {
	        return rollno;
	    }

	    public double getAttendance_percentage() {
	        return attendance_percentage;
	    }
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", attendance_percentage="
					+ attendance_percentage + ", score=" + score + "]";
		}
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return Double.compare(o.attendance_percentage, this.attendance_percentage);
	    }
		
	    

}
