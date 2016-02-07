package 线性表部分;

public interface LList<T> {
	boolean isEmpty();

	int lenght();

	T get(int i);

	void set(int i, T x);

	void insert(int i, T x);

	T remove(int i);

	void removeAll();

	T search(T key);
}
