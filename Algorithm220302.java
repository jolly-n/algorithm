
/* ���α׷��ӽ� (�ùٸ� ��ȣ)
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 */

class Algorithm220302 {

	/* Ǯ�� */
	static boolean solution(String s) {		
		// (�� �����ϰ�, )�� ������ �Ѵ�.
		if (!(s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')'))
			return false;
		
		// (�� ������ )�� ������ �����ؾ� �Ѵ�.
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				cnt++;

			if (s.charAt(i) == ')')
				cnt--;
			
			if (cnt < 0) // ��ȣ�� ¦�� ���� �� )�� ���� ���� �ȵ�
				return false;
		}

		return cnt == 0 ? true : false;
	}

	/* �׽�Ʈ */
	public static void main(String[] args) {
		String test = "(())()(())";
		System.out.println(solution(test));
	}

}