
/* 프로그래머스 (숫자의 표현)
 * https://programmers.co.kr/learn/courses/30/lessons/12924
 */

class Algorithm220212 {

	/* 풀이 */
	public static int solution(int n) {
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) { 
				sum += j;
				if (sum == n) {
					cnt++;
					break; // 합이 n일 경우 다음 자연수부터 덧셈 시작
				}
				if (sum > n)
					break;
			}
		}
		return cnt;
	}

	/* 테스트 */
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
}