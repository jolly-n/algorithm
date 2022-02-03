import java.util.*;
import java.util.Map.Entry;

/* ���α׷��ӽ� (������)
 * https://programmers.co.kr/learn/courses/30/lessons/42889?language=java
 */

class Algorithm220129__3 {
	/* Ǯ�� */
	public static int[] solution(int N, int[] stages) {
		int totalUser = stages.length; // �� �����
		System.out.println("stages : " + Arrays.toString(stages));

		// �������� �� �÷��̾� ���� ��Ÿ���� �迭
		int[] stageUser = new int[N];
		for (int i = 1; i <= N; i++) { // i�� ��������
			for (int n : stages)
				if (i == n)
					stageUser[i - 1] += 1;
		}
		System.out.println("stagesUser : " + Arrays.toString(stageUser));

		// �������� �� �������� ��Ÿ���� ��
		HashMap<Integer, Double> failMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (totalUser == 0) {
				failMap.put(i + 1, 0.0);
				continue;
			}

			failMap.put(i + 1, (double) stageUser[i] / totalUser);
			totalUser -= stageUser[i]; // ���������� ������ �÷��̾� ��
		}
		System.out.println("failRate : " + failMap);

		// ����
		// sort�޼ҵ带 ����ϱ� ���� list���·� ��ȯ
		List<Map.Entry<Integer, Double>> failLi = new ArrayList<>(failMap.entrySet());

		Comparator<Map.Entry<Integer, Double>> comp = (d1, d2) -> d2.getValue().compareTo(d1.getValue()); // value���� �������� ��������
		Collections.sort(failLi, comp);
//		Collections.sort(failLi, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		// list -> int[]
		int[] ans = new int[N];
		int cnt = 0;
		for (Entry<Integer, Double> entry : failLi) {
			ans[cnt++] = entry.getKey();
		}
		return ans;
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] test1 = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] test2 = { 4, 4, 4, 4, 4 };
		int[] test3 = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(solution(5, test1)));
		System.out.println(Arrays.toString(solution(4, test2)));
		System.out.println(Arrays.toString(solution(8, test3)));
	}
}