package lecture06;

public class CrainExample {
	
	public int solution(int[][] board, int[] moves) {
		
		int[] popValue = new int[moves.length];
		int count = 0;
		int popCount = 0;
		
		for (int i : moves) {
			for (int j = 0; j < board[0].length; j++) {
				for (int k = 0; k < board[0].length; k++) {
					if (board[j][k] == i) {
						popValue[count] = board[j][k]; 
						board[j][k] = 0;
						if (count!=0 && popValue[count] == popValue[count-1]) {
							popCount++;
							popValue[count] = 0;
							popValue[count-1] = 0;
							count -= 2;
						}
						count++;
					}
				}	
			}
		}
		
		return popCount;
	}
	
	public static void main(String[] args) {
		CrainExample crainExample = new CrainExample();
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int solution = crainExample.solution(board, moves);
		
		System.out.println(solution);
	}
}
