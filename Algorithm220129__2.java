import java.util.Scanner;

/* 프로그래머스 (하샤드 수)
 * https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */

class Algorithm220129__2 {
	/* 풀이 */
	public static boolean solution(int x) {
		// 각 자릿수 더하기
		String s = String.valueOf(x);
		String[] arr = s.split("");
		
		int sum = 0;
		for (String a : arr) {
			sum += Integer.parseInt(a);
		}
		// System.out.println(sum);
		
		// 하샤드 수 판별
		return (x % sum == 0) ? true : false;
	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("입력하세요 >> ");
		System.out.println(solution(kb.nextInt()));
	}
}