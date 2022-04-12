package com.imooc.flow1;

public class JiechengPlus {

	public static void main(String[] args) {
		// 阶乘之和
		// 定义两个变量，s存放阶乘结果，sum存放阶乘之和
		int s = 1, sum = 0;

		for (int i = 1; i <= 10; i++) {
			s = 1;
			for (int j = 1; j <= i; j++) {
				s = s * j;
			}
			sum += s;
		}
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("okok");
		System.out.println("1-10的阶乘之和为" + sum);

	}

}
