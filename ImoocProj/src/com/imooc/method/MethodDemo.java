package com.imooc.method;

public class MethodDemo {
	// 一行打印输出一串星号
	public void printStar() {
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		// 创建一个MethodDemo类的对象myMethodDemo
		MethodDemo myMethodDemo = new MethodDemo();
		// 使用对象名.方法名()去调用方法
		myMethodDemo.printStar();
		System.out.println("欢迎来到Java的世界");
		myMethodDemo.printStar();
	}

}
