/*
Author: Noah Jacques

Sieve of Eratosthenes

Pass it an upper bound; returns string of primes

*/
public class Sieve {

	public static void main(String[] args) {

		int upperBound = Integer.parseInt(args[0]);
	    int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
	    boolean[] isComposite = new boolean[upperBound + 1];//why plus 1?

	    String primes = "";

	    for (int m = 2; m <= upperBoundSquareRoot; m++) {
	        if (!isComposite[m]) {
	            primes+= m + " ";
	            for (int k = m * m; k <= upperBound; k += m)
	                isComposite[k] = true;
	        }
	    }

	    for (int m = upperBoundSquareRoot; m <= upperBound; m++){
	    	if (!isComposite[m])
	            primes += m + " ";
		}

		System.out.printf("\nThere are %d primes from 2 to %s:\n", primes.split(" ").length, args[0]);
		System.out.println(primes);
	}
}