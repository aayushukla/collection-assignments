package com.capgemini.collections.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.main.Car;
import com.capgemini.collection.main.Television;

public class TelevisionTest {
	
	Television t1;
	Television t2;
	Television t3;
	Television t4;
	
	@Before
	public void setUp()
	{
		t1=new Television("LG","LED",true,10000);
		t2=new Television("LG","LED",false,6000);
		t3=new Television("Toshiba","LCD",true,10000);
		t4=new Television("samsung","Plasma",true,2000);
		
	}
	
	@Test
	public void testForOrderInputUsingArrayList()
	{
		ArrayList<Television> tv=new ArrayList<>();
		tv.add(t1);
		tv.add(t2);
		tv.add(t3);
		tv.add(t4);
		
		Iterator<Television> iterator= tv.iterator();
		assertEquals(t1, iterator.next());
		assertEquals(t3, iterator.next());
		assertEquals(t4, iterator.next());
	}

}
