package com.imooc;

public class FinalDemo {

	public static void main(String[] args) {
		// 定义常量，并区分他与变量的区别
		// 定义常量时，我们一般使用全大写的形式，两个单词以上的连接使用_连接，如MIN_VALUE
		int m = 5;
		final int N = 6;
		// 变量的值可以修改，而常量不能修改，会报错
		// N=10;
		m = 10;
		// 定义圆周率
		final double PI = 3.14;
		// 定义最小值
		final double MIN_VALUE = 0;

	}

}
