
/* 프로그래머스 (JadenCase 문자열 만들기)
 * https://programmers.co.kr/learn/courses/30/lessons/12951
 */

class Algorithm220218 {

	/* 풀이 */
	public static String solution(String s) {
		char[] arr = s.toCharArray();		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			cnt++;
			if (arr[i] == ' ') {
				cnt = 0;
				continue;
			}
			
			if (cnt == 1) // 첫 문자만 대문자
				arr[i] = Character.toUpperCase(arr[i]);
			else // 그 외 소문자
				arr[i] = Character.toLowerCase(arr[i]);
		}
		return String.valueOf(arr);
	}

	/* 테스트 */
	public static void main(String[] args) {
		String test1 = "3people unFollowed me";
		String test2 = "for the last week";

		System.out.println(solution(test1));
		System.out.println(solution(test2));
	}

}
