import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 프로그래머스 (정수 내림차순으로 배치하기)
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */

class Algorithm220108 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Algorithm220108 a = new Algorithm220108();
		
		System.out.print("수를 입력하세요 : ");
		long n = kb.nextLong();
		
		System.out.println(a.solution(n));
	}
	
	public long solution(long n) {
		String str = n + "";							// long -> String
		
		String[] arr = str.split("");					// 한 글자씩 String[]에 저장
//		System.out.println(Arrays.toString(arr));		// 배열 확인용
		
		Arrays.sort(arr, Collections.reverseOrder());	// 내림차순 정렬
//		System.out.println(Arrays.toString(arr));		// 배열 확인용
		
		str = String.join("", arr);						// String[] -> String
//		System.out.println(str);
		
		long answer = Long.parseLong(str);				// String -> long
		
		return answer;	
	} 
}