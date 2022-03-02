import java.util.StringTokenizer;

/* ���α׷��ӽ� (k�������� �Ҽ� ���� ���ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/92335
 */

class Algorithm220226 {

	/* Ǯ�� */
	static int solution(int n, int k) {
		// 10���� -> k����
		String decimalTo = Integer.toString(n, k);
//		System.out.println(n + "�� " + k + "���� : " + decimalTo); // Ȯ�ο�

		StringTokenizer st = new StringTokenizer(decimalTo, "0");

		int cnt = 0; // �Ҽ� ����

		while (st.hasMoreTokens()) {
			if (primeNum(st.nextToken()))
				cnt++;
		}
		
		return cnt;
	}

	// �Ҽ� �Ǻ� �޼ҵ�
	static boolean primeNum(String s) {
		long num = Long.parseLong(s);

		if (num == 1) // 1�� �Ҽ� �ƴ�
			return false;

		long sqrt = (long) Math.sqrt(num); // ������

		for (int i = 2; i <= sqrt; i++)
			if (num % i == 0)
				return false;

		return true;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		int n1 = 437674;
		int k1 = 3;
		int n2 = 110011;
		int k2 = 10;

		System.out.println(solution(n1, k1));
		System.out.println(solution(n2, k2));
	}

}