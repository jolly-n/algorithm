import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/* 백준 (알파벳 개수)
 * https://www.acmicpc.net/problem/10808
 */

class Algorithm220303 {

	/* 풀이 */
	static void solution(String s) {
		// Map 생성
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char alpha = 97; // a = 97 , z = 122
		
		for (int i = 0; i <= 25; i++)
			map.put(alpha++, 0);
		
		// 알파벳 개수 세기
		for (int i = 0; i < s.length(); i++)
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		
		// 출력
		StringBuilder answer = new StringBuilder();
		
		for (int i : map.values())
			answer.append(String.valueOf(i)).append(" ");
		
		System.out.println(answer);
	}

	/* 테스트 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);		
		solution(kb.nextLine());
	}

}