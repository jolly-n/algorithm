import java.util.Scanner;

/* ���α׷��ӽ� (�Ҽ� ã��)
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */

class Algorithm220114 {
	/* Ǯ�� */
	public static int solution(int n) {
		/* ���3 (�����佺�׳׽��� ü) */
		int[] arr = new int[n+1]; // n���� ������ �迭
		for (int i=0; i<arr.length; i++) {
			arr[i] = i; // �迭�� �ε��� �� ����
		}
		
		// �Ҽ��� �ƴ� �� �Ǻ� (�Ҽ��� �ƴϸ� 0���� ����)
		int cnt = 0; // �Ҽ��� �ƴ� �� ī����
		arr[1] = 0;  // 1�� �Ҽ��� �ƴ�
		for (int i=1; i<arr.length; i++) {
			if (arr[i]==0) { // �Ҽ��� �ƴ� ���
				cnt++;
				continue;
			}
			for (int k=2; k<=(n/i); k++) { // i*k<=n -> k<=n/i ���� ����
				arr[i*k] = 0; // i�� ����� ��� ->  �Ҽ��� �ƴ�
			}
		}
		return n-cnt; // �Ҽ��� ���� -> (n-�Ҽ��� �ƴ� ����)
	}

		/* ���2 (����) */
//		int ans = 0;
//		Loop :
//		for (int i=2; i<=n; i++) {
//			// �Ҽ� �Ǻ�
//			for (int k=2; k<i; k++) {
//				if (i % k == 0) // 1�� �ڱ��ڽ��� ������ ����� �����ϸ� �Ҽ� �ƴ�
//					continue Loop;
//			}
//			ans++;
//		}		
//		return ans;
//	}
	
		/* ���1 (����) */
//		int ans = 0;
//		for (int i=2; i<=n; i++) { // 1�� �Ҽ��� �ƴϹǷ� ����
//			// ����� ���� ���ϱ�
//			int cnt = 0;			
//			for (int k=1; k<=i; k++) {
//				if (i % k == 0) // k�� i�� ���
//					cnt++;
//			}
//			System.out.println(i + "�� ����� ����: " + cnt );
//			
//			if (cnt <= 2)
//				ans++;
//		}
//		return ans;
//	}
		
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�Է��ϼ���: ");
		System.out.println(solution(kb.nextInt()));
	}
}