package org.bjgarc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testManualSort() {
		Sorting.manualSort();
	}

	@Test
	public void testSortAlphabetically() {
		Sorting.sortAlphabetically();
	}

	@Test
	public void testSortArrayList() {
		Sorting.sortArrayList();
	}

	@Test
	public void testBubbleSort() {
		Sorting.bubbleSort();
	}

	@Test
	public void testSortChars() {
		Sorting.sortChars();
	}

	@Test
	public void testSortChars2() {
		Sorting.sortChars2();
	}

	@Test
	public void testExchangeSort() {
		Sorting.exchangeSort();
	}
	
	@Test
	public void testVectorSort() {
		Sorting.vectorSort();
	}

}
