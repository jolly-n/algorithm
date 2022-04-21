import java.util.Scanner;

/* 백준 (연속 합)
 * https://www.acmicpc.net/problem/2737
 */

class Algorithm220421__1 {

	static int solution(int n) {
		int answer = 0; 
		int cnt = 1; // 연속된 수의 개수

		n--; // 1 빼기
		
		while (n > 0) {
			cnt++;
			n -= cnt; // 2, 3, 4, ...  빼기
			
			// 나누어 떨어 질 경우 cnt개의 연속된 수로 표현 가능
			if (n % cnt == 0) 
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스의 개수

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.println(solution(n));
		}

	}

}