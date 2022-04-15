// Instructions:
// Write a recursive version of numCombinations()
// Compile and execute

public class CombinationsRecursive {

    public static void main (String[] argv)
    {
	int n = 10;
	Function C = new Function ("n-choose-k vs k");
	for (int k=0; k<=n; k++) {
	    int r = numCombinationsRecursive (n,k);
	    C.add (k, r);
	}
	C.show ();
    }

    static int numCombinationsRecursive (int n, int k)
    {
	// Base case (already written for you)
	if ((n==k) || (n==1) || (k==0)) {
	    return 1;
	}
		return numCombinationsRecursive(n-1,k)+numCombinationsRecursive(n-1,k-1);
	// INSERT one line of code here (the actual recursion):

    }

    static int factorial (int n)
    {
	// INSERT YOUR CODE HERE:
        int sum =1;
        for (int i=1;i<=n;i++)
        {
            sum*=i;
        }
        return sum;
    }

}