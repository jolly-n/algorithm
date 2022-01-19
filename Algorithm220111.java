import java.util.Arrays;
import java.util.Scanner;

/* 프로그래머스 (서울에서 김서방 찾기)
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 */

class Algorithm220111 {
	public static String solution(String[] seaul) {
		int index = Arrays.asList(seaul).indexOf("Kim");
		
		return String.format("김서방은 %s에 있다", index);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("입력을 해주세요 : ");
		String[] arr = kb.nextLine().split(",");
		
		System.out.println(solution(arr));
	}
}