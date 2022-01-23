import java.util.Scanner;

/* 프로그래머스 (가운데 글자 가져오기)
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */

class Algorithm220119 {
	/* 풀이 */
	public static String solution(String s) {
		// 단어의 길이가 홀수일 경우
		if (s.length() % 2 != 0) 
			return s.charAt(s.length()/2) + "";
		
		// 단어의 길이가 짝수일 경우
		return s.substring((s.length()/2)-1, (s.length()/2)+1); // substring(a, b) -> a<=...<b 
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("입력하세요: ");
		System.out.println(solution(kb.nextLine()));
	}
}