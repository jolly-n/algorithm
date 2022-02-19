import java.util.Arrays;
import java.util.stream.IntStream;

/* ���α׷��ӽ� (��Ʈ ����)
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */

class Algorithm220210 {

	/* Ǯ�� */
	public static int solution(String dartResult) {
		int[] arr = new int[3];
		int idx = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			// ����
			if ('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9') {
				// ������ 10�� ���
				if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
					arr[idx++] = 10;
					i++; // �α����̹Ƿ� ���� �ݺ��� �Ѿ�� ����
					continue;
				}

				// ������ 0~9�� ���
				arr[idx++] = dartResult.charAt(i) - '0'; // char Ÿ���� ���� - '0' = int Ÿ���� ����
				continue;
			}

			// ���ʽ�, �ɼ�
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

	/* �׽�Ʈ */
	public static void main(String[] args) {
		String test1 = "1D2S#10S";
		System.out.println(solution(test1));
	}

}