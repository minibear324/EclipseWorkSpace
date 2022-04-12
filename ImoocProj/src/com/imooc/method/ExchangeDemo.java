package com.imooc.method;

public class ExchangeDemo {
	// 对两个变量的值进行交换并打印输出
	public void swap(int a, int b) {
		int temp;
		System.out.println("交换前：a=" + a + ",b=" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("交换后：a=" + a + ",b=" + b);
	}

	public void swapTest() {
		int m = 45, n = 34;
		System.out.println("交换前：m=" + m + ",n=" + n);
		// 如果是在同一个类中，除主方法以外的方法在调用其他方法时，可以不用创建对象
		swap(m, n);
		System.out.println("交换后：m=" + m + ",n=" + n);
	}

	public static void main(String[] args) {
		ExchangeDemo exchangeDemo = new ExchangeDemo();
		exchangeDemo.swapTest();
	}

}
