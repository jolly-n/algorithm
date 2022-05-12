import java.util.Scanner;

/* 백준 (팩토리얼)
 * https://www.acmicpc.net/problem/10872
 */

class Algorithm220512__1 {

	static int DFS(int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return 1;
		else
			return n * DFS(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(DFS(n));
	}

}