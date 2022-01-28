import java.util.HashSet;
import java.util.Set;

/* 프로그래머스 (폰켓몬)
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 */

class Algorithm220126 {
	/* 풀이 */
	public static int solution(int[] nums) {		
		Set<Integer> set = new HashSet<>();
		
		// HashSet을 이용해 중복 제거
		for(int n : nums)
			set.add(n);
//		System.out.println(set); // 확인용
		
		return Math.min(set.size(), nums.length/2); // 둘중 작은 값 반환

		// if문 생략 가능
//		if (set.size() == nums.length/2 || set.size() < nums.length/2) {
//		return set.size();
//	}
//	return nums.length/2;
	}
	
	/* 메인 메소드 */
	public static void main(String[] args) {
		int[] test1 = {2,1,2,3}; 
		int[] test2 = {3,3,3,2,2,4}; 
		int[] test3 = {3,3,3,2,2,2}; 
		
		System.out.println(solution(test1));
		System.out.println(solution(test2));
		System.out.println(solution(test3));
	}
}