import java.util.Arrays;
import java.util.Scanner;

/* 프로그래머스 (3진법 뒤집기)
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */

class Algorithm220106 {
	public static int solution(int n) {
		int answer = 0;
		
		// 배열의 길이 구하기
		int i =0;
		while(n - Math.pow(3, i) >= 0) {
			System.out.println("while 반복: " + i);
			i++;
		}
		
		int[] arr = new int[i];
		int cnt = i-1;
		
		// 10진법 -> 3진법
		while(n > 0) {
			
//			// 생략 가능 문장
//			if (n < 3) {
//				arr[cnt] = n; 
//				break;
//			}
			
			arr[cnt--] = n % 3;	// 배열의 마지막부터 나머지를 담음
			n = n/3;
		}
		
		// 3진법 -> 10진법
		for(int k=0; k<arr.length; k++) {
			answer += Math.pow(3, k)*arr[k];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("자연수 n을 입력하세요: ");
		System.out.println(solution(kb.nextInt()));
	}
}
