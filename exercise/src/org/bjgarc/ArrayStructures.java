package org.bjgarc;

public class ArrayStructures {

	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	public static void main(String[] args) {
		ArrayStructures arrays = new ArrayStructures();
		arrays.generateRandomArray();
		arrays.printArray();
		arrays.linearSearch(18);
	}
	
	public void generateRandomArray() {
		for (int i=0; i < arraySize; i++) {
			theArray[i] = (int) ((Math.random()*9) + 10);
		}
	}
	
	public void printArray() {
		for (int i=0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}
	
	public void linearSearch(int item) {
		
		boolean found = false;
		String locations = "";
		
		System.out.print("Item found at position: ");

		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == item) {
				found = true;
				locations += i + " ";
			}
		}
		if(!found) {
			System.out.println("NONE");
		} else {
			System.out.println(locations);
		}
	}
	

}
