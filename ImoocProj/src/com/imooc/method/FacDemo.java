package com.imooc.method;

public class FacDemo {

	// ��������Ƕ�׶���
	// ��׳˵ķ���
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}

	public static void main(String[] args) {
		// ����FacDemo��Ķ���
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
