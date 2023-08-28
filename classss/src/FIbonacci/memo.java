package FIbonacci;

import java.util.Arrays;

public class memo extends Strategy{	
	private int n; //전역변수
	
	public memo(String name, int n) {
		super(name, n);
		this.n = n; //초기화
	}

	 private int[] memoizationFibonacci() {
	        int[] fibArray = new int[n + 1];
	        Arrays.fill(fibArray, -1);

	        for (int i = 0; i <= n; i++) {
	            fibArray[i] = memoizationFib(i, fibArray);
	        }

	        return fibArray;
	    }

	    private int memoizationFib(int n, int[] fibArray) {
	        if (fibArray[n] != -1) {
	            return fibArray[n];
	        }
	        if (n <= 1) {
	            return n;
	        }
	        fibArray[n] = memoizationFib(n - 1, fibArray) + memoizationFib(n - 2, fibArray);
	        return fibArray[n];
	    }
    
    
    
    public void perform(int n) {
		System.out.println("THIS IS MEMO");

		memoizationFibonacci(n);
	}


}
