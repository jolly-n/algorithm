import java.util.Scanner;

/* ���� (������)
 * https://www.acmicpc.net/problem/1439
 */

class Algorithm220407__2 {
	
	static int solution(String s) {
		int cnt0 = 0;
		int cnt1 = 0;
		
		// ù��° ���� ���ڰ� 0���� 1������ ���� ī��Ʈ
		if (s.charAt(0) == '0')
			cnt0++;
		else
			cnt1++;
		
		// ���� ���ڿ� ���� ���ڰ� �ٸ��� 0/1�� ���� ī��Ʈ ����
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i-1) == '0')
				if (s.charAt(i)=='1')
					cnt1++;
			
			if (s.charAt(i-1) == '1')
				if(s.charAt(i) == '0')
					cnt0++;
		}
		
		// �ּ� Ƚ�� ��ȯ
		return Math.min(cnt0, cnt1);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(solution(s));
	}

}