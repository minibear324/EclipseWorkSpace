package com.imooc;

public class TypeExchange {

	public static void main(String[] args) {
		// 定义各种数据类型的变量，为它们赋值，并打印输出
		// 定义一个整型变量n，值为98
		int n = 98;
		System.out.println("n=" + n);

		// 定义一个char类型的变量ch，将变量n赋值给ch，然后输出ch的值,类型的强制转换
		char ch = (char) n;
		System.out.println("ch=" + ch);

		// 定义一个长整型变量var，值为190000000，并输出
		long var = (long) 1.9E8;
		System.out.println("var=" + var);

		// 定义一个double类型的变量d，将变量var的值赋值给d
		double d;
		// 自动类型转换
		d = var;
		System.out.println("d=" + d);

	}

}
