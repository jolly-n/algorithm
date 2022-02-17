
/* ���α׷��ӽ� (�ּ� ���簢��)
 * https://programmers.co.kr/learn/courses/30/lessons/86491
 */

class Algorithm220208 {
	
	/* Ǯ�� */
	public static int solution(int[][] sizes) {
		int[][] arr = new int[sizes.length][2];

		// arr ä��� : [������, ū��]�� �� ä���
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

//		for (int[] ar : arr) // �迭 Ȯ��
//			System.out.println(Arrays.toString(ar));

		// [������, ū��]���� ������ �� �ִ밪, ū�� �� �ִ밪 ��������
		int w = 0; // ���� ����
		int h = 0; // ���� ����
		for (int i = 0; i < arr.length; i++) {
			if (w < arr[i][0])
				w = arr[i][0];

			if (h < arr[i][1])
				h = arr[i][1];
		}

//		System.out.printf("w:%d h:%d %n", w, h);
		return w * h;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		int[][] test1 = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		System.out.println(solution(test1));
	}
	
}