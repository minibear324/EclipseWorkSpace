package com.imooc;

public class TypeExchangePractice {

	public static void main(String[] args) {
		// 定义各种数据类型的变量，按要求为它们赋值，并打印输出
		// 将一个整形字面值67832赋值给char类型变量c
		int z = 67832;
		char c;
		c = (char) z;
		// 并将c的值输出
		System.out.println("c=" + c);
		// 定义一个整型变量n，值为65
		int n = 65;
		// 定义一个字符型变量c1，赋值为n,并输出c1的值
		char c1;
		c1 = (char) n;
		System.out.println("c1=" + c1);
		// 定义一个整形变量l，值为987654321
		long l = 987654321;
		// 定义一个整型变量i，赋值为l,并输出i的值
		int i;
		i = (int) l;
		System.out.println("i=" + i);
		// 定义一个float类型变量f，将变量l的值赋值给f，并输出f的值
		float f;
		f = (float) l;
		System.out.println("f=" + f);
		// 将float的值f，重新赋值给变量l，并输出l的值
		l = (long) f;
		System.out.println("l=" + l);
	}

}
