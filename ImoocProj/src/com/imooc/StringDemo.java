package com.imooc;

public class StringDemo {

	public static void main(String[] args) {
		// 定义一个空字符串
		String s1 = "";
		System.out.println("s1=" + s1);
		// 定义一个hello字符串
		String s2 = "hello";
		System.out.println("s2=" + s2);

		// 使用Unicode编码进行字符串变量的定义
		String s3 = "A\u005d\u005fB";
		System.out.println("s3=" + s3);

		// 定义一个包含空格的字符串(空格作为一个字符，并且一个空格 占一位)
		String s4 = "Hello   Imooc!";
		System.out.println("s4=" + s4);
	}

}
