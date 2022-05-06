import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 백준 (중복 빼고 정렬하기)
 * https://www.acmicpc.net/problem/10867
 */

class Algorithm220506__1 {

	static Set<Integer> solution(int n, int[] arr) {
		Set<Integer> set = new TreeSet<>();
		
		for (int i : arr)
			set.add(i);
		
		return set; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수의 개수
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int i : solution(n, arr))
			System.out.print(i + " ");
	}

}