import java.util.Arrays;
import java.util.Scanner;

/* ���� (���� �ڸ���)
 * https://www.acmicpc.net/problem/2805
 */

class Algorithm220510__2 {
	static long count(long[] trees, long height) {
		long sum = 0; // �߸� ������ ���� ��

		for (long tree : trees) {
			if (tree > height) // ���ܱ� ���̺��� Ŭ ��쿡�� ������ �߸�
				sum += tree - height;
		}

		return sum;
	}

	static long solution(int n, long m, long[] trees) {
		Arrays.sort(trees); // �������� ����
		long answer = 0; // ���ܱ� ����
		long lt = 1;
		long rt = trees[n - 1];

		while (lt <= rt) {
			long mid = (lt + rt) / 2;

			if (count(trees, mid) >= m) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������ ��
		long m = sc.nextLong(); // ����̰� ���������� �ϴ� ������ ����

		long[] trees = new long[n];

		for (int i = 0; i < n; i++)
			trees[i] = sc.nextLong();

		System.out.println(solution(n, m, trees));
	}

}