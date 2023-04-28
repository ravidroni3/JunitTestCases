package com.spring.junit.junittestcases;

import com.spring.junit.junittestcases.calcs.Calculator;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class JunitTestcasesApplicationTests {

	@Test
	public void AssertEqualsEx(){
		String s = "Java";
		String s1 = "Java";
		assertEquals(s,s1);
	}

	@Test
	public void AssertArrayEqualsEx(){
		int [] a = {1,2,3,4,5};
		int [] b = {1, 2, 3, 4, 5};
		assertArrayEquals(a,b);
	}
	@Test
	public void AssertTrueEx() {
		assertTrue(30>10);
	}
	@Test
	public void AssertFalseEx(){
		assertFalse(20>35);
	}
	@Disabled
	@Test
	public void AssertNotEqualsEx(){
		Calculator calculator = new Calculator();
		int expected = 10;
		int actual = calculator.add(30,20);
		assertNotEquals(expected,actual);
	}

}
