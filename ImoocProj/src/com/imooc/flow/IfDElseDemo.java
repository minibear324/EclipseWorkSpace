package com.imooc.flow;

public class IfDElseDemo {

	public static void main(String[] args) {
		// 根据已知函数编写程序，并输出x和y的值(使用多重if-else结构完成)
		// 定义整型变量x并初始化为-5
		int x = -5;
		// 定义整型变量y并初始化为0
		int y = 0;
		// 根据所给条件，使用多重if-else结构求y的值
		// 当x<0时执行y=-1;当x=0时执行y=0;当x>0时执行y=1
		if (x < 0) {
			y = -1;
		} else if (x == 0) {
			y = 0;
		} else {
			y = 1;
		}
		System.out.println("x=" + x + ",y=" + y);
	}

}
