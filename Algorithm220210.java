import java.util.Arrays;
import java.util.stream.IntStream;

/* 프로그래머스 (다트 게임)
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */

class Algorithm220210 {

	/* 풀이 */
	public static int solution(String dartResult) {
		int[] arr = new int[3];
		int idx = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			// 점수
			if ('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9') {
				// 점수가 10일 경우
				if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
					arr[idx++] = 10;
					i++; // 두글자이므로 다음 반복을 넘어가기 위함
					continue;
				}

				// 점수가 0~9일 경우
				arr[idx++] = dartResult.charAt(i) - '0'; // char 타입의 숫자 - '0' = int 타입의 숫자
				continue;
			}

			// 보너스, 옵션
			switch (dartResult.charAt(i)) {
			case 'S':
				arr[idx - 1] = (int) (Math.pow((arr[idx - 1]), 1));
				break;
			case 'D':
				arr[idx - 1] = (int) (Math.pow((arr[idx - 1]), 2));
				break;
			case 'T':
				arr[idx - 1] = (int) (Math.pow((arr[idx - 1]), 3));
				break;
			case '*':
				arr[idx - 1] *= 2;
				if (idx >= 2)
					arr[idx - 2] *= 2;
				break;
			case '#':
				arr[idx - 1] *= -1;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

		int sum = IntStream.of(arr).sum();
		return sum;
	}

	/* 테스트 */
	public static void main(String[] args) {
		String test1 = "1D2S#10S";
		System.out.println(solution(test1));
	}

}