package org.bjgarc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayPracticeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testManualSort() {
		ArrayPractice.manualSort();
	}

	@Test
	public void testSortAlphabetically() {
		ArrayPractice.sortAlphabetically();
	}

	@Test
	public void testSortArrayList() {
		ArrayPractice.sortArrayList();
	}

	@Test
	public void testBubbleSort() {
		ArrayPractice.bubbleSort();
	}

	@Test
	public void testSortChars() {
		ArrayPractice.sortChars();
	}

	@Test
	public void testSortChars2() {
		ArrayPractice.sortChars2();
	}

	@Test
	public void testExchangeSort() {
		ArrayPractice.exchangeSort();
	}

}
