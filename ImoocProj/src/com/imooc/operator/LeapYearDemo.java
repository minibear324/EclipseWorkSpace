package com.imooc.operator;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// 用if-else语句判断输入的年份是否为闰年
		System.out.println("请输入年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println(year + "年是闰年！");
		} else {
			System.out.println(year + "年不是闰年！");
		}
		sc.close();
	}

}
