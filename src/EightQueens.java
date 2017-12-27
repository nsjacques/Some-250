
public class EightQueens {

	public static void main(String[] args) {
		boolean[][] board = new boolean[8][8];
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				board[i][j] = false;
			}
		}
		
		board = placeQueens(board, 8);
		
		/*
		 *Brainstorming:
		 *Put queen in valid spot until all queens are placed
		 *Go by row
		 *	for each row check the column (could ignore taken columns)
		 *Spot is valid if no queen in same column/row/diagonal
		 *	checking diagonals
		 *		r++ c++, r-- c--, r++ c--, r--, c++
		 *			maybe can be more concise
		 *
		 *Note: no outside sources used.
		 *Note: does not work. Stops after 5 properly places queens.
		 */
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				if (board[i][j]) System.out.print(" Q");
				else System.out.print(" #");
			}
			System.out.println();
		}

	}
	
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
}