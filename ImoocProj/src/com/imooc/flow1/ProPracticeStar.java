package com.imooc.flow1;

public class ProPracticeStar {

	public static void main(String[] args) {
		// 用星号输出一个梯形（使用for循环完成）
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int t = 1; t <= 11 - (5 - i) * 2; t++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
