package com.rakesh.comparatorImplLambda;

public class Employee {
	
	String EmpName;
	String email;
	double salary;
	
	
	public Employee(String empName, String email, double salary) {
		super();
		EmpName = empName;
		this.email = email;
		this.salary = salary;
	}
	public String getEmpName() {
		return EmpName;
	}
	public String getEmail() {
		return email;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
	

}
