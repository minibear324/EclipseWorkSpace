package com.imooc;

public class VarDemo {

	public static void main(String[] args) {
		// 定义两个整型变量x，y
		// 直接对变量进行初始化
		// int x = 0, y = 0;

		// 先声明变量名和变量类型，后面再对变量名进行赋值
		int x, y;
		x = 2;
		y = 5;
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		// 关于字符串进行的加法操作还是拼串操作
		// 进行加法操作
		System.out.println(x + '\t' + y + '\n');
		// 进行拼串操作
		System.out.println("" + x + '\t' + y + '\n');
		// 对以上的总结就是，我们自己要区分好这是字符串还是说这是单字符，像上面的'\t'、'\n'都被认成单字符

		// 定义一个汉字的字符
		char ch = '霞';
		System.out.println("ch=" + ch);

		// 定义一个中文名的变量名，但是不建议使用
		char 中文 = '中';
		System.out.println("中文=" + 中文);

		// 用科学计数法表示浮点型数据
		double d = 1.23E5;
		float f = 1.23E5f;
		double d1 = .2;
		System.out.println("d=" + d + '\t' + "f=" + f + '\t' + "d1=" + d1);
	}

}
