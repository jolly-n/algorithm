import java.util.Scanner;

/* 프로그래머스 (콜라츠 추측)
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */

class Algorithm220127 {
	public static int solution(int num) {
		/* 방법2(for문 이용) */
		long longNum = (long) num;

		for (int i = 0; i <= 500; i++) {
			if (longNum == 1)
				return i;

			longNum = (longNum % 2 == 0) ? (longNum / 2) : (longNum * 3 + 1);
			
			// 삼항연산자로 코드단축
//			if (longNum % 2 == 0) {
//				longNum /= 2;
//				continue;
//			}
//
//			longNum = longNum * 3 + 1;
		}
		return -1;
	}

		/* 방법1 (while문 이용) */
//		long longNum = (long)num;
//		int cnt = 0; // 반복 횟수
//
//		while (longNum != 1) {
//			if (cnt >= 500)
//				return -1;
//			
//			// 짝수일 경우
//			if (longNum % 2 == 0) {
//				longNum = longNum/2;
//				cnt++;
//				continue;
//			}
//			
//			// 홀수일 경우
//			if (longNum % 2 != 0) {
//				longNum = longNum * 3 + 1;
//				cnt++;
//				continue;
//			}
//		}
//		return cnt;
//	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("입력하세요 >> ");
		System.out.println(solution(kb.nextInt()));
	}
}