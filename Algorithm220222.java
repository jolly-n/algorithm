import java.util.Scanner;

/* ���� (����Լ��� ������?)
 * https://www.acmicpc.net/problem/17478
 */

class Algorithm220222 {
	static String str = "";
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);		
		int num = kb.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		
		print(num);
		
	}
	
	static void print(int num) {
		String underbar = str;
		
		if (num == 0) {
			System.out.println(underbar + "\"����Լ��� ������?\"");
			System.out.println(underbar + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(underbar + "��� �亯�Ͽ���.");
			return;
		}
		
		System.out.println(underbar + "\"����Լ��� ������?\"");
		System.out.println(underbar + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(underbar + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(underbar + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		str += "____";
		print(num-1);
		
		System.out.println(underbar + "��� �亯�Ͽ���.");
	}

}