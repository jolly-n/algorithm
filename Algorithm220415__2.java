import java.util.Scanner;

/* 백준 (등수 구하기)
 * https://www.acmicpc.net/problem/1205
 */

class Algorithm220415__2 {

	static int solution(int n, int p, Long score, Long[] list) {
		int rank = 1;
		
		// 현재 랭킹 리스트가 꽉 차있을 경우
		if (n == p)
			if (list[n-1] >= score) // 가장 작은 점수보다 태수의 점수가 작거나 같으면
				return -1;

		// 현재 랭킹 리스트에 자리가 있을 경우
		for (int i = 0; i < n; i++) {
			if (list[i] > score) {
				rank++;
				continue;
			}
		}

		return rank;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 리스트에 있는 점수의 개수
		Long score = sc.nextLong(); // 태수의 점수
		int p = sc.nextInt(); // 랭킹 리스트에 올라 갈 수 있는 점수의 개수

		Long[] list = new Long[n];

		for (int i = 0; i < n; i++)
			list[i] = sc.nextLong();

		System.out.println(solution(n, p, score, list));
	}

}