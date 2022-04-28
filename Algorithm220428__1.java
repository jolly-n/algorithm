import java.util.Scanner;
import java.util.Stack;

/* ���� (�������� ����)
 * https://www.acmicpc.net/problem/4949
 */

class Algorithm220428__1 {

	static String solution(String str) {
		String answer = "yes";
		Stack<Character> stack = new Stack<>(); // (),[]�� ���� ����

		for (char c : str.toCharArray()) {
			if (c == '(' || c == ')' || c == '[' || c == ']') {
				if (c == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						return "no";
					}

					stack.pop(); // [ ����
					continue;
				}

				if (c == ')') {
					if (stack.isEmpty() || stack.peek() != '(')
						return "no";

					stack.pop(); // ( ����
					continue;
				}

				stack.push(c);
//				System.out.println("���� : " + stack); // Ȯ�ο�
			}
		}
		
		if (!stack.isEmpty()) // �ݾ��ִ� ��ȣ ¦�� ���� ���
			return "no";

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			if (str.equals("."))
				break;
			System.out.println(solution(str));
		}
	}

}