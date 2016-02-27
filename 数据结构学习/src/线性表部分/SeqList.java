package 线性表部分;

public class SeqList<T> implements LList<T> {
	private Object[] element;
	private int len;

	public SeqList(int size) {
		this.element = new Object[size];
		this.len = 0;
	}

	public SeqList() {
		this(64);
	}

	@Override
	public boolean isEmpty() {

		return this.len == 0;
	}

	@Override
	public int lenght() {

		return this.len;
	}

	@Override
	public T get(int i) {

		if (i >= 0 && i < this.len)
			return (T) this.element[i];
		return null;
	}

	@Override
	public void set(int i, T x) {

		if (x == null)
			return;
		if (i >= 0 && i < this.len)
			this.element[i] = x;
		else
			throw new IndexOutOfBoundsException(i + "");
	}

	@Override
	public void insert(int i, T x) {
		if (x == null)
			return;
		if (this.len == element.length) {
			Object[] temp = this.element;
			this.element = new Object[temp.length * 2];
			for (int j = 0; j < temp.length; j++)
				this.element[j] = temp[j];
		}
		if (i < 0)
			i = 0;
		if (i > this.len)
			i = this.len;
		for (int j = this.len - 1; j >= i; j--)
			this.element[j + 1] = this.element[j];
		this.element[i] = x;
		this.len++;
	}

	public void append(T x) {
		insert(this.len, x);
	}

	@Override
	public T remove(int i) {
		if (this.len == 0 || i < 0 || i > this.len)
			return null;
		@SuppressWarnings("unchecked")
		T old = (T) this.element[i];
		for (int j = i; j < this.len - 1; j++)
			this.element[j] = this.element[j + 1];
		this.element[this.len - 1] = null;
		this.len--;
		return old;
	}

	public void remove(T key) {
		if (this.len != 0 && key != null)
			this.remove(this.indexOf(key));
	}

	@Override
	public void removeAll() {
		this.len = 0;
	}

	@SuppressWarnings("unused")
	private int indexOf(T key) {
		if (key != null)
			for (int i = 0; i < this.len; i++) {
				if (this.element[i].equals(key)) {
					return i;
				}
			}
		return -1;
	}

	@Override
	public T search(T key) {
		int find = this.indexOf(key);
		return find == -1 ? null : (T) this.element[find];
	}

	public boolean contain(T key) {
		return this.indexOf(key) >= 0;
	}

	public String toString() {
		SeqList<Object> str = new SeqList<Object>(element.length);
		String s = "";
		for (int i = 0; i < element.length; i++) {
			// str.set(i, element[i]);
			if (this.element[i] != null) {
				s = s + (String) this.element[i];
			} else {

			}

		}

		return s;

	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof SeqList) {
			@SuppressWarnings("unchecked")
			SeqList<T> list = (SeqList<T>) obj;
			for (int i = 0; i < this.lenght(); i++) {
				if (this.get(i).equals(list.get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
