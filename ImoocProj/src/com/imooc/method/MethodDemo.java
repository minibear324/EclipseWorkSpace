package com.imooc.method;

public class MethodDemo {
	// һ�д�ӡ���һ���Ǻ�
	public void printStar() {
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		// ����һ��MethodDemo��Ķ���myMethodDemo
		MethodDemo myMethodDemo = new MethodDemo();
		// ʹ�ö�����.������()ȥ���÷���
		myMethodDemo.printStar();
		System.out.println("��ӭ����Java������");
		myMethodDemo.printStar();
	}

}
