package com.imooc.flow1;

public class ForDemo {

	public static void main(String[] args) {
		// for循环的使用
		// 求1-100的累加和
		// 定义一个变量，存储结果
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}

}
