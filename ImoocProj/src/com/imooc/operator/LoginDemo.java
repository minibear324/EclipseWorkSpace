package com.imooc.operator;

public class LoginDemo {

	public static void main(String[] args) {
		// 定义一个字符，判断是否是'a'到'z'之间的字符
		// 定义一个char类型的变量，并赋初值为'f'
		char ch = 'f';
		// 如果ch的值介于'a'到'z'之间，则输出是a-z之间的字符，否则输出不是a-z之间的字符
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("是a-z之间的字符");
		} else {
			System.out.println("不是a-z之间的字符");
		}
	}

}
