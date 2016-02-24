package 栈和队列部分;

public interface QQueue<T> {
	boolean isEmpty();

	void enqueue(T x);

	T dequeue();
}
