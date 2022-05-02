import java.util.Arrays;
import java.util.Scanner;

/* ���� (���� ���� ��)
 * https://www.acmicpc.net/problem/8896
 */

class Algorithm220413__1 {

	static int solution(String[] robot) {
		int round = robot[0].length(); // ���� Ƚ��
		char[] game = new char[robot.length]; // ���������� ���
		int winner = 0; // ���� ����

		for (int k = 0; k < round; k++) {
			int player = 0; // �÷��̾� ��
			int S = 0, R = 0, P = 0; // ����, ����, �� ī����

			System.out.println("------------ " + (k + 1) + "���� ------------");
			System.out.println(Arrays.toString(robot));

			// �÷��̾� �� Ȯ��
			for (int i = 0; i < game.length; i++) {
				if (robot[i] != "0")
					player += 1;
			}

			// �÷��̾ �Ѹ��� ��� ���� ����
			if (player == 1) {
				break;
			}

			for (int j = 0; j < robot.length; j++) {
				if (robot[j] == "0") {
					game[j] = '0';
					continue;
				}

				if (robot[j].charAt(k) == 'S') {
					game[j] = 'S';
					S++;
				}
				if (robot[j].charAt(k) == 'R') {
					game[j] = 'R';
					R++;
				}
				if (robot[j].charAt(k) == 'P') {
					game[j] = 'P';
					P++;
				}
			}

			System.out.println(Arrays.toString(game));

			// �� �� �� ��� ���������
			if (S >= 1 && R >= 1 && P >= 1) {
				System.out.println("��ȿ");
				continue;
			}

			// ���º��� ��� ���������
			else if ((S == 0 && R == 0) || (S == 0 && P == 0) || (R == 0 && P == 0)) {
				System.out.println("���º�");
				continue;
			}

			// �º� ���� (����:S, ����:R, ��:P)
			System.out.println("�º�");
			for (int i = 0; i < game.length; i++) {
				// ����, ������ ����
				if (P == 0)
					if (game[i] == 'S')
						robot[i] = "0";

				// ����, ���� ����
				if (S == 0)
					if (game[i] == 'R')
						robot[i] = "0";

				// ����, ���� ����
				if (R == 0)
					if (game[i] == 'P')
						robot[i] = "0";
			}
		}
		
		int cnt = 0; // ������ ī��Ʈ
		for (int i = 0; i < robot.length; i++) {
			if (robot[i] != "0") {
				cnt++;
				winner = i + 1;
			}
		}

		if (cnt != 1) // ���ڰ� ���� ���
			return 0;

		return winner;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // �׽�Ʈ ���̽��� ����

		for (int i = 0; i < t; i++) {
			String[] robot = new String[sc.nextInt()]; // �����ϴ� �κ�

			for (int r = 0; r < robot.length; r++)
				robot[r] = sc.next();

			System.out.println(solution(robot));
		}
	}

}