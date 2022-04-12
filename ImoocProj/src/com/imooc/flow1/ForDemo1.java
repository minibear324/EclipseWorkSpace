package com.imooc.flow1;

public class ForDemo1 {

	public static void main(String[] args) {
		// 将100以内的值打印出，并10个数换行
		for (int i = 1; i < 101; i++) {
			// 控制数的输出
			System.out.print(i + "    ");
			// 控制换行
			if (i % 10 == 0) {
				System.out.println();
			}

		}

	}

}
