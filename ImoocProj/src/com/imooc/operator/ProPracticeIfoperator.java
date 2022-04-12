package com.imooc.operator;

public class ProPracticeIfoperator {

	public static void main(String[] args) {
		// 使用if-else语句完成：根据x的值，输出y的值
		// 定义整形变量x和y，值分别为-2和0
		int x = -2, y = 0;
		// 如果x大于0，则y的值为2*x+1，否则y的值为x+5
		if (x > 0) {
			y = 2 * x + 1;
		} else {
			y = x + 5;
		}
		// 分别输出x和y的值
		System.out.println("x的值为" + x + "\ty的值为" + y);
	}

}
