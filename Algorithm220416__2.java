import java.util.Arrays;

/* ���α׷��ӽ� (��� �׵θ� ȸ���ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/77485
 */

class Algorithm220416__2 {

	static int[] solution(int rows, int columns, int[][] queries) {
		int[] result = new int[queries.length];
		int[][] arr = new int[rows][columns]; // ��� ����
		int[][] tmp = new int[rows][columns]; // �� ����

		// ��� �ʱ�ȭ
		int num = 1;
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {
				arr[i][j] = num;
				tmp[i][j] = num;
				num++;
			}

		// Ȯ�ο�
//		for (int[] a : arr) {
//			for (int i : a)
//				System.out.print(String.valueOf(i).length() == 1 ? i + "  " : i + " ");
//			System.out.println();
//		}

		// ȸ��
		int cnt = 0;
		for (int[] q : queries) {
			int x1 = q[0] - 1, x2 = q[2] - 1; // �� (�ε������� 0���� �����ϹǷ� -1)
			int y1 = q[1] - 1, y2 = q[3] - 1; // �� (�ε������� 0���� �����ϹǷ� -1)
			int min = arr[x1][y1]; // �ּڰ� �ʱ�ȭ

			// ����(�� -> �� : �� �̵�)
			for (int y = y1 + 1; y <= y2; y++) {
				min = Math.min(min, arr[x1][y]);
				arr[x1][y] = tmp[x1][y - 1];
			}

			// ������(�� -> �� : �� �̵�)
			for (int x = x1 + 1; x <= x2; x++) {
				min = Math.min(min, arr[x][y2]);
				arr[x][y2] = tmp[x - 1][y2];
			}

			// �Ʒ���(�� -> �� : �� �̵�)
			for (int y = y2 - 1; y >= y1; y--) {
				min = Math.min(min, arr[x2][y]);
				arr[x2][y] = tmp[x2][y + 1];
			}

			// ����(�� -> �� : �� �̵�)
			for (int x = x2 - 1; x >= x1; x--) {
				min = Math.min(min, arr[x][y1]);
				arr[x][y1] = tmp[x + 1][y1];
			}

			// �ּڰ� ���
			result[cnt] = min;
			cnt++;

			// temp �迭 �ٲ��ֱ�
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < columns; j++)
					tmp[i][j] = arr[i][j];

			// Ȯ�ο�
//			System.out.println("---------- " + cnt + "ȸ�� ----------");
//			for (int[] a : arr) {
//				for (int i : a)
//					System.out.print(String.valueOf(i).length() == 1 ? i + "  " : i + " ");
//				System.out.println();
//			}
		}

		return result;
	}

	public static void main(String[] args) {
		// test1
//		int rows = 6; // ���� ����
//		int columns = 6; // ���� ����
//		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };

		// test2
//		int rows = 3; // ���� ����
//		int columns = 3; // ���� ����
//		int[][] queries = { { 1, 1, 2, 2 }, { 1, 2, 2, 3 }, { 2, 1, 3, 2 }, { 2, 2, 3, 3 } };

		// test3
//		int rows = 100; // ���� ����
//		int columns = 97; // ���� ����
//		int[][] queries = { { 1, 1, 100, 97 } };

		// test4
		int rows = 3; // ���� ����
		int columns = 4; // ���� ����
		int[][] queries = { { 1, 1, 2, 2 }, { 1, 2, 2, 3 }, { 1, 3, 2, 4 }, { 2, 3, 3, 4 } };

		System.out.println(Arrays.toString(solution(rows, columns, queries)));
	}

}