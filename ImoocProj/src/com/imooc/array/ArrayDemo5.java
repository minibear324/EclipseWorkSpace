package com.imooc.array;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// 二维数组的使用
		// 二维数组的声明，三种形式
		// 声明int类型的二维数组
		int[][] intArray;
		// 声明float类型的二维数组
		float floatArray[][];
		// 声明double类型的二维数组
		double[] doubleArray[];
		// 二维数组的创建三行三列
		intArray = new int[3][3];
		System.out.println("intArray数组的第三行第三列的元素为：" + intArray[2][2]);
		// 为第二行第三列的元素赋值为9
		intArray[1][2] = 9;
		System.out.println("intArray数组第二行第三列的元素为+" + intArray[1][2]);
		// 声明数组的同时进行创建
		char[][] ch = new char[3][5];
		// 创建float类型的同时，只指定行数
		floatArray = new float[3][];
		// 目前不能对数组中的元素进行输出，因为没有创建列数组
		// 要想使用float数组，则还需要在对每一行数组创建列数组,这样我们可以创建每行之间列数不一样的情况
		floatArray[0] = new float[3];// 第一行有三列
		floatArray[1] = new float[10];// 第二行有十列
		floatArray[2] = new float[5];// 第三行有五列
		// 现在对floatArray数组的元素进行输出，注意，不能出现下标越线
		System.out.println(floatArray[0][2]);
		System.out.println(floatArray[1][8]);
		System.out.println(floatArray[2][4]);

		// 二维数组初始化
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6, 54, 123, 78, 2 }, { 7, 8, 9 } };
		System.out.println("num数组第一行第二列的元素为：" + num[0][1]);
		System.out.println("num数组的行数为：" + num.length);
		System.out.println("num数组的第一行的列数为:" + num[0].length);

		// 循环输出二维数组的内容
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
		}
	}

}
