package com.imooc.method;

public class ExchangeDemo1 {
	public void add(int n) {
		n++;
		System.out.println("������n=" + n);
	}

	public static void main(String[] args) {
		// ���÷���
		int n = 10;
		System.out.println("��������ǰn��ֵ��" + n);
		ExchangeDemo1 exchangeDemo1 = new ExchangeDemo1();
		exchangeDemo1.add(n);
		System.out.println("�������ú��n��ֵ��" + n);
	}

}