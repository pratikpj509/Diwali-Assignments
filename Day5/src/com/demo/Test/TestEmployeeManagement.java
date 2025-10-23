package com.demo.Test;



import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


public class TestEmployeeManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice= new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. Add Employee");
			 System.out.println("2. Show All Employees");
            System.out.println("3. Remove Employee"); 
            System.out.println("4. Show Sorted Employees");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("Added Successfully");
				}else {
					System.out.println("Not Found");
				}
				
			}
			case 2->{
				List<Employee> elist= eservice.displayAll();
				elist.forEach(System.out::println);
				
			}
			case 3->{
				System.out.println("enter Employee Id to delete Employee Data : ");
				int id=sc.nextInt();
				boolean status=eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
			}
			case 4->{
				List<Employee> elist=eservice.sortById();
				elist.forEach(System.out::println);
			}
			case 5->{
				System.out.println("Enter Employee Name to search : ");
				String nm=sc.next();
				List<Employee> slist= eservice.searchByName(nm);
				if(slist!=null) {
					slist.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
				
			}
			case 6->{
				
				eservice.saveToFile("EmployeeData.txt");
				System.out.println("Saved All Employee Data in File ");
				
				
			}
			case 7->{
				sc.close();
				System.out.println("Thank you for visiting......");
				
			}
			
			default->{
				System.out.println("Wrong choice ");
			}

		}
			
		}while(choice!=7);
		
	}

}
