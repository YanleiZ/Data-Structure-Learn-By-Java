package 广义表部分;

public class GenListNode<T> {
	public T data;
	public GenList<T> child;
	public GenListNode<T> next;

	public GenListNode(T data, GenList<T> child, GenListNode<T> next) {
		this.data = data;
		this.child = child;
		this.next = next;
	}

	public GenListNode(T data) {
		this(data, null, null);
	}

	public GenListNode() {
		this(null, null, null);
	}
}
