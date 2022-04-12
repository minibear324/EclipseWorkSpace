package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 求整形数组的累加和
		// 定义整形数组
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		// 从键盘接收数据，为数组元素赋值
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素");
			a[i] = sc.nextInt();
		}
		System.out.println("数组元素的内容为：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 增强型for循环迭代输出
		System.out.println("\n增强型for循环输出a数组的元素：");
		for (int n : a) {
			System.out.print(n + " ");
		}
		sc.close();

		// 求数组元素的累加和
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println();
		System.out.println("数组的累加和为：" + sum);
	}

}
