import java.util.Scanner;

/* ���� (�Ӹ����)
 * https://www.acmicpc.net/problem/10988
 */

class Algorithm220305 {
	
	/* Ǯ�� */
	static int palindrome(String s) {

		String reverse = ""; // �Ųٷ� ���� ��

		for (int i = s.length() - 1; i >= 0; i--)
			reverse += s.charAt(i);

		if (s.equals(reverse)) // ������ �Ӹ����
			return 1;
		
		return 0; 
	}
	
	/* �׽�Ʈ */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println(palindrome(kb.nextLine()));
	}

}