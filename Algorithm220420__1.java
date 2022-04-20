import java.util.Scanner;

/* 백준 (수열)
 * https://www.acmicpc.net/problem/2559
 */

class Algorithm220420__1 {

	static int solution(int n, int k, int[] arr) {
		int max = 0; // 합의 최대가 되는 값
		int sum = 0; // 합
		int lt = 0;  // 왼쪽 포인터
		
		// 초기 합 구하기
		for (int rt = 0; rt < k; rt++) { 
			sum += arr[rt];
			max = sum;
		}

		// 오른쪽 포인터를 이동하며 합 비교 (sliding window)
		for (int rt = k; rt < n; rt++) {
			sum += (arr[rt] - arr[lt++]);
			max = Math.max(max, sum);
		}
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 온도를 측정한 전체 날짜의 수
		int k = sc.nextInt(); // 합을 구하기 위한 연속적인 날짜의 수
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(solution(n, k, arr));
	}

}