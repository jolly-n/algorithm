import java.util.Scanner;

/* ���� (��ġ)
 * https://www.acmicpc.net/problem/7568
 */

class Algorithm220412__1 {

	static StringBuilder solution(int n, int[][] arr) {
		StringBuilder rank = new StringBuilder(); // ��ġ ���

		for (int i = 0; i < n; i++) {
			int cnt = 1; // �ڽź��� �� ū ��ġ�� ��� ī��Ʈ
			
			for (int j = 0; j < n; j++)
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					cnt++;
			
			rank.append(cnt + " ");
		}
		
		return rank.deleteCharAt(rank.length()-1); // �� �� ���� ����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		System.out.println(solution(n, arr));
	}

}