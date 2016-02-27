package 树和二叉树部分;

public class BinaryTree<T> implements BinaryTTree<T> {
	public BinaryNode<T> root;

	public BinaryTree() {
		this.root = null;
	}

	@Override
	public boolean isEmpty() {

		return this.root == null;
	}

	@Override
	public int count() {

		return count(root);
	}

	public int count(BinaryNode<T> p) {
		if (p == null) {
			return 0;
		}
		return count(p.left) + count(p.right) + 1;

	}

	@Override
	public int height() {
		return height(root);
	}

	public int height(BinaryNode<T> p) {
		if (p == null) {
			return 0;
		}
		int lh = height(p.left);
		int rh = height(p.right);

		return (lh >= rh) ? lh + 1 : rh + 1;
	}

	@Override
	public void preOrder() {
		System.out.print("先根次序遍历二叉树： ");
		preOrder(root);
		System.out.println();
	}

	public void preOrder(BinaryNode<T> p) {
		if (p != null) {
			System.out.print(p.data.toString() + " ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}

	@Override
	public void inOrder() {
		System.out.print("中根次序遍历二叉树： ");
		inOrder(root);
		System.out.println();

	}

	public void inOrder(BinaryNode<T> p) {
		if (p != null) {
			inOrder(p.left);
			System.out.print(p.data.toString() + " ");
			inOrder(p.right);
		}
	}

	@Override
	public void postOrder() {
		System.out.print("后根次序遍历二叉树： ");
		postOrder(root);
		System.out.println();
	}

	public void postOrder(BinaryNode<T> p) {
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.println(p.data.toString() + " ");
		}
	}

	@Override
	public void levelOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public BinaryNode<T> search(T key) {
		return serch(root, key);
	}

	public BinaryNode<T> serch(BinaryNode<T> p, T key) {
		BinaryNode<T> find;
		if (p == null || key == null)
			return null;
		if (p.data == key)
			return p;
		find = serch(p.left, key);
		if (find == null)
			find = serch(p.right, key);
		return find;
	}

	@Override
	public BinaryNode<T> getParent(BinaryNode<T> node) {
		if (root == null || node == null || node == root) {
			return null;
		}
		return getParent(root, node);
	}

	public BinaryNode<T> getParent(BinaryNode<T> p, BinaryNode<T> node) {
		if (p == null)
			return null;
		if (p.left == node || p.right == node)
			return null;
		BinaryNode<T> find = getParent(p.left, node);
		if (find == null)
			find = getParent(p.right, node);
		return find;
	}

	@Override
	public void insertRoot(T x) {
		root = new BinaryNode<>(x, root, null);

	}

	@Override
	public BinaryNode<T> insertChild(BinaryNode<T> p, T x, boolean leftChild) {
		if (p == null || x == null) {
			return null;
		}
		if (leftChild) {
			p.left = new BinaryNode<T>(x, p.left, null);
			return p.right;
		}
		p.right = new BinaryNode<T>(x, null, p.right);
		return null;
	}

	@Override
	public void removeChild(BinaryNode<T> p, boolean leftChild) {
		if (p != null)
			if (leftChild)
				p.left = null;
			else
				p.right = null;

	}

	@Override
	public void removeAll() {
		this.root = null;

	}
}
