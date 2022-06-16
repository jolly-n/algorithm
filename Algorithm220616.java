import java.util.Scanner;

/* 백준 (단어의 개수)
 * https://www.acmicpc.net/problem/1152
 */

public class Algorithm220616 {
	
	static int solution(String str) {
		String[] arr = str.split(" ");
		int cnt = arr.length;
		
		if (cnt == 0) // 단어가 없는 경우
			return 0;
		
		if (arr[0] == "" || arr[arr.length - 1] == "")
			cnt--;
		
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
