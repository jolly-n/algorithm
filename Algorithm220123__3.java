import java.util.Scanner;

/* ���α׷��ӽ� (�ڸ��� ���ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */

class Algorithm220123__3 {
	/* Ǯ�� */
	public static int solution(int n) {
		/* ���2 */
		int ans = 0;

		while (n != 0) {
			ans += n % 10; 	// ������
			n = n / 10; 	// n = ��
		}
		return ans;
	}

		/* ���1 */
//		int ans = 0;
//		
//		String str = String.valueOf(n);
//		String[] strArr = str.split("");
////		System.out.println(Arrays.toString(strArr));
//		
//		for (String s : strArr)
//			ans += Integer.parseInt(s);
//		
//		return ans;
//	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("�Է��ϼ���: ");
		System.out.println(solution(kb.nextInt()));
	}
}