import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 백준 (쇠막대기)
 * https://www.acmicpc.net/problem/10799
 */

class Algorithm220429__3 {

	static int solution(String x) {
		int cnt = 0;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);

			if (c == '(') {
				stack.push('(');
			} 
			else {
				stack.pop(); // ( 제거
				
				if (x.charAt(i - 1) == '(') // 이전이 (일 경우 레이저
					cnt += stack.size(); // 잘린 쇠막대기 추가
				else // 아닐 경우 쇠막대기
					cnt++; // 쇠막대기 자투리 추가
			}
		}

		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		System.out.println(solution(x));
	}

}