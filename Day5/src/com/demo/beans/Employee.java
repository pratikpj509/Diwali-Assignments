package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable{
	 private int empID;
	    private String empName;
	    private String empRole;
		public Employee() {
			super();
			 this.empID = 0;
		     this.empName = "Unknown";
		     this.empRole = "Not Assigned";
		}
		public Employee(int empID, String empName) {
			super();
			this.empID = empID;
			this.empName = empName;
			this.empRole="staff";
		}
		
		public Employee(int empID, String empName, String empRole) {
			super();
			this.empID = empID;
			this.empName = empName;
			this.empRole = empRole;
		}
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpRole() {
			return empRole;
		}
		public void setEmpRole(String empRole) {
			this.empRole = empRole;
		}
		@Override
		public String toString() {
			return "Employee [empID=" + empID + ", empName=" + empName + ", empRole=" + empRole + "]";
		}
	    
	
	

}  
