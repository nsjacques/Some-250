/*
Author: Noah Jacques

Sieve of Eratosthenes

*/
public class Sieve {

	public static void main(String[] args) {

	int upperBound = Integer.parseInt(args[0]);
    int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
    boolean[] isComposite = new boolean[upperBound + 1];//why plus 1?

    for (int m = 2; m <= upperBoundSquareRoot; m++) {
        if (!isComposite[m]) {
            System.out.print(m + " ");

                for (int k = m * m; k <= upperBound; k += m)
                    isComposite[k] = true;
	            }

	    }
	    for (int m = upperBoundSquareRoot; m <= upperBound; m++)
        	if (!isComposite[m])
                System.out.print(m + " ");
		}

}
