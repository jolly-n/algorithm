import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 프로그래머스 (최댓값과 최솟값)
 * https://programmers.co.kr/learn/courses/30/lessons/12939
 */

class Algorithm220216 {
	
	/* 풀이 */
	public static String solution(String s) {
		String[] arr = s.split(" ");		
		
		// String[] ➡ IntStream 
		IntStream ist1 = Stream.of(arr).mapToInt(Integer::parseInt);
		IntStream ist2 = Stream.of(arr).mapToInt(Integer::parseInt);
		
		return String.format("%d %d", ist2.min().getAsInt(), ist1.max().getAsInt());
	}
	
	/* 테스트 */
	public static void main(String[] args) {
		String test1 = "1 2 3 4";
		String test2 = "-1 -2 -3 -4";
		
		System.out.println(solution(test1));
		System.out.println(solution(test2));
	}

}