
public class recursiveSubtractionDef {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		System.out.println(minus(x, y));
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
