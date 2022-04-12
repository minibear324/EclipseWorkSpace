package com.imooc.flow1;

public class CharDemo {

	public static void main(String[] args) {
		// 循环输出26个英文小写字母，分两行输出
		char ch = 'a';
		int count = 1;
		while (ch <= 'z') {
			System.out.print(ch + " ");
			if (count % 13 == 0) {
				System.out.println();
			}
			count++;
			ch++;
		}

		// 求j的值
		int j = 9, i = 6;
		while (i-- > 3)
			--j;
		System.out.println(j);

		// 求k的值
		int m = 3, n = 6, k = 0;
		while (m < n) {
			++k;
			m++;
			--n;
		}
		System.out.println(k);
	}

}
