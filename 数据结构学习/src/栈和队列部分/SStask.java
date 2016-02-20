package 栈和队列部分;

public interface SStask<T> {
    boolean isEmpty();
    void push(T x);
    T pop();
    T get();
}
