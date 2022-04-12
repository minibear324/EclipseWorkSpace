package com.imooc.array;

import java.util.Scanner;

public class ScoreDemo {

	public static void main(String[] args) {
		// 在一个二维数组中存放了三学生的语文和数学的成绩，从键盘输入三名学生成绩存储到二维数组中，分别求语文和数学的总成绩及平均分并输出
		// 定义一个三行两列的整形数组intArray
		int[][] intArrray = new int[3][2];

		// 从键盘输入学生成绩，要求输入顺序与效果图一致
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArrray.length; i++) {
			for (int j = 0; j < intArrray[i].length; j++) {
				if (j == 0) {
					System.out.println("请输入第" + (i + 1) + "个学生语文成绩");
					intArrray[i][j] = sc.nextInt();
				} else {
					System.out.println("请输入第" + (i + 1) + "个学生数学成绩");
					intArrray[i][j] = sc.nextInt();
				}
			}
		}
		// 求语文的总成绩和平均分
		int sum1 = 0;
		float avg1;
		for (int i = 0; i < intArrray.length; i++) {
			sum1 += intArrray[i][0];
		}
		avg1 = sum1 / intArrray.length;
		System.out.println("语文总分为：" + sum1 + "语文平均分为：" + avg1);

		// 求数学的总成绩和平均分
		int sum2 = 0;
		float avg2;
		for (int i = 0; i < intArrray.length; i++) {
			sum2 += intArrray[i][1];
		}
		avg2 = sum2 / intArrray.length;
		System.out.println("数学总分为：" + sum2 + "数学平均分为：" + avg2);

	}

}
