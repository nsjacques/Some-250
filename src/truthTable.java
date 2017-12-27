/*
Author: Noah Jacques

*/
public class truthTable {

	public static void main(String[] args) {
		printTruthTable(4);
	}
	
	//k is number of variables
	public static void printTruthTable(int k) {
		//sets numberLines to 2^k
		int numberLines = 1;
	    for (int i = 0; i < k; i++) {
	        numberLines *= 2;
	    }
	    //calls makeline numberLines times with k and lineNumber for LN 0 to numberLines
	    for (int lineNumber = 0; lineNumber < numberLines; lineNumber++) {
	        System.out.println(lineNumber + " in binary: " + makeLine(k, lineNumber));
	    }
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
