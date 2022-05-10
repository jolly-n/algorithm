import java.util.Arrays;
import java.util.Scanner;

/* ���� (���� �ڸ���)
 * https://www.acmicpc.net/problem/1654
 */

class Algorithm220510__1 {
	static int count(int[] arr, long len) {
		int cnt = 0; // ������ ����

		for (int i : arr)
			cnt += i / len; // ���� �ڸ���
		
		return cnt;
	}

	static long solution(int k, int n, int[] arr) {
		Arrays.sort(arr); // �������� ����
		long answer = 0;  // ������ �ִ� ����
		long lt = 1;
		long rt = arr[k - 1];

		while (lt <= rt) {
			long mid = (lt + rt) / 2;

			if (count(arr, mid) >= n) {
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
		int k = sc.nextInt(); // ������ �ִ� ������ ����
		int n = sc.nextInt(); // �ʿ��� ������ ����
		int[] arr = new int[k];

		for (int i = 0; i < k; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(k, n, arr));
	}

}