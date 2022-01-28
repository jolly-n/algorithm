import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* 프로그래머스 (완주하지 못한 선수)
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */

class Algorithm220125 {
	public static String solution(String[] participant, String[] completion) {
		/* 방법2 (배열 이용) */
//		Arrays.sort(participant); // 배열 정렬
//		Arrays.sort(completion);  // 배열 정렬
////		System.out.println(Arrays.toString(participant)); // 확인용
////		System.out.println(Arrays.toString(completion));  // 확인용
//
//		for (int i = 0; i < completion.length; i++) {
//			if (!participant[i].equals(completion[i])) {  // 내용 비교
//				return participant[i];                    // 같지 않은 요소 반환
//			}
//		}
//		return participant[(participant.length) - 1]; // 배열의 가장 마지막 요소 반환
//	}

		/* 방법1 (Map 이용) */
		String ans = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		// 참가자 넣기(동명이인일 경우 +1)
		for (int i=0; i<participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0)+1); // key : 참가자 이름/ getOrDefault : 전달된 key값에 대응하는 value값 반환(없으면 두번째 인자 반환)
		}
//		System.out.print("1: " + map); // 확인용
//		System.out.println();
		
		// 완주한 참가자의 수 빼기
		for (int i=0; i<completion.length; i++) {
			map.put(completion[i], map.get(completion[i])-1);
		}
//		System.out.print("2: " + map); // 확인용
//		System.out.println();
		
		Set<String> ks = map.keySet();
		
		// 완주하지 못한 사람(value!=0)
		for (String s : ks)
//			System.out.println(map.get(s)); // 확인용
			if (map.get(s) != 0)
				return s;
		
		return ans;
	}

	public static void main(String[] args) {
		String[] p1 = { "leo", "kiki", "eden" };
		String[] c1 = { "eden", "kiki" };

		String[] p2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] c2 = { "josipa", "filipa", "marina", "nikola" };

		String[] p3 = { "mislav", "stanko", "mislav", "ana" };
		String[] c3 = { "stanko", "ana", "mislav" };

		System.out.println(solution(p1, c1));
		System.out.println(solution(p2, c2));
		System.out.println(solution(p3, c3));
	}
}