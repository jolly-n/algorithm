import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* ���α׷��ӽ� (���� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/67258
 */

class Algorithm220421__2 {

	static int[] solution(String[] gems) {
		int[] answer = new int[2]; // [���� ������ ��ȣ, �� ������ ��ȣ]
		int minLen = Integer.MAX_VALUE; // ���� ª�� ����
		int lt = 0; // ���� ������

		Set<String> set = new HashSet<>(); // ���� ���� (Set�� ����� �ߺ� ����)

		for (String gem : gems)
			set.add(gem);

		Map<String, Integer> map = new HashMap<>(); // ���� ������ ���� �� map ���

		for (int rt = 0; rt < gems.length; rt++) {
			map.put(gems[rt], map.containsKey(gems[rt]) ? map.get(gems[rt]) + 1 : 1);

			// ��� ������ ������ ������ ���
			while (map.size() == set.size()) {
//				System.out.println("--- lt:" + lt + " / rt:" + rt + " ---");
//				System.out.println(map);

				if (rt - lt < minLen) {
					answer[0] = lt + 1; // �ε����� 0���� �����ϹǷ� +1
					answer[1] = rt + 1; // �ε����� 0���� �����ϹǷ� +1
					minLen = rt - lt;
				}

				map.put(gems[lt], map.get(gems[lt]) - 1); // lt�� ���ʴ�� ���ֱ�

				if (map.get(gems[lt]) == 0)
					map.remove(gems[lt]);

				lt++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// �׽�Ʈ ���̽�
		String[] gems = { "DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA" };
//		String[] gems = {"AA", "AB", "AC", "AA", "AC"};
//		String[] gems = {"XYZ", "XYZ", "XYZ"};
//		String[] gems = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};

		System.out.println(Arrays.toString(solution(gems)));
	}

}