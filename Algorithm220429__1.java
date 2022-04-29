import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/* 백준 (카드2)
 * https://www.acmicpc.net/problem/2164
 */

class Algorithm220429__1 {

	static int solution(int n) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			q.offer(i);

		while (q.size() != 1) {
			q.poll(); // 맨 위에 카드 버림
			q.offer(q.poll()); // 그 다음 맨 위에 있는 카드 뒤로 옮김
		}
		
		answer = q.poll(); // 마지막에 남는 카드
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 카드의 개수
		System.out.println(solution(n));
	}

}