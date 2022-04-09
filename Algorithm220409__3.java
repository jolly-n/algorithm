import java.util.Arrays;
import java.util.Scanner;

/* 백준 (문자열 분석)
 * https://www.acmicpc.net/problem/10820
 */

class Algorithm220409__3 {

	static int[] solution(String s) {
		int[] answer = new int[4];
		Arrays.fill(answer, 0);

		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') //소문자
				answer[0] += 1;
			
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') //대문자
				answer[1] += 1;
			
			if ('0' <= s.charAt(i) && s.charAt(i) <= '9') //숫자
				answer[2] += 1;
			
			if (s.charAt(i)==' ') //공백
				answer[3] += 1;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EOF
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			
			for (int i : solution(s))
				System.out.print(i + " ");
			System.out.println();
		}
	}

}