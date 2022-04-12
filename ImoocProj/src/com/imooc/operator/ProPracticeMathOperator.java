package com.imooc.operator;

public class ProPracticeMathOperator {

	public static void main(String[] args) {
		// 将变量m的初值赋值为10，变量n的初值赋值为5
		int m = 10, n = 5;
		// 变量m的值加3，n的值加5
		m += 3;
		n += 5;
		// 求m和n的平均值，并将结果存放在变量p中
		double p;
		p = (double) (m + n) / 2;
		// 求m的平方乘以n的平方，并将结果存于变量q中
		int q;
		q = (m * m) * (n * n);
		// 将p和q的值打印输出
		System.out.println("p=" + p);
		System.out.println("q=" + q);

		// 声明三个整形变量a,b,c
		int a, b, c;
		// 分别为a,b,c赋值为4,15,20
		a = 4;
		b = 15;
		c = 20;
		// 计算(b/a)+c的值，并赋值给变量x
		int x = (b / a) + c;
		// 计算(c%b)*a-c的值，并赋值给变量y
		int y = (c % b) * a - c;
		// 输出x和y的值
		System.out.println("x=" + x + "\ty=" + y);

	}

}
