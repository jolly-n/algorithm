import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* ���α׷��ӽ� (�ΰ� �̾Ƽ� ���ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */

class Algorithm220129__1 {
	/* Ǯ�� */
	public static int[] solution(int[] numbers) {
		Set<Integer> li = new HashSet<>(); // �ߺ� ���Ÿ� ���� HashSet ����

		// �ΰ� �̾Ƽ� ���ϱ�
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				li.add(numbers[i] + numbers[j]);
				// System.out.println(numbers[i] + "+" + numbers[j] + "=" + (numbers[i]+numbers[j])); // Ȯ�ο�
			}
		}

		// HashSet -> int[]
		int cnt = 0;
		int[] ans = new int[li.size()];
		for (int n : li) {
			ans[cnt++] = n;
		}
		Arrays.sort(ans); // �������� ����
		return ans;
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] numbers1 = { 2, 1, 3, 4, 1 };
		int[] numbers2 = { 5, 0, 2, 7 };

		System.out.println(Arrays.toString(solution(numbers1)));
		System.out.println(Arrays.toString(solution(numbers2)));
	}
}