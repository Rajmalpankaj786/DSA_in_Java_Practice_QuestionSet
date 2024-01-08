package com.DSA.StreamAPI;

public class Student {
	private int id;
	private String name;
	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}

	public Student() {
		super();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", state=" + state + "]";
	}

}
