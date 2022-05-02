import java.util.Arrays;

/* 프로그래머스 (행렬 테두리 회전하기)
 * https://programmers.co.kr/learn/courses/30/lessons/77485
 */

class Algorithm220416__2 {

	static int[] solution(int rows, int columns, int[][] queries) {
		int[] result = new int[queries.length];
		int[][] arr = new int[rows][columns]; // 행렬 생성
		int[][] tmp = new int[rows][columns]; // 값 저장

		// 행렬 초기화
		int num = 1;
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {
				arr[i][j] = num;
				tmp[i][j] = num;
				num++;
			}

		// 확인용
//		for (int[] a : arr) {
//			for (int i : a)
//				System.out.print(String.valueOf(i).length() == 1 ? i + "  " : i + " ");
//			System.out.println();
//		}

		// 회전
		int cnt = 0;
		for (int[] q : queries) {
			int x1 = q[0] - 1, x2 = q[2] - 1; // 행 (인덱스값은 0부터 시작하므로 -1)
			int y1 = q[1] - 1, y2 = q[3] - 1; // 열 (인덱스값은 0부터 시작하므로 -1)
			int min = arr[x1][y1]; // 최솟값 초기화

			// 위쪽(좌 -> 우 : 열 이동)
			for (int y = y1 + 1; y <= y2; y++) {
				min = Math.min(min, arr[x1][y]);
				arr[x1][y] = tmp[x1][y - 1];
			}

			// 오른쪽(상 -> 하 : 행 이동)
			for (int x = x1 + 1; x <= x2; x++) {
				min = Math.min(min, arr[x][y2]);
				arr[x][y2] = tmp[x - 1][y2];
			}

			// 아래쪽(우 -> 좌 : 열 이동)
			for (int y = y2 - 1; y >= y1; y--) {
				min = Math.min(min, arr[x2][y]);
				arr[x2][y] = tmp[x2][y + 1];
			}

			// 왼쪽(하 -> 상 : 행 이동)
			for (int x = x2 - 1; x >= x1; x--) {
				min = Math.min(min, arr[x][y1]);
				arr[x][y1] = tmp[x + 1][y1];
			}

			// 최솟값 담기
			result[cnt] = min;
			cnt++;

			// temp 배열 바꿔주기
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < columns; j++)
					tmp[i][j] = arr[i][j];

			// 확인용
//			System.out.println("---------- " + cnt + "회전 ----------");
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
//		int rows = 6; // 행의 개수
//		int columns = 6; // 열의 개수
//		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };

		// test2
//		int rows = 3; // 행의 개수
//		int columns = 3; // 열의 개수
//		int[][] queries = { { 1, 1, 2, 2 }, { 1, 2, 2, 3 }, { 2, 1, 3, 2 }, { 2, 2, 3, 3 } };

		// test3
//		int rows = 100; // 행의 개수
//		int columns = 97; // 열의 개수
//		int[][] queries = { { 1, 1, 100, 97 } };

		// test4
		int rows = 3; // 행의 개수
		int columns = 4; // 열의 개수
		int[][] queries = { { 1, 1, 2, 2 }, { 1, 2, 2, 3 }, { 1, 3, 2, 4 }, { 2, 3, 3, 4 } };

		System.out.println(Arrays.toString(solution(rows, columns, queries)));
	}

}