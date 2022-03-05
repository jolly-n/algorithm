import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/* ���� (���ĺ� ����)
 * https://www.acmicpc.net/problem/10808
 */

class Algorithm220303 {

	/* Ǯ�� */
	static void solution(String s) {
		// Map ����
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char alpha = 97; // a = 97 , z = 122
		
		for (int i = 0; i <= 25; i++)
			map.put(alpha++, 0);
		
		// ���ĺ� ���� ����
		for (int i = 0; i < s.length(); i++)
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		
		// ���
		StringBuilder answer = new StringBuilder();
		
		for (int i : map.values())
			answer.append(String.valueOf(i)).append(" ");
		
		System.out.println(answer);
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);		
		solution(kb.nextLine());
	}

}