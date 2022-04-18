import java.util.Scanner;

/* 백준 (임시 반장 정하기)
 * https://www.acmicpc.net/problem/1268
 */

class Algorithm220418__1 {

	static int solution(int s, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < s; i++) { // i학생
			int cnt = 0;

			for (int j = 0; j < s; j++) // j학생
				for (int k = 0; k < 5; k++) // k학년
					if (arr[i][k] == arr[j][k]) { // i학생과 j학생이 k학년에 같은 반일 경우
						cnt++;
						break; // 한번 같은 반이었으면 더 비교하지 않아도 됨
					}

			if (cnt > max) {
				max = cnt;
				answer = i + 1; // 학생 번호 = 인덱스 +1
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(); // 학생 수
		int[][] arr = new int[s][5]; // 1-5학년 까지 속했던 반

		for (int i = 0; i < s; i++)
			for (int j = 0; j < 5; j++)
				arr[i][j] = sc.nextInt();

		System.out.println(solution(s, arr));
	}

}