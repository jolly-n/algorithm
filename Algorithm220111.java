import java.util.Arrays;
import java.util.Scanner;

/* ���α׷��ӽ� (���￡�� �輭�� ã��)
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 */

class Algorithm220111 {
	public static String solution(String[] seaul) {
		int index = Arrays.asList(seaul).indexOf("Kim");
		
		return String.format("�輭���� %s�� �ִ�", index);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�Է��� ���ּ��� : ");
		String[] arr = kb.nextLine().split(",");
		
		System.out.println(solution(arr));
	}
}