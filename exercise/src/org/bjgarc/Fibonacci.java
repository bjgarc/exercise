package org.bjgarc;


public class Fibonacci {
    
	/*
	 * Fibonacci generator using tail reccursion
	 */
	public static int fibonacci(int number){

		if(number == 1 || number == 2){
            return 1;
        }
		return fibonacci(number-1) + fibonacci(number-2); //tail recursion

	}
    
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        int fibo1=1, fibo2=1, fibonacci=1;
        int[] sequence = new int[number+1];
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
            sequence[i-3] = fibonacci;
          
        }
        /*
        for (int temp : sequence) {
        	if (temp != 0) System.out.println(" " + temp + " ");
        }
        */
        return fibonacci; //Fibonacci number
      
    }
    
    public static int factorial (int n) {
    	int accum = 1;
    	
    	while(n != 0) {
    		accum = accum * n;
    		n--;
    	}
    	return accum;
    }

}
