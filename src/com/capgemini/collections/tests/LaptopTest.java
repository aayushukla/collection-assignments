package com.capgemini.collections.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.main.Laptop;

public class LaptopTest {
	Laptop dellLaptop;
	Laptop hpLaptop;
	Laptop acerLaptop;
	Laptop dellLaptop2;
	Laptop comparing;
	@Before
	public void setUp()
	{
		dellLaptop= new Laptop("dell",101,"ubuntu","intel");
		hpLaptop=new Laptop("hp",102,"windows","intel");
		acerLaptop=new Laptop("dell",1332,"elementary","kirin");
		dellLaptop2=new Laptop("dell",101,"windows","intel");
	}
	
	@Test
	public void testForNumberOfElementsUsingHashSet()
	{
		HashSet<Laptop> laptops=new HashSet<>();
		laptops.add(acerLaptop);
		laptops.add(hpLaptop);
		laptops.add(dellLaptop2);
		laptops.add(dellLaptop);
		assertEquals(3, laptops.size());
	}
	
	@Test(expected=java.lang.AssertionError.class)
	public void testForOrderInputUsingHashSet()
	{
		HashSet<Laptop> laptops=new HashSet<>();
		laptops.add(acerLaptop);
		laptops.add(hpLaptop);
		laptops.add(dellLaptop2);
		laptops.add(dellLaptop);
		
		Iterator<Laptop> iterator= laptops.iterator();
		assertEquals(acerLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(dellLaptop, iterator.next());
	}
	
	@Test
	public void testForOrderInputUsingArrayList()
	{
		ArrayList<Laptop> laptops=new ArrayList<>();
		laptops.add(acerLaptop);
		laptops.add(hpLaptop);
		laptops.add(dellLaptop2);
		laptops.add(dellLaptop);
		
		Iterator<Laptop> iterator= laptops.iterator();
		assertEquals(acerLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(dellLaptop, iterator.next());
	}
	
	@Test
	public void testForEqualityOfTwoObjects()
	{
		ArrayList<Laptop> laptops=new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(dellLaptop2);
		
		assertEquals(0,dellLaptop.compareTo(dellLaptop2));
	}
}
