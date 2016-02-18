package ���㷨ʵ��;

//������
//KMP���д���ƥ��
//��Beute_Force�㷨����
public class KMP {
	public static int bijiao(String target, String pattern, int begin) {

		if (target != null && pattern.length() > 0
				&& target.length() >= pattern.length()) {
			int i = begin, j = 0;
			int[] next = getNext(pattern);
			while (i < target.length()) {
				if (j == -1 || target.charAt(i) == pattern.charAt(j)) {
					i++;
					j++;
				} else {
					j = next[j];

				}
				if (j == pattern.length()) {
					return i - j;
				}
			}
		}
		return -1;

	}

	public static int bijiao(String target, String pattern) {
		return bijiao(target, pattern, 0);
	}

	public static int[] getNext(String pattern) {
		int j = 0, k = -1;
		int[] next = new int[pattern.length()];
		next[0] = -1;
		// while (j < pattern.length() - 1) {
		// if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
		// j++;
		// k++;
		// next[j] = k;
		// } else {
		// k = next[k];
		// }
		// }
		// �Ľ�KMP�㷨��getNext����
		while (j < pattern.length() - 1) {
			if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
				j++;
				k++;
				if (pattern.charAt(j) != pattern.charAt(k)) {
					next[j] = k;
				} else {
					next[j] = next[k];
				}

			} else {
				k = next[k];
			}
		}
		return next;
	}

	public static void main(String[] args) {
		System.out.print(bijiao("sasadffsdfggxdwqer", "xdwq"));
	}
}
