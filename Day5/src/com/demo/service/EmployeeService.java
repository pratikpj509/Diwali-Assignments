package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	boolean deleteById(int id);

	List<Employee> sortById();

	List<Employee> searchByName(String nm);

	void saveToFile(String string);

	

	

}
