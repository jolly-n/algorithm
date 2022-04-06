import java.util.Arrays;
import java.util.Scanner;

/* ���� (���ĺ� ã��)
 * https://www.acmicpc.net/problem/10809
 */

class Algorithm220406__1 {

	public static void solution(String s) {
		int[] answer = new int[26];

		Arrays.fill(answer, -1); // -1�� �迭 �ʱ�ȭ

		char alpha = 'a';
		for (int i = 0; i < answer.length; i++) {
//			System.out.println("alpha= " + alpha);
			for (int j = 0; j < s.length(); j++) {
				if (alpha == s.charAt(j)) {
					answer[i] = j;
					alpha += 1;
					break;
				} else if (j == s.length() - 1) {
					alpha += 1;
					break;
				}
			}
		}
		
		// �迭 ���
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		solution(s);
	}

}