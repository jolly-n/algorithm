import java.util.Scanner;
import java.util.Stack;

/* 백준 (균형잡힌 세상)
 * https://www.acmicpc.net/problem/4949
 */

class Algorithm220428__1 {

	static String solution(String str) {
		String answer = "yes";
		Stack<Character> stack = new Stack<>(); // (),[]를 담을 스택

		for (char c : str.toCharArray()) {
			if (c == '(' || c == ')' || c == '[' || c == ']') {
				if (c == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						return "no";
					}

					stack.pop(); // [ 제거
					continue;
				}

				if (c == ')') {
					if (stack.isEmpty() || stack.peek() != '(')
						return "no";

					stack.pop(); // ( 제거
					continue;
				}

				stack.push(c);
//				System.out.println("스택 : " + stack); // 확인용
			}
		}
		
		if (!stack.isEmpty()) // 닫아주는 괄호 짝이 없을 경우
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