import java.util.HashSet;
import java.util.Set;

/* ���α׷��ӽ� (���ϸ�)
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 */

class Algorithm220126 {
	/* Ǯ�� */
	public static int solution(int[] nums) {		
		Set<Integer> set = new HashSet<>();
		
		// HashSet�� �̿��� �ߺ� ����
		for(int n : nums)
			set.add(n);
//		System.out.println(set); // Ȯ�ο�
		
		return Math.min(set.size(), nums.length/2); // ���� ���� �� ��ȯ

		// if�� ���� ����
//		if (set.size() == nums.length/2 || set.size() < nums.length/2) {
//		return set.size();
//	}
//	return nums.length/2;
	}
	
	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] test1 = {2,1,2,3}; 
		int[] test2 = {3,3,3,2,2,4}; 
		int[] test3 = {3,3,3,2,2,2}; 
		
		System.out.println(solution(test1));
		System.out.println(solution(test2));
		System.out.println(solution(test3));
	}
}