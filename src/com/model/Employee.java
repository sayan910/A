package com.model;

public class Employee {
	private String name;
	private float salary;
	private float netsalary;
	public Employee(String name, float salary, float netsalary) {
		super();
		this.name = name;
		this.salary = salary;
		this.netsalary = netsalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(float netsalary) {
		this.netsalary = netsalary;
	}
	
	

}
