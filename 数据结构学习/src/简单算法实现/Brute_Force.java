package ���㷨ʵ��;

//Brute-Force�㷨ʵ���ַ�����ƥ��
public class Brute_Force {
	public static int bijiao(String s1, String s2) {
		if (s1.length() > 0 && s2.length() > 0 && s1.length() >= s2.length()) {
			int i = 0, j = 0;
			while (i < s1.length()) {
				if (s1.charAt(i) == s1.charAt(j)) {
					i++;
					j++;
				} else {
					i = i - j + 1;
					j = 0;
				}
				if (j == s2.length()) {
					return i - j;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(bijiao("asdcsdfacxgs", "cx"));
	}
}
