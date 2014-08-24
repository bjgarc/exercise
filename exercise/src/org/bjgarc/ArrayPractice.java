package org.bjgarc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class ArrayPractice {
    public static void main( String[] args )
    {
    	ArrayPractice app = new ArrayPractice();
    	
    	//app.sortChars2();
    	//app.exchangeSort();
    	//app.sortAlphabetically();
    	//app.sortArrayList();
    	//app.bubbleSort();
    	
    	manualSort();
    }
    
    public static void manualSort() {
    	String[] chars = new String[] {"B", "A", "B", "C", "C", "A", "M"};
    	String temp = null;
    	for (int i=0; i < chars.length; i++) {
    		for (int j=0; j < chars.length; j++) {
    			if (chars[i].compareToIgnoreCase( chars[j]) < 0) {
    				temp = chars[i];
    				chars[i] = chars[j];
    				chars[j] = temp;
    			}
    		}
    	}
    	String last = "EMPTY";
    	for (String s : chars) {
    		if (!last.equals(s)) System.out.println(s);
    		last = s;
    	}
    }
    
    public void sortAlphabetically() {
    	String[] chars = new String[] {"B", "A", "B", "C", "C", "A", "D"};
    	Arrays.sort(chars);  	
    	for(String temp: chars) {
    		System.out.println("char: " + temp);
    	}
    }
    
    public void sortArrayList() {
    	List<String> chars = new ArrayList<String>();
    	chars.add("B");
    	chars.add("A");
    	chars.add("B");
    	chars.add("C");
    	chars.add("C");
    	chars.add("A");
    	chars.add("D");
    	
    	Collections.sort(chars);
    	for (String temp : chars) {
    		System.out.println("chars: " + temp);
    	}
    	
    }
    
	public void bubbleSort() {

		int[] num = {1,5,7,3,8,4,5}; 
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable
		int passNum = 0;
		
		System.out.println("Entering while loop...");
		System.out.println("Flag value: " + flag);

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			passNum++;
			System.out.println("\npass: " + passNum);
			System.out.println(">> Flag value: " + flag);
			for (j = 0; j < num.length - 1; j++) {
				
				if (num[j] < num[j + 1]) // change to > for ascending sort
				{
					System.out.println("swapping elements:" + j + (j+1));
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
					System.out.println(">>>> Flag value: " + flag);
				}
			}
			for (int i : num) {
				System.out.print(Integer.toString(i) + ",");
			}
		}
		System.out.println("\n>>>>>> Flag value: " + flag);

	}
	
	/* 
	 * Use a hashmap for deplucation and an array for sort
	 */
	public void sortChars() {
    	String[] charsStrings = new String[] {"B", "A", "D", "D", "X", "A", "D", "R", "T", "V", "S", "W", "X", "R"};
    	HashMap<Integer, String> hash = new HashMap<Integer, String>();
    	int i = 1;
    	for (String t : charsStrings) {
    		if (!hash.containsValue(t)) { 
    			hash.put(i, t);
    			i++;
    		}
    	}
	
    	System.out.println("Hash size: " + hash.size());
    	Vector<String> vector = new Vector<String>();
    	for (int x = 0; x < hash.size(); x++) {
    		System.out.println("Hash object: " + (x+1) + " Iterator: " + x);
    		vector.add(hash.get(x+1));
    	}
    	
    	Object[] charArrayStrings = vector.toArray();
    	for (Object object : charArrayStrings) {
    		System.out.println("UnSorted: " + (String) object);
    	}
    	Arrays.sort(charArrayStrings);
    	for (Object object : charArrayStrings) {
    		System.out.println("Sorted: " + (String) object);
    	}
    	
	}
	
	/* 
	 * Uses a vector to dedupe and sort - much more susinct and optimized
	 */
	public void sortChars2() {
    	String[] charsStrings = new String[] {"B", "A", "D", "D", "X", "A", "D", "R", "T", "V", "S", "W", "X", "R"};
    	
    	Vector<String> vec = new Vector<String>();
    	for (String t : charsStrings) {
    		if(!vec.contains(t)) {
    			vec.add(t);
    		}
    	}
    	Object[] cArr = vec.toArray();
    	for (Object object : cArr) {
    		System.out.println("Vector sort: " + (String) object);
    	}
    	
    	Arrays.sort(cArr);
    	
    	for (Object object : cArr) {
    		System.out.println("Sorted: " + (String) object);
    	}   	
	}
	
	public void exchangeSort() {
    	String[] arr = new String[] {"B", "A", "D", "D", "X", "A", "D", "R", "T", "V", "S", "W", "X", "R"};
		String temp;
		
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) < 0) { // use > for ascending order
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp; 
				}
			}
		}
		for (String t : arr) {
			System.out.println(t);
		}
		//return arr;
	}
}
