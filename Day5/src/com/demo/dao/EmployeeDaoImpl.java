package com.demo.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;



public class EmployeeDaoImpl  implements EmployeeDao {
		static List<Employee> elist;
		
		static{
			elist=new ArrayList<>();
			elist.add(new Employee(100, "Pratik","software"));
			elist.add(new Employee(101, "Priya", "Tester"));
			
		}

		@Override
		public boolean save(Employee e) {
			
			return elist.add(e);
		}

		@Override
		public List<Employee> displayAll() {
			
			return elist;
		}

		@Override
		public boolean removeById(int id) {
			
			boolean result=elist.removeIf(emp->emp.getEmpID()==id);
			return result;
		}

		@Override
		public List<Employee> sortById() {
			List<Employee> temp= new ArrayList<>();
			for(Employee e: elist) {
				temp.add(e);
			}
			Comparator<Employee> c = (o1,o2)->{
				return o1.getEmpID()-o2.getEmpID();
			};
			temp.sort(c);
			return temp;
		}

		@Override
		public List<Employee> findByName(String nm) {
			List<Employee> temp=elist.stream()
											 .filter(emp->emp.getEmpName().equals(nm))
											 .collect(Collectors.toList());
			return temp;
		}

		@Override
		public void writeToFile(String string) {
			try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(string))){
				for(Employee e:elist) {
					oos.writeObject(e);
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}
		
		
}
