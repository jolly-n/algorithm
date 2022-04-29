import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 백준 (요세푸스 문제)
 * https://www.acmicpc.net/problem/1158
 */

class Algorithm220429__2 {

	static String solution(int n, int k) {
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			q.offer(i);

		sb.append("<");
		
		while (q.size()!=1) {
			for (int i = 1; i < k; i++)
				q.offer(q.poll());
			sb.append(q.poll()).append(", "); // k번째 사람 제거
		}
		
		sb.append(q.poll()).append(">");
		
 		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 사람의 수
		int k = Integer.parseInt(st.nextToken()); // 제거 순서
	
		System.out.println(solution(n, k));
	}

}