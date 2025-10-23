package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;



public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> displayAll();

	boolean removeById(int id);

	List<Employee> sortById();

	List<Employee> findByName(String nm);

	void writeToFile(String string);


}
