import java.util.Scanner;

/* ���α׷��ӽ� (�� ���� ������ ��)
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */

class Algorithm220117 {
	/* Ǯ�� */
	public static long solution(int a, int b) {
		/* ���2 (���������� �� �̿�) */
		return ((long)Math.abs(a-b)+1)*(a+b)/2; // ��=(����)(ù°��+��������)/2
	}
	
		/* ���1 */
//		long ans = 0;
//		int max = Math.max(a, b);
//		int min = Math.min(a, b);
//		
//		for (int i=min; i<=max; i++) {
//			ans += i;
//		}
//		return ans;
//	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("�Է��ϼ���.");
		System.out.println(solution(kb.nextInt(), kb.nextInt()));
	}
}