import java.util.Scanner;
import java.util.Stack;

/* 백준 (괄호 끼워넣기)
 * https://www.acmicpc.net/problem/11899
 */

class Algorithm220428__2 {

	static int solution(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == ')' && !stack.isEmpty() && stack.peek() == '(') // )일 경우
				stack.pop(); // ( 제거
			else
				stack.push(c);
		}
		
		return stack.size(); // 괄호 짝이 없어 남은 것의 개수
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}