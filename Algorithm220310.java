import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 백준 (수학숙제)
 * https://www.acmicpc.net/problem/2870
 */

class Algorithm220310 {

	// 런타임 오류(NumberFormat)
	static void findNumber(List<String> li) {
		List<BigInteger> numsList = new ArrayList<>();

		for (String s : li) {
			String[] nums = s.split("\\D"); // 정규표현식 (\\D:숫자가 아닌 것들을 공백으로 치환=[^0-9])

			for (String num : nums) {
				if (num != "") {
					if (num.length() != 1 && num.charAt(0) == '0') {
						String n = "";

						if (num.charAt(num.length() - 1) == '0')
							n += "0";

						for (int i = 0; i < num.length(); i++)
							if (num.charAt(i) != '0')
								n += num.charAt(i);

						numsList.add(BigInteger.valueOf(Long.parseLong(n)));
					}

					else {
						numsList.add(BigInteger.valueOf(Long.parseLong(num)));
					}
				}
			}
		}

		numsList.sort((o1, o2) -> o1.compareTo(o2));

		for (BigInteger num : numsList)
			System.out.println(num);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int N = Integer.parseInt(kb.nextLine());
		List<String> li = new ArrayList<>();

		for (int i = 0; i < N; i++)
			li.add(kb.nextLine());

		findNumber(li);
	}

}