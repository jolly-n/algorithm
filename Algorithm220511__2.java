import java.util.Scanner;

/* น้มุ (N ย๏ฑโ)
 * https://www.acmicpc.net/problem/2741
 */

class Algorithm220511__2 {

	static void DFS(int n) {
		if (n == 0)
			return;
		else {
			DFS(n-1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

}