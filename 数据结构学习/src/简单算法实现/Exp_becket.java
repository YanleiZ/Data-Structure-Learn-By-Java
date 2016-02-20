package 简单算法实现;

//实现括号的匹配问题
import 栈和队列部分.SeqStack;

public class Exp_becket {
	public static String isValid(String expstr) {
		SeqStack<String> stack = new SeqStack<String>(expstr.length());
		for (int i = 0; i < expstr.length(); i++) {
			char ch = expstr.charAt(i);
			switch (ch) {
			case '(':
				stack.push(ch + "");
				break;
			case ')':
				if (stack.isEmpty() || !stack.pop().equals("("))
					return " 期望（";
			}
		}
		return (stack.isEmpty() ? "" : "期望）");
	}

	public static void main(String[] args) {
		System.out.println("(1+2)*2+((4+5)))/2" + "  "
				+ isValid("(1+2)*2+((4+5)))/2"));

	}

}
