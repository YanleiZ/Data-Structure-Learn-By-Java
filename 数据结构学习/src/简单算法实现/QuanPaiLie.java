package 简单算法实现;

public class QuanPaiLie {
	public static void f(char[] data, int k) {
		if (k == data.length) {
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i]);
			}
			System.out.println();
		}
		for (int i = k; i < data.length; i++) {
			{
				int t = data[k];
				data[k] = data[i];
				data[i] = (char) t;
			}
			f(data, k + 1);
			{
				int t = data[k];
				data[k] = data[i];
				data[i] = (char) t;
			}
		}
	}

	public static void main(String[] args) {
		char[] data = "AABB".toCharArray();
		f(data, 0);
	}
}
