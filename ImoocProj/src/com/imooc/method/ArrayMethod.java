package com.imooc.method;

public class ArrayMethod {
	// ���巽������ӡ�������Ԫ�ص�ֵ
	public void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// ����printArray���󣬲������䷽��
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		ArrayMethod arrayMethod = new ArrayMethod();
		arrayMethod.printArray(arr);

	}

}
