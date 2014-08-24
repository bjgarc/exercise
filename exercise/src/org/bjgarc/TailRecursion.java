package org.bjgarc;

public class TailRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(10));
	}
	
	/*
	 * Fibonacci generator using tail reccursion
	 */
	public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
		return fibonacci(number-1) + fibonacci(number-2); //tail recursion
    }

}
