
/* ���α׷��ӽ� (������ ǥ��)
 * https://programmers.co.kr/learn/courses/30/lessons/12924
 */

class Algorithm220212 {

	/* Ǯ�� */
	public static int solution(int n) {
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) { 
				sum += j;
				if (sum == n) {
					cnt++;
					break; // ���� n�� ��� ���� �ڿ������� ���� ����
				}
				if (sum > n)
					break;
			}
		}
		return cnt;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
}