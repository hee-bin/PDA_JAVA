package FIbonacci;

public class map extends Strategy {
	
	 private int[] iterativeFibonacci(int n) {
	        int[] fibArray = new int[n + 1];

	        for (int i = 0; i <= n; i++) {
	            if (i <= 1) {
	                fibArray[i] = i;
	            } else {
	                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
	            }
	        }

	        return fibArray;
	    }
	
	
	public void perform(int n) {
		System.out.println("THIS IS MAP");
		iterativeFibonacci(n);
	}
	
}
