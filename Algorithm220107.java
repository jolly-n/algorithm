import java.util.Arrays;
import java.util.Scanner;

/* ���α׷��ӽ� (�ִ������� �ּҰ����)
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */

class Algorithm220107 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Solution s = new Solution();
		
		System.out.print("ù��° ���� �Է��ϼ���: ");
		int n = kb.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		int m = kb.nextInt();
		
		System.out.println(Arrays.toString(s.solution(n,m)));
	}
}

class Solution{
	public int[] solution(int n, int m) {
		int max = 0; // �� ���� �ִ� ����� �ʱ�ȭ
		
		// �ִ� ����� ���ϱ�
		for(int i=1; i<=n; i++) {
			if(n % i == 0 && m % i ==0)  // �� ���� ����� i
				max = i;  // ����� �� �ִ밪�� max�� �����ϰ� ��
		}
		
		// �ּ� ����� ���ϱ�
		int min = (n*m) / max;
		
		// ��� �迭�� ���
		int[] answer = {max, min};
		
		System.out.println("�� ���� �ִ�������? " + max);
		System.out.println("�� ���� �ּҰ������? " + (n*m/max));
		return answer;
	}
}