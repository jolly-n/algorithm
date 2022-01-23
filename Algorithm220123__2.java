import java.util.Scanner;

/* ���α׷��ӽ� (���ڿ� �� p�� y�� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */

class Algorithm220123__2 {
	/* Ǯ�� */
	public static boolean solution(String s) {
		int pCnt = 0; // p�� ���� ������ ���� �ʱ�ȭ
		int yCnt = 0; // y�� ������ ������ ���� �ʱ�ȭ

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pCnt++;
			}
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yCnt++;
			}
		}

		if (pCnt == yCnt) // p�� y�� ������ ������ ���
			return true;  // true
		if (pCnt == 0 && yCnt == 0) // p�� y�� ���� ���
			return false;           // false
		return false;     // p�� y�� ������ �ٸ� ��� false
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("�Է��ϼ���: ");
		System.out.println(solution(kb.nextLine()));
	}
}