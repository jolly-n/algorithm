import java.util.Scanner;

/* SW Expert Academy (달팽이 숫자)
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq
 */

class Algorithm220207 {
	/* 풀이 */
	public static void snail(int n) {
		int[][] arr = new int[n][n];

		int[] dr = { 0, 1, 0, -1 }; // 행 변화값 (우 하 좌 상)
		int[] dc = { 1, 0, -1, 0 }; // 열 변화값 (우 하 좌 상)
		int[] dd = { 0, 1, 2, 3 };  // 인덱스 값

		int row = 0; // 행 초기화
		int column = 0; // 열 초기화
		int cnt = 0; // dd의 인덱스 초기화

		// 배열 채우기
		for (int i = 1; i <= n * n; i++) {
			int dRow = row + dr[dd[cnt]]; // 다음번 움직일 행
			int dColumn = column + dc[dd[cnt]]; // 다음번 움직일 열

			// 방향을 바꿔 줄 조건
			if (dRow < 0 || dRow >= n || dColumn < 0 || dColumn >= n || arr[dRow][dColumn] != 0) {
				cnt = (cnt + 1) % 4; // cnt가 3을 넘어가지 않게 해줌
				dRow = row + dr[dd[cnt]]; 
				dColumn = column + dc[dd[cnt]];
			}
			
			arr[row][column] = i;
			row = dRow;
			column = dColumn;
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int testNum = kb.nextInt(); // 테스트 케이스의 개수
		
		for (int i = 1; i <= testNum; i++) {
			int snailNum = kb.nextInt(); // 각 테스트 케이스
			System.out.println("#" + i);
			snail(snailNum);
		}
	}
}