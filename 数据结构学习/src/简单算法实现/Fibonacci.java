package 简单算法实现;

//用递归的方法求Fibonacci数列
public class Fibonacci {
	public static int fibonacci(int n) {
		if (n < 0) {
			throw new java.lang.IllegalArgumentException("n=" + n);
		} else if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 24; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
