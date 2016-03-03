package ���򲿷�;

public class Array {
	// ����������������
	// 1.ֱ�Ӳ�������
	public static void insertSort(int[] table) {
		for (int i = 1; i < table.length; i++) {
			int temp = table[i], j;
			for (j = i - 1; j >= 0 && temp < table[j]; j--) {
				table[j + 1] = table[j];
			}
			table[j + 1] = temp;
			System.out.println("��" + i + "�ˣ�");
			print(table);

		}
	}

	// 2.�۰�����
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

			System.out.println("��" + i + "�ˣ�");
			print(table);
		}

		return table;
	}

	// 3.ϣ������
	// ���ȶ�������ֵͬ���������λ�û�仯��
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
			System.out.println("��" + i0 + "�ˣ�");
			i0++;
			print(table);
		}
	}

	// ��������ļ���
	// 1.ð������
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
			System.out.println("��" + i + "�ˣ�");

			print(table);
		}

	}

	// 2.��������
	// ͨ��ѡ���׼ֵ������ð������
	public static int[] quickSort(int[] table) {
		return quickSort(table, 0, table.length - 1);
	}

	public static int[] quickSort(int[] table, int begin, int end) {

		if (begin < end) {
			int i = begin, j = end;
			int vot = table[i];// ��һ��ֵ��Ϊ��׼ֵ

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

	// ѡ������
	// 1.ֱ��ѡ������
	// ���ȶ��������㷨
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
			System.out.println("��" + i + "�ˣ�");
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
	 * System.out.println("��" + i + "�ˣ�"); print(table); }
	 * ������ϰ�ķ��������ϱߵ�insertSort������һ���� }
	 */
}
