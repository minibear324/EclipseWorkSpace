package com.imooc.flow1;

public class LoopDemo {

	public static void main(String[] args) {
		// 使用while循环求1~5的平方和
		// 定义整形变量n作为循环变量，并初始化
		int n = 1;
		// 定义整形变量sum存放和，并初始化，
		int sum = 0;
		// 使用while循环求1~5的平方和
		while (n <= 5) {
			sum += Math.pow(n, 2);// 调用math库中的pow()函数，用来求平方
			n++;
		}
		System.out.println("1到5的平方和为：" + sum);

		// 求i的值
		int i = 10;
		do {
			i -= 2;
		} while (i > 6);
		System.out.println(i);
	}

}
