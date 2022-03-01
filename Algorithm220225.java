import java.util.*;

/* 프로그래머스 (문자열 내 마음대로 정렬하기)
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */

class Algorithm220225 {

	/* 풀이 */
	public static String[] solution(String[] strings, int n) {
		// 우선 사전 순 정렬
		Arrays.sort(strings);

		// Map 생성
		Map<Integer, Character> map = new LinkedHashMap<>();

		for (Integer i = 0; i < strings.length; i++)
			map.put(i, strings[i].charAt(n));
		
//		System.out.println("기존 : " + map); // 확인용

		// Map을 value 기준으로 정렬
		List<Map.Entry<Integer, Character>> entry = new LinkedList<>(map.entrySet());
		entry.sort(Map.Entry.comparingByValue());

//		System.out.println("정렬 : " + entry); // 확인용
		
		// n번째 문자를 기준으로 정렬된 새로운 배열
		String[] answer = new String[strings.length];

		for (int i = 0; i < entry.size(); i++)
			answer[i] = strings[entry.get(i).getKey()];

		return answer;
	}

	/* 테스트 */
	public static void main(String[] args) {
		String[] str1 = { "abce", "abcd", "cdx" };
		int n1 = 2;
		
		System.out.println(Arrays.toString(solution(str1, n1)));
	}

}