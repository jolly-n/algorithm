
/* 프로그래머스 (다음 큰 숫자)
 * https://programmers.co.kr/learn/courses/30/lessons/12911
 */

class Algorithm220219 {

	/* 풀이 */
	public static int solution(int n) {
		int nextNum = n + 1; // n의 다음 숫자

		while (count(n) != count(nextNum)) {
			System.out.println(nextNum); // 확인용
			nextNum++;
		}
		return nextNum;
	}

	// 2진수로 변환 후 1의 개수 구하는 메소드
	public static int count(int num) {
		int cnt = 0; // 1의 개수

		String binaryString = Integer.toBinaryString(num); // 10 -> 2진수

		for (int i = 0; i < binaryString.length(); i++)
			if (binaryString.charAt(i) == '1')
				cnt++;

		System.out.println(num + "의 2진수 : " + binaryString + " / 1의 개수 : " + cnt); // 확인용

		return cnt;
	}

	/* 테스트 */
	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}

}
