import java.util.*;
import java.util.Map.Entry;

/* 프로그래머스 (실패율)
 * https://programmers.co.kr/learn/courses/30/lessons/42889?language=java
 */

class Algorithm220129__3 {
	/* 풀이 */
	public static int[] solution(int N, int[] stages) {
		int totalUser = stages.length; // 총 사용자
		System.out.println("stages : " + Arrays.toString(stages));

		// 스테이지 별 플레이어 수를 나타내는 배열
		int[] stageUser = new int[N];
		for (int i = 1; i <= N; i++) { // i번 스테이지
			for (int n : stages)
				if (i == n)
					stageUser[i - 1] += 1;
		}
		System.out.println("stagesUser : " + Arrays.toString(stageUser));

		// 스테이지 별 실패율을 나타내는 맵
		HashMap<Integer, Double> failMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (totalUser == 0) {
				failMap.put(i + 1, 0.0);
				continue;
			}

			failMap.put(i + 1, (double) stageUser[i] / totalUser);
			totalUser -= stageUser[i]; // 스테이지에 도달한 플레이어 수
		}
		System.out.println("failRate : " + failMap);

		// 정렬
		// sort메소드를 사용하기 위해 list형태로 변환
		List<Map.Entry<Integer, Double>> failLi = new ArrayList<>(failMap.entrySet());

		Comparator<Map.Entry<Integer, Double>> comp = (d1, d2) -> d2.getValue().compareTo(d1.getValue()); // value값을 기준으로 오름차순
		Collections.sort(failLi, comp);
//		Collections.sort(failLi, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		// list -> int[]
		int[] ans = new int[N];
		int cnt = 0;
		for (Entry<Integer, Double> entry : failLi) {
			ans[cnt++] = entry.getKey();
		}
		return ans;
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] test1 = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] test2 = { 4, 4, 4, 4, 4 };
		int[] test3 = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(solution(5, test1)));
		System.out.println(Arrays.toString(solution(4, test2)));
		System.out.println(Arrays.toString(solution(8, test3)));
	}
}