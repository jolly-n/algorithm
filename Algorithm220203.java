import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 프로그래머스 (피보나치 수)
 * https://programmers.co.kr/learn/courses/30/lessons/12945?language=java
 */

class Algorithm220203 {
	/* 풀이 */
	public static int solution(int n) {
		List<Integer> fibo = new ArrayList<>();
		fibo.add(0);
		fibo.add(1);

		for (int i = 2; i <= n; i++)
			fibo.add((fibo.get(i - 2) + fibo.get(i - 1)) % 1234567); // int 자료형 크기를 맞춰주기 위함
//		System.out.println(fibo); // 리스트 확인용
		return fibo.get(n);
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("입력하세요 >> ");
		System.out.println(solution(kb.nextInt()));
	}
}