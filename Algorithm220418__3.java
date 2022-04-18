import java.util.Scanner;

/* ���� (�迭 �����ϱ�)
 * https://www.acmicpc.net/problem/16967
 */

class Algorithm220418__3 {

	static int[][] solution(int H, int W, int X, int Y, int[][] arr) {
		int[][] answer = new int[H][W];

		// A�迭 ũ�⸸ŭ ����
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				answer[i][j] = arr[i][j];

		// �������� �κ� ����
		for (int i = X; i < H; i++)
			for (int j = Y; j < W; j++)
//				answer[i][j] -= arr[i - X][j - Y];
				answer[i][j] = arr[i][j] - answer[i - X][j - Y]; // ����� answer�� arr���� ����� �Ѵ�.

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // ��
		int W = sc.nextInt(); // ��
		int X = sc.nextInt(); // �Ʒ� �̵� ��
		int Y = sc.nextInt(); // ������ �̵� ��

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