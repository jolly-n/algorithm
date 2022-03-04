
/* 프로그래머스 (올바른 괄호)
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 */

class Algorithm220302 {

	/* 풀이 */
	static boolean solution(String s) {		
		// (로 시작하고, )로 끝나야 한다.
		if (!(s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')'))
			return false;
		
		// (의 개수와 )의 개수가 동일해야 한다.
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				cnt++;

			if (s.charAt(i) == ')')
				cnt--;
			
			if (cnt < 0) // 괄호의 짝이 끝난 후 )가 먼저 오면 안됨
				return false;
		}

		return cnt == 0 ? true : false;
	}

	/* 테스트 */
	public static void main(String[] args) {
		String test = "(())()(())";
		System.out.println(solution(test));
	}

}