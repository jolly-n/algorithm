import java.util.Scanner;

/* ���α׷��ӽ� (����� ��)
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */

class Algorithm220112 {
	public static int solution(int n) {
		int ans = 0;
		
		for (int i=1; i<=n; i++) {
			if(n % i == 0)	{ // i�� n�� ���
				ans += i;
			} 
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�Է��� ���ּ��� : ");
		System.out.println(solution(kb.nextInt()));
	}
}