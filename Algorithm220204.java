
/* 프로그래머스 (소수 만들기)
 * https://programmers.co.kr/learn/courses/30/lessons/12977?language=java
 */

class Algorithm220204 {
	/* 풀이 */
	public static int solution(int[] nums) {
		int primeNumCnt = 0; // 소수 개수

		// 서로 다른 3개 수의 합
		for (int i = 0; i <= nums.length - 3; i++)
			for (int j = i + 1; j <= nums.length - 2; j++)
				for (int k = j + 1; k <= nums.length - 1; k++) {
//					System.out.printf("%d + %d + %d = %d %n", nums[i], nums[j], nums[k], (nums[i] + nums[j] + nums[k]));
					int sumNums = nums[i] + nums[j] + nums[k];					
					if (is_Prime(sumNums)) // sumNums가 소수일 경우
						primeNumCnt++;
				}
		return primeNumCnt;
	}

	/* 소수 판별 메소드 */
	public static boolean is_Prime(int num) {
		// 0, 1은 소수 제외
		if (num < 2)
			return false;

		// 1과 자기 자신을 제외한 약수가 존재할 경우 소수 X
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] test1 = { 1, 2, 3, 4 };
		int[] test2 = { 1, 2, 7, 6, 4 };

		System.out.println(solution(test1));
		System.out.println(solution(test2));
	}
}