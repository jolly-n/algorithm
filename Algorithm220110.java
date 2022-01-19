import java.util.Arrays;
import java.util.Scanner;

/* 프로그래머스 (이상한 문자 만들기)
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */

public class Algorithm220110 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);		
		System.out.print("문자열 입력 : ");		
		System.out.println(solution(kb.nextLine()));
	}
	
	public static String solution(String s) {
		/* 방법2 (성공) */
		String answer = "";
		int cnt = 0;
		
		String[] arr = s.split("");	// 문자열을 한글자씩 배열에 담음
//		System.out.println("배열 확인 :" + Arrays.toString(arr));		// 배열 확인용
		
		for (int i=0; i < arr.length; i++) { // 배열 반복
//			System.out.println(arr[i]);		 // 단어 확인용
			
			// 공백 검사
			if (arr[i].equals(" ")) {
				cnt = 0;
				answer += arr[i];
			}
			else if (cnt % 2 == 0) {
				answer += arr[i].toUpperCase();
				cnt++;
			}
			else {
				answer += arr[i].toLowerCase();
				cnt++;
			}
		}
		return answer;
	}
}

		/* 방법1 (실패) */
//		String answer = "";
//		
//		String[] arr = s.split(" ");	// 공백을 기준으로 문자열을 배열에 담음
//		System.out.println("배열 확인 :" + Arrays.toString(arr));		// 배열 확인용
//		
//		for (int i=0; i < arr.length; i++) {	// 문자열의 단어 반복
//			String newWord = "";
//			System.out.println(arr[i]);			// 단어 확인용
//			
//			for (int k=0; k < arr[i].length(); k++) {	// 각 단어의 알파벳 반복
//				/* 짝수번째 알파벳 대문자로 변환 */
//				if (k % 2 == 0)	
//					newWord += Character.toUpperCase(arr[i].charAt(k));
//				/* 홀수번째 알파벳 소문자로 변환 */
//				else
//					newWord += Character.toString(arr[i].charAt(k)).toLowerCase();
//			}
//			answer += newWord + " ";
//		}
//		return answer.trim();
//	}
//}
		