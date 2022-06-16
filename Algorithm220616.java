import java.util.Scanner;

/* ���� (�ܾ��� ����)
 * https://www.acmicpc.net/problem/1152
 */

public class Algorithm220616 {
	
	static int solution(String str) {
		String[] arr = str.split(" ");
		int cnt = arr.length;
		
		if (cnt == 0) // �ܾ ���� ���
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
