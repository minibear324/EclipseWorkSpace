package com.imooc.method;

public class ArrayDemo {
	// 定义一个用于修改某个数组元素值的方法
	public void updataArray(int[] a) {
		a[3] = 15;
		System.out.println("数组元素为：");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 创建对象
		ArrayDemo arrayDemo = new ArrayDemo();
		int[] a = { 1, 2, 3, 4, 5, 6, 67 };
		System.out.println("方法调用前数组元素值为：");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		arrayDemo.updataArray(a);
		System.out.println("方法调用后数组元素的值");
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
