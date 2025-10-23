package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;



public class EmployeeServiceImpl implements EmployeeService {
		private EmployeeDao edao;
		
		public EmployeeServiceImpl() {
			super();
			edao= new EmployeeDaoImpl();
		}

		@Override
		public boolean addNewEmployee() {
			Scanner sc=new Scanner(System.in);
			 System.out.print("Enter Employee ID: ");
		        int id = sc.nextInt();
		        sc.nextLine();
		        System.out.print("Enter Employee Name: ");
		        String name = sc.nextLine();
		        System.out.print("Enter Employee Role (leave blank for default): ");
		        String role = sc.nextLine();
		        Employee e = role.isEmpty() ? new Employee(id, name) : new Employee(id, name, role);
			return edao.save(e);
		}

		@Override
		public List<Employee> displayAll() {
			
			return edao.displayAll();
		}

		@Override
		public boolean deleteById(int id) {
			
			return edao.removeById(id);
		}

		@Override
		public List<Employee> sortById() {
			
			return edao.sortById();
		}

		@Override
		public List<Employee> searchByName(String nm) {
			
			return edao.findByName(nm);
		}

		@Override
		public void saveToFile(String string) {
			edao.writeToFile(string);
			
		}

		


		
		

}
