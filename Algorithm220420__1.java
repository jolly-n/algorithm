import java.util.Scanner;

/* ���� (����)
 * https://www.acmicpc.net/problem/2559
 */

class Algorithm220420__1 {

	static int solution(int n, int k, int[] arr) {
		int max = 0; // ���� �ִ밡 �Ǵ� ��
		int sum = 0; // ��
		int lt = 0;  // ���� ������
		
		// �ʱ� �� ���ϱ�
		for (int rt = 0; rt < k; rt++) { 
			sum += arr[rt];
			max = sum;
		}

		// ������ �����͸� �̵��ϸ� �� �� (sliding window)
		for (int rt = k; rt < n; rt++) {
			sum += (arr[rt] - arr[lt++]);
			max = Math.max(max, sum);
		}
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �µ��� ������ ��ü ��¥�� ��
		int k = sc.nextInt(); // ���� ���ϱ� ���� �������� ��¥�� ��
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(n, k, arr));
	}

}