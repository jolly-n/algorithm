import java.util.ArrayDeque;
import java.util.Deque;

/* ���α׷��ӽ� (ũ���� �����̱� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */

class Algorithm220209 {
	
	/* Ǯ�� */
	public static int solution(int[][] board, int[] moves) {
		// ���� ȭ�� Ȯ��
		for (int[] ar : board) {
			for (int n : ar) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		// �ٱ���
		Deque<Integer> basket = new ArrayDeque<>();
		basket.addLast(0); // ù��° �� ���Ƿ� ����
		
		// ũ���� �۵�
		int cnt = 0; // ��Ʈ�� ����� ������ ����
		
		for (int n : moves)
			for (int i = 0; i < board.length; i++) {
				if (board[i][n-1] != 0) { // �� �ε��� : ũ���� ��ġ -1
					if (basket.peekLast() == board[i][n-1]) { // ���� ��� ������ �����ؼ� ���̸�
						basket.pollLast();
						cnt += 2; // 2�� ������ �����
					} else { 
						basket.addLast(board[i][n-1]);
					}
					
					board[i][n-1] = 0;
					break;
				}
			}
		
		System.out.println("�ٱ��� " + basket);
		return cnt;
	}
	
	/* �׽�Ʈ */
	public static void main(String[] args) {
		int[][] testBoard = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 },
				              { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
		int[] testMoves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		System.out.println(solution(testBoard, testMoves));
	}
	
}