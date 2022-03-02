import java.util.StringTokenizer;

/* 프로그래머스 (k진수에서 소수 개수 구하기)
 * https://programmers.co.kr/learn/courses/30/lessons/92335
 */

class Algorithm220226 {

	/* 풀이 */
	static int solution(int n, int k) {
		// 10진수 -> k진수
		String decimalTo = Integer.toString(n, k);
//		System.out.println(n + "의 " + k + "진수 : " + decimalTo); // 확인용

		StringTokenizer st = new StringTokenizer(decimalTo, "0");

		int cnt = 0; // 소수 개수

		while (st.hasMoreTokens()) {
			if (primeNum(st.nextToken()))
				cnt++;
		}
		
		return cnt;
	}

	// 소수 판별 메소드
	static boolean primeNum(String s) {
		long num = Long.parseLong(s);

		if (num == 1) // 1은 소수 아님
			return false;

		long sqrt = (long) Math.sqrt(num); // 제곱근

		for (int i = 2; i <= sqrt; i++)
			if (num % i == 0)
				return false;

		return true;
	}

	/* 테스트 */
	public static void main(String[] args) {
		int n1 = 437674;
		int k1 = 3;
		int n2 = 110011;
		int k2 = 10;

		System.out.println(solution(n1, k1));
		System.out.println(solution(n2, k2));
	}

}