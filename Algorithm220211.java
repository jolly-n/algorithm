import java.util.Arrays;

/* 프로그래머스 (행렬의 곱셈)
 * https://programmers.co.kr/learn/courses/30/lessons/12949
 */

class Algorithm220211 {
	
	/* 풀이 */
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int row = arr1.length; // 행
		int column = arr2[0].length; // 열
		int arr_column = arr1[0].length; // arr1의 열 값 필요 (예- 3x5 5x3 행렬의 곱일 경우 5도 필요)

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

		// 이차원 배열 출력용
		for (int[] arr : answer)
			System.out.println(Arrays.toString(arr));
		
		return answer;
	}

	/* 테스트 */
	public static void main(String[] args) {
		int[][] test1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } }; // 3x2
		int[][] test2 = { { 3, 3 }, { 3, 3 } }; // 2x2

		solution(test1, test2);
	}

}
