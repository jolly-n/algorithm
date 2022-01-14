import java.util.Arrays;
import java.util.Scanner;

/* ���α׷��ӽ� (3���� ������)
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */

class Algorithm220106 {
	public static int solution(int n) {
		int answer = 0;
		
		// �迭�� ���� ���ϱ�
		int i =0;
		while(n - Math.pow(3, i) >= 0) {
			System.out.println("while �ݺ�: " + i);
			i++;
		}
		
		int[] arr = new int[i];
		int cnt = i-1;
		
		// 10���� -> 3����
		while(n > 0) {
			
//			// ���� ���� ����
//			if (n < 3) {
//				arr[cnt] = n; 
//				break;
//			}
			
			arr[cnt--] = n % 3;	// �迭�� ���������� �������� ����
			n = n/3;
		}
		
		// 3���� -> 10����
		for(int k=0; k<arr.length; k++) {
			answer += Math.pow(3, k)*arr[k];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�ڿ��� n�� �Է��ϼ���: ");
		System.out.println(solution(kb.nextInt()));
	}
}
