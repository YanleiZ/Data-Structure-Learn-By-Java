package 栈和队列部分;

public class SeqStack<T> implements SStask<T> {
	private Object element[];
	private int top;

	public SeqStack(int size) {
		this.element = new Object[Math.abs(size)];
		this.top = -1;
	}

	public SeqStack() {
		this(64);
	}

	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}

	@Override
	public void push(T x) {
		if (x == null)
			return;
		if (this.top == element.length - 1) {
			Object[] temp = this.element;
			this.element = new Object[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				this.element[i] = temp[i];
			}
			
		}
		this.top++;
		this.element[this.top] = x;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {

		return this.top == -1 ? null : (T) this.element[this.top--];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get() {
		return this.top == -1 ? null : (T) this.element[this.top];
	}

}
