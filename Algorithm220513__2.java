import java.util.Scanner;

/* 백준 (부분수열의 합)
 * https://www.acmicpc.net/problem/1182
 */

class Algorithm220513__2 {
	static int N; // 정수의 개수
	static int S; // 원소의 합
	static int[] arr; // 수열을 받을 배열
	static int[] check; // 수를 사용할지 말지 체크를 위한 배열
	static int cnt; // 부분수열의 개수

	static int DFS(int L) {
		if (L == N) {
			int sum = 0; // 부분수열의 합

			for (int i = 0; i < N; i++)
				if (check[i] == 1)
					sum += arr[i];

			if (sum == S)
				cnt++;
		} else {
			check[L] = 1; // 사용 함
			DFS(L + 1);
			check[L] = 0; // 사용하지 않음
			DFS(L + 1);
		}

		return S == 0 ? cnt - 1 : cnt; // 합이 0인 경우 공집합 빼주기
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); 
		S = sc.nextInt(); 
		arr = new int[N]; 
		check = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		System.out.println(DFS(0));
	}

}