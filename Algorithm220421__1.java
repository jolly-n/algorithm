import java.util.Scanner;

/* ���� (���� ��)
 * https://www.acmicpc.net/problem/2737
 */

class Algorithm220421__1 {

	static int solution(int n) {
		int answer = 0; 
		int cnt = 1; // ���ӵ� ���� ����

		n--; // 1 ����
		
		while (n > 0) {
			cnt++;
			n -= cnt; // 2, 3, 4, ...  ����
			
			// ������ ���� �� ��� cnt���� ���ӵ� ���� ǥ�� ����
			if (n % cnt == 0) 
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // �׽�Ʈ ���̽��� ����

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.println(solution(n));
		}

	}

}