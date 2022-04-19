import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 백준 (소수의 연속합)
 * https://www.acmicpc.net/problem/1644
 */

class Algorithm220414__1 {

	static int solution(int n) {
		List<Integer> prime = primeNum(n);
//		System.out.println(prime); // 확인용

		int cnt = 0; // 경우의 수

		for (int i = 0; i < prime.size(); i++) {
			int sum = 0; // 소수의 합
			for (int j = i; j < prime.size(); j++) {
				sum += prime.get(j);

				if (sum == n)
					cnt++;

				if (sum > n)
					break;
			}
		}

		return cnt;
	}

	static List<Integer> primeNum(int n) {
		List<Integer> prime = new ArrayList<>();
		int[] check = new int[n + 1];

		// 0, 1은 소수 제외
		check[0] = 1;
		check[1] = 1;

		// 에라토스테네스 체를 이용해 소수가 아닌 수 1로 체크하기
		for (int i = 2; i <= n; i++)
			for (int j = i + i; j <= n; j = j + i)
				check[j] = 1;

		// 소수만 저장
		for (int i = 0; i <= n; i++)
			if (check[i] == 0)
				prime.add(i);

		return prime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}