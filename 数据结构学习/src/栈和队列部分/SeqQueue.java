package 栈和队列部分;

//顺序循环队列类
public class SeqQueue<T> implements QQueue<T> {
	private Object element[];
	private int front, rear;

	public SeqQueue(int length) {
		if (length < 64) {
			this.element = new Object[(Math.abs(length))];
		}
		this.element = new Object[Math.abs(length)];
		this.front = this.rear = 0;
	}

	public SeqQueue() {
		this(64);
	}

	public boolean isEmpty() {
		return this.front == this.rear;
	}

	public void enqueue(T x) {
		// TODO Auto-generated method stub
		if (x == null) {
			return;
		}
		if (this.front == (this.rear + 1) % this.element.length) {
			Object[] temp = this.element;
			this.element = new Object[this.element.length * 2];
			int i = this.front, j = 0;
			while (i != this.rear) {
				this.element[j] = temp[i];
				i = (i + 1) % temp.length;
				j++;
			}
			this.front = 0;
			this.rear = j;
		}
		this.element[this.rear] = x;
		this.rear = (this.rear + 1) % this.element.length;
	}

	public T dequeue() {
		if (isEmpty()) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T temp = (T) this.element[this.front];
		this.front = (this.front + 1) % this.element.length;
		return temp;
	}

	/*public String toString() {
		String str = "";
		if (!isEmpty()) {
			str += this.element[this.front].toString();
			int i = (this.front + 1) % this.element.length;
			while (i != this.rear) {
				str += "," + this.element[i].toString();
				i = (i + 1) % this.element.length;

			}
		}
		return str + ")";
	}*/
}
