// Instructions:
// Copy over your code from CombinationsComparison into 
// methods numCombinations() and numCombinationsRecursive()
// Then implement the second recursive approach in numCombinationsRecursive2()
// and the iterative approach in numCombinationsIterative()

public class CombinationsComparison2 {

    static int numCalls = 0;
    static int numCallsRecursive = 0;
    static int numCallsRecursive2 = 0;
    static int numIterations = 0;

    public static void main (String[] argv)
    {
	// Try n=5, n=10, n=20.
	int n = 20;
	for (int k=0; k<=n; k++) {
	    int p = numCombinations (n,k);
	    int q = numCombinationsRecursive (n,k);
	    double r = numCombinationsRecursive2 (n,k);
	    double s = numCombinationsIterative (n,k);
	    System.out.println ("n=" + n + " k=" + k + " p=" + p + " q=" + q + " r=" + r + " s=" + s);
	}
	System.out.println ("numCalls=" + numCalls + " numCallsRecursive=" + numCallsRecursive + " numCallsRecursive2=" + numCallsRecursive2 + " numIterations=" + numIterations);
    }

    static double numCombinationsIterative (int n, int k)
    {
	// INSERT YOUR CODE HERE. In the loop, add the line numIterations++;
    	double res = 1;
    	int k0 =0;
    	if (k0==k)
    	{
    		return res;
    	}
    	int n0 = n-k;
    	for (int i=0;i<k;i++)
    	{
    		n0++;
    		k0++;
    		res*=n0;
    		res/=k0;
    		numIterations++;
    	}
    	
    	return res;
    }

    static double numCombinationsRecursive2 (int n, int k)
    {
	numCallsRecursive2 ++;
	// INSERT YOUR CODE HERE:
	if ((n==k) || (n==1) || (k==0)) {
	    return 1;
	}
		return numCombinationsRecursive2(n-1,k-1)*n/k;

    }

    static int numCombinationsRecursive (int n, int k)
    {
	numCallsRecursive ++;
	// INSERT YOUR CODE HERE:
	if ((n==k) || (n==1) || (k==0)) {
	    return 1;
	}
		return numCombinationsRecursive(n-1,k)+numCombinationsRecursive(n-1,k-1);

    }

    static int numCombinations (int n, int k)
    {
	// INSERT YOUR CODE HERE:
    	return factorial(n)/(factorial(n-k)*factorial(k));

    }

    static int factorial (int n)
    {
	numCalls ++;
	// // INSERT YOUR CODE HERE:
	 int sum =1;
        for (int i=1;i<=n;i++)
        {
            sum*=i;
        }
        return sum;

    }

}