import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/* 백준 (추월)
 * https://www.acmicpc.net/problem/2002
 */

class Algorithm220423__2 {

	static int solution(int n, String[] in, String[] out) {
		HashMap<String, Integer> inCar = new HashMap<>(); // <차량번호, 차량순위>
		ArrayList<String> outCar = new ArrayList<>();

		for (int i = 0; i < n; i++)
			inCar.put(in[i], i + 1);

		for (int i = 0; i < n; i++)
			outCar.add(out[i]);

		List<Entry<String, Integer>> inCarRanks = new ArrayList<>(inCar.entrySet());
		inCarRanks.sort((n1, n2) -> n1.getValue() - n2.getValue()); // 차량순위를 기준으로 내림차순 정렬

//		System.out.println(inCarRanks); // 확인용
//		System.out.println(outCar); // 확인용

		int cnt = 0; // 추월차량 카운트

		for (Entry<String, Integer> rank : inCarRanks) {
//			System.out.println("--- rank : " + rank.getKey() + " ---"); // 확인용
			
			Iterator<String> itr = outCar.iterator();
			
			while(itr.hasNext() && outCar.contains(rank.getKey())) {
				String carNum = itr.next(); // 추월 차량인지 확인할 챠량번호
				if (!carNum.equals(rank.getKey())) {
					itr.remove();
					cnt++;
//					System.out.println("추월 : " + carNum + " / " + cnt); // 확인용
				} else {
					itr.remove();
					break;
				}
			}
//			System.out.println(outCar); // 확인용
			
			if (outCar.size() == 1)
				return cnt;
		}

		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 차의 대수
		String[] in = new String[n]; // 터널입구에서 적은 차량 번호 목록
		String[] out = new String[n]; // 터널출구에서 적은 차량 번호 목록

		for (int i = 0; i < n; i++)
			in[i] = sc.next();
		for (int i = 0; i < n; i++)
			out[i] = sc.next();

		System.out.println(solution(n, in, out));
	}

}