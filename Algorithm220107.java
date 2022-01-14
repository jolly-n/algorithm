import java.util.Arrays;
import java.util.Scanner;

/* 프로그래머스 (최대공약수와 최소공배수)
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */

class Algorithm220107 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Solution s = new Solution();
		
		System.out.print("첫번째 수를 입력하세요: ");
		int n = kb.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int m = kb.nextInt();
		
		System.out.println(Arrays.toString(s.solution(n,m)));
	}
}

class Solution{
	public int[] solution(int n, int m) {
		int max = 0; // 두 수의 최대 공약수 초기화
		
		// 최대 공약수 구하기
		for(int i=1; i<=n; i++) {
			if(n % i == 0 && m % i ==0)  // 두 수의 공약수 i
				max = i;  // 공약수 중 최대값을 max에 대입하게 됨
		}
		
		// 최소 공배수 구하기
		int min = (n*m) / max;
		
		// 결과 배열에 담기
		int[] answer = {max, min};
		
		System.out.println("두 수의 최대공약수는? " + max);
		System.out.println("두 수의 최소공배수는? " + (n*m/max));
		return answer;
	}
}