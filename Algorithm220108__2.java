import java.util.Scanner;

/* ���α׷��ӽ� (������ȣ)
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */

class Algorithm220108__2 {
	public static String solution(String s, int n) {
		String answer = "";
		
		for (int i=0; i<s.length(); i++) {
			char alpha = s.charAt(i); // ���ڿ��� �ѱ��ھ� ����
			System.out.println("���ĺ�: " + alpha);
			
			if ('a' <= alpha && alpha <= 'z') {	// �ҹ����� ���
				if (alpha+n > 'z')	// z�� �Ѿ ���
					answer += (char)(alpha + (n-26));
				else 
					answer += (char)(alpha + n);
			}
			else if ('A' <= alpha && alpha <= 'Z') { // �빮���� ���
				if (alpha+n > 'Z')	// z�� �Ѿ ���
					answer += (char)(alpha + (n-26));
				else
					answer += (char)(alpha + n);
			}
			else answer += alpha;
		}
		return answer;			
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = kb.nextLine();
		
		System.out.print("�Ÿ��� �Է��ϼ��� : ");
		int num = kb.nextInt();
		
		System.out.println(solution(str, num));
	}
}