package com.imooc;

public class Exchange {

	public static void main(String[] args) {
		// char类型和int类型之间的转换
		char c = (char) 65536;
		int n;
		n = c;// 隐式类型转换
		c = (char) n;

		// 整形和浮点型的类型转换问题
		int x = 100;
		long y = x;
		x = (int) y;
		float f = 100000000000000L;
		System.out.println("f=" + f);
		float f1 = (float) 14563534656756765L;
		System.out.println("f1=" + f1);
	}

}
