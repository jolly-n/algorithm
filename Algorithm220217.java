import java.util.Arrays;
import java.util.Collections;

/* 프로그래머스 (최솟값 만들기)
 * https://programmers.co.kr/learn/courses/30/lessons/12941
 */

class Algorithm220217 {

	/* 풀이 */
	public static int solution(int[] A, int[] B) {
		int sum = 0;

		// A[] 정렬
		Arrays.sort(A);
		System.out.println(Arrays.toString(A)); // 확인용

		// B[] 역정렬
		Integer[] integerB = new Integer[B.length];

		for (int i = 0; i < B.length; i++)
			integerB[i] = B[i];

		Arrays.sort(integerB, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerB)); // 확인용
		
		// 곱셈 누적
		for (int i = 0; i < A.length; i++) {
			sum += A[i] * integerB[i];
		}
		return sum;
	}

	/* 테스트 */
	public static void main(String[] args) {
		int[] A1 = { 1, 4, 2 };
		int[] B1 = { 5, 4, 4 };

		int[] A2 = { 1, 2 };
		int[] B2 = { 3, 4 };

		System.out.println(solution(A1, B1));
		System.out.println(solution(A2, B2));
	}

}
