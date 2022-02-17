
/* 프로그래머스 (최소 직사각형)
 * https://programmers.co.kr/learn/courses/30/lessons/86491
 */

class Algorithm220208 {
	
	/* 풀이 */
	public static int solution(int[][] sizes) {
		int[][] arr = new int[sizes.length][2];

		// arr 채우기 : [작은수, 큰수]로 값 채우기
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] <= sizes[i][1]) {
				arr[i][0] = sizes[i][0];
				arr[i][1] = sizes[i][1];
			}
			if (sizes[i][0] > sizes[i][1]) {
				arr[i][0] = sizes[i][1];
				arr[i][1] = sizes[i][0];
			}
		}

//		for (int[] ar : arr) // 배열 확인
//			System.out.println(Arrays.toString(ar));

		// [작은수, 큰수]에서 작은수 중 최대값, 큰수 중 최대값 가져오기
		int w = 0; // 가로 길이
		int h = 0; // 세로 길이
		for (int i = 0; i < arr.length; i++) {
			if (w < arr[i][0])
				w = arr[i][0];

			if (h < arr[i][1])
				h = arr[i][1];
		}

//		System.out.printf("w:%d h:%d %n", w, h);
		return w * h;
	}

	/* 테스트 */
	public static void main(String[] args) {
		int[][] test1 = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		System.out.println(solution(test1));
	}
	
}