import java.util.Arrays;
import java.util.Comparator;

/* 프로그래머스 (전화번호 목록)
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */

class Algorithm220228 {

	/* 풀이 */
	static boolean solution(String[] phone_book) {
		// 문자열 사전 순 정렬
		Arrays.sort(phone_book);
//		System.out.println(Arrays.toString(phone_book)); // 확인용

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i+1].startsWith(phone_book[i])) // 접두어인 경우
				return false;
		}

		return true;
	}
		
		// 효율성 통과 x
//		// 문자열 길이를 기준으로 정렬
//		Arrays.sort(phone_book, (i1, i2) -> i1.length() - i2.length());
//		
//		for (int i = 0; i < phone_book.length; i++) {
//			for (int j = i + 1; j < phone_book.length; j++) {
//				int len = phone_book[i].length();
//
//				System.out.println(i + "번째 : " + phone_book[i]); // 확인용
//				System.out.println(j + "번째 : " + phone_book[j].substring(0, len)); // 확인용
//
//				if (phone_book[i].equals(phone_book[j].substring(0, len))) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}

	/* 테스트 */
	public static void main(String[] args) {
		String[] test = { "888", "123", "1235", "567", "88" };
		System.out.println(solution(test));
	}

}