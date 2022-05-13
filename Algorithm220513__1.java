import java.util.Scanner;

/* 백준 (트리 순회)
 * https://www.acmicpc.net/problem/1991
 */

class Node { // 노드 정보를 저장 할 클래스
	char data; // 노드 값
	Node lt; // 왼쪽 자식 노드 값
	Node rt; // 오른쪽 자식 노드 값

	public Node(char data) {
		this.data = data;
	}
}

class Tree {
	public Node root;

	public void createNode(char data, char lt, char rt) {
		if (root == null) {
			root = new Node(data);
			root.lt = lt != '.' ? new Node(lt) : null;
			root.rt = rt != '.' ? new Node(rt) : null;
		} else {
			searchNode(root, data, lt, rt);
		}
	}

	public void searchNode(Node node, char data, char lt, char rt) {
		if (node == null)
			return;
		else if (node.data == data) {
			node.lt = lt != '.' ? new Node(lt) : null;
			node.rt = rt != '.' ? new Node(rt) : null;
		} else {
			searchNode(node.lt, data, lt, rt); // 왼쪽 재귀 탐색
			searchNode(node.rt, data, lt, rt); // 오른쪽 재귀 탐색
		}
	}
	
	// 전위순회 (root -> left -> right)
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data);
			if (node.lt != null) preOrder(node.lt);
			if (node.rt != null) preOrder(node.rt);
		}
	}
	
	// 중위순회 (left -> root -> right)
	public void inOrder(Node node) {
		if (node != null) {
			if (node.lt != null) inOrder(node.lt);
			System.out.print(node.data);
			if (node.rt != null) inOrder(node.rt);
		}
	}
	
	// 후위순회 (left -> right -> root)
	public void postOrder(Node node) {
		if (node != null) {
			if (node.lt != null) postOrder(node.lt);
			if (node.rt != null) postOrder(node.rt);
			System.out.print(node.data);
		}
	}
}
	
class Algorithm220513__1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine()); // 노드의 개수
		Tree t = new Tree();
		
		for (int i = 0; i < N; i++) {
			String[] arr = sc.nextLine().split(" "); 
			char root = arr[0].charAt(0);
			char lt = arr[1].charAt(0);
			char rt = arr[2].charAt(0);
			
			t.createNode(root, lt, rt);
		}
		
		t.preOrder(t.root);
		System.out.println();
		t.inOrder(t.root);
		System.out.println();
		t.postOrder(t.root);
	}
}