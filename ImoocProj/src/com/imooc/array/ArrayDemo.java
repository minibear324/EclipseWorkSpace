package com.imooc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// 声明一个整形数组
		int[] intArray;
		// 声明一个字符串类型的数组
		String strArray[];
		// 创建数组
		intArray = new int[5];
		strArray = new String[10];
		// 声明数组的同时进行创建
		float[] floatArray = new float[4];
		char[] charArray = new char[4];
		// 初始化数组
		char[] ch = { 'a', 'b', 'c', 'd' };
		System.out.println("ch数组的长度为:" + ch.length);
		System.out.println("intArray数组的第2个元素为：" + intArray[1]);
		System.out.println("strArray数组的第5个元素为" + strArray[4]);
		System.out.println("charArray数组的第1个元素为：" + charArray[0]);
		System.out.println("floatArray数组的最后一个元素为：" + floatArray[floatArray.length - 1]);

		// 循环为整形数组赋值
		for (int i = 0; i < 5; i++) {
			intArray[i] = i + 1;
		}
		// 循环输出整形数组中的值
		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

}
