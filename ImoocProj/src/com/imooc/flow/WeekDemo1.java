package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		// 星期的输出,输入时为英文单词
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入表示星期的英文单词：");
		String week = sc.next();
		week = week.toUpperCase();// 将字符串的单词转化为大写
		switch (week) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期日");
			break;
		default:
			System.out.println("您输入的信息有误，请重新输入！");
			break;
		}
		sc.close();
	}

}
