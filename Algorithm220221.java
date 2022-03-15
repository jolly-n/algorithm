import java.util.Arrays;
import java.util.Scanner;

/* ���� (Ʈ�� ��ȸ)
 * https://www.acmicpc.net/problem/1991
 */

class Node {
	String data;
	Node lt;
	Node rt;

	Node(String data) {
		this.data = data;
	}
}

class Tree {
	Node root;
	public void creatNode(String data, String lt, String rt) {
		if (root == null) {
			root = new Node(data); // ��Ʈ ��� ����
			root.lt = lt != "." ? new Node(lt) : null; // ���� ��� ����
			root.rt = rt != "." ? new Node(rt) : null; // ������ ��� ����
		} else {
			searchNode(root, data, lt, rt); // ��Ʈ ��尡 �ִ� ��� ã��
		}
	}
	
	public void searchNode(Node node, String data, String lt, String rt) {
		if (node.data == data) {
			
		}
	}
}

class Algorithm220221 {
	public static void main(String[] args) {
		// �Է� �ޱ�
		Scanner kb = new Scanner(System.in);

		System.out.print("����� ���� >> ");
		int cnt = Integer.parseInt(kb.nextLine());

		Tree t = new Tree();

		for (int i = 0; i <= cnt; i++) {
			String[] arr = kb.nextLine().split(" ");
			System.out.println(i + "��° �ݺ�: " + Arrays.toString(arr));

			String root = arr[0];
			String lt = arr[1];
			String rt = arr[2];

			t.creatNode(root, lt, rt);
		}
	}
}
