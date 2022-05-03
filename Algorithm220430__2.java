import java.util.LinkedList;
import java.util.Queue;

/* ���α׷��ӽ� (�ٸ��� ������ Ʈ��)
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */

class Algorithm220430__2 {

	static int solution(int bridge_length, int weight, int[] truck_weights) {
		int sum = 0; // �ٸ� ���� �ִ� Ʈ���� ���� ��
		int time = 0; // �ð�

		Queue<Integer> truck = new LinkedList<Integer>(); // ������� Ʈ��
		Queue<Integer> passTruck = new LinkedList<Integer>(); // �ٸ� ���� �ִ� Ʈ��

		for (int tw : truck_weights)
			truck.offer(tw);

		while (!truck.isEmpty()) {
//			System.out.println("������� Ʈ�� : " + truck);
//			System.out.println("�ٸ� ���� �ִ� Ʈ�� : " + passTruck);
//			System.out.println("�ð� : " + time + " ���� : " + sum);
//			System.out.println("------------------------------------");
			
			// �ٸ��� ����ִ� ��� (�ƹ� Ʈ���� ����)
			if (passTruck.isEmpty()) {
				sum += truck.peek(); // ���� ����
				time++; // �ð� ����
				passTruck.offer(truck.poll()); // Ʈ���� �ٸ��� �ø�
				continue;
			}

			// �ٸ��� ���� ���� ���� ��� (�������� Ʈ���� ����)
			if (passTruck.size() < bridge_length) {
				// ���� Ʈ���� �ٸ��� �ø� �� �ִ� �� Ȯ��
				if (sum + truck.peek() <= weight) {
					sum += truck.peek(); // ���� ����
					passTruck.offer(truck.poll());
				} else {
					passTruck.offer(0);
				}

				time++; // �ð� ����
				continue;
			}

			// �ٸ��� ���� �� ��� (���̻� Ʈ���� �ö� �� ����)
			if (passTruck.size() <= bridge_length) {
				sum -= passTruck.peek(); // ���� ����
				passTruck.poll(); // �ٸ� ���� ������ Ʈ�� ����
			}
		}

		return time + bridge_length; // ���������� �ö� Ʈ���� ������ �ð� ���ϱ�
	}

	public static void main(String[] args) {
		// test case
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };

		System.out.println(solution(bridge_length, weight, truck_weights));
	}

}