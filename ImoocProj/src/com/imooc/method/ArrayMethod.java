package com.imooc.method;

public class ArrayMethod {
	// 定义方法，打印输出数组元素的值
	public void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 创建printArray对象，并调用其方法
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		ArrayMethod arrayMethod = new ArrayMethod();
		arrayMethod.printArray(arr);

	}

}
