package com.imooc.method;

public class AreaDemo {
	// 求圆形的面积
	public double area(double radius) {
		double areaOfCircl = 0;
		areaOfCircl = radius * radius * Math.PI;
		return areaOfCircl;
	}

	// 求长方形的面积
	public double area(double length, double width) {
		double rectangularArea = 0;
		rectangularArea = length * width;
		return rectangularArea;
	}

	public static void main(String[] args) {
		// 定义两个重载的方法，分别求圆和长方形的面积
		// 定义对象
		AreaDemo areaDemo = new AreaDemo();
		// 定义一个double类型的变量存放半径，并初始化
		double radius = 4.5;
		// 定义两个变量存放长和宽，并初始化
		double length = 8, width = 5;
		// 调用方法，求圆的面积并打印输出
		System.out.println("圆的面积为：" + areaDemo.area(radius));
		// 调用方法，求长方形面积并打印输出
		System.out.println("长方形的面积为：" + areaDemo.area(length, width));
	}

}
