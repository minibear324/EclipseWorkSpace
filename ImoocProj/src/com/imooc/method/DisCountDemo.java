package com.imooc.method;

import java.util.Scanner;

public class DisCountDemo {

	// 定义一个求商品的折扣价方法
	public double disCount(double cost) {
		if (cost > 200.0) {
			return cost * 0.85;
		} else if (cost > 100.0) {
			return cost * 0.95;
		} else {
			return cost;
		}
	}

	public static void main(String[] args) {
		// 创建disCount对象，再调用其方法
		DisCountDemo disCount = new DisCountDemo();
		// 定义商品总价存放到变量中
		double totle;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品的总价格：");
		totle = sc.nextDouble();
		// 调用方法，输出折后商品的总价
		System.out.println("折后商品总价为：" + disCount.disCount(totle));

	}

}
