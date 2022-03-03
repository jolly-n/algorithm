import java.util.Arrays;
import java.util.Comparator;

/* ���α׷��ӽ� (��ȭ��ȣ ���)
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */

class Algorithm220228 {

	/* Ǯ�� */
	static boolean solution(String[] phone_book) {
		// ���ڿ� ���� �� ����
		Arrays.sort(phone_book);
//		System.out.println(Arrays.toString(phone_book)); // Ȯ�ο�

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i+1].startsWith(phone_book[i])) // ���ξ��� ���
				return false;
		}

		return true;
	}
		
		// ȿ���� ��� x
//		// ���ڿ� ���̸� �������� ����
//		Arrays.sort(phone_book, (i1, i2) -> i1.length() - i2.length());
//		
//		for (int i = 0; i < phone_book.length; i++) {
//			for (int j = i + 1; j < phone_book.length; j++) {
//				int len = phone_book[i].length();
//
//				System.out.println(i + "��° : " + phone_book[i]); // Ȯ�ο�
//				System.out.println(j + "��° : " + phone_book[j].substring(0, len)); // Ȯ�ο�
//
//				if (phone_book[i].equals(phone_book[j].substring(0, len))) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		String[] test = { "888", "123", "1235", "567", "88" };
		System.out.println(solution(test));
	}

}