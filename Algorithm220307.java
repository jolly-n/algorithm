import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* ���� (�� ���)
 * https://www.acmicpc.net/problem/1159
 */

class Algorithm220307 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int member = Integer.valueOf(kb.nextLine()); // ������ ��

		Map<Character, Integer> map = new TreeMap<>(); // ������ ���� TreeMap���
		
		for (int i = 0; i < member; i++) {
			String name = kb.nextLine(); // ������ ��
			map.put(name.charAt(0), map.getOrDefault(name.charAt(0), 0)+1);
		}
		
		String ans = ""; // ������ �� �ִ� ���� ù����
		
		for (Character i : map.keySet())
			if (map.get(i) >= 5)
				ans += i;
		
		if (ans.length() == 0) 
			System.out.println("PREDAJA");
		
		System.out.println(ans);
	}

}