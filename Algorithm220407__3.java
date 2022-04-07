import java.util.Scanner;

/* ���� (�׷� �ܾ� üĿ)
 * https://www.acmicpc.net/problem/1316
 */

public class Algorithm220407__3 {

	static int solution(int n, String[] sArr) {
		for (String s : sArr) { // �� �ܾ� �ݺ�
			loop : for (int i = 0; i < s.length(); i++) { // �ѱ��ھ� �ݺ�
				char c = s.charAt(i);
				
				int firstIdx = s.indexOf(c); // �ش� ���ĺ��� ó�� ���� �ε���
				int lastIdx = s.lastIndexOf(c); // �ش� ���ĺ��� �������� ���� �ε���

				for (int j = firstIdx; j <= lastIdx; j++) {
					if (s.charAt(j) != c) { // ���� ���ĺ� ���̿� �ٸ� ���ĺ��� ���� ���
						n -= 1;
						break loop;
					}
				}
			}
		}
		
		return n;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		String[] sArr = new String[n];
		for (int i = 0; i < n; i++)
			sArr[i] = kb.next();
		
		System.out.println(solution(n, sArr));
	}

}