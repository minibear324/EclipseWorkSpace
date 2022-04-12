package com.imooc.flow1;

public class DoWhileDemo {

	public static void main(String[] args) {
		// 求1到100的累加和
		// 定义一个变量
		int n = 1;
		int sum = 0;
		do {
			sum += n;
			n++;
		} while (n < 101);
		System.out.println("1到100的累加和为：" + sum);
	}

}
