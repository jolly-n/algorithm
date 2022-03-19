import java.util.Scanner;

/* 백준 (로또)
 * https://www.acmicpc.net/problem/6603
 */

class Algorithm220311 {

	/* 백트래킹 방식 */
	static void combination(int[] arr, boolean[] visited, int start, int arrlen, int comblen) {
		if (comblen == 0) {
			print(arr, visited, arrlen);
			return;
		}

		for (int i = start; i < arrlen; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, arrlen, comblen - 1);
			visited[i] = false;
		}
	}

	static void print(int[] arr, boolean[] visited, int arrlen) {
		for (int i = 0; i < arrlen; i++) {
			if (visited[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	
	/* 대준님 방식 */
	static void comb(String[] arr, int comblen, int start) {
		StringBuilder sb = new StringBuilder();
		String[] lottoNum = new String[6];

		if (comblen == 6) {
			for (int i = 0; i < comblen; i++) {
				sb.append(arr[i]).append(" ");
			}
			System.out.println(sb);
			return;
		}

		for (int i = start; i < arr.length; i++) {
			lottoNum[comblen] = arr[i];
			comb(arr, comblen + 1, i + 1);
		}
	}

	/* 테스트 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String[] arr;
		while (true) {
			arr = kb.nextLine().split("");

			if (arr[0].equals("0"))
				break;

			comb(arr, 1, 0);
		}

//		int n;
//		do {
//			n = kb.nextInt(); // 입력 받을 숫자의 개수
//			int[] arr = new int[n]; // 입력 값을 받을 배열
//			boolean[] visited = new boolean[n];
//
////			System.out.println(); // 단순 개행
//
//			for (int i = 0; i < n; i++)
//				arr[i] = kb.nextInt();
//
////			System.out.println(Arrays.toString(arr));
////			System.out.println(Arrays.toString(visited));
//			combination(arr, visited, 0, n, 6);
//		} while (n != 0);
	}

}