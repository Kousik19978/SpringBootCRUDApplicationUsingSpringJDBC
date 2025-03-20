package com.Springjdbc.entity;



public class Student {

	private String name;
	private int cls;
	private int roll;
	
	public Student() {
		super();
	}
	public Student(String name, int cls, int roll) {
		super();
		this.name = name;
		this.cls = cls;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", cls=" + cls + ", roll=" + roll + "]";
	}
	
}
