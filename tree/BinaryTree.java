package ds.tree.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	TreeNode root;

	public static TreeNode insert(TreeNode node, int val) {
		if (node == null) {
			node = new TreeNode(val);
			return node;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.left != null) {
				q.offer(temp.left);
			} else {
				temp.left = new TreeNode(val);
				break;
			}

			if (temp.right != null) {
				q.offer(temp.right);
			} else {
				temp.right = new TreeNode(val);
				break;
			}

		}

		return node;
	}

	public static void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + "  ");
			inOrder(node.right);
		}
	}

	public static void postOrderRec(TreeNode node) {
		if (node != null) {
			postOrderRec(node.left);
			postOrderRec(node.right);
			System.out.print(node.data + "  ");
		}
	}

	public static ArrayList<Integer> lavel(TreeNode node) {
		if (node == null) {
			return null;
		}
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<Integer> al = new ArrayList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			al.add(temp.data);
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}
		return al;

	}

	public static void postOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		s1.push(node);
		while (!s1.isEmpty()) {
			TreeNode temp = s1.pop();
			s2.push(temp.data);
			if (temp.left != null) {
				s1.push(temp.left);
			}
			if (temp.right != null) {
				s1.push(temp.right);
			}

		}

		while (!s2.isEmpty()) {
			System.out.print(s2.pop() + " ");
		}

	}

	public static int maxval(TreeNode node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int max = Integer.MIN_VALUE;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.data > max) {
				max = temp.data;
			}
			if (temp.left != null) {
				q.offer(temp.left);

			}
			if (temp.right != null) {
				q.offer(temp.right);

			}
		}
		return max;
	}

	public static int countLeaf(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int count = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.left == null && temp.right == null) {
				count++;
			}
			if (temp.left != null) {
				q.offer(temp.left);

			}
			if (temp.right != null) {
				q.offer(temp.right);

			}
		}
		return count;
	}

	public static int countLavel(TreeNode node) {
		if (node == null)
			return 0;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(node);
		q.offer(null);
		int count = 1;
		while (!q.isEmpty()) {

			TreeNode temp = q.poll();
			if (temp != null) {
				if (temp.left != null)
					q.offer(temp.left);
				if (temp.right != null)
					q.offer(temp.right);
			} else {
				if (!q.isEmpty()) {
					count++;
					q.offer(null);
				}
			}
			
		}
		return count;
	}

	
	
	public static boolean isval(TreeNode node, int val) {
		if (node == null) {
			return false;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.data == val) {
				return true;
			}
			if (temp.left != null) {
				q.offer(temp.left);

			}
			if (temp.right != null) {
				q.offer(temp.right);

			}
		}
		return false;
	}

	
	public static boolean isNode(TreeNode node, int val){

		if(node == null) return false;

		if(node.data == val) return true;

		return isNode(node.left,val) || isNode(node.right,val);

		}
	
	
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.root = insert(t.root, 10);
		t.root = insert(t.root, 200);
		t.root = insert(t.root, 30);
		t.root = insert(t.root, 40);
		t.root = insert(t.root, 50);
		t.root = insert(t.root, 60);
		t.root = insert(t.root, 70);
		inOrder(t.root);
		System.out.println();
		System.out.println(lavel(t.root));

		postOrder(t.root);
		System.out.println();
		postOrderRec(t.root);
		System.out.println();
		System.out.println(maxval(t.root));
		System.out.println(countLeaf(t.root));
		System.out.println(countLavel(t.root.left));
		
		System.out.println(isval(t.root, 100));
		System.out.println(isNode(t.root,100));
	}

}
