package FIbonacci;

public class Original extends Strategy {

	
	  private int[] recursiveFibonacci(int n) {
	        int[] fibArray = new int[n + 1];

	        for (int i = 0; i <= n; i++) {
	            fibArray[i] = recursiveFib(i);
	        }

	        return fibArray;
	    }

	    private int recursiveFib(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return recursiveFib(n - 1) + recursiveFib(n - 2);
	    }
	
	
	
	public void perform(int n) {
		System.out.println("THIS IS ORIGINAL");
		recursiveFibonacci(n);
	}
    
}
