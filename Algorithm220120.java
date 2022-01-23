import java.util.Scanner;

/* 프로그래머스 (부족한 금액 계산하기)
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 */

class Algorithm220120 {
	/* 풀이 */
	public static long solution(int price, int money, int count) {
		/* 방법2 (등차수열 이용)*/		
		long totalPrice = (long)count*(price+price*count)/2; // count/2를 먼저 해주면 나머지가 날아가기 때문에 /2를 맨뒤에 해줘야 함
		
		return Math.max(totalPrice-money, 0); // totalPrice-money : 금액이 부족할 경우 양수, 금액이 부족하지 않을 경우 음수
	}
	
		/* 방법1 */
//		// 총 필요한 놀이기구의 이용 금액
//		long totalPrice = 0;		
//		for (int i = 1; i <= count; i++) {
//			totalPrice += price * i;
//		}
//		
//		// 금액이 부족하지 않을 경우
//		if (money >= totalPrice) {
//			return 0;
//		}
//		
//		// 금액이 부족할 경우
//		return Math.abs(money - totalPrice);
//	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("놀이기구 이용료: ");
		int p = kb.nextInt();
		System.out.print("처음 가지고 있던 금액: ");
		int m = kb.nextInt();
		System.out.print("놀이기구 이용 횟수: ");
		int c = kb.nextInt();
		
		System.out.print("부족한 금액: ");
		System.out.println(solution(p, m, c));
	}
}