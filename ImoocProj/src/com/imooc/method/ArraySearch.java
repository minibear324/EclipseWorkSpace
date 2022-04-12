package com.imooc.method;

import java.util.Scanner;

public class ArraySearch {
	// 查找数组元素的值
	public boolean search(int n, int[] arr) {
		// 先定义一个变量，默认值为false
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				// 如果相等，表示在这个数组中
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想要查找的数:");
		int number = sc.nextInt();
		// 创建对象
		ArraySearch arraySearch = new ArraySearch();
		// 调用方法
		boolean flag = arraySearch.search(number, arr);
		if (flag == true) {
			System.out.println("您想要查找的数在这个数组中哦！");
		} else {
			System.out.println("不在数组中啦！");
		}
	}

}
