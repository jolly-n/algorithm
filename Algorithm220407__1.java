import java.util.Scanner;

/* ���� (�ܾ� ������2)
 * https://www.acmicpc.net/problem/17413
 */

class Algorithm220407__1 {

	static void solution(String s) {
		StringBuilder answer = new StringBuilder();
		StringBuilder temp = new StringBuilder(); // �ӽ� �����
		
		boolean tag = false;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			/* �±� ó�� */
			// �±� ���۵Ǹ� �������� ����� �ܾ� ����� �߰�
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
			
			// �±� �� ������ ��� �״�� �߰�
			if (tag) {
				answer.append(c);
				continue;
			}
			
			/* ���� ó�� */
			// ������ ��� �������� ����� �ܾ� ����� �߰�
			if (c == ' ') {
				answer.append(temp.reverse()).append(c);
				temp.setLength(0);
				continue;
			}
			
			// �ܾ��� ��� temp�� ����
			temp.append(c);
		}
		
		// �������� ����� �ܾ� ����� �߰�
		answer.append(temp.reverse());
		
		System.out.println(answer);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		solution(s);
	}

}