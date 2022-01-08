import java.util.Scanner;

/* ���α׷��ӽ� (����� ������ ����) 
 * https://programmers.co.kr/learn/courses/30/lessons/77884?language=java
 */

class Algorithm220105 {
	public static int solution(int left, int right) {
		int answer = 0;
		
		for(int i=left; i<right+1; i++) {
			int cnt = 0;
			// ��� ���ϱ�
			for (int k=1; k<i+1; k++) {  // 1���� �ڱ��ڽű��� �ݺ�
				if (i % k == 0) {        // k�� i�� ����� �ش�
					cnt++;               // ����� ���� ī����
				}				
			}
			
			// ����� ������ ¦���� ���� ���ϰ� ����� ������ Ȧ���� ���� ����
			if (cnt % 2 == 0) {       // ����� ������ ¦�����̸�
				answer = (answer+i);  // ���ϱ�
			} else {
				answer = (answer-i);  // ����
			}	
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("left ���� �Է��ϼ���: ");
		int left = kb.nextInt();
		System.out.print("right ���� �Է��ϼ���: ");
		int right = kb.nextInt();
		
		System.out.println(solution(left,right));
	}
}
