package 线性表部分;

public class SeqList<T> implements LList<T>{
    private Object[]element;
    private int len;
    public SeqList(int size){
    	this.element = new Object[size];
    	this.len = 0;
    }
    public SeqList(){
    	this(64);
    }
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int lenght() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void set(int i, T x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert(int i, T x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T search(T key) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
