import java.util.Scanner;

/* 프로그래머스 (시저암호)
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */

class Algorithm220108__2 {
	public static String solution(String s, int n) {
		String answer = "";
		
		for (int i=0; i<s.length(); i++) {
			char alpha = s.charAt(i); // 문자열의 한글자씩 접근
			System.out.println("알파벳: " + alpha);
			
			if ('a' <= alpha && alpha <= 'z') {	// 소문자일 경우
				if (alpha+n > 'z')	// z가 넘어갈 경우
					answer += (char)(alpha + (n-26));
				else 
					answer += (char)(alpha + n);
			}
			else if ('A' <= alpha && alpha <= 'Z') { // 대문자일 경우
				if (alpha+n > 'Z')	// z가 넘어갈 경우
					answer += (char)(alpha + (n-26));
				else
					answer += (char)(alpha + n);
			}
			else answer += alpha;
		}
		return answer;			
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = kb.nextLine();
		
		System.out.print("거리를 입력하세요 : ");
		int num = kb.nextInt();
		
		System.out.println(solution(str, num));
	}
}