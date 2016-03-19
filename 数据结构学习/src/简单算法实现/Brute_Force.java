package 简单算法实现;

import java.util.Scanner;

//回溯算法
//Brute-Force算法实现字符串的匹配
public class Brute_Force {
	public static int chazhao(String s1, String s2) {
		if (s1.length() > 0 && s2.length() > 0 && s1.length() >= s2.length()) {
			int i = 0, j = 0;
			while (i < s1.length()) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				} else {// 否则i、j回溯进行下一次匹配
					i = i + 1;
					j = 0;
				}
				if (j == s2.length()) {
					return i - j;
				}
			}

		} else {
			System.out.println("输入错误！");
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("请输入要查找的字符串：");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(chazhao("hbadsghbdcxxxxx", s));
	}
}
