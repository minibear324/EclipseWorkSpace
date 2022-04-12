package com.imooc;

public class CharDemo {

	public static void main(String[] args) {
		// 定义一个变量存放字符'a'
		char a = 'a';
		System.out.println("a=" + a);

		// 整形和字符型可以互相转化的，运用的就是ASCII码
		char ch = 65;
		// 输出的是A，因为65对应的ASCII对应的字符是A
		System.out.println("ch=" + ch);

		// char类型占2个字节，16位，表示范围为0~(2^16)-1，即0~65535
		char ch2 = 65535;
		System.out.println("ch2="+ch2);
		// 在数值的范围内可以正常的输出，如果不在数值的范围内，则要进行强制性的转换，如下操作
		char ch1 = (char) 65536;
		System.out.println("ch1="+ch1);

		// 定义变量存放Unicode编码表示的字符
		char c = '\u005d';
		System.out.println("c=" + c);
	}

}
