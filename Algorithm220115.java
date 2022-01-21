import java.util.Scanner;

/* 프로그래머스 (문자열 다루기 기본)
 * https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
 */

public class Algorithm220115 {
	/* 풀이 */
	public static boolean solution(String s) {
		/* 방법2 */
		// 문자열의 길이가 4 또는 6이 아니면 flase
		if (s.length() != 4 && s.length() !=6)
			return false;
		// 문자열이 숫자가 아니면 flase
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) <'0' || s.charAt(i) > '9')
				return false;
		}
		return true;
	}

//		/* 방법1 */
//		// 문자열의 길이기 4 또는 6인가?
//		boolean ans = false;
//		if (s.length() == 4 || s.length() == 6) {
//			// 문자열이 모두 숫자로 구성돼있나?
//			for (int i = 0; i < s.length(); i++) {
//				if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
//					ans = true;
//				} else {
//					ans = false;
//					break;
//				}
//			}
//		}
//		else
//			ans = false;
//		return ans;
//	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("입력해주세요: ");
		System.out.println(solution(kb.nextLine()));
	}
}