package com.imooc.operator;

import java.util.Scanner;

public class IntDemo {

	public static void main(String[] args) {
		// 判断输入的正整数是否既是5又是7的整数倍，如果是，则输出yes，否则输出no
		// 定义一个整型变量n，并从键盘接收数据
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// 判断n是否同时能被5和7 整除，如果满足，则输出yes，不能则输出no
		if ((number % 5 == 0) & (number % 7 == 0)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}
}
