import java.util.Scanner;

/* ���α׷��ӽ� (�ϻ��� ��)
 * https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */

class Algorithm220129__2 {
	/* Ǯ�� */
	public static boolean solution(int x) {
		// �� �ڸ��� ���ϱ�
		String s = String.valueOf(x);
		String[] arr = s.split("");
		
		int sum = 0;
		for (String a : arr) {
			sum += Integer.parseInt(a);
		}
		// System.out.println(sum);
		
		// �ϻ��� �� �Ǻ�
		return (x % sum == 0) ? true : false;
	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�Է��ϼ��� >> ");
		System.out.println(solution(kb.nextInt()));
	}
}