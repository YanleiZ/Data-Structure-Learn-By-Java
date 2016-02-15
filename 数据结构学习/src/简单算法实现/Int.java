package 简单算法实现;

//用于整数的二进制或十六进制转换
public class Int {
	public static String toBinaryString(int n) {
		String str = "";
		for (int i = 0x80000000; i != 0; i >>>= 1) {
			str += (n & i) == 0 ? '0' : '1';

		}
		return str;
	}

	public static String toHexString(int n) {
		String str = "";
		while (n > 0) {
			int k = n % 16;
			str = (char) (k <= 9 ? k + '0' : k + 'A' - 10) + str;
			n /= 16;
		}
		return str;
	}

	public static String toString(int n, int radix) {
        String str = "";
        while(n>0){
        	int k = n%radix;
        	str = (char)(k<=9?k+'0':k+'A'-10)+str;
        	n /=radix;
        }
        return str;
	}

	public static void main(String args[]) {

		System.out.println(toBinaryString(12).toString());
		System.out.println(toHexString(12).toString());
	}
}
