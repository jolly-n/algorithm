import java.util.Scanner;

/* 프로그래머스 (문자열 내 p와 y의 개수)
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */

class Algorithm220123__2 {
	/* 풀이 */
	public static boolean solution(String s) {
		int pCnt = 0; // p의 개수 세어줄 변수 초기화
		int yCnt = 0; // y의 개수를 세어줄 변수 초기화

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pCnt++;
			}
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yCnt++;
			}
		}

		if (pCnt == yCnt) // p와 y의 개수가 동일할 경우
			return true;  // true
		if (pCnt == 0 && yCnt == 0) // p와 y가 없을 경우
			return false;           // false
		return false;     // p와 y의 개수가 다른 경우 false
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("입력하세요: ");
		System.out.println(solution(kb.nextLine()));
	}
}