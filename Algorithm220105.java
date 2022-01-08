import java.util.Scanner;

/* 프로그래머스 (약수의 개수와 덧셈) 
 * https://programmers.co.kr/learn/courses/30/lessons/77884?language=java
 */

class Algorithm220105 {
	public static int solution(int left, int right) {
		int answer = 0;
		
		for(int i=left; i<right+1; i++) {
			int cnt = 0;
			// 약수 구하기
			for (int k=1; k<i+1; k++) {  // 1부터 자기자신까지 반복
				if (i % k == 0) {        // k는 i의 약수에 해당
					cnt++;               // 약수의 개수 카운팅
				}				
			}
			
			// 약수의 개수가 짝수인 수는 더하고 약수의 개수가 홀수인 수는 빼기
			if (cnt % 2 == 0) {       // 약수의 개수가 짝수개이면
				answer = (answer+i);  // 더하기
			} else {
				answer = (answer-i);  // 빼기
			}	
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("left 값을 입력하세요: ");
		int left = kb.nextInt();
		System.out.print("right 값을 입력하세요: ");
		int right = kb.nextInt();
		
		System.out.println(solution(left,right));
	}
}
