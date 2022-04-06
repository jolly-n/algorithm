import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* ���� (�ܾ� ����)
 * https://www.acmicpc.net/problem/1157
 */

class Algorithm220406__3 {
	
	static String solution(String s) {
		s = s.toUpperCase();
		
		Map<Character, Integer> map = new HashMap<>();
		
		// key�� �����ϴ� ��츸 value ����, �׷��� ������ 1�� ����
		for (char c : s.toCharArray())
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
//		System.out.println(map);
		
		Set<Character> set = map.keySet();
		
		String answer = "";
		int max = 0;
		for (char i : set) {
			if (map.get(i) >= max)
				max = map.get(i);
		}
		
		for (char i : set) {
			if (map.get(i) == max)
				answer += i;			
		}
				
		return (answer.length()>1) ? "?" : answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(solution(s));
	}

}