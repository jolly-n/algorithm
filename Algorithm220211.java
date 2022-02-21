import java.util.Arrays;

/* ���α׷��ӽ� (����� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/12949
 */

class Algorithm220211 {
	
	/* Ǯ�� */
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int row = arr1.length; // ��
		int column = arr2[0].length; // ��
		int arr_column = arr1[0].length; // arr1�� �� �� �ʿ� (��- 3x5 5x3 ����� ���� ��� 5�� �ʿ�)

		int[][] answer = new int[row][column]; // 3x2

		for (int i = 0; i < row; i++)  // (0,1,2)
			for (int j = 0; j < column; j++)  // (0,1)
				for (int k = 0; k < arr_column; k++)  // (0,1)
					answer[i][j] += arr1[i][k] * arr2[k][j];
					// i=0, j=0, k=0,1
					// [0][0] = [0][0] * [0][0]
					//        + [0][1] * [1][0]
					
					// i=0, j=1, k=0,1
					// [0][1] = [0][0] * [0][1]
					//        + [0][1] * [1][1]          

		// ������ �迭 ��¿�
		for (int[] arr : answer)
			System.out.println(Arrays.toString(arr));
		
		return answer;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		int[][] test1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } }; // 3x2
		int[][] test2 = { { 3, 3 }, { 3, 3 } }; // 2x2

		solution(test1, test2);
	}

}
