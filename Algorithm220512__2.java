import java.util.Scanner;

/* 백준 (피보나치 수)
 * https://www.acmicpc.net/problem/2747
 */

class Algorithm220512__2 {
	static int[] fibo; // 값을 저장하기 위한 배열 생성

	static int DFS(int n) {
		if (fibo[n] > 0) // 이미 구한 값인 경우
			return fibo[n];

		if (n == 1 || n == 2)
			return fibo[n] = 1;
		else
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n + 1];
		System.out.println(DFS(n));
	}

}