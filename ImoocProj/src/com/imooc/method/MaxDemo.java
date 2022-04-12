package com.imooc.method;

public class MaxDemo {
	// 定义一个求两个float类型数据最大值的方法，在方法中将最大值打印输出
	public void max(float a, float b) {
		float max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("两个数" + a + "和" + b + "的最大值为" + max);
	}

	public static void main(String[] args) {
		// 先创建一个MaxDemo类的对象，再通过创建的这个对象调用方法
		// 创建对象
		MaxDemo maxDemo = new MaxDemo();
		// 直接传字面值
		maxDemo.max(3, 7);
		// 传变量
		float m = 5.6f, n = 8.3f;
		maxDemo.max(m, n);
	}

}
