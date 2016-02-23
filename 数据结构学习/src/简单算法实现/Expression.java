package 简单算法实现;

import 栈和队列部分.SeqStack;

//实现加减乘除的优先顺序的计算
//toPostfix方法把中缀表达式转换为后缀表达式
//value方法计算处理为后缀表达式的值
public class Expression {
	public static String toPostfix(String expstr) {
		SeqStack<String> stack = new SeqStack<String>(expstr.length());
		String postfix = "";
		int i = 0;
		while (i < expstr.length()) {
			char ch = expstr.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				while (!stack.isEmpty() && !stack.get().equals("(")) {
					postfix += stack.pop();

				}
				stack.push(ch + "");
				i++;
				break;
			case '*':
			case '/':
				while (!stack.isEmpty()
						&& (stack.get().equals("*") || stack.get().equals("/"))) {
					postfix += stack.pop();
				}
				stack.push(ch + "");
				i++;
				break;
			case '(':
				stack.push(ch + "");
				i++;
				break;
			case ')':
				String out = stack.pop();
				while (out != null && !out.equals("(")) {
					postfix += out;
					out = stack.pop();
				}
				i++;
				break;
			default:
				while (i < expstr.length() && ch >= '0' && ch <= '9') {
					postfix += ch;
					i++;
					if (i < expstr.length()) {
						ch = expstr.charAt(i);
					}
					postfix += "";
				}
			}
		}
		while (!stack.isEmpty()) {
			postfix += stack.pop();

		}

		return postfix;
	}

	public static int value(String postfix) {
		SeqStack<Integer> stack = new SeqStack<Integer>();
		int i = 0, result = 0;
		while (i < postfix.length()) {
			char ch = postfix.charAt(i);
			if (ch >= '0' && ch <= '9') {
				result = 0;
				while (ch != 's') {
					result = result * 10 + Integer.parseInt(ch + "");
					i++;
					ch = postfix.charAt(i);
				}
				i++;
				stack.push(new Integer(result));

			} else {
				int y = stack.pop().intValue();
				int x = stack.pop().intValue();
				switch (ch) {
				case '+':
					result = x + y;
					break;
				case '-':
					result = x - y;
					break;
				case '*':
					result = x * y;
					break;
				case '/':
					result = x / y;
					break;
				}
				stack.push(new Integer(result));
				i++;
			}
		}
		return stack.pop().intValue();
	}

	public static void main(String[] args) {
		String expstr = "121+10*2+(3+7)/2";
		String postfix = toPostfix(expstr);
		// int zhi = ;
		System.out.println(expstr);
		System.out.println(postfix);
		System.out.println(value(postfix));
	}
}
