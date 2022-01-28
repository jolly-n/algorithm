import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 프로그래머스 (제일 작은 수 제거하기)
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 */

class Algorithm220128 {
	/* 풀이 */
	public static int[] solution(int[] arr) {
		/* 방법2 */
//		int min = 0; // 가장 작은 수의 인덱스 값
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[min] > arr[i])
//				min = i;
//		}
//
//		// 작은 수 제외하고 배열 채우기
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

		/* 방법1 (ArrayList 이용) */
		// int[] -> ArrayList
		List<Integer> li = new ArrayList<>();
		for (int n : arr) {
			li.add(n);
		}

		// 가장 작은 수 제거
		List<Integer> dest = new ArrayList<>(li); // 리스트 복사본
		Collections.sort(dest); // 정렬
		li.remove(li.indexOf(dest.get(0))); // 작은수 제거

		// ArrayList -> int[]
		int[] ans = new int[li.size()];
		for (int i = 0; i < ans.length; i++)
			ans[i] = li.get(i);

		return li.size() == 0 ? new int[] { -1 } : ans;
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] ex1 = { 4, 3, 2, 1 };
		int[] ex2 = { 10 };

		System.out.println(Arrays.toString(solution(ex1)));
		System.out.println(Arrays.toString(solution(ex2)));
	}
}