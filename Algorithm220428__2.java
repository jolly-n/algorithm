import java.util.Scanner;
import java.util.Stack;

/* ���� (��ȣ �����ֱ�)
 * https://www.acmicpc.net/problem/11899
 */

class Algorithm220428__2 {

	static int solution(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == ')' && !stack.isEmpty() && stack.peek() == '(') // )�� ���
				stack.pop(); // ( ����
			else
				stack.push(c);
		}
		
		return stack.size(); // ��ȣ ¦�� ���� ���� ���� ����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}