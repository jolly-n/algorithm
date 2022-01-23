import java.util.Scanner;

/* 프로그래머스 (자릿수 더하기)
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */

class Algorithm220123__3 {
	/* 풀이 */
	public static int solution(int n) {
		/* 방법2 */
		int ans = 0;

		while (n != 0) {
			ans += n % 10; 	// 나머지
			n = n / 10; 	// n = 몫
		}
		return ans;
	}

		/* 방법1 */
//		int ans = 0;
//		
//		String str = String.valueOf(n);
//		String[] strArr = str.split("");
////		System.out.println(Arrays.toString(strArr));
//		
//		for (String s : strArr)
//			ans += Integer.parseInt(s);
//		
//		return ans;
//	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("입력하세요: ");
		System.out.println(solution(kb.nextInt()));
	}
}