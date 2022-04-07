import java.util.Scanner;

/* 백준 (그룹 단어 체커)
 * https://www.acmicpc.net/problem/1316
 */

public class Algorithm220407__3 {

	static int solution(int n, String[] sArr) {
		for (String s : sArr) { // 각 단어 반복
			loop : for (int i = 0; i < s.length(); i++) { // 한글자씩 반복
				char c = s.charAt(i);
				
				int firstIdx = s.indexOf(c); // 해당 알파벳이 처음 나온 인덱스
				int lastIdx = s.lastIndexOf(c); // 해당 알파벳이 마지막에 나온 인덱스

				for (int j = firstIdx; j <= lastIdx; j++) {
					if (s.charAt(j) != c) { // 같은 알파벳 사이에 다른 알파벳이 있을 경우
						n -= 1;
						break loop;
					}
				}
			}
		}
		
		return n;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		String[] sArr = new String[n];
		for (int i = 0; i < n; i++)
			sArr[i] = kb.next();
		
		System.out.println(solution(n, sArr));
	}

}