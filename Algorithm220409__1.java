import java.util.Scanner;

/* ���α׷��ӽ� (���ڿ� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */

class Algorithm220409__1 {

	static int solution(String s) {
		int minLen = s.length(); // �ּ� ���ڿ� ���� �ʱ�ȭ

		for (int i = 1; i <= (s.length() / 2); i++) {
			String str = s + " "; // ���� �� ���ڿ� (1�� ���� �񱳸� ���� ���� �߰�)
			String zip = ""; // ���� ���

			String tmp = str.substring(0, i); // ���� ����
			int cnt = 1; // ���� ī��Ʈ
			str = str.substring(i);

//			System.out.println("====================== i : " + i + " ======================");
			while (str.length() != 0) {
//				System.out.println("------- �ݺ� -------");
//				System.out.println("���� ���� : " + tmp);
//				System.out.println("���� ���� : " + str);

				// ���� ���ڰ� ���� ���ں��� ª�� �� -> �״�� �ٿ���
				if (str.length() <= tmp.length()) {
					zip += tmp + str.substring(0, str.length() - 1); // �ٿ��� ���� �����ϰ� �߰�
					if (cnt > 1)
						zip += String.valueOf(cnt);
					minLen = Math.min(minLen, zip.length());
//					System.out.println("���� ��� : " + zip);
					break;
				}

				if (str.substring(0, i).equals(tmp)) {
					cnt++;
					str = str.substring(i);
					continue;
				} else {
					zip += tmp;
					if (cnt > 1)
						zip += String.valueOf(cnt);
					cnt = 1;
					tmp = str.substring(0, i);
					str = str.substring(i);
				}
//				System.out.println("���� ��� : " + zip);
			}

//			System.out.println("���� : " + zip.length());
			minLen = Math.min(minLen, zip.length());
		}

		return minLen;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(solution(s));
	}

}
