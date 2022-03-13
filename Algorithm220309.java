import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* ���� (��й�ȣ �����ϱ�)
 * https://www.acmicpc.net/problem/4659
 */

class Algorithm220309 {

	/* Ǯ�� */
	static void pwQuality(List<String> li) {
		String quality = "";

		for (String s : li) {

			// ���� (a,e,i,o,u) 1�� �ݵ�� ����
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					quality = "is acceptable";
					break;
				}
				quality = "is not acceptable";
			}

			// ���� ���� ���� �ι� ���� �ȵ� (ee, oo�� ���)
			loop1: 
			for (int i = 0; i < s.length() - 1; i++) {
					if (s.charAt(i) == s.charAt(i+1))
						if (!(s.charAt(i) == 'e' || s.charAt(i) == 'o')) {
							quality = "is not acceptable";
							break loop1;
						}
			}

			// ���� 3��, ���� 3�� �������� ���� �ȵ�
			loop2: 
			for (int i = 0; i < s.length() - 2; i++) {
				// ���� 3��
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
					if (s.charAt(i + 1) == 'a' || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'i' || s.charAt(i + 1) == 'o' || s.charAt(i + 1) == 'u')
						if (s.charAt(i + 2) == 'a' || s.charAt(i + 2) == 'e' || s.charAt(i + 2) == 'i' || s.charAt(i + 2) == 'o' || s.charAt(i + 2) == 'u') {
							quality = "is not acceptable";
							break loop2;
						}
				
				// ���� 3��
				if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'))
					if (!(s.charAt(i + 1) == 'a' || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'i' || s.charAt(i + 1) == 'o' || s.charAt(i + 1) == 'u'))
						if (!(s.charAt(i + 2) == 'a' || s.charAt(i + 2) == 'e' || s.charAt(i + 2) == 'i' || s.charAt(i + 2) == 'o' || s.charAt(i + 2) == 'u')) {
							quality = "is not acceptable";
							break loop2;
						}
			}
			
			print(s, quality);
		}
	} // end of method

	/* ��� ���� */
	static void print(String s, String m) {
		System.out.printf("<%s> %s. %n", s, m);
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		List<String> li = new ArrayList<>();

		String str = "";
		while (!(str.equals("end"))) {
			str = kb.nextLine();
			li.add(str);
		}

		li.remove(li.size() - 1); // ������ end ����
		pwQuality(li);
	}

}