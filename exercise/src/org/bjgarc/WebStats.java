package org.bjgarc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebStats {

	private Map<Long, Long> successStats = new HashMap<Long, Long>();
	private Map<Long, Long> failStats = new HashMap<Long, Long>();
	public static final boolean SUCCESS = true;
	public static final boolean FAILURE = false;
	
	public WebStats() {
		
	}
	
	public void putSuccess() {
		long current_time = System.currentTimeMillis();
		long current_second = current_time/1000;
		
		if (successStats.containsKey(current_second)) {
			successStats.put(Long.valueOf(current_second), Long.valueOf( successStats.get(current_second)+1 ));
		} else {
			successStats.put(Long.valueOf(current_second), Long.valueOf(1));
		}
		
		prune();
		
	}
	
	public void putFailure() {
		long current_time = System.currentTimeMillis();
		long current_second = current_time/1000;
		
		if (failStats.containsKey(current_second)) {
			failStats.put(Long.valueOf(current_second), Long.valueOf( failStats.get(current_second)+1 ));
		} else {
			failStats.put(Long.valueOf(current_second), Long.valueOf(1));
		}
		
		prune();
	}
	
	public long getSuccessesForLastMinute() {
		long current_second = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());

		if(successStats.containsKey(current_second)) {
			long stats = successStats.get(current_second);
			return stats;
		} else {
			return 0;
		}
		
	}
	
	public long getFailuresForLastMinute() {
		long current_second = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		if(failStats.containsKey(current_second)) {
			long stats = failStats.get(current_second);
			return stats;
		} else {
			return 0;
		}
	}
	
	public long getSuccessesForLastHour() {
		long current_minute = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis());		
		return successStats.get(failStats.get(current_minute));
		
	}
	
	public long getFailuresForLastHour() {
		long current_hour = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis());	
		
		return successStats.get(failStats.get(current_hour));
		
	}
	
	private void prune() {
		//prune the stats to only hold the last hour
		long current_hour = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis());
		
		for (int i=1; i < successStats.size(); i++) {
			successStats.remove(current_hour - i);
		}
		for (int i=1; i < failStats.size(); i++) {
			failStats.remove(current_hour - i);
		}
	}
	
	
}
