package com.imooc;

public class FloatDemo {

	public static void main(String[] args) {
		// 变量必须先定义，再使用
		// float f = 1234.328;相当于将double类型的值赋值给float类型，大范围赋给小范围，将会报错
		// 定义一个单精度浮点型变量，存放1234.328
		float f = 1234.328f;
		System.out.println("f=" + f);

		// 定义一个双精度浮点型变量，存放5623.465
		double d = 5623.465;
		System.out.println("d=" + d);
		// 将长整型赋值给浮点型，长整型字面值赋值给双精度浮点型不报错，说明双精度浮点型的范围是最大的
		double dl = 123l;
		System.out.println("dl=" + dl);

		// 变量间的赋值,将变量d的值赋值给between变量
		double between = d;
		System.out.println("between=" + between);
	}

}
