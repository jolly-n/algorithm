import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/* 백준 (소트인사이드)
 * https://www.acmicpc.net/problem/1427
 */

class Algorithm220503__2 {

	static int solution(int n) {
		int answer = 0;

		List<Integer> li = new ArrayList<>();

		while (n != 0) {
			int num = n % 10;
			n = n / 10;
			li.add(num);
		}

		Collections.sort(li, Comparator.reverseOrder());

		int cnt = 1;
		for (int i : li) {
			answer += i * Math.pow(10, (li.size() - cnt));
			cnt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수
		System.out.println(solution(n));
	}

}