import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* ���α׷��ӽ� (������ �������� ���� �迭)
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */

class Algorithm220123__1 {
	/* Ǯ�� */
	public static int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr); // �迭 �������� ����
		
		List<Integer> list = new ArrayList<>(); // ArrList ����
		for (int n : arr) {
			if (n % divisor == 0) // ������ �������� ��� �߰�
				list.add(n);	
			continue;
		}
		
		if (list.size() == 0) { // ��Ұ� ���ٸ� -1
			list.add(-1);
		}
		
		// ArrayList<Integer> -> int[] ��ȯ		
		/* ���1 (each-for��) */
		int[] ans = new int[list.size()];
		int cnt = 0;		
		for(int m : list) {
			ans[cnt++] = m;
		}
		
		/* ���2 (����)*/
//		int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
			
		return ans;
	}

	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		int[] arr1 = {5, 9, 7, 10};
		System.out.println(Arrays.toString(solution(arr1, 5)));
	}
}