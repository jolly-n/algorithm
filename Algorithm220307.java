import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* 백준 (농구 경기)
 * https://www.acmicpc.net/problem/1159
 */

class Algorithm220307 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int member = Integer.valueOf(kb.nextLine()); // 선수의 수

		Map<Character, Integer> map = new TreeMap<>(); // 정렬을 위해 TreeMap사용
		
		for (int i = 0; i < member; i++) {
			String name = kb.nextLine(); // 선수의 성
			map.put(name.charAt(0), map.getOrDefault(name.charAt(0), 0)+1);
		}
		
		String ans = ""; // 선발할 수 있는 성의 첫글자
		
		for (Character i : map.keySet())
			if (map.get(i) >= 5)
				ans += i;
		
		if (ans.length() == 0) 
			System.out.println("PREDAJA");
		
		System.out.println(ans);
	}

}