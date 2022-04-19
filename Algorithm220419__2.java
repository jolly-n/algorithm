import java.util.Scanner;

/* ���� (�迭 ��ġ��)
 * https://www.acmicpc.net/problem/11728
 */

class Algorithm220419__2 {

	static String solution(int n, int m, int[] a, int[] b) {
		StringBuilder sb = new StringBuilder();
		
		// �� ������
		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {
			// ���� ������� �߰�
			if (a[p1] < b[p2])
				sb.append(a[p1++] + " ");
			else
				sb.append(b[p2++] + " ");
		}

		// ���� ���� ������ ������� �߰�
		while (p1 < n) sb.append(a[p1++] + " ");
		while (p2 < m) sb.append(b[p2++] + " ");

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �迭 a�� ũ��
		int m = sc.nextInt(); // �迭 b�� ũ��
		int[] a = new int[n];
		int[] b = new int[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();

		System.out.println(solution(n, m, a, b));
	}

}