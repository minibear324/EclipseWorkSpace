package com.imooc.operator;

import java.util.Scanner;

public class LogicDemo {

	public static void main(String[] args) {
		// 输入一个整数
		System.out.println("输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (!(n % 3 == 0)) {
			System.out.println(n + "不能被3整除！");
		} else {
			System.out.println(n + "能被3整除！");
		}

		// 求k的值
		int i = 4, j = 5, k = 9, m = 5;
		if (i > j && m < k++) {
			k++;
		} else {
			k--;
		}
		System.out.println("k=" + k);
		sc.close();
	}

}
