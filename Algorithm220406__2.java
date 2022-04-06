import java.util.Scanner;

/* 백준 (크로아티아 알파벳)
 * https://www.acmicpc.net/problem/2941
 */

class Algorithm220406__2 {

	public static void solution(String s) {
		String[] str = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < str.length; i++)
			if (s.contains(str[i]))
				s = s.replace(str[i], "!");
//		System.out.println(s);
		
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		solution(s);
	}

}