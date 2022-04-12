package com.imooc.method;

// Javad的帮助文档，文档注释
/**
 * 关于可变参数与重载的问题 通过文档注释生成帮助文档，通过javadoc命令从文档注释当中提取API帮助文档， 例如：javadoc -d doc
 * ArgsDemo2.java,在cmd中,输入此命令，将会在此方法所在的文件夹中生成doc文件，想查看帮助文档时，打开doc中的index.html文件就可以查看了
 * *
 * 
 * @author queen
 * @version 1.0
 *
 */

public class ArgsDemo2 {
	// 可变参数列表的方法是最后被访问的
	// 求两个整数的和
	public int plus(int a, int b) {
		System.out.println("不带可变参数的方法被调用！");
		return a + b;
	}

	// 带可变参数列表的方法，求和
	public int plus(int... a) {
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		System.out.println("带可变参数的方法被调用！");
		return sum;
	}

	public static void main(String[] args) {
		// 带可变参数的方法重载使用
		ArgsDemo2 argsDemo2 = new ArgsDemo2();
		System.out.println("和为：" + argsDemo2.plus(1, 2));

	}

}
