package com.imooc.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		// 求1到100的累加和
		// 1+2+3+...+100
		// 定义变量
		int n = 1;
		// 定义累加和的变量
		int sum = 0;
		// while循环
		while (n < 101) {
			sum += n;
			n++;
		}
		System.out.println("sum=" + sum);

		// 求1+3+5+7+...+99
		// 定义变量
		int m = 1;
		// 重新使sum值为0
		sum = 0;
		// while循环求结果
		while (m < 100) {
			sum += m;
			m = m + 2;
		}
		System.out.println("sum=" + sum);
	}

}
