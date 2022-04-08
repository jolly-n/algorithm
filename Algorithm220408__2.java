import java.util.Scanner;

/* SW Expert Academy (제곱 팰린드롬 수)
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXO72aaqPrcDFAXS
 */

class Algorithm220408__2 {

	static int solution(int A, int B) {
		int cnt = 0;

		for (int i = A; i <= B; i++) {
			// 제곱근이 정수일 경우에만 팰린드롬 체크
			if (Math.sqrt(i) % 1 == 0)
				if (isPalindrome(i, (int)Math.sqrt(i)))
					cnt++;
		}

		return cnt;
	}

	static boolean isPalindrome(int num, int sqrt) {
		boolean ispalindrom = false;

		String strNum = String.valueOf(num);
		String strSqrt = String.valueOf(sqrt);

		String tempNum = new StringBuilder(strNum).reverse().toString();
		String tempSqrt = new StringBuilder(strSqrt).reverse().toString();

		if (strNum.equals(tempNum) && strSqrt.equals(tempSqrt))
			ispalindrom = true;

		return ispalindrom;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		for (int i = 0; i < n; i++) {
			int A = Integer.valueOf(kb.next());
			int B = Integer.valueOf(kb.next());

			System.out.println("#" + (i+1) + " " + solution(A, B));
		}
	}

}