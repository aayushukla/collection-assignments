package com.capgemini.collection.main;

public class Student {

	private String name;
	private int rollNo;
	private String fruit;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruit == null) ? 0 : fruit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fruit == null) {
			if (other.fruit != null)
				return false;
		} else if (!fruit.equals(other.fruit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	public Student(String name, int rollNo, String branch) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.fruit = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String branch) {
		this.fruit = branch;
	}
	
	
	

}
