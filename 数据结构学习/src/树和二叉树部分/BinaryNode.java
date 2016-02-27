package 树和二叉树部分;

//这是二叉链表节点类
public class BinaryNode<T> {
	public T data;
	public BinaryNode<T> left, right;

	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public BinaryNode(T data) {
		this(data, null, null);
	}

	public BinaryNode() {
		this(null, null, null);
	}
}
