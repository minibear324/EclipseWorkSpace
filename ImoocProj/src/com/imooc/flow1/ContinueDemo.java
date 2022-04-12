package com.imooc.flow1;

public class ContinueDemo {

	public static void main(String[] args) {
		// Çó1+3+5+7+9
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;
		}
		System.out.println("sum=" + sum);

	}

}
