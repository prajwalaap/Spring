package com.DIusingconstructor;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	

}
