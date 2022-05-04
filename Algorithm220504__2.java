import java.util.Arrays;
import java.util.Scanner;

/* ���� (�ϰ� ������)
 * https://www.acmicpc.net/problem/2309
 */

class Algorithm220504__2 {

	static int[] solution(int[] arr, int total) {
		int[] find = new int[7]; // �ϰ�������
		int sum = total - 100; // ã�ƾ� �� Ű�� ��
		
		Arrays.sort(arr); // �������� ����
		
		loop : 
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					arr[i] = 0;
					arr[j] = 0;
					break loop;
				}
			}
		}
		
		int idx = 0;
		for (int i : arr) {
			if (i != 0)
				find[idx++] = i;
		}

		return find;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9]; // ��ȩ �������� Ű�� ���� �迭
		int total = 0; // ��ȩ ������ Ű ����

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		for (int i : solution(arr, total))
			System.out.println(i);
	}

}