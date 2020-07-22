package lecture10;

import java.util.Random;

public class Solution {
	 public int solution(int[][] board, int[] moves) {
		 	
		 	Random random = new Random();
		 	int answer = 0;
		 	int boardErrCount = 0;
	        
	        if (board.length > 30) {
				board = new int[30][board[0].length];
				boardErrCount++;
			}else if (board[0].length > 30) {
				board = new int[board.length][30];
				boardErrCount++;
			}else if (boardErrCount >= 1) {
				System.err.println("배열크기의 30을 초과한 값은 30으로 수정됩니다.");
			}
	        
	        
	        
	        for (int[] i : board) {
				System.out.println(i + " ");
			} 
	        
	        
	        
	        return answer;
	    }
}
