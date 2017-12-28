/*
Author: Noah Jacques

*/
public class truthTable {

	public static void main(String[] args) {
		printTruthTable(Integer.parseInt(args[0]));
	}
	
	//k is number of variables
	public static void printTruthTable(int k) {

		int numberLines = (int) Math.pow(2,k);

		String output = "";

	    //calls makeline 2^k times with k and lineNumber for LN 0 to numberLines
	    for (int lineNumber = 0; lineNumber < numberLines; lineNumber++) {
	        output+= makeLine(k, lineNumber) + "\n";
	    }

	    System.out.println(output);
	}
	
	public static String makeLine(int k, int lineNumber) {

		//w set to LN % 2 (0 or 1)
	    String w = String.valueOf(lineNumber % 2);
	    //for i from 1 to k
	    for (int i = 1; i < k; i++) {
	    	//LN = LN halved
	        lineNumber /= 2;
	        //w gets LN mod 2 prepended
	        w = (lineNumber % 2) + " " + w;
	    }
	    return w;
	}
}
