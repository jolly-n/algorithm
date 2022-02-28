import java.util.LinkedList;
import java.util.Queue;

/* ���α׷��ӽ� (������)
 * https://programmers.co.kr/learn/courses/30/lessons/42587?language=java
 */

class Algorithm220224 {

	static class Task {
		int location;
		int priority;

		public Task(int location, int priority) {
			this.location = location;
			this.priority = priority;
		}
	}

	/* Ǯ�� */
	public static int solution(int[] priorities, int location) {
		// ť ����
		Queue<Task> que = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++)
			que.offer(new Task(i, priorities[i]));

		int print = 0; // ��� Ƚ��

		while (!que.isEmpty()) {
			Task cur = que.poll(); // ���� ����
			boolean bool = false;
			
			for (Task t : que) {   // ��� ����
//				System.out.println("����:" + cur.priority + "  ���:" + t.priority); // Ȯ�ο�
				if (cur.priority < t.priority) {
					bool = true;
					break;
				}
			} // end of for
			
			if (bool) {  		// �켱������ �������� ������
				que.add(cur); 	// �ڷ� ������
			} else { 			// �켱������ ���� ���� ������
				print++; 		// ��� +1
				if (cur.location == location)
					break;
			}
		} // end of while
		return print;
	} // end of solution()

	/* �׽�Ʈ */
	public static void main(String[] args) {
		int[] prt = { 1, 1, 9, 1, 1, 1 };
		int lct = 0;

		System.out.println(solution(prt, lct));
	}

}
