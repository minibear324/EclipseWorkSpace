package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/**
		 * 需求描述： • 编写一个程序，根据考试成绩，输出相应的评定信息。 • 成绩大于等于90分，输出“优” • 成绩大于等于80分且小于90分，输出“良”
		 * •成绩大于等于60分小于80分，输出“中” • 成绩小于60分，输出“不及格”
		 */

		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("优");
		} else if (score >= 80) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("中");
		} else {
			System.out.println("不及格");
		}
		sc.close();

		// 求运算后的结果
		int a = 5, b = 4, c = 3, d = 2;
		if (a > b && b > c) {
			System.out.println(d);
		} else if ((c - 1 >= d) == true) {
			System.out.println(d + 1);
		} else {
			System.err.println(d + 2);
		}
	}

}
