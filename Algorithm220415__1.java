import java.util.Scanner;

/* 백준 (보너스 점수)
 * https://www.acmicpc.net/problem/17389
 */

class Algorithm220415__1 {

	static int solution(int n, String s) {
		int score = 0;
		int bonus = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'O') {
				score += (i + 1) + bonus++;
//				bonus++;
			} else {
				bonus = 0;
			}
		}

		return score;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(solution(n, s));
	}

}