import java.util.Arrays;
import java.util.Scanner;

/* 백준 (나무 자르기)
 * https://www.acmicpc.net/problem/2805
 */

class Algorithm220510__2 {
	static long count(long[] trees, long height) {
		long sum = 0; // 잘린 나무의 길이 합

		for (long tree : trees) {
			if (tree > height) // 절단기 높이보다 클 경우에만 나무가 잘림
				sum += tree - height;
		}

		return sum;
	}

	static long solution(int n, long m, long[] trees) {
		Arrays.sort(trees); // 오름차순 정렬
		long answer = 0; // 절단기 높이
		long lt = 1;
		long rt = trees[n - 1];

		while (lt <= rt) {
			long mid = (lt + rt) / 2;

			if (count(trees, mid) >= m) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 나무의 수
		long m = sc.nextLong(); // 상근이가 가져가려고 하는 나무의 길이

		long[] trees = new long[n];

		for (int i = 0; i < n; i++)
			trees[i] = sc.nextLong();

		System.out.println(solution(n, m, trees));
	}

}