package com.imooc.method;

public class FacDemo {

	// 方法不能嵌套定义
	// 求阶乘的方法
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}

	public static void main(String[] args) {
		// 创建FacDemo类的对象
		FacDemo facDemo = new FacDemo();
		int fac = facDemo.fac(3);
		System.out.println("3!=" + fac);
		int sum = 0;
		// 1!+2!+3!+4!+5!
		for (int i = 1; i <= 5; i++) {
			fac = facDemo.fac(i);
			sum += fac;
		}
		System.out.println("1!+2!+3!+4!+5!=" + sum);
	}

}
