import java.util.Scanner;

/* ���� (�κм����� ��)
 * https://www.acmicpc.net/problem/1182
 */

class Algorithm220513__2 {
	static int N; // ������ ����
	static int S; // ������ ��
	static int[] arr; // ������ ���� �迭
	static int[] check; // ���� ������� ���� üũ�� ���� �迭
	static int cnt; // �κм����� ����

	static int DFS(int L) {
		if (L == N) {
			int sum = 0; // �κм����� ��

			for (int i = 0; i < N; i++)
				if (check[i] == 1)
					sum += arr[i];

			if (sum == S)
				cnt++;
		} else {
			check[L] = 1; // ��� ��
			DFS(L + 1);
			check[L] = 0; // ������� ����
			DFS(L + 1);
		}

		return S == 0 ? cnt - 1 : cnt; // ���� 0�� ��� ������ ���ֱ�
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); 
		S = sc.nextInt(); 
		arr = new int[N]; 
		check = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		System.out.println(DFS(0));
	}

}