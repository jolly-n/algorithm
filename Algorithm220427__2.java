import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 백준 (에디터)
 * https://www.acmicpc.net/problem/1406
 */

class Algorithm220427__2 {

	static String solution(int n, String str, String[] command) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>(); 
		
		for (char c : str.toCharArray())
			stack.push(c);
		
		for (String s : command) {
			if (s.equals("L")) { // 커서를 왼쪽으로 한 칸 옮김
				if (stack.isEmpty())
					continue;
				
				sb.append(stack.pop());
			}

			if (s.equals("D")) { // 커서를 오른쪽으로 한 칸 옮김
				if (sb.length() <= 0)
					continue;
				
				stack.push(sb.charAt(sb.length()-1)); // 마지막 sb 다시 스택에 담기
				sb.deleteCharAt(sb.length()-1); // sb에서 삭제
			}

			if (s.equals("B")) { // 커서 왼쪽에 있는 문자 삭제
				if (stack.isEmpty())
					continue;
				stack.pop();
			}

			if (s.length() > 1) { // $라는 문자를 커서 왼쪽에 추가
				char $ = s.toCharArray()[2];
				stack.push($);
			}
		}
		
		while (!stack.isEmpty())
			sb.append(stack.pop());

		return sb.reverse().toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 입력되어 있는 문자열
		int n = Integer.valueOf(br.readLine()); // 입력할 명령어의 개수

		String[] command = new String[n];

		for (int i = 0; i < n; i++)
			command[i] = br.readLine();

		System.out.println(solution(n, str, command));
	}

}