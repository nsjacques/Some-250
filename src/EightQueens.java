/*
Author: Noah Jacques

add option for linear time vs backtracking method

*/
public class EightQueens {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int[] p = placeQueens(n);
		
		String o = "";
		int x = 1;
		for (int y : p){
			o += String.format("(%d,%d)\n", x,y);
			x++;
		}

		System.out.println(o);

	}


	private static int[] placeQueens(int n){

		int[] placement;

		if (n%2 == 1){
			int[] p = placeQueens(n-1);
			placement = new int[n];
			for (int i =0; i<n-1; i++){
				placement[i] = p[i];
			}
			placement[n-1]=n;
		}
		else if (n%6 != 2){
			placement = method1(n);
		}
		else{//if (n%6 == 0)
			placement = method2(n);
		}
		return placement;

	}

	private static int[] method1(int n){
		int[] p = new int[n];
		for(int i = 1; i <= n/2; i++){
			p[i-1] = 2*i;
			p[n/2+i-1] = 2*i-1;
		}
		return p;
	}

	private static int[] method2(int n){
		int[] p = new int[n];
		for(int i = 1; i <= n/2; i++){
			p[i-1] = 1 + (2*i-2+n/2 -1)%n;
			p[n-i] = n - (2*i-2+n/2-1)%n;
		}
		return p;
	}
	




	/*

	//Old stuff for nonlinear-time


	public static boolean[][] placeQueens(boolean[][] board, int numQueens){
		if (numQueens < 1) return board;
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				if (!board[i][j]){
					if (isValid(board, i,j)){
						board[i][j] = true;
						board = placeQueens(board, numQueens-1);
					}
				}
			}
		}
		return board;
	}
	
	public static boolean isValid(boolean[][] board, int i, int j){
		boolean valid = true;
		int index1 = 0;
		int index2 = 0;
		
		while(valid && index1 < 8){
			if(board[index1][j]) valid = false;
			index1++;
		}
		while(valid && index2 < 8){
			if(board[i][index2]) valid = false;
			index2++;
		}
		//check diagonals...
		if (valid){
			for (int x = 0; x < 4; x++){
				if (x == 0){
					index1 = i;
					index2 = j;
					while(valid && index1 < 8 && index1 >= 0 && index2 < 8 && index2 >= 0){
						if(board[index1][index2]) valid = false;
						index1++;
						index2++;
					}
				}
				if (x == 1){
					index1 = i;
					index2 = j;
					while(valid && index1 < 8 && index1 >= 0 && index2 < 8 && index2 >= 0){
						if(board[index1][index2]) valid = false;
						index1--;
						index2++;
					}
				}
				if (x == 2){
					index1 = i;
					index2 = j;
					while(valid && index1 < 8 && index1 >= 0 && index2 < 8 && index2 >= 0){
						if(board[index1][index2]) valid = false;
						index1++;
						index2--;
					}
				}
				if (x == 3){
					index1 = i;
					index2 = j;
					while(valid && index1 < 8 && index1 >= 0 && index2 < 8 && index2 >= 0){
						if(board[index1][index2]) valid = false;
						index1--;
						index2--;
					}
				}
			}
		}
		return valid;
	}

	*/



}