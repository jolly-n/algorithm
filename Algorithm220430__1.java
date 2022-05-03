import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 백준 (프린터 큐)
 * https://www.acmicpc.net/problem/1966
 */

class Print {
	int id;
	int priority;

	public Print(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

class Algorithm220430__1 {

	static int solution(Integer[] arr, Queue<Print> que, int N, int M) {
		int answer = 0; // 프린트 횟수
		Arrays.sort(arr, Collections.reverseOrder()); // 우선순위 기준

		int cnt = 0; // 우선순위 순서
		while (true) {
			if (que.peek().priority != arr[cnt]) {
				que.offer(que.poll());
			}
			else {
				answer++; // 프린트 +1
				cnt++; // 다음 우선순위로
				
				if (que.peek().id == M)
					break;
				
				que.poll();
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt(); // 테스트케이스의 수

		for (int i = 0; i < test; i++) {
			int N = sc.nextInt(); // 문서의 개수
			int M = sc.nextInt(); // 몇번째로 인쇄되었는지 궁금한 문서가 현재 큐에서 놓여있는 순서

			Queue<Print> que = new LinkedList<>();
			Integer[] arr = new Integer[N];

			for (int j = 0; j < N; j++) {
				int p = sc.nextInt(); // 우선순위
				que.add(new Print(j, p));
				arr[j] = p;
			}

			System.out.println(solution(arr, que, N, M));
		}
	}

}