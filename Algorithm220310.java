import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* ���� (���м���)
 * https://www.acmicpc.net/problem/2870
 */

class Algorithm220310 {

	static void findNumber(List<String> li) {
		List<BigInteger> numsList = new ArrayList<>();

		for (String s : li) {
			String[] nums = s.split("\\D"); // ����ǥ���� (\\D:���ڰ� �ƴ� �͵��� �������� ġȯ=[^0-9])

			for (String num : nums) {
				if (num != "")
					numsList.add(new BigInteger(num)); // �����ڴ� String ���� ����
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