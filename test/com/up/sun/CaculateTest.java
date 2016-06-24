package com.up.sun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int a = 10;
		int b = 10;
		
		int expResult = 20;
		Caculate instance = new Caculate();
		assertEquals(expResult, instance.add(a, b));
	}

}
