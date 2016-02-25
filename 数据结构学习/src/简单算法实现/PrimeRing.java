package 简单算法实现;

import 栈和队列部分.SeqQueue;
import 线性表部分.SeqList;

//无法求解素数环，isPrime方法是判断是否为素数的
public class PrimeRing {
	public PrimeRing(int n) {
		SeqList<Integer> ring = new SeqList<Integer>(n);
		ring.append(new Integer(1));
		SeqQueue<Integer> que = new SeqQueue<Integer>(n);
		for (int i = 2; i <= n; i++) {
			que.enqueue(new Integer(i));
		}
		int i = 0;
		while (!que.isEmpty()) {
			int k = que.dequeue().intValue();
			if (isPrime(ring.get(i) + k)) {
				i++;
				ring.append(new Integer(k));
			} else {
				que.enqueue(new Integer(k));
			}
		}
		System.out.print(ring.toString());
	}

	//判断是否为素数
	private static boolean isPrime(int k) {
		if (k == 2) {
			return true;
		}
		if (k < 2 || k > 2 && k % 2 == 0) {
			return false;
		}
		int j = (int) Math.sqrt(k);
		if (j % 2 == 0) {
			j--;

		}
		while (j > 2 && k % j != 0) {
			j -= 2;
		}
		return j < 2;
	}

	public static void main(String args[]) {
		int j = (int) Math.sqrt(7);
		System.out.println(isPrime(101));
		new PrimeRing(10);
	}
}
