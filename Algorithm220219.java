
/* ���α׷��ӽ� (���� ū ����)
 * https://programmers.co.kr/learn/courses/30/lessons/12911
 */

class Algorithm220219 {

	/* Ǯ�� */
	public static int solution(int n) {
		int nextNum = n + 1; // n�� ���� ����

		while (count(n) != count(nextNum)) {
			System.out.println(nextNum); // Ȯ�ο�
			nextNum++;
		}
		return nextNum;
	}

	// 2������ ��ȯ �� 1�� ���� ���ϴ� �޼ҵ�
	public static int count(int num) {
		int cnt = 0; // 1�� ����

		String binaryString = Integer.toBinaryString(num); // 10 -> 2����

		for (int i = 0; i < binaryString.length(); i++)
			if (binaryString.charAt(i) == '1')
				cnt++;

		System.out.println(num + "�� 2���� : " + binaryString + " / 1�� ���� : " + cnt); // Ȯ�ο�

		return cnt;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}

}
