import java.util.Scanner;

/* ���� (�������� �Ҽ�)
 * https://www.acmicpc.net/problem/10859
 */

class Algorithm220414__2 {
	static boolean isPrime(Long num) {
		for (int i = 2; i < num; i++) // 1�� �ڱ� �ڽ� ����
			if (num % i == 0) // ����� �ִٸ� �Ҽ� X
				return false;
		
		return true;
	}

	static String solution(String n) {
		String answer = "no";
		StringBuilder sb = new StringBuilder(n); // ������ ���ڸ� ���� �뵵

		// 3,4,7�� ������ ��� ���ڰ� �ƴϹǷ� ����
		if (n.contains("3") || n.contains("4") || n.contains("7"))
			return answer;

		// ���� ���ڰ� �Ҽ����� Ȯ��
		if (isPrime(Long.parseLong(n))) {
			System.out.println("���� ���� : " + n);
			
			for (int i = 0; i < n.length(); i++) {
				// 6 -> 9
				if (n.charAt(i) == '6')
					sb.replace(i, i + 1, "9");
				// 9 -> 6
				if (n.charAt(i) == '9')
					sb.replace(i, i + 1, "6");
			}
		} else {
			return answer; 
		}

		// ������ ���ڰ� �Ҽ����� Ȯ��
		sb = sb.reverse();
		System.out.println("������ ���� : " + sb);
		
		if (isPrime(Long.parseLong(sb.toString())))
			answer = "yes";

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(solution(n));
	}

}