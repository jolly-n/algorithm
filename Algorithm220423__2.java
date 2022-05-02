import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/* ���� (�߿�)
 * https://www.acmicpc.net/problem/2002
 */

class Algorithm220423__2 {

	static int solution(int n, String[] in, String[] out) {
		HashMap<String, Integer> inCar = new HashMap<>(); // <������ȣ, ��������>
		ArrayList<String> outCar = new ArrayList<>();

		for (int i = 0; i < n; i++)
			inCar.put(in[i], i + 1);

		for (int i = 0; i < n; i++)
			outCar.add(out[i]);

		List<Entry<String, Integer>> inCarRanks = new ArrayList<>(inCar.entrySet());
		inCarRanks.sort((n1, n2) -> n1.getValue() - n2.getValue()); // ���������� �������� �������� ����

//		System.out.println(inCarRanks); // Ȯ�ο�
//		System.out.println(outCar); // Ȯ�ο�

		int cnt = 0; // �߿����� ī��Ʈ

		for (Entry<String, Integer> rank : inCarRanks) {
//			System.out.println("--- rank : " + rank.getKey() + " ---"); // Ȯ�ο�
			
			Iterator<String> itr = outCar.iterator();
			
			while(itr.hasNext() && outCar.contains(rank.getKey())) {
				String carNum = itr.next(); // �߿� �������� Ȯ���� í����ȣ
				if (!carNum.equals(rank.getKey())) {
					itr.remove();
					cnt++;
//					System.out.println("�߿� : " + carNum + " / " + cnt); // Ȯ�ο�
				} else {
					itr.remove();
					break;
				}
			}
//			System.out.println(outCar); // Ȯ�ο�
			
			if (outCar.size() == 1)
				return cnt;
		}

		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ���� ���
		String[] in = new String[n]; // �ͳ��Ա����� ���� ���� ��ȣ ���
		String[] out = new String[n]; // �ͳ��ⱸ���� ���� ���� ��ȣ ���

		for (int i = 0; i < n; i++)
			in[i] = sc.next();
		for (int i = 0; i < n; i++)
			out[i] = sc.next();

		System.out.println(solution(n, in, out));
	}

}