import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* ���� (������)
 * https://www.acmicpc.net/problem/1406
 */

class Algorithm220427__2 {

	static String solution(int n, String str, String[] command) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>(); 
		
		for (char c : str.toCharArray())
			stack.push(c);
		
		for (String s : command) {
			if (s.equals("L")) { // Ŀ���� �������� �� ĭ �ű�
				if (stack.isEmpty())
					continue;
				
				sb.append(stack.pop());
			}

			if (s.equals("D")) { // Ŀ���� ���������� �� ĭ �ű�
				if (sb.length() <= 0)
					continue;
				
				stack.push(sb.charAt(sb.length()-1)); // ������ sb �ٽ� ���ÿ� ���
				sb.deleteCharAt(sb.length()-1); // sb���� ����
			}

			if (s.equals("B")) { // Ŀ�� ���ʿ� �ִ� ���� ����
				if (stack.isEmpty())
					continue;
				stack.pop();
			}

			if (s.length() > 1) { // $��� ���ڸ� Ŀ�� ���ʿ� �߰�
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
		String str = br.readLine(); // �ԷµǾ� �ִ� ���ڿ�
		int n = Integer.valueOf(br.readLine()); // �Է��� ��ɾ��� ����

		String[] command = new String[n];

		for (int i = 0; i < n; i++)
			command[i] = br.readLine();

		System.out.println(solution(n, str, command));
	}

}