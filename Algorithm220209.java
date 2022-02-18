import java.util.ArrayDeque;
import java.util.Deque;

/* 프로그래머스 (크레인 인형뽑기 게임)
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */

class Algorithm220209 {
	
	/* 풀이 */
	public static int solution(int[][] board, int[] moves) {
		// 게임 화면 확인
		for (int[] ar : board) {
			for (int n : ar) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		// 바구니
		Deque<Integer> basket = new ArrayDeque<>();
		basket.addLast(0); // 첫번째 값 임의로 저장
		
		// 크레인 작동
		int cnt = 0; // 터트려 사라진 인형의 개수
		
		for (int n : moves)
			for (int i = 0; i < board.length; i++) {
				if (board[i][n-1] != 0) { // 열 인덱스 : 크레인 위치 -1
					if (basket.peekLast() == board[i][n-1]) { // 같은 모양 인형이 연속해서 쌓이면
						basket.pollLast();
						cnt += 2; // 2개 인형이 사라짐
					} else { 
						basket.addLast(board[i][n-1]);
					}
					
					board[i][n-1] = 0;
					break;
				}
			}
		
		System.out.println("바구니 " + basket);
		return cnt;
	}
	
	/* 테스트 */
	public static void main(String[] args) {
		int[][] testBoard = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 },
				              { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
		int[] testMoves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		System.out.println(solution(testBoard, testMoves));
	}
	
}