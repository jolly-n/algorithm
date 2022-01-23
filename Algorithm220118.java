import java.util.Scanner;

/* 프로그래머스 (나머지가 1이 되는 수 찾기)
 * https://programmers.co.kr/learn/courses/30/lessons/87389
 */

class Algorithm220118 {
	/* 풀이 */
	public static int solution(int n) {
		/* 방법1 */
		int ans = 0;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 1) {
				ans = i;
				break;
			}
		}
		return ans;
	}
		
		/* 방법2 (코드 단축) */
//		for (int i=1; i<=n; i++) {
//			if (n % i == 1) {
//				return i;
//			}
//		}
//		return 0;
//	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("입력하세요: ");
		System.out.println(solution(kb.nextInt()));
	}
}