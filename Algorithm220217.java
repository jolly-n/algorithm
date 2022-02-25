import java.util.Arrays;
import java.util.Collections;

/* ���α׷��ӽ� (�ּڰ� �����)
 * https://programmers.co.kr/learn/courses/30/lessons/12941
 */

class Algorithm220217 {

	/* Ǯ�� */
	public static int solution(int[] A, int[] B) {
		int sum = 0;

		// A[] ����
		Arrays.sort(A);
		System.out.println(Arrays.toString(A)); // Ȯ�ο�

		// B[] ������
		Integer[] integerB = new Integer[B.length];

		for (int i = 0; i < B.length; i++)
			integerB[i] = B[i];

		Arrays.sort(integerB, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerB)); // Ȯ�ο�
		
		// ���� ����
		for (int i = 0; i < A.length; i++) {
			sum += A[i] * integerB[i];
		}
		return sum;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		int[] A1 = { 1, 4, 2 };
		int[] B1 = { 5, 4, 4 };

		int[] A2 = { 1, 2 };
		int[] B2 = { 3, 4 };

		System.out.println(solution(A1, B1));
		System.out.println(solution(A2, B2));
	}

}
