package 简单算法实现;

//简单的递归问题，阶乘求解
public class Factorial {
	public static int factorial(int n) {
		if (n < 0) {
			throw new java.lang.IllegalArgumentException("n=" + n);
		} else if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n + "! =" + factorial(n));
	}
}
