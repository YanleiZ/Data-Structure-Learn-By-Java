package ≈≈–Ú≤ø∑÷;

public class Array {
	public static void insertSort(int[] table) {
		for (int i = 1; i < table.length; i++) {
			int temp = table[i], j;
			for (j = i - 1; j >= 0 && temp < table[j]; j--) {
				table[j + 1] = table[j];
			}
			table[j + 1] = temp;
			System.out.println("µ⁄" + i + "ÃÀ£∫");
			print(table);

		}
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] table = { 54, 34, 5, 78, 56, 75, 3 };
		print(table);
		insertSort(table);
	}
}
