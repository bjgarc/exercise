package org.bjgarc;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

public class WebStatsTest {

	WebStats stats;

	@Before
	public void setUp() throws Exception {
		stats = new WebStats();
		
		for(int i=0; i < 200;i++) {
			stats.putSuccess();
			stats.putFailure();
		}
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		long current_minute = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis());
		System.out.println("Current hour: " + current_minute);
		
		/*
		long success_num = stats.getSuccessesForLastMinute();
		long fail_num = stats.getFailuresForLastMinute();
		System.out.println(success_num);
		System.out.println(fail_num);
		*/
		//sleeping for a little over a minute
		try {
			Thread.sleep(1000*61);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		/*
		System.out.println(stats.getSuccessesForLastMinute());
		System.out.println(stats.getFailuresForLastMinute());
		*/
		System.out.println("Current hour: " + TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()));
	}

}
