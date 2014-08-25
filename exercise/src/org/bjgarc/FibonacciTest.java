package org.bjgarc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFibonacci() {
		assertEquals("Fibonacci sequence to 8 numbers must equal 21", 21, Fibonacci.fibonacci(8));
	}

	@Test
	public void testFibonacci2() {
		assertEquals("Fibonacci sequence to 8 numbers must equal 21", 21, Fibonacci.fibonacci2(8));
	}

	@Test
	public void testFactorial() {
		assertEquals("Factorial for 12 must equal 479001600", 479001600, Fibonacci.factorial(12));

	}

}
