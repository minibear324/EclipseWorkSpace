package com.imooc.operator;

public class AssignDemo {

	public static void main(String[] args) {
		// ��ֵ�����
		int m = 5, n = 6;
		int x = (m++) + n;
		int y = (--m) + n;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
