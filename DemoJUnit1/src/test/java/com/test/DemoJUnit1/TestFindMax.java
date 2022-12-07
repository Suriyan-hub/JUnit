package com.test.DemoJUnit1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFindMax {

	int a[]= {1,2,3,4,5};
	int a1[]= {-10,-3,-2,-6};
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before");
	}
	
	@Test
	public void testMax() {
		System.out.println("test case find max");  
		assertEquals(5, Calculation.calMax(a));
		assertEquals(-2, Calculation.calMax(a1));
	}
	
	@Test
	public void testSqr() {
		System.out.println("test case find Square");  
		assertEquals(25, Calculation.square(5));
	}
	
	@After
	public void finishDown() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void finishDownClass() {
		System.out.println("after Class");
	}
}
