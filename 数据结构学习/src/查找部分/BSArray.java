package ²éÕÒ²¿·Ö;

public class BSArray {
	public static int binarySearch(int[] value, int begin, int end, int key) {
		while (begin <= end) {
			int mid = (begin + end) / 2;
			if (value[mid] == key)
				return mid;
			if (value[mid] < key)
				end = mid - 1;
			else
				begin = mid + 1;

		}
		return 0;

	}
}
