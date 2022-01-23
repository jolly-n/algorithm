import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 프로그래머스 (나누어 떨어지는 숫자 배열)
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */

class Algorithm220123__1 {
	/* 풀이 */
	public static int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr); // 배열 오름차순 정렬
		
		List<Integer> list = new ArrayList<>(); // ArrList 생성
		for (int n : arr) {
			if (n % divisor == 0) // 나누어 떨어지면 요소 추가
				list.add(n);	
			continue;
		}
		
		if (list.size() == 0) { // 요소가 없다면 -1
			list.add(-1);
		}
		
		// ArrayList<Integer> -> int[] 변환		
		/* 방법1 (each-for문) */
		int[] ans = new int[list.size()];
		int cnt = 0;		
		for(int m : list) {
			ans[cnt++] = m;
		}
		
		/* 방법2 (람다)*/
//		int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
			
		return ans;
	}

	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] arr1 = {5, 9, 7, 10};
		System.out.println(Arrays.toString(solution(arr1, 5)));
	}
}