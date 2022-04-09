import java.util.Scanner;

/* 백준 (암호)
 * https://www.acmicpc.net/problem/1718
 */

class Algorithm220409__2 {

	static String solution(String s, String key) {
		String answer = "";

		while (!(s.length() <= key.length())) {
			key += key;
		}

		for (int i = 0; i < s.length(); i++) {
			int n = key.charAt(i) - 'a' + 1; // 알파벳 상에서 차지하는 순서
			char c = s.charAt(i);

			if (c == ' ') {
				answer += c;
				continue;
			}

			if (c - n < 'a')
				answer += (char)(c + (26 - n));
			else
				answer += (char)(c - n);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		String key = kb.nextLine();

		System.out.println(solution(s, key));
	}

}