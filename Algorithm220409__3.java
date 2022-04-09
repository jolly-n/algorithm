import java.util.Arrays;
import java.util.Scanner;

/* ���� (���ڿ� �м�)
 * https://www.acmicpc.net/problem/10820
 */

class Algorithm220409__3 {

	static int[] solution(String s) {
		int[] answer = new int[4];
		Arrays.fill(answer, 0);

		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') //�ҹ���
				answer[0] += 1;
			
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') //�빮��
				answer[1] += 1;
			
			if ('0' <= s.charAt(i) && s.charAt(i) <= '9') //����
				answer[2] += 1;
			
			if (s.charAt(i)==' ') //����
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