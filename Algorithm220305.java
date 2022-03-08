import java.util.Scanner;

/* 백준 (팰린드롬)
 * https://www.acmicpc.net/problem/10988
 */

class Algorithm220305 {
	
	/* 풀이 */
	static int palindrome(String s) {

		String reverse = ""; // 거꾸로 읽을 때

		for (int i = s.length() - 1; i >= 0; i--)
			reverse += s.charAt(i);

		if (s.equals(reverse)) // 같으면 팰린드롬
			return 1;
		
		return 0; 
	}
	
	/* 테스트 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println(palindrome(kb.nextLine()));
	}

}