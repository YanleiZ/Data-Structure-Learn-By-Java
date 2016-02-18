package 简单算法实现;

import java.util.Scanner;

import 线性表部分.SeqList;

//约瑟夫环问题
public class Josephus {
	private static Scanner sc;

	/*
	 * public static void main(String[] args) {
	 * System.out.println("请输入犯人个数、开始的犯人代号、数到的犯人代号："); Scanner sc = new
	 * Scanner(System.in); int n = sc.nextInt(); int s = sc.nextInt(); int d =
	 * sc.nextInt(); SeqList <String>list = new SeqList<String>(n); for(int
	 * i=0;i<=n;i++){ list.append(""+i); }
	 * System.out.println("约瑟夫环："+"("+n+","+"s"
	 * +","+"d"+")"+"\n"+list.toString()); }
	 */
	public Josephus(int number, int start, int distance) {
		SeqList<String> list = new SeqList<String>(number);
		for (int i = 0; i < number; i++) {
			list.append((char) ('A' + i) + "");
		}
		System.out.println("约瑟夫环（" + number + "，" + (start+1) + "，" + distance
				+ "），" + list.toString());
		int i = start;
		while (list.lenght() > 1) {
			i = (i + distance - 1) % list.lenght();
			System.out.print("删除" + list.remove(i).toString() + ",");
			System.out.println(list.toString());

		}
		System.out.println("被赦免者是" + list.get(0).toString());
	}

	public static void main(String[] args) {
		System.out.println("请输入犯人个数、开始的犯人代号、数到的犯人代号：");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt()-1;
		int d = sc.nextInt();
		new Josephus(n, s, d);
	}
}
