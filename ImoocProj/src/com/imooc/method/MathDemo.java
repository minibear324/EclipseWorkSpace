package com.imooc.method;

public class MathDemo {
	// ����3��������ʵ��int��double���������ͺ͵�����
	// ������int���͵ĺ�
	public int plus(int m, int n) {
		return m + n;
	}

	// ������double���͵��ۼӺ�
	public double plus(double m, double n) {
		return m + n;
	}

	// ������Ԫ�ص��ۼӺ�
	public int plus(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// ��᷽�����ص�����
		int m = 5, n = 10;
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		MathDemo mathDemo = new MathDemo();
		System.out.println("int���͵ĺͣ�" + mathDemo.plus(m, n));
		System.out.println("double���͵ĺͣ�" + mathDemo.plus(5.6, 7.8));
		System.out.println("����Ԫ�صĺͣ�" + mathDemo.plus(arr));
	}

}
