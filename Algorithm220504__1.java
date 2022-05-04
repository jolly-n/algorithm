/* ���α׷��ӽ� ([1��]ĳ��)
 * https://programmers.co.kr/learn/courses/30/lessons/17680
 */

class Algorithm220504__1 {

	static int solution(int cacheSize, String[] cities) {
		int time = 0; // �� ����ð�
		String[] cache = new String[cacheSize];
		
		if (cacheSize <= 0) // ĳ�ð� ���� ��� ��� miss ó��
			return cities.length * 5;

		for (String city : cities) {
			int pos = -1;

			for (int i = 0; i < cacheSize; i++)
				if (city.equalsIgnoreCase(cache[i])) // ĳ�ÿ� �ִٸ� hit
					pos = i;

			if (pos == -1) { // miss ��Ȳ�� ���
				for (int i = cacheSize - 1; i >= 1; i--)
					cache[i] = cache[i - 1];
				time += 5;
			} else { // hit ��Ȳ�� ���
				for (int i = pos; i >= 1; i--)
					cache[i] = cache[i - 1];
				time += 1;
			}

			cache[0] = city;
		}

		return time;
	}

	public static void main(String[] args) {
		// test case
		int cacheSize = 3;
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		System.out.println(solution(cacheSize, cities));
	}

}