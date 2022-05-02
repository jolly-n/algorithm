import java.util.Arrays;

/* 프로그래머스 (n^2 배열 자르기)
 * https://programmers.co.kr/learn/courses/30/lessons/87390
 */

class Algorithm220418__2 {

	static int[] solution(int n, long left, long right) {
		int[] answer = new int[(int) (right - left + 1)];

		for (long i = left; i <= right; i++) {
			int row = (int) (i / n);
			int column = (int) (i % n);
			int idx = (int) (i - left);

			if (row < column) // 행보다 열이 클 경우
				answer[idx] = column + 1; // 0부터 시작하므로 +1
			else
				answer[idx] = row + 1; // 0부터 시작하므로 +1
		}

		return answer;
	}

	public static void main(String[] args) {
		// test
		int n = 4; // 2차원 배열의 크기
		long left = 7; // 열의 개수
		long right = 14; // 열의 개수

		System.out.println(Arrays.toString(solution(n, left, right)));
	}

}