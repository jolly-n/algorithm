import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* ���α׷��ӽ� (���� ���� �� �����ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 */

class Algorithm220128 {
	/* Ǯ�� */
	public static int[] solution(int[] arr) {
		/* ���2 */
//		int min = 0; // ���� ���� ���� �ε��� ��
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[min] > arr[i])
//				min = i;
//		}
//
//		// ���� �� �����ϰ� �迭 ä���
//		int[] ans = new int[arr.length - 1];
//
//		for (int i = 0; i < min; i++)
//			ans[i] = arr[i];
//
//		for (int i = min; i < ans.length; i++)
//			ans[i] = arr[i + 1];
//
//		return ans.length == 0 ? new int[] { -1 } : ans;
//	}

		/* ���1 (ArrayList �̿�) */
		// int[] -> ArrayList
		List<Integer> li = new ArrayList<>();
		for (int n : arr) {
			li.add(n);
		}

		// ���� ���� �� ����
		List<Integer> dest = new ArrayList<>(li); // ����Ʈ ���纻
		Collections.sort(dest); // ����
		li.remove(li.indexOf(dest.get(0))); // ������ ����

		// ArrayList -> int[]
		int[] ans = new int[li.size()];
		for (int i = 0; i < ans.length; i++)
			ans[i] = li.get(i);

		return li.size() == 0 ? new int[] { -1 } : ans;
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] ex1 = { 4, 3, 2, 1 };
		int[] ex2 = { 10 };

		System.out.println(Arrays.toString(solution(ex1)));
		System.out.println(Arrays.toString(solution(ex2)));
	}
}