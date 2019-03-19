package com.capgemini.collection.main;

import java.lang.Comparable;

public class Car implements Comparable<Car> {
	
	private String make;
	private String model;
	private int year;
	private double price;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Car obj)
	{
		if(this.make==obj.make && this.model==obj.model)
		{
			return 0;
		}
		else
			return 1;
	}

}
