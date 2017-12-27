
public class PerfectSquares250 {

	public static void main(String[] args) {
		
		int m = 13;
		
		for (int x = 0; x < 100; x++){
			for (int b = 0; b < 100; b++){
				if (x%m == Math.pow(b,2))
					System.out.println(x + " % " + m + " (" + x%m + ") is congruent to " + 
							b + "^2, or " + Math.pow(b,2));
			}
		}

	}

}