import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* ���� (�踷���)
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
				stack.pop(); // ( ����
				
				if (x.charAt(i - 1) == '(') // ������ (�� ��� ������
					cnt += stack.size(); // �߸� �踷��� �߰�
				else // �ƴ� ��� �踷���
					cnt++; // �踷��� ������ �߰�
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