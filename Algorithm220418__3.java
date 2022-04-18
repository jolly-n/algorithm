import java.util.Scanner;

/* 백준 (배열 복원하기)
 * https://www.acmicpc.net/problem/16967
 */

class Algorithm220418__3 {

	static int[][] solution(int H, int W, int X, int Y, int[][] arr) {
		int[][] answer = new int[H][W];

		// A배열 크기만큼 생성
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				answer[i][j] = arr[i][j];

		// 겹쳐지는 부분 복원
		for (int i = X; i < H; i++)
			for (int j = Y; j < W; j++)
//				answer[i][j] -= arr[i - X][j - Y];
				answer[i][j] = arr[i][j] - answer[i - X][j - Y]; // 변경된 answer을 arr에서 빼줘야 한다.

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // 행
		int W = sc.nextInt(); // 열
		int X = sc.nextInt(); // 아래 이동 값
		int Y = sc.nextInt(); // 오른쪽 이동 값

		int[][] arr = new int[H + X][W + Y];

		for (int i = 0; i < H + X; i++)
			for (int j = 0; j < W + Y; j++)
				arr[i][j] = sc.nextInt();

		for (int[] a : solution(H, W, X, Y, arr)) {
			for (int aa : a)
				System.out.print(aa + " ");
			System.out.println();
		}
	}

}