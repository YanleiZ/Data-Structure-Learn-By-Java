package 树和二叉树部分;

public interface BinaryTTree<T> {
	boolean isEmpty();

	int count();

	int height();

	void preOrder();

	void inOrder();

	void postOrder();

	void levelOrder();

	BinaryNode<T> search(T key);

	BinaryNode<T> getParent(BinaryNode<T> node);

	void insertRoot(T x);

	BinaryNode<T> insertChild(BinaryNode<T> p, T x, boolean leftChild);

	void removeChild(BinaryNode<T> p, boolean leftChild);

	void removeAll();
}
