import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* ���α׷��ӽ� (���� ���ڴ� �Ⱦ�)
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */

class Algorithm220124 {
	/* Ǯ�� */
	public static int[] solution(int[] arr) {
		List<Integer> li = new ArrayList<Integer>();

		li.add(arr[0]); // ù �� �־��ֱ�

		for (int n : arr) {
//			if (li.get(li.size()-1) == n) {
//				continue;
//			}

			// ���� �ߺ��� ���� �ƴѰ�?
			if (li.get(li.size() - 1) != n) {
				li.add(n);
			}
		}

		// ArrayList<Integer> -> int[] ��ȯ
		int[] ans = new int[li.size()];
		for (int i = 0; i < li.size(); i++) {
			ans[i] = li.get(i);
		}
		return ans;
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] test1 = { 1, 1, 3, 3, 0, 1, 1 };
		int[] test2 = { 4, 4, 4, 3, 3 };

		System.out.println(Arrays.toString(solution(test1)));
		System.out.println(Arrays.toString(solution(test2)));
	}
}