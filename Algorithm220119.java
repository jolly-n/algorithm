import java.util.Scanner;

/* ���α׷��ӽ� (��� ���� ��������)
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */

class Algorithm220119 {
	/* Ǯ�� */
	public static String solution(String s) {
		// �ܾ��� ���̰� Ȧ���� ���
		if (s.length() % 2 != 0) 
			return s.charAt(s.length()/2) + "";
		
		// �ܾ��� ���̰� ¦���� ���
		return s.substring((s.length()/2)-1, (s.length()/2)+1); // substring(a, b) -> a<=...<b 
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("�Է��ϼ���: ");
		System.out.println(solution(kb.nextLine()));
	}
}