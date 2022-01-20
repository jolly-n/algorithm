import java.util.Scanner;

/* 프로그래머스 (두 정수 사이의 합)
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */

class Algorithm220117 {
	/* 풀이 */
	public static long solution(int a, int b) {
		/* 방법2 (등차수열의 합 이용) */
		return ((long)Math.abs(a-b)+1)*(a+b)/2; // 합=(개수)(첫째항+마지막항)/2
	}
	
		/* 방법1 */
//		long ans = 0;
//		int max = Math.max(a, b);
//		int min = Math.min(a, b);
//		
//		for (int i=min; i<=max; i++) {
//			ans += i;
//		}
//		return ans;
//	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("입력하세요.");
		System.out.println(solution(kb.nextInt(), kb.nextInt()));
	}
}