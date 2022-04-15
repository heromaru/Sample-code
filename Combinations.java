// Instructions:
// Write code in factorial() and then numCombinations()
// Calculate by hand numCombinations(5,k) for k=0,1,..,5.
// Compare with the computation.

public class Combinations {

    public static void main (String[] argv)
    {
	// Try k=0,1,2,3,4,5.

	int k = 0;
    for (k=0;k<=5;k++)
    {
        int r = numCombinations (5,k);
        System.out.println (r);
    }
    }

    static int numCombinations (int n, int k)
    {
	// INSERT YOUR CODE HERE:
        return factorial(n)/(factorial(n-k)*factorial(k));

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