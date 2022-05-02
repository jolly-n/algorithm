import java.util.LinkedList;
import java.util.Queue;

/* 프로그래머스 (다리를 지나는 트럭)
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */

class Algorithm220430__2 {

	static int solution(int bridge_length, int weight, int[] truck_weights) {
		int sum = 0; // 다리 위에 있는 트럭의 무게 합
		int time = 0; // 시간

		Queue<Integer> truck = new LinkedList<Integer>(); // 대기중인 트럭
		Queue<Integer> passTruck = new LinkedList<Integer>(); // 다리 위에 있는 트럭

		for (int tw : truck_weights)
			truck.offer(tw);

		while (!truck.isEmpty()) {
//			System.out.println("대기중인 트럭 : " + truck);
//			System.out.println("다리 위에 있는 트럭 : " + passTruck);
//			System.out.println("시간 : " + time + " 무게 : " + sum);
//			System.out.println("------------------------------------");
			
			// 다리가 비어있는 경우 (아무 트럭도 없음)
			if (passTruck.isEmpty()) {
				sum += truck.peek(); // 무게 증가
				time++; // 시간 증가
				passTruck.offer(truck.poll()); // 트럭을 다리에 올림
				continue;
			}

			// 다리가 가득 차지 않은 경우 (진행중인 트럭이 있음)
			if (passTruck.size() < bridge_length) {
				// 다음 트럭을 다리에 올릴 수 있는 지 확인
				if (sum + truck.peek() <= weight) {
					sum += truck.peek(); // 무게 증가
					passTruck.offer(truck.poll());
				} else {
					passTruck.offer(0);
				}

				time++; // 시간 증가
				continue;
			}

			// 다리가 가득 찬 경우 (더이상 트럭이 올라갈 수 없음)
			if (passTruck.size() <= bridge_length) {
				sum -= passTruck.peek(); // 무게 감소
				passTruck.poll(); // 다리 끝에 도달한 트럭 꺼냄
			}
		}

		return time + bridge_length; // 마지막으로 올라간 트럭이 지나는 시간 더하기
	}

	public static void main(String[] args) {
		// test case
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };

		System.out.println(solution(bridge_length, weight, truck_weights));
	}

}