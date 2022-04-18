import java.util.Arrays;

/* ���α׷��ӽ� (n^2 �迭 �ڸ���)
 * https://programmers.co.kr/learn/courses/30/lessons/87390
 */

class Algorithm220418__2 {

	static int[] solution(int n, long left, long right) {
		int[] answer = new int[(int) (right - left + 1)];

		for (long i = left; i <= right; i++) {
			int row = (int) (i / n);
			int column = (int) (i % n);
			int idx = (int) (i - left);

			if (row < column) // �ຸ�� ���� Ŭ ���
				answer[idx] = column + 1; // 0���� �����ϹǷ� +1
			else
				answer[idx] = row + 1; // 0���� �����ϹǷ� +1
		}

		return answer;
	}

	public static void main(String[] args) {
		// test
		int n = 4; // 2���� �迭�� ũ��
		long left = 7; // ���� ����
		long right = 14; // ���� ����

		System.out.println(Arrays.toString(solution(n, left, right)));
	}

}