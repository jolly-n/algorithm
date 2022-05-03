import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* ���� (������ ť)
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
		int answer = 0; // ����Ʈ Ƚ��
		Arrays.sort(arr, Collections.reverseOrder()); // �켱���� ����

		int cnt = 0; // �켱���� ����
		while (true) {
			if (que.peek().priority != arr[cnt]) {
				que.offer(que.poll());
			}
			else {
				answer++; // ����Ʈ +1
				cnt++; // ���� �켱������
				
				if (que.peek().id == M)
					break;
				
				que.poll();
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt(); // �׽�Ʈ���̽��� ��

		for (int i = 0; i < test; i++) {
			int N = sc.nextInt(); // ������ ����
			int M = sc.nextInt(); // ���°�� �μ�Ǿ����� �ñ��� ������ ���� ť���� �����ִ� ����

			Queue<Print> que = new LinkedList<>();
			Integer[] arr = new Integer[N];

			for (int j = 0; j < N; j++) {
				int p = sc.nextInt(); // �켱����
				que.add(new Print(j, p));
				arr[j] = p;
			}

			System.out.println(solution(arr, que, N, M));
		}
	}

}