import java.util.Arrays;
import java.util.Scanner;

/* ���α׷��ӽ� (�̻��� ���� �����)
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */

public class Algorithm220110 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);		
		System.out.print("���ڿ� �Է� : ");		
		System.out.println(solution(kb.nextLine()));
	}
	
	public static String solution(String s) {
		/* ���2 (����) */
		String answer = "";
		int cnt = 0;
		
		String[] arr = s.split("");	// ���ڿ��� �ѱ��ھ� �迭�� ����
//		System.out.println("�迭 Ȯ�� :" + Arrays.toString(arr));		// �迭 Ȯ�ο�
		
		for (int i=0; i < arr.length; i++) { // �迭 �ݺ�
//			System.out.println(arr[i]);		 // �ܾ� Ȯ�ο�
			
			// ���� �˻�
			if (arr[i].equals(" ")) {
				cnt = 0;
				answer += arr[i];
			}
			else if (cnt % 2 == 0) {
				answer += arr[i].toUpperCase();
				cnt++;
			}
			else {
				answer += arr[i].toLowerCase();
				cnt++;
			}
		}
		return answer;
	}
}

		/* ���1 (����) */
//		String answer = "";
//		
//		String[] arr = s.split(" ");	// ������ �������� ���ڿ��� �迭�� ����
//		System.out.println("�迭 Ȯ�� :" + Arrays.toString(arr));		// �迭 Ȯ�ο�
//		
//		for (int i=0; i < arr.length; i++) {	// ���ڿ��� �ܾ� �ݺ�
//			String newWord = "";
//			System.out.println(arr[i]);			// �ܾ� Ȯ�ο�
//			
//			for (int k=0; k < arr[i].length(); k++) {	// �� �ܾ��� ���ĺ� �ݺ�
//				/* ¦����° ���ĺ� �빮�ڷ� ��ȯ */
//				if (k % 2 == 0)	
//					newWord += Character.toUpperCase(arr[i].charAt(k));
//				/* Ȧ����° ���ĺ� �ҹ��ڷ� ��ȯ */
//				else
//					newWord += Character.toString(arr[i].charAt(k)).toLowerCase();
//			}
//			answer += newWord + " ";
//		}
//		return answer.trim();
//	}
//}
		