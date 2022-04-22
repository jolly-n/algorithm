import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 프로그래머스 (보석 쇼핑)
 * https://programmers.co.kr/learn/courses/30/lessons/67258
 */

class Algorithm220421__2 {

	static int[] solution(String[] gems) {
		int[] answer = new int[2]; // [시작 진열대 번호, 끝 진열대 번호]
		int minLen = Integer.MAX_VALUE; // 가장 짧은 구간
		int lt = 0; // 시작 진열대

		Set<String> set = new HashSet<>(); // 보석 종류 (Set을 사용해 중복 제거)

		for (String gem : gems)
			set.add(gem);

		Map<String, Integer> map = new HashMap<>(); // 보석 개수를 세어 줄 map 사용

		for (int rt = 0; rt < gems.length; rt++) {
			map.put(gems[rt], map.containsKey(gems[rt]) ? map.get(gems[rt]) + 1 : 1);

			// 모든 종류의 보석을 포함할 경우
			while (map.size() == set.size()) {
//				System.out.println("--- lt:" + lt + " / rt:" + rt + " ---");
//				System.out.println(map);

				if (rt - lt < minLen) {
					answer[0] = lt + 1; // 인덱스가 0부터 시작하므로 +1
					answer[1] = rt + 1; // 인덱스가 0부터 시작하므로 +1
					minLen = rt - lt;
				}

				map.put(gems[lt], map.get(gems[lt]) - 1); // lt값 차례대로 빼주기

				if (map.get(gems[lt]) == 0)
					map.remove(gems[lt]);

				lt++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 테스트 케이스
		String[] gems = { "DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA" };
//		String[] gems = {"AA", "AB", "AC", "AA", "AC"};
//		String[] gems = {"XYZ", "XYZ", "XYZ"};
//		String[] gems = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};

		System.out.println(Arrays.toString(solution(gems)));
	}

}