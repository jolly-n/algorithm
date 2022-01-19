import java.util.Scanner;

/* 프로그래머스 (수박수박수)
 * https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
 */

class Algorithm220113 {
	/* 풀이 */
	public static String solution(int n) {
		/* 방법1 */
//		String ans = "";
//		for (int i=1; i<=n; i++) {
//			if (i % 2 != 0)	// 홀수일 경우
//				ans += "수";
//			else 			// 짝수일 경우
//				ans += "박"; 
//		}
//		return ans;
//	}
		
		/* 방법2 (else생략) */
//		String ans = "";
//		for (int i=1; i<=n; i++) {
//			if (i % 2 != 0)	{ // 홀수일 경우
//				ans += "수";
//				continue;
//			}
//			ans += "박"; 
//		}
//		return ans;
//	}
		
		/* 방법3 (삼항연산자) */
//		String ans = "";
//		for (int i=1; i<=n; i++) {
//			ans += (i % 2 != 0) ? "수" : "박";
//		}
//		return ans;
//	}
	
		/* 방법4 (StringBuilder) */
		StringBuilder sb = new StringBuilder(n); // 문자열 길이 n만큼 버퍼길이를 지정
		for (int i=1; i<=n; i++) {
			sb.append((i % 2 != 0) ? "수" : "박");
		}
		return sb.toString();
	}

	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("문자의 길이를 입력하세요: ");
		System.out.println(solution(kb.nextInt()));
	}
}