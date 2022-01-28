import java.util.Scanner;

/* ���α׷��ӽ� (�ݶ��� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */

class Algorithm220127 {
	public static int solution(int num) {
		/* ���2(for�� �̿�) */
		long longNum = (long) num;

		for (int i = 0; i <= 500; i++) {
			if (longNum == 1)
				return i;

			longNum = (longNum % 2 == 0) ? (longNum / 2) : (longNum * 3 + 1);
			
			// ���׿����ڷ� �ڵ����
//			if (longNum % 2 == 0) {
//				longNum /= 2;
//				continue;
//			}
//
//			longNum = longNum * 3 + 1;
		}
		return -1;
	}

		/* ���1 (while�� �̿�) */
//		long longNum = (long)num;
//		int cnt = 0; // �ݺ� Ƚ��
//
//		while (longNum != 1) {
//			if (cnt >= 500)
//				return -1;
//			
//			// ¦���� ���
//			if (longNum % 2 == 0) {
//				longNum = longNum/2;
//				cnt++;
//				continue;
//			}
//			
//			// Ȧ���� ���
//			if (longNum % 2 != 0) {
//				longNum = longNum * 3 + 1;
//				cnt++;
//				continue;
//			}
//		}
//		return cnt;
//	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("�Է��ϼ��� >> ");
		System.out.println(solution(kb.nextInt()));
	}
}