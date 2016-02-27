package 广义表部分;

public class GenList<T> {
	public GenListNode<T> head;

	public GenList() {
		this.head = new GenListNode<T>();
	}

	public GenList(T[] atoms) {
		for (int i = 0; i < atoms.length; i++) {
			head = (GenListNode<T>) atoms[i];
			if(atoms[i+1] instanceof GenList){
				//head.child = atoms[i+1];
			}else
			head.next = (GenListNode<T>) atoms[i+1];
		}

	}

	public boolean isEmpty() {
		return head.next == null;
	}
	
}
