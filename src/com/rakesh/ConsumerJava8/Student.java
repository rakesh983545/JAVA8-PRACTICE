package com.rakesh.ConsumerJava8;

public class Student {
	
	private String StudentName;
	private String marks;
	

	public Student(String studentName, String marks) {
		super();
		StudentName = studentName;
		this.marks = marks;
	}
	public String getStudentName() {
		return StudentName;
	}
	public String getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
