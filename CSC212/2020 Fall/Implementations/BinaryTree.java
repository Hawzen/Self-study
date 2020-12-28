
public class BinaryTree<T> {

	private BTNode<T> root, cur;

	public BinaryTree() {

		cur = root = null;

	}

	public int CountLeafNode() {

		cur = root;

		if (cur.right == null && cur.left == null)
			return 1;

		Stack<BTNode<T>> s = new LinkedStack<BTNode<T>>();
		int count = 0;

		if (cur.right != null)
			s.push(cur.right);

		while (cur.left != null || !s.IsEmpty()) {

			cur = cur.left;

			if (cur == null)
				cur = s.pop();

			if (cur.left == null && cur.right == null)
				count++;

			if (cur.right != null)
				s.push(cur.right);

		}
		
		cur = root;
		return count;
	}

	public boolean insert(T e, Relative rel) {

		switch (rel) {
		case Root: {

			if (root == null) {
				root = cur = new BTNode<T>(e);
				return true;
			}
			return false;
		}

		case Parent:
			return false;

		case LeftChild: {

			if (cur.left == null) {
				cur.left = new BTNode<T>(e);
				cur = cur.left;
				return true;
			}

			return false;

		}

		case RightChild: {

			if (cur.right == null) {
				cur.right = new BTNode<T>(e);
				cur = cur.right;
				return true;
			}

			return false;

		}
		}
		return false;
	}

	public boolean find(Relative rel) {

		switch (rel) {
		case Root: {
			cur = root;
			return true;
		}
		case Parent:
			if (cur == root)
				return false;
			cur = FindParent(cur, root);
			return true;

		case LeftChild: {

			if (cur.left == null)
				return false;

			cur = cur.left;
			return true;
		}

		case RightChild: {

			if (cur.right == null)
				return false;

			cur = cur.right;
			return true;

		}
		}
		return false;

	}

	public void DeleteSub() {

		if (cur == root)
			root = cur = null;
		else {
			find(Relative.Parent);
			if (cur.left == cur)
				cur.left = null;
			else
				cur.right = null;

			cur = root;
		}
	}

	public void update(T e) {
		cur.data = e;
	}

	public T retrive() {
		return cur.data;
	}

	public boolean IsEmpty() {
		return root == null;
	}

	public boolean Full() {
		return false;
	}

	private BTNode<T> FindParent(BTNode<T> cur2, BTNode<T> root2) {

		if (root2 == null)
			return null;
		else if (root2.right == null && root2.left == null)
			return null;
		else if (root2.left == cur2 || root2.right == cur2) {
			return root2;
		} else {

			BTNode<T> found = FindParent(cur2, root2.left);

			if (found == null)
				found = FindParent(cur2, root2.right);

			return found;
		}

	}

    boolean notRightChild(T e){
        BTNode<T> temp = root;
        if(temp == null)	return false;
        return notRightChildRec(e, temp);
    }

    boolean notRightChildRec(T e, BTNode<T> crnt){
		if(crnt.right != null){
			if(crnt.right.data.equals(e))	return true;
			if(notRightChildRec(e, crnt.right))	return true;
		}
		if(crnt.left != null)
			if(notRightChildRec(e, crnt.left))	return true;
		return false;
    }
}

class BTNode <T> {
	public T data;
	public BTNode<T> left, right;

	/** Creates a new instance of BTNode */
	public BTNode(T val) {
		data = val;
		left = right = null;
	}

	public BTNode(T val, BTNode<T> l, BTNode<T> r){
		data = val;
		left = l;
		right = r;
	}
}

enum Order {preOrder, inOrder, postOrder};
enum Relative {Root, Parent, LeftChild, RightChild};