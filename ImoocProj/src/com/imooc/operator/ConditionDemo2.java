package com.imooc.operator;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// ���������
		// ��a��b˭��˭��ֵ��max
		int a = 4, b = 7;
		int max;
		max = a > b ? a : b;
		System.out.println("max=" + max);
		// ʹ��if-else������
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
