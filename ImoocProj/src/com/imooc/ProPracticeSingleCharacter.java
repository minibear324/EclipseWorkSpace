package com.imooc;

public class ProPracticeSingleCharacter {

	public static void main(String[] args) {
		// 编程练习，分别定义float、double、int类型的数据，并打印输出
		// 定义一个float类型的变量f1，值为98.4
		float f1 = 98.4f;
		System.out.println("f1=" + f1);

		// 定义一个float类型的变量f2.将f1的值赋值给f2
		float f2 = f1;
		System.out.println("f2=" + f2);

		// 定义一个整数型变量n，值为55
		int n = 55;
		System.out.println("n=" + n);

		// 定义一个double类型的变量d1，值为555.3
		double d1 = 555.3;
		System.out.println("d1=" + d1);

		// 将n的值赋值给d1
		d1 = n;
		System.out.println("d1=" + n);
	}

}
