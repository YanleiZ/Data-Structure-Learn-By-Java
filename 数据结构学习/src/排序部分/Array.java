package 排序部分;

public class Array {
	// 插入排序的三种情况
	// 1.直接插入排序
	public static void insertSort(int[] table) {
		for (int i = 1; i < table.length; i++) {
			int temp = table[i], j;
			for (j = i - 1; j >= 0 && temp < table[j]; j--) {
				table[j + 1] = table[j];
			}
			table[j + 1] = temp;
			System.out.println("第" + i + "趟：");
			print(table);

		}
	}

	// 2.折半排序
	public static int[] halfSort(int[] table) {
		int begin, end, mid;

		for (int i = 1; i < table.length; i++) {
			int temp = table[i], j;
			begin = 0;
			end = i - 1;
			while (begin <= end) {
				mid = (end + begin) / 2;
				if (table[mid] > temp) {
					end = mid - 1;
				} else {
					begin = mid + 1;
				}

			}
			for (j = i - 1; j > end; j--) {
				table[j + 1] = table[j];
			}
			table[j + 1] = temp;

			System.out.println("第" + i + "趟：");
			print(table);
		}

		return table;
	}

	// 3.希尔排序
	// 不稳定（即相同值的数排序后位置会变化）
	public static void shellSort(int[] table) {
		int i0 = 1;
		for (int delta = table.length / 2; delta > 0; delta /= 2) {
			for (int i = delta; i < table.length; i++) {
				int temp = table[i], j;
				for (j = i - delta; j >= 0 && temp < table[j]; j -= delta) {
					table[j + delta] = table[j];
				}
				table[j + delta] = temp;
			}
			System.out.println("第" + i0 + "趟：");
			i0++;
			print(table);
		}
	}

	// 交换排序的几种
	// 1.冒泡排序
	public static void bubbleSort(int[] table) {
		boolean exchange = true;
		for (int i = 1; i < table.length && exchange; i++) {
			exchange = false;
			for (int j = 0; j < table.length - i; j++) {

				if (table[j] > table[j + 1]) {
					int temp = table[j];
					table[j] = table[j + 1];
					table[j + 1] = temp;
					exchange = true;
				}

			}
			System.out.println("第" + i + "趟：");

			print(table);
		}

	}

	// 2.快速排序
	// 通过选择基准值，进行冒泡排序
	public static int[] quickSort(int[] table) {
		return quickSort(table, 0, table.length - 1);
	}

	public static int[] quickSort(int[] table, int begin, int end) {

		if (begin < end) {
			int i = begin, j = end;
			int vot = table[i];// 第一个值作为基准值

			while (i != j) {
				while (i < j && vot <= table[j]) {
					j--;
				}
				if (i < j) {
					table[i++] = table[j];
				}
				while (i < j && table[i] <= vot) {
					i++;
				}
				if (i < j) {
					table[j--] = table[i];
				}
			}
			table[i] = vot;
			quickSort(table, begin, j - 1);
			quickSort(table, i + 1, end);

		}
		return table;

	}

	// 选择排序
	// 1.直接选择排序
	// 不稳定的排序算法
	public static void selectSort(int[] table) {
		for (int i = 0; i < table.length; i++) {
			int min = i;
			for (int j = i + 1; j < table.length; j++) {
				if (table[min] > table[j]) {
					min = j;
				}
				if (min != i) {
					int temp = table[min];
					table[min] = table[i];
					table[i] = temp;
				}
			}
			System.out.println("第" + i + "趟：");
			print(table);
		}
		
	}

	/*
	 * public static int[] halfSort(int[] array) { int low, high, mid; int tmp,
	 * j; for (int i = 1; i < array.length; i++) { tmp = array[i]; low = 0; high
	 * = i - 1; while (low <= high) { mid = low + (high - low) / 2; if
	 * (array[mid] > tmp) high = mid - 1; else low = mid + 1; } for (j = i - 1;
	 * j > high; j--) { array[j + 1] = array[j]; } array[high + 1] = tmp; }
	 * return array; }
	 */
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] table = { 54, 34, 5, 78, 56, 75, 3 };
		print(table);
		// insertSort(table);
		System.out.println("---------------------------------------");
		// halfSort(table);
		// shellSort(table);
		// bubbleSort(table);
		// print(quickSort(table));
		selectSort(table);
	}
	/*
	 * private static void insertSort(int[] table) { for (int i = 1; i <
	 * table.length; i++) { int temp = table[i], j; for (j = i - 1; j >= 0 &&
	 * temp <= table[j]; j--) { table[j + 1] = table[j]; } table[j + 1] = temp;
	 * System.out.println("第" + i + "趟："); print(table); }
	 * 用于练习的方法，和上边的insertSort方法是一样的 }
	 */
}
