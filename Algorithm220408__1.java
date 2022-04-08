import java.util.Scanner;

/* ���� (ȸ��)
 * https://www.acmicpc.net/problem/17609
 */

class Algorithm220408__1 {

	static int solution(String s) {
		// ȸ���� ���
		if (isPalindrome(s)) {
			return 0;
		}

		// ����ȸ�� or �Ѵ� �ƴ� ���
		int lt = 0;
		int rt = s.length() - 1;

		while (lt < rt) {
			// ���� ���
			if (s.charAt(lt) == s.charAt(rt)) {
				lt++;
				rt--;
				continue;
			}

			// �ٸ� ��� (���� ����, ������ ���� ���� �ϳ��� �����ص� ����ȸ��)
			if (checkLeft(lt, rt, new StringBuilder(s)) || 
					checkRight(lt, rt, new StringBuilder(s))) {
				return 1;
			}
			
			break;
		}
		return 2;
	}
	
	static boolean checkLeft(int lt, int rt, StringBuilder sb) {		
		if (sb.charAt(lt + 1) == sb.charAt(rt)) {
			sb = sb.deleteCharAt(lt);
//			System.out.println("���� ���� Ȯ�� : " + sb.toString());
			
			if (isPalindrome(sb.toString()))
				return true;
		}
		return false;
	}
	
	static boolean checkRight(int lt, int rt, StringBuilder sb) {
		if (sb.charAt(lt) == sb.charAt(rt - 1)) {
			sb = sb.deleteCharAt(rt);
//			System.out.println("������ ���� Ȯ�� : " + sb.toString());
			
			if (isPalindrome(sb.toString()))
				return true;
		}
		return false;
	}

	static boolean isPalindrome(String str) {
		String tmp = new StringBuilder(str).reverse().toString();

		if (str.equals(tmp))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++)
			str[i] = kb.next();

		for (String s : str)
			System.out.println(solution(s));
	}

}