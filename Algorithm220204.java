
/* ���α׷��ӽ� (�Ҽ� �����)
 * https://programmers.co.kr/learn/courses/30/lessons/12977?language=java
 */

class Algorithm220204 {
	/* Ǯ�� */
	public static int solution(int[] nums) {
		int primeNumCnt = 0; // �Ҽ� ����

		// ���� �ٸ� 3�� ���� ��
		for (int i = 0; i <= nums.length - 3; i++)
			for (int j = i + 1; j <= nums.length - 2; j++)
				for (int k = j + 1; k <= nums.length - 1; k++) {
//					System.out.printf("%d + %d + %d = %d %n", nums[i], nums[j], nums[k], (nums[i] + nums[j] + nums[k]));
					int sumNums = nums[i] + nums[j] + nums[k];					
					if (is_Prime(sumNums)) // sumNums�� �Ҽ��� ���
						primeNumCnt++;
				}
		return primeNumCnt;
	}

	/* �Ҽ� �Ǻ� �޼ҵ� */
	public static boolean is_Prime(int num) {
		// 0, 1�� �Ҽ� ����
		if (num < 2)
			return false;

		// 1�� �ڱ� �ڽ��� ������ ����� ������ ��� �Ҽ� X
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] test1 = { 1, 2, 3, 4 };
		int[] test2 = { 1, 2, 7, 6, 4 };

		System.out.println(solution(test1));
		System.out.println(solution(test2));
	}
}