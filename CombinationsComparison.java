// Instructions:
// Copy over your code from CombinationsRecursive into 
// methods numCombinations() and numCombinationsRecursive()

public class CombinationsComparison {

    static int numCalls = 0;
    static int numCallsRecursive = 0;

    public static void main (String[] argv)
    {
	int n = 20;
	for (int k=0; k<=n; k++) {
	    int p = numCombinations (n,k);
	    int q = numCombinationsRecursive (n,k);
	    System.out.println ("n=" + n + " k=" + k + " p=" + p + " q=" + q);
	}
	System.out.println ("numCalls=" + numCalls + " numCallsRecursive=" + numCallsRecursive);
    }

    static int numCombinationsRecursive (int n, int k)
    {
	numCallsRecursive ++;
	// INSERT YOUR CODE HERE:
	if ((n==k) || (n==1) || (k==0)) {
	    return 1;
	}
		return numCombinationsRecursive(n-1,k)+numCombinationsRecursive(n-1,k-1);
	// INSERT one line of code here (the actual recursion):

    }

    static int numCombinations (int n, int k)
    {
	// INSERT YOUR CODE HERE:
    	return factorial(n)/(factorial(n-k)*factorial(k));

    }

    static int factorial (int n)
    {
	numCalls ++;
	// INSERT YOUR CODE HERE:
	 int sum =1;
        for (int i=1;i<=n;i++)
        {
            sum*=i;
        }
        return sum;

    }
}