import java.util.Scanner;

/* ���α׷��ӽ� (���ڼ��ڼ�)
 * https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
 */

class Algorithm220113 {
	/* Ǯ�� */
	public static String solution(int n) {
		/* ���1 */
//		String ans = "";
//		for (int i=1; i<=n; i++) {
//			if (i % 2 != 0)	// Ȧ���� ���
//				ans += "��";
//			else 			// ¦���� ���
//				ans += "��"; 
//		}
//		return ans;
//	}
		
		/* ���2 (else����) */
//		String ans = "";
//		for (int i=1; i<=n; i++) {
//			if (i % 2 != 0)	{ // Ȧ���� ���
//				ans += "��";
//				continue;
//			}
//			ans += "��"; 
//		}
//		return ans;
//	}
		
		/* ���3 (���׿�����) */
//		String ans = "";
//		for (int i=1; i<=n; i++) {
//			ans += (i % 2 != 0) ? "��" : "��";
//		}
//		return ans;
//	}
	
		/* ���4 (StringBuilder) */
		StringBuilder sb = new StringBuilder(n); // ���ڿ� ���� n��ŭ ���۱��̸� ����
		for (int i=1; i<=n; i++) {
			sb.append((i % 2 != 0) ? "��" : "��");
		}
		return sb.toString();
	}

	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("������ ���̸� �Է��ϼ���: ");
		System.out.println(solution(kb.nextInt()));
	}
}