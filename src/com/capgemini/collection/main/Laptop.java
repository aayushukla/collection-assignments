package com.capgemini.collection.main;


import java.util.Iterator;
import java.lang.Comparable;

public class Laptop implements Comparable<Laptop> { 
	private String laptopCompany;
	private int laptopModel;
	private String laptopOs;
	private String laptopProcessor;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String laptopCompany, int laptopModel, String laptopOs, String laptopProcessor) {
		super();
		this.laptopCompany = laptopCompany;
		this.laptopModel = laptopModel;
		this.laptopOs = laptopOs;
		this.laptopProcessor = laptopProcessor;
	}
	public String getLaptopCompany() {
		return laptopCompany;
	}
	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}
	public int getLaptopModel() {
		return laptopModel;
	}
	public void setLaptopModel(int laptopModel) {
		this.laptopModel = laptopModel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((laptopCompany == null) ? 0 : laptopCompany.hashCode());
		result = prime * result + laptopModel;
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
		Laptop other = (Laptop) obj;
		if (laptopCompany == null) {
			if (other.laptopCompany != null)
				return false;
		} else if (!laptopCompany.equals(other.laptopCompany))
			return false;
		if (laptopModel != other.laptopModel)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Laptop obj)
	{
		if(this.laptopCompany==obj.laptopCompany && this.laptopModel==obj.laptopModel)
		{
			return 0;
		}
		else
			return 1;
	}


}
