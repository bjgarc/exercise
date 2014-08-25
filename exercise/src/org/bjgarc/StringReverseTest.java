package org.bjgarc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFirstReverse() {
		assertEquals("coderbyte string must reverse to etybredoc", "etybredoc", StringReverse.firstReverse("coderbyte"));
	}

	@Test
	public void testFirstReverseManual() {
		assertEquals("coderbyte string must reverse to etybredoc", "etybredoc", StringReverse.firstReverseManual("coderbyte"));
	}

}
