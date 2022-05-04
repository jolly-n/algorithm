import java.util.Arrays;
import java.util.Scanner;

/* 백준 (일곱 난쟁이)
 * https://www.acmicpc.net/problem/2309
 */

class Algorithm220504__2 {

	static int[] solution(int[] arr, int total) {
		int[] find = new int[7]; // 일곱난쟁이
		int sum = total - 100; // 찾아야 할 키의 합
		
		Arrays.sort(arr); // 오름차순 정렬
		
		loop : 
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					arr[i] = 0;
					arr[j] = 0;
					break loop;
				}
			}
		}
		
		int idx = 0;
		for (int i : arr) {
			if (i != 0)
				find[idx++] = i;
		}

		return find;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9]; // 아홉 난쟁이의 키를 담을 배열
		int total = 0; // 아홉 난쟁이 키 총합

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		for (int i : solution(arr, total))
			System.out.println(i);
	}

}