import java.util.LinkedList;
import java.util.Queue;

/* 프로그래머스 (프린터)
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

	/* 풀이 */
	public static int solution(int[] priorities, int location) {
		// 큐 생성
		Queue<Task> que = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++)
			que.offer(new Task(i, priorities[i]));

		int print = 0; // 출력 횟수

		while (!que.isEmpty()) {
			Task cur = que.poll(); // 현재 문서
			boolean bool = false;
			
			for (Task t : que) {   // 대기 문서
//				System.out.println("현재:" + cur.priority + "  대기:" + t.priority); // 확인용
				if (cur.priority < t.priority) {
					bool = true;
					break;
				}
			} // end of for
			
			if (bool) {  		// 우선순위가 높은것이 있으면
				que.add(cur); 	// 뒤로 보낸다
			} else { 			// 우선순위가 높은 것이 없으면
				print++; 		// 출력 +1
				if (cur.location == location)
					break;
			}
		} // end of while
		return print;
	} // end of solution()

	/* 테스트 */
	public static void main(String[] args) {
		int[] prt = { 1, 1, 9, 1, 1, 1 };
		int lct = 0;

		System.out.println(solution(prt, lct));
	}

}
