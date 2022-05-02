import java.util.Scanner;

/* 백준 (가장 긴 짝수 연속한 부분 수열(large))
 * https://www.acmicpc.net/problem/22862
 */

class Algorithm220422__1 {

	static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0; // 삭제 횟수 카운팅
		
		// 투 포인터
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] % 2 != 0) // 홀수일 경우 삭제
				cnt++;

			// 삭제 횟수가 k보다 커질 경우
			while (cnt > k) {
				if (arr[lt] % 2 != 0)
					cnt--;
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1 - cnt);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수열의 길이
		int k = sc.nextInt(); // 삭제 가능한 횟수

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(n, k, arr));
	}

}