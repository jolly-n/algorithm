import java.util.Scanner;

/* ���α׷��ӽ� (���ڿ� �ٷ�� �⺻)
 * https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
 */

public class Algorithm220115 {
	/* Ǯ�� */
	public static boolean solution(String s) {
		/* ���2 */
		// ���ڿ��� ���̰� 4 �Ǵ� 6�� �ƴϸ� flase
		if (s.length() != 4 && s.length() !=6)
			return false;
		// ���ڿ��� ���ڰ� �ƴϸ� flase
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) <'0' || s.charAt(i) > '9')
				return false;
		}
		return true;
	}

//		/* ���1 */
//		// ���ڿ��� ���̱� 4 �Ǵ� 6�ΰ�?
//		boolean ans = false;
//		if (s.length() == 4 || s.length() == 6) {
//			// ���ڿ��� ��� ���ڷ� �������ֳ�?
//			for (int i = 0; i < s.length(); i++) {
//				if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
//					ans = true;
//				} else {
//					ans = false;
//					break;
//				}
//			}
//		}
//		else
//			ans = false;
//		return ans;
//	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("�Է����ּ���: ");
		System.out.println(solution(kb.nextLine()));
	}
}