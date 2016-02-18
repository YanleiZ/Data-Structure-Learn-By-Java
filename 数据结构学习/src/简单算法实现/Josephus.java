package ���㷨ʵ��;

import java.util.Scanner;

import ���Ա���.SeqList;

//Լɪ������
public class Josephus {
	private static Scanner sc;

	/*
	 * public static void main(String[] args) {
	 * System.out.println("�����뷸�˸�������ʼ�ķ��˴��š������ķ��˴��ţ�"); Scanner sc = new
	 * Scanner(System.in); int n = sc.nextInt(); int s = sc.nextInt(); int d =
	 * sc.nextInt(); SeqList <String>list = new SeqList<String>(n); for(int
	 * i=0;i<=n;i++){ list.append(""+i); }
	 * System.out.println("Լɪ�򻷣�"+"("+n+","+"s"
	 * +","+"d"+")"+"\n"+list.toString()); }
	 */
	public Josephus(int number, int start, int distance) {
		SeqList<String> list = new SeqList<String>(number);
		for (int i = 0; i < number; i++) {
			list.append((char) ('A' + i) + "");
		}
		System.out.println("Լɪ�򻷣�" + number + "��" + (start+1) + "��" + distance
				+ "����" + list.toString());
		int i = start;
		while (list.lenght() > 1) {
			i = (i + distance - 1) % list.lenght();
			System.out.print("ɾ��" + list.remove(i).toString() + ",");
			System.out.println(list.toString());

		}
		System.out.println("����������" + list.get(0).toString());
	}

	public static void main(String[] args) {
		System.out.println("�����뷸�˸�������ʼ�ķ��˴��š������ķ��˴��ţ�");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt()-1;
		int d = sc.nextInt();
		new Josephus(n, s, d);
	}
}
