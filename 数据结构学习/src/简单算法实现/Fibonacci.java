package ���㷨ʵ��;

//�õݹ�ķ�����Fibonacci����
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
