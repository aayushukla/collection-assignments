package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.main.Car;



public class CarTest {

	Car bmw;
	Car honda;
	Car tesla;
	Car tesla1;
	@Before
	public void setUp()
	{
		bmw=new Car("bmw","GT",2019,2000000);
		honda=new Car("honda","city",2016,600000);
		tesla=new Car("tesla","s",2019,8000000);
		tesla1=new Car("tesla","s",2019,8000000);
	}
	
	@Test
	public void testForEquality()
	{
		assertEquals(0,tesla1.getMake().compareTo(tesla.getMake()));
	}
	
	@Test
	public void testForOrderInputUsingArrayList()
	{
		ArrayList<Car> cars=new ArrayList<>();
		cars.add(bmw);
		cars.add(honda);
		cars.add(tesla);
		cars.add(tesla1);
		
		Iterator<Car> iterator= cars.iterator();
		assertEquals(bmw, iterator.next());
		assertEquals(honda, iterator.next());
		assertEquals(tesla, iterator.next());
	}
	
	
	@Test
	public void testForNumberOfElementsUsingHashSet()
	{
		HashSet<Car> cars=new HashSet<>();
		cars.add(tesla);
		cars.add(tesla1);
		cars.add(honda);
		cars.add(bmw);
		assertEquals(3, cars.size());
	}

}
