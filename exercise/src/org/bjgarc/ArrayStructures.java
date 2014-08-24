package org.bjgarc;


public class ArrayStructures {

	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	public static void main(String[] args) {
		ArrayStructures arrays = new ArrayStructures();
		arrays.generateRandomArray();
		//arrays.printArray();
		//arrays.deleteAtIndex(6);
		//arrays.printArray();
		//arrays.linearSearch(11);
		//arrays.addValue(77);
		arrays.binarySearch(11);
		//arrays.bSearch(11);
		arrays.printArray();
		//arrays.bubbleSort();
		//arrays.printArray();
		//System.out.println(arrays.isValueInArray(11));
	}
	
	public int[] generateRandomArray() {
		//theArray[0] = 11;
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) ((Math.random()*9) + 10);
		}
		return theArray;
	}
	
	public boolean isValueInArray(int value) {
		boolean valueInArray = false;
		
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				i = arraySize;
			}
		}
		return valueInArray;
	}

	public void printArray() {
		for(int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("__________");
		}
	}
	
	public void addValue(int value) {
		theArray[arraySize++] = value;
	}
	
	public void deleteAtIndex(int index) {
		if(index < arraySize) {
			for (int i = index; i < arraySize; i++) {
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
	}
	
	public void linearSearch(int value) { 
		boolean valueFound = false;
		String indexFoundAt = "";
		System.out.print("Found valuse at indexes: ");
		for (int i=0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueFound = true;
				indexFoundAt += i + " ";
			}
		}
		if(!valueFound) {
			indexFoundAt = "NONE";
		} 
		System.out.println(indexFoundAt);
		
	}
	
    // The Binary Search is quicker than the linear search
    // because all the values are sorted. Because everything
    // is sorted once you get to a number larger than what
	// you are looking for you can stop the search. Also
    // you be able to start searching from the middle
    // which speeds the search. It also works best when
    // there are no duplicates
	// See more at: http://www.newthinktank.com/2013/02/java-algorithms/#sthash.nErwZmiP.dpuf
	public void binarySearch(int value) {
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		//Arrays.sort(theArray);
		while( lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
			else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
			else {
				System.out.println("Found a match for " + value + " at index " + middleIndex);
				lowIndex = highIndex+1;
			}
		}
	}
	
	public void bSearch(int value) {
		int lowValue = 0;
		int highValue = arraySize - 1;
		
		while (lowValue <= highValue) {
			int middleValue = (lowValue + highValue) / 2;
			if (theArray[middleValue] < value) lowValue = middleValue + 1;
			else if (theArray[middleValue] > value) highValue = middleValue - 1;
			else {
				System.out.println("Found a match for " + value + " at index " + middleValue);
				lowValue = highValue+1;
			}
		}
	}
	
	public void bubbleSort() {

		for(int i = arraySize -1; i > 1; i--) {  //loop through the array based on the size of the array
			for(int j = 1; j < arraySize; j++) { //check each element in the array for position
				if(theArray[j-1] < theArray[j]) {
					int temp = theArray[j-1];
					theArray[j-1] = theArray[j];
					theArray[j] = temp;
				}
			}
		}
	}
}
