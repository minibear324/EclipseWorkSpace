package com.imooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// 使用嵌套while循环输出10行10列的星号
		int m = 1;// 外重循环的循环变量
		int n = 1;// 内重循环的循环变量
		System.out.println("输出10行10列的星号");
		// 外重循环控制输出的行
		while (m <= 10) {
			// 内重循环控制输出的列数
			n = 1;
			while (n <= m) {
				System.out.print("* ");
				n++;
			}
			System.out.println();
			m++;

		}

	}

}
