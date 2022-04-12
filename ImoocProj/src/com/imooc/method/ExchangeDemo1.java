package com.imooc.method;

public class ExchangeDemo1 {
	public void add(int n) {
		n++;
		System.out.println("方法中n=" + n);
	}

	public static void main(String[] args) {
		// 调用方法
		int n = 10;
		System.out.println("方法调用前n的值：" + n);
		ExchangeDemo1 exchangeDemo1 = new ExchangeDemo1();
		exchangeDemo1.add(n);
		System.out.println("方法调用后的n的值：" + n);
	}

}
