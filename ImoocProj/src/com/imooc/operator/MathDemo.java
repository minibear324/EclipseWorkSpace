package com.imooc.operator;

public class MathDemo {

	public static void main(String[] args) {
		// 算术运算符
		int num1 = 1, num2 = 5;
		int result;// 存放结果
		// 加法运算
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		// 字符串的连接
		System.out.println("" + num1 + num2);
		// 减法运算
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		// 乘法运算
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
		// 除法运算
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		// 如果想保存除法全部的值，可以将分子或者分母改成浮点型数据
		System.out.println("1.0/5" + "=" + 1.0 / 5);
		// 求余数
		result = num1 % num2;
		System.out.println(num1 + "%" + num2 + "=" + result);
		System.out.println("14.3%" + num2 + "=" + (14.3 % num2));

		int a = 3;
		result = a += a *= a;// a*a+a=result
		System.out.println(result);
	}

}
