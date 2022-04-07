import java.util.Scanner;

/* 백준 (뒤집기)
 * https://www.acmicpc.net/problem/1439
 */

class Algorithm220407__2 {
	
	static int solution(String s) {
		int cnt0 = 0;
		int cnt1 = 0;
		
		// 첫번째 나온 문자가 0인지 1인지에 따라 카운트
		if (s.charAt(0) == '0')
			cnt0++;
		else
			cnt1++;
		
		// 현재 문자와 이전 문자가 다르면 0/1에 따라 카운트 증가
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i-1) == '0')
				if (s.charAt(i)=='1')
					cnt1++;
			
			if (s.charAt(i-1) == '1')
				if(s.charAt(i) == '0')
					cnt0++;
		}
		
		// 최소 횟수 반환
		return Math.min(cnt0, cnt1);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(solution(s));
	}

}