package com.imooc.array;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// 定义一个字符数组并初始化，统计字符'a'或'A'出现的次数
		// 定义一个字符数组吃ch并初始化
		char[] ch = { 'a', 'A', 's', 'a', 'f', 'a', 'A', 'R' };
		// 循环遍历数组，统计字符'a'或'A'出现的次数
		int i;
		int count1 = 0;
		int count2 = 0;
		for (i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				count1++;
			}
			if (ch[i] == 'A') {
				count2++;
			}
		}
		// 打印输出统计的次数
		int sum = count1 + count2;
		System.out.println("总次数为：" + sum);
	}

}
