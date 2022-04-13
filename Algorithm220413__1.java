import java.util.Arrays;
import java.util.Scanner;

/* 백준 (가위 바위 보)
 * https://www.acmicpc.net/problem/8896
 */

class Algorithm220413__1 {

	static int solution(String[] robot) {
		int round = robot[0].length(); // 라운드 횟수
		char[] game = new char[robot.length]; // 가위바위보 결과
		int winner = 0; // 최종 승자

		for (int k = 0; k < round; k++) {
			int player = 0; // 플레이어 수
			int S = 0, R = 0, P = 0; // 가위, 바위, 보 카운팅

			System.out.println("------------ " + (k + 1) + "라운드 ------------");
			System.out.println(Arrays.toString(robot));

			// 플레이어 수 확인
			for (int i = 0; i < game.length; i++) {
				if (robot[i] != "0")
					player += 1;
			}

			// 플레이어가 한명일 경우 게임 종료
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

			// 셋 다 낼 경우 다음라운드로
			if (S >= 1 && R >= 1 && P >= 1) {
				System.out.println("무효");
				continue;
			}

			// 무승부일 경우 다음라운드로
			else if ((S == 0 && R == 0) || (S == 0 && P == 0) || (R == 0 && P == 0)) {
				System.out.println("무승부");
				continue;
			}

			// 승부 결정 (가위:S, 바위:R, 보:P)
			System.out.println("승부");
			for (int i = 0; i < game.length; i++) {
				// 가위, 바위만 존재
				if (P == 0)
					if (game[i] == 'S')
						robot[i] = "0";

				// 바위, 보만 존재
				if (S == 0)
					if (game[i] == 'R')
						robot[i] = "0";

				// 가위, 보만 존재
				if (R == 0)
					if (game[i] == 'P')
						robot[i] = "0";
			}
		}
		
		int cnt = 0; // 생존자 카운트
		for (int i = 0; i < robot.length; i++) {
			if (robot[i] != "0") {
				cnt++;
				winner = i + 1;
			}
		}

		if (cnt != 1) // 승자가 없는 경우
			return 0;

		return winner;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스의 개수

		for (int i = 0; i < t; i++) {
			String[] robot = new String[sc.nextInt()]; // 참여하는 로봇

			for (int r = 0; r < robot.length; r++)
				robot[r] = sc.next();

			System.out.println(solution(robot));
		}
	}

}