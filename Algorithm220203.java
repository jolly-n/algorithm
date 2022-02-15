import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* ���α׷��ӽ� (�Ǻ���ġ ��)
 * https://programmers.co.kr/learn/courses/30/lessons/12945?language=java
 */

class Algorithm220203 {
	/* Ǯ�� */
	public static int solution(int n) {
		List<Integer> fibo = new ArrayList<>();
		fibo.add(0);
		fibo.add(1);

		for (int i = 2; i <= n; i++)
			fibo.add((fibo.get(i - 2) + fibo.get(i - 1)) % 1234567); // int �ڷ��� ũ�⸦ �����ֱ� ����
//		System.out.println(fibo); // ����Ʈ Ȯ�ο�
		return fibo.get(n);
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�Է��ϼ��� >> ");
		System.out.println(solution(kb.nextInt()));
	}
}