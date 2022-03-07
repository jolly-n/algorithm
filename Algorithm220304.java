import java.util.Scanner;

/* 백준 (트럭 주차)
 * https://www.acmicpc.net/problem/2979
 */

class Algorithm220304 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int A = kb.nextInt(); // 1대 주차 : A원
		int B = kb.nextInt(); // 2대 주차 : B원
		int C = kb.nextInt(); // 3대 주차 : C원

		int[] arr = new int[100];

		for (int i = 0; i < 3; i++) {
			int in = kb.nextInt(); // 입차시간
			int out = kb.nextInt(); // 출차시간

			for (int j = in; j < out; j++)
				arr[j] += 1;
		}

		int cntA = 0; // 1대 주차 시간
		int cntB = 0; // 2대 주차 시간
		int cntC = 0; // 3대 주차 시간

		for (int n : arr) {
			if (n == 0)
				continue;

			if (n == 1)
				cntA += 1;

			if (n == 2)
				cntB += 1;

			if (n == 3)
				cntC += 1;
		}

		int fee = (A * cntA) + (B * cntB * 2) + (C * cntC * 3); // 총 주차요금

		System.out.println(fee);
	}

}