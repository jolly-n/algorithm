import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* ���α׷��ӽ� (���� ������������ ��ġ�ϱ�)
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */

class Algorithm220108 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Algorithm220108 a = new Algorithm220108();
		
		System.out.print("���� �Է��ϼ��� : ");
		long n = kb.nextLong();
		
		System.out.println(a.solution(n));
	}
	
	public long solution(long n) {
		String str = n + "";							// long -> String
		
		String[] arr = str.split("");					// �� ���ھ� String[]�� ����
//		System.out.println(Arrays.toString(arr));		// �迭 Ȯ�ο�
		
		Arrays.sort(arr, Collections.reverseOrder());	// �������� ����
//		System.out.println(Arrays.toString(arr));		// �迭 Ȯ�ο�
		
		str = String.join("", arr);						// String[] -> String
//		System.out.println(str);
		
		long answer = Long.parseLong(str);				// String -> long
		
		return answer;	
	} 
}