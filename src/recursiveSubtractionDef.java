/*
Author: Noah Jacques

Yields 0 if result would be negative. Does not take negative integers.

*/
public class recursiveSubtractionDef {

	public static void main(String[] args) {
		System.out.println(minus(args[0], args[1]));
	}
	
	public static int minus(int x, int y){
		if (x < y || y == x)
			return 0;
		if (y == 0)
			return x;
		else return pred(minus(x,pred(y)));
	}
	
	public static int pred(int x){
		return x-1;
	}

}
