package org.bjgarc;

public class SaddlePoint {
	
	/*
	 * Write a program to search for the "saddle points" in a square 
	 * matrix of integers. A saddle point is a cell whose value is 
	 * greater than or equal to any in its row, and less than or equal 
	 * to any in its column.
	 */
	static int[][] theArray = 
			{{24,21,32,41,25},
			{25,33,43,14,31},
			{24,45,52,42,23},
			{26,35,45,34,31},
			{21,52,33,32,23}};
	/*
	static int[] theArray = 
			{{1,2,3},
			{4,5,6},
			{7,8,9}};
	*/
	
	public static void findSaddlePoints() {
		
		int min, max, k, j, l;
		for (int i=0; i < theArray.length; i++) {
			for (j=0; j < theArray.length; j++) {
				max = min = theArray[i][j];
				//System.out.println(max + " " + min);
				// Check the column for the smallest value 
				for(k=0; k < theArray.length; k++) {
					System.out.println("max: " + max + " min: " + min + " @ [" + k + "," + j + "]");
					if(min < theArray[k][j]) {
						max = theArray[k][j];
						System.out.println("CHANGED max ==> max: " + max + " min: " + min + " @ [" + k + "," + j + "]");
					}
				}
				for (l=0; l < theArray.length; l++) {
					System.out.println(">>>>> max: " + max + " min: " + min + " @ [" + i + "," + l + "]");
					if(max > theArray[i][l]) {
						min = theArray[i][l];
						System.out.println(">>>>> CHANGED min ==> max: " + max + " min: " + min + " @ [" + i + "," + l + "]");
					}
				}
				if (min == max) { System.out.println("XXXXXXXXXXX  Saddle point found!  XXXXXXXXXXXXXXX"); }
				//else { System.out.println("No point found"); }
			}
		}
	}

	
	public static void main(String[] args) {
		findSaddlePoints();
		/*
		int max, min, i, j, k, l;
		//int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int a[][];
		
		a = theArray;
		

		for (i = 0; i < 5; i++) {

			for (j = 0; j < 5; j++) {
				max = min = a[i][j];
				//System.out.println("max: " + max);
				//System.out.println("min: " + min);
				//System.out.println("array val: " + a[i][j]);
				for (k = 0; k < 5; k++) {
					if (max < a[k][j]) {
						min = a[k][j];
					}
				}

				for (l = 0; l < 5; l++) {
					if (min > a[i][l]) {
						max = a[i][l];
					}
				}

				if (max == min) {
					System.out.print("Saddle point is " + max + " at ("
							+ (i + 1) + " , " + (j + 1) + ")");
				}

			}

		}

		System.out.println();
*/
	}
}
