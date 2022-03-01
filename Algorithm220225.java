import java.util.*;

/* ���α׷��ӽ� (���ڿ� �� ������� �����ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */

class Algorithm220225 {

	/* Ǯ�� */
	public static String[] solution(String[] strings, int n) {
		// �켱 ���� �� ����
		Arrays.sort(strings);

		// Map ����
		Map<Integer, Character> map = new LinkedHashMap<>();

		for (Integer i = 0; i < strings.length; i++)
			map.put(i, strings[i].charAt(n));
		
//		System.out.println("���� : " + map); // Ȯ�ο�

		// Map�� value �������� ����
		List<Map.Entry<Integer, Character>> entry = new LinkedList<>(map.entrySet());
		entry.sort(Map.Entry.comparingByValue());

//		System.out.println("���� : " + entry); // Ȯ�ο�
		
		// n��° ���ڸ� �������� ���ĵ� ���ο� �迭
		String[] answer = new String[strings.length];

		for (int i = 0; i < entry.size(); i++)
			answer[i] = strings[entry.get(i).getKey()];

		return answer;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		String[] str1 = { "abce", "abcd", "cdx" };
		int n1 = 2;
		
		System.out.println(Arrays.toString(solution(str1, n1)));
	}

}