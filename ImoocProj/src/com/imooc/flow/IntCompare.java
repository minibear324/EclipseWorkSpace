package com.imooc.flow;

import java.util.Scanner;

public class IntCompare {

	public static void main(String[] args) {
		// 从键盘输入两个整数，经过判断输出他们的关系（大于，小于，等于）
		System.out.println("请输入第一个数num1：");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数num2：");
		int num2 = sc.nextInt();
		// 先判断num1，num2是否相等
		if (num1 != num2) {
			if (num1 > num2) {
				System.out.println(num1 + "大于" + num2);
			} else {
				System.out.println(num1 + "小于" + num2);
			}
		} else {
			System.out.println("两数相等！");
		}
		sc.close();
	}

}
