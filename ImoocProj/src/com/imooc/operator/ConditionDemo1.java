package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// 判断一个整数是奇数还是偶数，并将结果打印输出
		// 定义一个变量存放数据
		// int number;
		// number = 10;
		// 从键盘输入数据
		System.out.println("请输入你想要查验的数：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("这个数是偶数");
		} else {
			System.out.println("这个数是奇数");
		}
		sc.close();
	}

}
