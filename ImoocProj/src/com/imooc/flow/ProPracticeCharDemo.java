package com.imooc.flow;

public class ProPracticeCharDemo {

	public static void main(String[] args) {
		// 给定一个字符变量，判断该变量是否为元音字母并输出
		// 定义一个字符变量并初始化
		char ch = 'a';
		// 使用switch结构判断是否为元音字母，并输出对应的信息
		switch (ch) {
		case 'a':
			System.out.println("元音字母a");
			break;
		case 'e':
			System.out.println("元音字母e");
			break;
		case 'i':
			System.out.println("元音字母i");
			break;
		case 'o':
			System.out.println("元音字母o");
			break;
		case 'u':
			System.out.println("元音字母u");
			break;
		default:
			System.out.println("不是元音字母");
			break;
		}

	}

}
