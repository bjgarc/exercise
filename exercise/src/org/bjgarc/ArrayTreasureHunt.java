/*
 * In this problem you are to write a program to 
 * explore the above array for a treasure. The values in the array are clues. 
 * Each cell contains an integer between 11 and 55; for each value the ten's 
 * digit represents the row number and the unit's digit represents the column
 * number of the cell containing the next clue. Starting in the upper left 
 * corner (at 1,1), use the clues to guide your search of the array. The 
 * treasure is a cell whose value is 
 * the same as its coordinates. Your program must first read in the treasure 
 * map data into a 5 by 5 array. Your program should output the cells it 
 * visits during its search, and a message indicating where you found the 
 * treasure.
 */

package org.bjgarc;

public class ArrayTreasureHunt {
	
	public static void main(String[] args) {

		int[][] theArrayMap = 
				{{34,21,32,41,25}, 
				{14,42,43,13,31},
				{54,45,52,42,23},
				{33,15,51,32,34},
				{21,52,33,13,23}};
		
		int[] current_coordinates = {1,1};
		int value = 0;
		
		for (int i =0; i < 100; i++) {
			// set the value to the number in the first cell 0,0
			int row = current_coordinates[0];
			int column = current_coordinates[1];
			System.out.println("current coordinates: " + row + "," + column);
			
			if (row > 0) row--;
			if (column > 0) column--;
			value = theArrayMap[ row ][ column ];
			System.out.println("value: " + value + " at " + row + "," + column);
			
			// split the number to get the column/row for the next cell
			int[] next_coordinate = getCoordinates(value);
			int next_row = next_coordinate[0];
			int next_column = next_coordinate[1];
			System.out.println("Next coordinates: " + next_coordinate[0] + "," + next_coordinate[1]);
			if (next_row > 0) {
				next_row--;
				System.out.println("Decremented next row: " + next_row);
			}
			if (next_column > 0) {
				next_column--;
				System.out.println("Decremented next column: " + next_column);
			}
			
			String x = Integer.toString(next_row);
			String y = Integer.toString(next_column);
			int next_value = theArrayMap[ next_row ] [ next_column ];
			System.out.println("Next value: " + next_value + " at " + next_row + "," + next_column);
			
			if (next_value == Integer.parseInt(x+y)) {
				System.out.println("Treasure found! at " + next_row + "," + next_column);
				break;
			}
			else {
				current_coordinates[0] = next_row;
				current_coordinates[1] = next_column;
				System.out.println("Setting new current coordinates to: " + next_row + "," + next_column);
			}
			System.out.println("--------------------------");

		}
	}	
	 
	public static int[] getCoordinates(int value) {
		
		String s = Integer.toString(value);
		char[] chars = s.toCharArray();
		String str_row = Character.toString(chars[0]);
		String str_column = Character.toString(chars[1]);
		
		int column = Integer.parseInt(str_column);
		int row = Integer.parseInt(str_row);
		int[] ret = {row, column};
		
		return ret;
	}

}
