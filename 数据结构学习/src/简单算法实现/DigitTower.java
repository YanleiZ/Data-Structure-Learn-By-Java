package 简单算法实现;

//递归实现打印数字塔
public class DigitTower {
	public static void line(int i, int n) {
		System.out.print(String.format("%3d", i));
		if (i < n) {
			line(i + 1, n);
			System.out.print(String.format("%3d", i));
		}
	}

	public static void main(String args[]) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			System.out.print(String.format("%" + 3 * (n - i + 1) + "c", ' '));
			line(1, i);
			System.out.println();
		}

	}
}
