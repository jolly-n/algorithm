import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 프로그래머스 (두개 뽑아서 더하기)
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */

class Algorithm220129__1 {
	/* 풀이 */
	public static int[] solution(int[] numbers) {
		Set<Integer> li = new HashSet<>(); // 중복 제거를 위한 HashSet 생성

		// 두개 뽑아서 더하기
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				li.add(numbers[i] + numbers[j]);
				// System.out.println(numbers[i] + "+" + numbers[j] + "=" + (numbers[i]+numbers[j])); // 확인용
			}
		}

		// HashSet -> int[]
		int cnt = 0;
		int[] ans = new int[li.size()];
		for (int n : li) {
			ans[cnt++] = n;
		}
		Arrays.sort(ans); // 오름차순 정렬
		return ans;
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] numbers1 = { 2, 1, 3, 4, 1 };
		int[] numbers2 = { 5, 0, 2, 7 };

		System.out.println(Arrays.toString(solution(numbers1)));
		System.out.println(Arrays.toString(solution(numbers2)));
	}
}