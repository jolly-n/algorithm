import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* ���α׷��ӽ� (�������� ���� ����)
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */

class Algorithm220125 {
	public static String solution(String[] participant, String[] completion) {
		/* ���2 (�迭 �̿�) */
//		Arrays.sort(participant); // �迭 ����
//		Arrays.sort(completion);  // �迭 ����
////		System.out.println(Arrays.toString(participant)); // Ȯ�ο�
////		System.out.println(Arrays.toString(completion));  // Ȯ�ο�
//
//		for (int i = 0; i < completion.length; i++) {
//			if (!participant[i].equals(completion[i])) {  // ���� ��
//				return participant[i];                    // ���� ���� ��� ��ȯ
//			}
//		}
//		return participant[(participant.length) - 1]; // �迭�� ���� ������ ��� ��ȯ
//	}

		/* ���1 (Map �̿�) */
		String ans = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		// ������ �ֱ�(���������� ��� +1)
		for (int i=0; i<participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0)+1); // key : ������ �̸�/ getOrDefault : ���޵� key���� �����ϴ� value�� ��ȯ(������ �ι�° ���� ��ȯ)
		}
//		System.out.print("1: " + map); // Ȯ�ο�
//		System.out.println();
		
		// ������ �������� �� ����
		for (int i=0; i<completion.length; i++) {
			map.put(completion[i], map.get(completion[i])-1);
		}
//		System.out.print("2: " + map); // Ȯ�ο�
//		System.out.println();
		
		Set<String> ks = map.keySet();
		
		// �������� ���� ���(value!=0)
		for (String s : ks)
//			System.out.println(map.get(s)); // Ȯ�ο�
			if (map.get(s) != 0)
				return s;
		
		return ans;
	}

	public static void main(String[] args) {
		String[] p1 = { "leo", "kiki", "eden" };
		String[] c1 = { "eden", "kiki" };

		String[] p2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] c2 = { "josipa", "filipa", "marina", "nikola" };

		String[] p3 = { "mislav", "stanko", "mislav", "ana" };
		String[] c3 = { "stanko", "ana", "mislav" };

		System.out.println(solution(p1, c1));
		System.out.println(solution(p2, c2));
		System.out.println(solution(p3, c3));
	}
}