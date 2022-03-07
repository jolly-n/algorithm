import java.util.Scanner;

/* ���� (Ʈ�� ����)
 * https://www.acmicpc.net/problem/2979
 */

class Algorithm220304 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int A = kb.nextInt(); // 1�� ���� : A��
		int B = kb.nextInt(); // 2�� ���� : B��
		int C = kb.nextInt(); // 3�� ���� : C��

		int[] arr = new int[100];

		for (int i = 0; i < 3; i++) {
			int in = kb.nextInt(); // �����ð�
			int out = kb.nextInt(); // �����ð�

			for (int j = in; j < out; j++)
				arr[j] += 1;
		}

		int cntA = 0; // 1�� ���� �ð�
		int cntB = 0; // 2�� ���� �ð�
		int cntC = 0; // 3�� ���� �ð�

		for (int n : arr) {
			if (n == 0)
				continue;

			if (n == 1)
				cntA += 1;

			if (n == 2)
				cntB += 1;

			if (n == 3)
				cntC += 1;
		}

		int fee = (A * cntA) + (B * cntB * 2) + (C * cntC * 3); // �� �������

		System.out.println(fee);
	}

}