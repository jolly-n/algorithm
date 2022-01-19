import java.util.Scanner;

/* 프로그래머스 (소수 찾기)
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */

class Algorithm220114 {
	/* 풀이 */
	public static int solution(int n) {
		/* 방법3 (에라토스테네스의 체) */
		int[] arr = new int[n+1]; // n까지 길이의 배열
		for (int i=0; i<arr.length; i++) {
			arr[i] = i; // 배열에 인덱스 값 저장
		}
		
		// 소수가 아닌 수 판별 (소수가 아니면 0으로 저장)
		int cnt = 0; // 소수가 아닌 수 카운팅
		arr[1] = 0;  // 1은 소수가 아님
		for (int i=1; i<arr.length; i++) {
			if (arr[i]==0) { // 소수가 아닐 경우
				cnt++;
				continue;
			}
			for (int k=2; k<=(n/i); k++) { // i*k<=n -> k<=n/i 범위 설정
				arr[i*k] = 0; // i의 배수일 경우 ->  소수가 아님
			}
		}
		return n-cnt; // 소수의 개수 -> (n-소수가 아닌 개수)
	}

		/* 방법2 (실패) */
//		int ans = 0;
//		Loop :
//		for (int i=2; i<=n; i++) {
//			// 소수 판별
//			for (int k=2; k<i; k++) {
//				if (i % k == 0) // 1과 자기자신을 제외한 약수가 존재하면 소수 아님
//					continue Loop;
//			}
//			ans++;
//		}		
//		return ans;
//	}
	
		/* 방법1 (실패) */
//		int ans = 0;
//		for (int i=2; i<=n; i++) { // 1은 소수가 아니므로 제외
//			// 약수의 개수 구하기
//			int cnt = 0;			
//			for (int k=1; k<=i; k++) {
//				if (i % k == 0) // k는 i의 약수
//					cnt++;
//			}
//			System.out.println(i + "의 약수의 개수: " + cnt );
//			
//			if (cnt <= 2)
//				ans++;
//		}
//		return ans;
//	}
		
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("입력하세요: ");
		System.out.println(solution(kb.nextInt()));
	}
}