import java.util.HashMap;
import java.util.Scanner;

/* 백준 (애너그램)
 * https://www.acmicpc.net/problem/6996
 */

class Algorithm220423__1 {

	private static boolean solveAnagrams(String first, String second) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : first.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		for (char c : second.toCharArray())
			map.put(c, map.getOrDefault(c, 0) - 1);

		for (int x : map.values())
			if (x != 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();

		for (int i = 0; i < numTests; i++) {
			String first = sc.next().toLowerCase();
			String second = sc.next().toLowerCase();

			System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
		}
	}

}