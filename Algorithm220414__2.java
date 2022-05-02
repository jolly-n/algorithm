import java.util.Scanner;

/* 백준 (뒤집어진 소수)
 * https://www.acmicpc.net/problem/10859
 */

class Algorithm220414__2 {
	static boolean isPrime(Long num) {
		for (int i = 2; i < num; i++) // 1과 자기 자신 제외
			if (num % i == 0) // 약수가 있다면 소수 X
				return false;
		
		return true;
	}

	static String solution(String n) {
		String answer = "no";
		StringBuilder sb = new StringBuilder(n); // 뒤집은 숫자를 담을 용도

		// 3,4,7은 뒤집을 경우 숫자가 아니므로 제외
		if (n.contains("3") || n.contains("4") || n.contains("7"))
			return answer;

		// 원래 숫자가 소수인지 확인
		if (isPrime(Long.parseLong(n))) {
			System.out.println("기존 숫자 : " + n);
			
			for (int i = 0; i < n.length(); i++) {
				// 6 -> 9
				if (n.charAt(i) == '6')
					sb.replace(i, i + 1, "9");
				// 9 -> 6
				if (n.charAt(i) == '9')
					sb.replace(i, i + 1, "6");
			}
		} else {
			return answer; 
		}

		// 뒤집은 숫자가 소수인지 확인
		sb = sb.reverse();
		System.out.println("뒤집은 숫자 : " + sb);
		
		if (isPrime(Long.parseLong(sb.toString())))
			answer = "yes";

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(solution(n));
	}

}