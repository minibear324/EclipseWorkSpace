package com.imooc.operator;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// 条件运算符
		// 求a和b谁大，谁大赋值给max
		int a = 4, b = 7;
		int max;
		max = a > b ? a : b;
		System.out.println("max=" + max);
		// 使用if-else来计算
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("max=" + max);

		boolean ab = a > b ? (3 < 6 | 3 < 1) : (true == false);
		System.out.println("ab=" + ab);
	}

}
