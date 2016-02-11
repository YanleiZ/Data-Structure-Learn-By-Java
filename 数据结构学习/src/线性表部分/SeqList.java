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
		// TODO Auto-generated method stub
		return this.len == 0;
	}

	@Override
	public int lenght() {
		// TODO Auto-generated method stub
		return this.len;
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		if (i >= 0 && i < this.len)
			return (T) this.element[i];
		return null;
	}

	@Override
	public void set(int i, T x) {
		// TODO Auto-generated method stub
		if (x == null)
			return;
		if (i >= 0 && i < this.len)
			this.element[i] = x;
		else
			throw new IndexOutOfBoundsException(i + "");
	}

	@Override
	public void insert(int i, T x) {
		// TODO Auto-generated method stub
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
		T old = (T) this.element[i];
		for (int j = i; j < this.len - 1; j++)
			this.element[j] = this.element[j + 1];
		this.element[this.len - 1] = null;
		this.len--;
		return old;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		this.len = 0;
	}

	@Override
	public T search(T key) {
		// TODO Auto-generated method stub
		return null;
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
}
