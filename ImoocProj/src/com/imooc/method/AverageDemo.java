package com.imooc.method;

public class AverageDemo {
	// 求数组的平均值
	public void avgArray(float[] a) {
		float average = 0;
		float sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		average = sum / a.length;
		System.out.println("数组的平均值为：" + average);
	}

	public static void main(String[] args) {
		// 定义一个方法，求数组的平均值
		// 在主方法定义对象，并初始化一个float类型的数组，调用方法求数组元素的平均值，并将平均值打印输出
		// 数组元素的内容为，78.5,98.5,65.5,32.5和75.5
		AverageDemo averageDemo = new AverageDemo();
		float[] a = { 78.5f, 98.5f, 65.5f, 32.5f, 75.5f };
		averageDemo.avgArray(a);

	}

}
