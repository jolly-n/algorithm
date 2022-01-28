import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 프로그래머스 (같은 숫자는 싫어)
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */

class Algorithm220124 {
	/* 풀이 */
	public static int[] solution(int[] arr) {
		List<Integer> li = new ArrayList<Integer>();

		li.add(arr[0]); // 첫 값 넣어주기

		for (int n : arr) {
//			if (li.get(li.size()-1) == n) {
//				continue;
//			}

			// 연속 중복인 값이 아닌가?
			if (li.get(li.size() - 1) != n) {
				li.add(n);
			}
		}

		// ArrayList<Integer> -> int[] 변환
		int[] ans = new int[li.size()];
		for (int i = 0; i < li.size(); i++) {
			ans[i] = li.get(i);
		}
		return ans;
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] test1 = { 1, 1, 3, 3, 0, 1, 1 };
		int[] test2 = { 4, 4, 4, 3, 3 };

		System.out.println(Arrays.toString(solution(test1)));
		System.out.println(Arrays.toString(solution(test2)));
	}
}