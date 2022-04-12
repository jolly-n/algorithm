import java.util.Scanner;

/* 백준 (x보다 작은 수)
 * https://www.acmicpc.net/problem/10871
 */

class Algorithm220412__2 {

	static StringBuilder solution(int n, int x, int[] arr) {
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < n; i++)
			if (arr[i] < x)
				answer.append(arr[i] + " ");

		return answer.deleteCharAt(answer.length() - 1); // 맨 뒤 공백 제거
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(n, x, arr));
	}

}