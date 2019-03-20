package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import com.capgemini.collection.main.Cellphone;

public class CellphoneTest {

	Cellphone apple;
	Cellphone samsung;
	Cellphone oneplus;
	Cellphone oneplus1;

	@Before
	public void setUp() {
		apple = new Cellphone("apple", "6s", "one", "ios", 45000);
		samsung = new Cellphone("samsung", "s10", "two", "android", 55000);
		oneplus = new Cellphone("oneplus", "6", "three", "android", 35000);
		oneplus1 = new Cellphone("oneplus", "6", "four", "android", 31000);
	}
	
	@Test
	public void testForOrderInputUsingArrayList()
	{
		ArrayList<Cellphone> c=new ArrayList<>();
		c.add(apple);
		c.add(samsung);
		c.add(oneplus);
		c.add(oneplus1);
		
		Iterator<Cellphone> iterator= c.iterator();
		assertEquals(apple, iterator.next());
		assertEquals(samsung, iterator.next());
		assertEquals(oneplus, iterator.next());
	}

}
