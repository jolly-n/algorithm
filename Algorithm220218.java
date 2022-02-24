
/* ���α׷��ӽ� (JadenCase ���ڿ� �����)
 * https://programmers.co.kr/learn/courses/30/lessons/12951
 */

class Algorithm220218 {

	/* Ǯ�� */
	public static String solution(String s) {
		char[] arr = s.toCharArray();		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			cnt++;
			if (arr[i] == ' ') {
				cnt = 0;
				continue;
			}
			
			if (cnt == 1) // ù ���ڸ� �빮��
				arr[i] = Character.toUpperCase(arr[i]);
			else // �� �� �ҹ���
				arr[i] = Character.toLowerCase(arr[i]);
		}
		return String.valueOf(arr);
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		String test1 = "3people unFollowed me";
		String test2 = "for the last week";

		System.out.println(solution(test1));
		System.out.println(solution(test2));
	}

}
