import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 백준 (비밀번호 발음하기)
 * https://www.acmicpc.net/problem/4659
 */

class Algorithm220309 {

	/* 풀이 */
	static void pwQuality(List<String> li) {
		String quality = "";

		for (String s : li) {

			// 모음 (a,e,i,o,u) 1개 반드시 포함
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					quality = "is acceptable";
					break;
				}
				quality = "is not acceptable";
			}

			// 같은 글자 연속 두번 오면 안됨 (ee, oo는 허용)
			loop1: 
			for (int i = 0; i < s.length() - 1; i++) {
					if (s.charAt(i) == s.charAt(i+1))
						if (!(s.charAt(i) == 'e' || s.charAt(i) == 'o')) {
							quality = "is not acceptable";
							break loop1;
						}
			}

			// 모음 3개, 자음 3개 연속으로 오면 안됨
			loop2: 
			for (int i = 0; i < s.length() - 2; i++) {
				// 모음 3개
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
					if (s.charAt(i + 1) == 'a' || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'i' || s.charAt(i + 1) == 'o' || s.charAt(i + 1) == 'u')
						if (s.charAt(i + 2) == 'a' || s.charAt(i + 2) == 'e' || s.charAt(i + 2) == 'i' || s.charAt(i + 2) == 'o' || s.charAt(i + 2) == 'u') {
							quality = "is not acceptable";
							break loop2;
						}
				
				// 자음 3개
				if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'))
					if (!(s.charAt(i + 1) == 'a' || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'i' || s.charAt(i + 1) == 'o' || s.charAt(i + 1) == 'u'))
						if (!(s.charAt(i + 2) == 'a' || s.charAt(i + 2) == 'e' || s.charAt(i + 2) == 'i' || s.charAt(i + 2) == 'o' || s.charAt(i + 2) == 'u')) {
							quality = "is not acceptable";
							break loop2;
						}
			}
			
			print(s, quality);
		}
	} // end of method

	/* 출력 형식 */
	static void print(String s, String m) {
		System.out.printf("<%s> %s. %n", s, m);
	}

	/* 테스트 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		List<String> li = new ArrayList<>();

		String str = "";
		while (!(str.equals("end"))) {
			str = kb.nextLine();
			li.add(str);
		}

		li.remove(li.size() - 1); // 마지막 end 제거
		pwQuality(li);
	}

}