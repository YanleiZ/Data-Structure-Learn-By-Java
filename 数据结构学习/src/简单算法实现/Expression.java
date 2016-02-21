package ���㷨ʵ��;

import ջ�Ͷ��в���.SeqStack;

//ʵ�ּӼ��˳�������˳��ļ���
//toPostfix��������׺���ʽת��Ϊ��׺���ʽ
//value�������㴦��Ϊ��׺���ʽ��ֵ
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
		return expstr;

	}
}
