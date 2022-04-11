import java.util.Scanner;

/* 프로그래머스 (문자열 압축)
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */

class Algorithm220409__1 {

	static int solution(String s) {
		int minLen = s.length(); // 최소 문자열 길이 초기화

		for (int i = 1; i <= (s.length() / 2); i++) {
			String str = s + " "; // 압축 할 문자열 (1개 단위 비교를 위한 공백 추가)
			String zip = ""; // 압축 결과

			String tmp = str.substring(0, i); // 압축 문자
			int cnt = 1; // 압축 카운트
			str = str.substring(i);

//			System.out.println("====================== i : " + i + " ======================");
			while (str.length() != 0) {
//				System.out.println("------- 반복 -------");
//				System.out.println("압축 문자 : " + tmp);
//				System.out.println("남은 문자 : " + str);

				// 남은 문자가 압축 문자보다 짧을 때 -> 그대로 붙여줌
				if (str.length() <= tmp.length()) {
					zip += tmp + str.substring(0, str.length() - 1); // 붙여준 공백 제거하고 추가
					if (cnt > 1)
						zip += String.valueOf(cnt);
					minLen = Math.min(minLen, zip.length());
//					System.out.println("압축 결과 : " + zip);
					break;
				}

				if (str.substring(0, i).equals(tmp)) {
					cnt++;
					str = str.substring(i);
					continue;
				} else {
					zip += tmp;
					if (cnt > 1)
						zip += String.valueOf(cnt);
					cnt = 1;
					tmp = str.substring(0, i);
					str = str.substring(i);
				}
//				System.out.println("압축 결과 : " + zip);
			}

//			System.out.println("길이 : " + zip.length());
			minLen = Math.min(minLen, zip.length());
		}

		return minLen;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(solution(s));
	}

}
