/*
Author: Noah Jacques

Takes two integers.

Lists all numbers in set [0,arg0) that are congruent to a perfect square (<E15) modulo arg1

*/

import java.util.HashSet;

public class PerfectSquares250 {

	public static void main(String[] args) {
		
		int range = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);

		String congruent = "List of numbers in range [0,"+range+") congruent to perfect squares mod "+m+":\n"; //"Output:\na : b indicates congruence mod " + m;
		String notCongruent = "List of numbers in range [0,"+range+") not congruent to perfect squares mod "+m+":\n"; //"Output:\na : b indicates congruence mod " + m;

		String outputVerbose = "";

		//add a -v --verbose option

		HashSet <Double> squares = new HashSet<Double>();
		HashSet <Double> squaresModM = new HashSet<Double>();

		for(int b=0; b<100; b++){
			double i = Math.pow(b,2);
			squares.add(i);
			squaresModM.add(i % m);
		}

		for (double x = 0; x < range; x++){
			if (squaresModM.contains(x % m)){
				congruent += x + "\n";
			}
			else
				notCongruent += x + "\n";
		}

		System.out.println(congruent);
		System.out.println(notCongruent);
		
		/*
		for (int x = 0; x < range; x++){
			for (int b = 0; b < 100; b++){
				if (x%m == Math.pow(b,2)){

					outputConcise += x + " : " + 

					outputVerbose += x + " % " + m + " (" + x%m + ") \u2261 " + 
							b + "^2, or " + Math.pow(b,2));
				}
			}
		}
		*/

	}

}