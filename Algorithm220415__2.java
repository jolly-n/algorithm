import java.util.Scanner;

/* ���� (��� ���ϱ�)
 * https://www.acmicpc.net/problem/1205
 */

class Algorithm220415__2 {

	static int solution(int n, int p, Long score, Long[] list) {
		int rank = 1;
		
		// ���� ��ŷ ����Ʈ�� �� ������ ���
		if (n == p)
			if (list[n-1] >= score) // ���� ���� �������� �¼��� ������ �۰ų� ������
				return -1;

		// ���� ��ŷ ����Ʈ�� �ڸ��� ���� ���
		for (int i = 0; i < n; i++) {
			if (list[i] > score) {
				rank++;
				continue;
			}
		}

		return rank;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ����Ʈ�� �ִ� ������ ����
		Long score = sc.nextLong(); // �¼��� ����
		int p = sc.nextInt(); // ��ŷ ����Ʈ�� �ö� �� �� �ִ� ������ ����

		Long[] list = new Long[n];

		for (int i = 0; i < n; i++)
			list[i] = sc.nextLong();

		System.out.println(solution(n, p, score, list));
	}

}