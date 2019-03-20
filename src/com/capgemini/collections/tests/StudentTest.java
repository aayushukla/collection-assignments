package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import com.capgemini.collection.main.Student;

public class StudentTest {

	Student studentOne;
	Student studentTwo;
	Student studentThree;
	@Before
	public void setUp()
	{
		studentOne=new Student("Allen",12,"apple");
		studentTwo=new Student("Brian",34,"orange");
		studentThree=new Student("Richard",44,"kiwi");
	}
	
	@Test
	public void testForIteratingAndPrinting()
	{
		ArrayList<Student> s=new ArrayList<>();
		s.add(studentOne);
		s.add(studentTwo);
		s.add(studentThree);
		
		Iterator<Student> iterator= s.iterator();
		assertEquals(studentOne, iterator.next());
		assertEquals(studentTwo, iterator.next());
		assertEquals(studentThree, iterator.next());
	}
	
	@Test
	public void testForFavFruitUsingMap()
	{
		HashMap<String, String> map = new HashMap<>();
		
		map.put(studentOne.getName(), studentOne.getFruit());
		map.put(studentTwo.getName(), studentTwo.getFruit());
		map.put(studentThree.getName(), studentThree.getFruit());
		
		assertEquals("apple", map.get(studentOne.getName()));
		assertEquals("orange", map.get(studentTwo.getName()));
		assertEquals("kiwi", map.get(studentThree.getName()));
		
		assertTrue(map.keySet().contains(studentOne.getName()));
		assertTrue(map.keySet().contains(studentTwo.getName()));
		assertTrue(map.keySet().contains(studentThree.getName()));
		
		assertTrue(map.values().contains(studentOne.getFruit()));
		assertTrue(map.values().contains(studentTwo.getFruit()));
		assertTrue(map.values().contains(studentThree.getFruit()));
		
		
	}

}
