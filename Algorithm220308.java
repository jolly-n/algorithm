import java.util.Scanner;

/* ���� (ROT13)
 * https://www.acmicpc.net/problem/11655
 */

class Algorithm220308 {

	static StringBuilder rot13(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			int code = s.charAt(i);

			// �빮���� ���
			if ('A' <= code && code <= 'Z') {
				if (code + 13 > 'Z')
					code -= 13;
				else
					code += 13;
			}

			// �ҹ����� ���
			if ('a' <= code && code <= 'z') {
				if (s.charAt(i) + 13 > 'z')
					code -= 13;
				else
					code += 13;
			}

			sb.append((char) code);
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println(rot13(kb.nextLine()));
	}

}