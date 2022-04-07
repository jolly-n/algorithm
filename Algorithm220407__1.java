import java.util.Scanner;

/* 백준 (단어 뒤집기2)
 * https://www.acmicpc.net/problem/17413
 */

class Algorithm220407__1 {

	static void solution(String s) {
		StringBuilder answer = new StringBuilder();
		StringBuilder temp = new StringBuilder(); // 임시 저장용
		
		boolean tag = false;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			/* 태그 처리 */
			// 태그 시작되면 이전까지 저장된 단어 뒤집어서 추가
			if (c == '<') {
				tag = true;
				answer.append(temp.reverse());
				answer.append(c);
				temp.setLength(0);
				continue;
			}
			
			if (c == '>') {
				tag = false;
				answer.append(c);
				continue;
			}
			
			// 태그 안 문자일 경우 그대로 추가
			if (tag) {
				answer.append(c);
				continue;
			}
			
			/* 문자 처리 */
			// 공백일 경우 이전까지 저장된 단어 뒤집어서 추가
			if (c == ' ') {
				answer.append(temp.reverse()).append(c);
				temp.setLength(0);
				continue;
			}
			
			// 단어일 경우 temp에 저장
			temp.append(c);
		}
		
		// 마지막에 저장된 단어 뒤집어서 추가
		answer.append(temp.reverse());
		
		System.out.println(answer);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		solution(s);
	}

}