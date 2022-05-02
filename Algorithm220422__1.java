import java.util.Scanner;

/* ���� (���� �� ¦�� ������ �κ� ����(large))
 * https://www.acmicpc.net/problem/22862
 */

class Algorithm220422__1 {

	static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0; // ���� Ƚ�� ī����
		
		// �� ������
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] % 2 != 0) // Ȧ���� ��� ����
				cnt++;

			// ���� Ƚ���� k���� Ŀ�� ���
			while (cnt > k) {
				if (arr[lt] % 2 != 0)
					cnt--;
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1 - cnt);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������ ����
		int k = sc.nextInt(); // ���� ������ Ƚ��

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(n, k, arr));
	}

}