import java.util.Arrays;
import java.util.Scanner;

/* 백준 (트리 순회)
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
			root = new Node(data); // 루트 노드 생성
			root.lt = lt != "." ? new Node(lt) : null; // 왼쪽 노드 생성
			root.rt = rt != "." ? new Node(rt) : null; // 오른쪽 노드 생성
		} else {
			searchNode(root, data, lt, rt); // 루트 노드가 있는 경우 찾기
		}
	}
	
	public void searchNode(Node node, String data, String lt, String rt) {
		if (node.data == data) {
			
		}
	}
}

class Algorithm220221 {
	public static void main(String[] args) {
		// 입력 받기
		Scanner kb = new Scanner(System.in);

		System.out.print("노드의 개수 >> ");
		int cnt = Integer.parseInt(kb.nextLine());

		Tree t = new Tree();

		for (int i = 0; i <= cnt; i++) {
			String[] arr = kb.nextLine().split(" ");
			System.out.println(i + "번째 반복: " + Arrays.toString(arr));

			String root = arr[0];
			String lt = arr[1];
			String rt = arr[2];

			t.creatNode(root, lt, rt);
		}
	}
}
