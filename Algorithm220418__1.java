import java.util.Scanner;

/* ���� (�ӽ� ���� ���ϱ�)
 * https://www.acmicpc.net/problem/1268
 */

class Algorithm220418__1 {

	static int solution(int s, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < s; i++) { // i�л�
			int cnt = 0;

			for (int j = 0; j < s; j++) // j�л�
				for (int k = 0; k < 5; k++) // k�г�
					if (arr[i][k] == arr[j][k]) { // i�л��� j�л��� k�г⿡ ���� ���� ���
						cnt++;
						break; // �ѹ� ���� ���̾����� �� ������ �ʾƵ� ��
					}

			if (cnt > max) {
				max = cnt;
				answer = i + 1; // �л� ��ȣ = �ε��� +1
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(); // �л� ��
		int[][] arr = new int[s][5]; // 1-5�г� ���� ���ߴ� ��

		for (int i = 0; i < s; i++)
			for (int j = 0; j < 5; j++)
				arr[i][j] = sc.nextInt();

		System.out.println(solution(s, arr));
	}

}