import java.util.Scanner;

/* SW Expert Academy (초심자의 회문 검사)
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PyTLqAf4DFAUq
 */

class Algorithm220408__3 {
	
	static int solution(String s){
		String temp = new StringBuilder(s).reverse().toString();
		
		if (s.equals(temp))
			return 1;
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		for (int i = 0; i < n; i++) {
			String s = kb.next();
			System.out.println("#" + (i+1) + " " + solution(s));
		}
	}

}