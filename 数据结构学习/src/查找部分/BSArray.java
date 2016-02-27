package 查找部分;

//二分法查找的简单实现
public class BSArray {
	public static int binarySearch(int[] value, int begin, int end, int key) {
		while (begin <= end) {
			int mid = (begin + end) / 2;
			if (value[mid] == key)
				return mid;
			if (value[mid] < key)
				begin = mid + 1;
			else
				end = mid - 1;

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 7, 9, 12, 32, 34, 56, 78 };
		System.out.println(binarySearch(a, 0, 5, 9));
	}
}
