import java.util.Scanner;

/* SW Expert Academy (������ ����)
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq
 */

class Algorithm220207 {
	/* Ǯ�� */
	public static void snail(int n) {
		int[][] arr = new int[n][n];

		int[] dr = { 0, 1, 0, -1 }; // �� ��ȭ�� (�� �� �� ��)
		int[] dc = { 1, 0, -1, 0 }; // �� ��ȭ�� (�� �� �� ��)
		int[] dd = { 0, 1, 2, 3 };  // �ε��� ��

		int row = 0; // �� �ʱ�ȭ
		int column = 0; // �� �ʱ�ȭ
		int cnt = 0; // dd�� �ε��� �ʱ�ȭ

		// �迭 ä���
		for (int i = 1; i <= n * n; i++) {
			int dRow = row + dr[dd[cnt]]; // ������ ������ ��
			int dColumn = column + dc[dd[cnt]]; // ������ ������ ��

			// ������ �ٲ� �� ����
			if (dRow < 0 || dRow >= n || dColumn < 0 || dColumn >= n || arr[dRow][dColumn] != 0) {
				cnt = (cnt + 1) % 4; // cnt�� 3�� �Ѿ�� �ʰ� ����
				dRow = row + dr[dd[cnt]]; 
				dColumn = column + dc[dd[cnt]];
			}
			
			arr[row][column] = i;
			row = dRow;
			column = dColumn;
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int testNum = kb.nextInt(); // �׽�Ʈ ���̽��� ����
		
		for (int i = 1; i <= testNum; i++) {
			int snailNum = kb.nextInt(); // �� �׽�Ʈ ���̽�
			System.out.println("#" + i);
			snail(snailNum);
		}
	}
}