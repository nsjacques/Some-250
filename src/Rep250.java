
public class Rep250 {

	public static void main(String[] args) {
		System.out.println(rep(637));
	}
	
	private static String rep (int n){
		if(n==0) return "0";
		if (n==1) return "1";
		System.out.println("\nn/2 = " + n/2);
		String w = rep (n/2);
		if (n%2 == 0)
			return w + 0;
		else return w + 1;
	}

}
