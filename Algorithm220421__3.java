import java.util.Scanner;

/* 백준 (수들의 합2)
 * https://www.acmicpc.net/problem/2003
 */

class Algorithm220421__3 {

	static int solution(int n, int m, int[] arr) {
		int cnt = 0; // 경우의 수
		int sum = 0;
		
		// 투 포인터
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];

			if (sum == m)
				cnt++;

			while (sum >= m) {
				sum -= arr[lt++];
				
				if (sum == m) 
					cnt++;
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수열의 개수
		int m = sc.nextInt(); // 합

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(n, m, arr));
	}

}