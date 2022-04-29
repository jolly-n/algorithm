import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/* ���� (ī��2)
 * https://www.acmicpc.net/problem/2164
 */

class Algorithm220429__1 {

	static int solution(int n) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			q.offer(i);

		while (q.size() != 1) {
			q.poll(); // �� ���� ī�� ����
			q.offer(q.poll()); // �� ���� �� ���� �ִ� ī�� �ڷ� �ű�
		}
		
		answer = q.poll(); // �������� ���� ī��
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // ī���� ����
		System.out.println(solution(n));
	}

}