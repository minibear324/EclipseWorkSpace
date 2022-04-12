package com.imooc.operator;

public class OrOperator {

	public static void main(String[] args) {
		// 或运算符
		// |运算符
		int n = 3;
		boolean b = (3 < 7) | ((n++) < 2);
		System.out.println("n=" + n + "\tb=" + b);

		// ||运算符
		// ||运算符又叫短路运算符，如果第一个表达式的值就能决定表达式最后的结果，运算符右边的表达式就不再计算了
		int m = 3;
		boolean c = (3 < 7) || ((n++) < 2);// 与&&运算符一样
		System.out.println("m=" + m + "\tc=" + c);
	}

}
