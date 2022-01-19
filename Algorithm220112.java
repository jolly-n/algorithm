import java.util.Scanner;

/* 프로그래머스 (약수의 합)
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */

class Algorithm220112 {
	public static int solution(int n) {
		int ans = 0;
		
		for (int i=1; i<=n; i++) {
			if(n % i == 0)	{ // i는 n의 약수
				ans += i;
			} 
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("입력을 해주세요 : ");
		System.out.println(solution(kb.nextInt()));
	}
}