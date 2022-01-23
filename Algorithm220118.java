import java.util.Scanner;

/* ���α׷��ӽ� (�������� 1�� �Ǵ� �� ã��)
 * https://programmers.co.kr/learn/courses/30/lessons/87389
 */

class Algorithm220118 {
	/* Ǯ�� */
	public static int solution(int n) {
		/* ���1 */
		int ans = 0;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 1) {
				ans = i;
				break;
			}
		}
		return ans;
	}
		
		/* ���2 (�ڵ� ����) */
//		for (int i=1; i<=n; i++) {
//			if (n % i == 1) {
//				return i;
//			}
//		}
//		return 0;
//	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�Է��ϼ���: ");
		System.out.println(solution(kb.nextInt()));
	}
}