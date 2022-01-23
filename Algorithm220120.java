import java.util.Scanner;

/* ���α׷��ӽ� (������ �ݾ� ����ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 */

class Algorithm220120 {
	/* Ǯ�� */
	public static long solution(int price, int money, int count) {
		/* ���2 (�������� �̿�)*/		
		long totalPrice = (long)count*(price+price*count)/2; // count/2�� ���� ���ָ� �������� ���ư��� ������ /2�� �ǵڿ� ����� ��
		
		return Math.max(totalPrice-money, 0); // totalPrice-money : �ݾ��� ������ ��� ���, �ݾ��� �������� ���� ��� ����
	}
	
		/* ���1 */
//		// �� �ʿ��� ���̱ⱸ�� �̿� �ݾ�
//		long totalPrice = 0;		
//		for (int i = 1; i <= count; i++) {
//			totalPrice += price * i;
//		}
//		
//		// �ݾ��� �������� ���� ���
//		if (money >= totalPrice) {
//			return 0;
//		}
//		
//		// �ݾ��� ������ ���
//		return Math.abs(money - totalPrice);
//	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("���̱ⱸ �̿��: ");
		int p = kb.nextInt();
		System.out.print("ó�� ������ �ִ� �ݾ�: ");
		int m = kb.nextInt();
		System.out.print("���̱ⱸ �̿� Ƚ��: ");
		int c = kb.nextInt();
		
		System.out.print("������ �ݾ�: ");
		System.out.println(solution(p, m, c));
	}
}