package com.imooc.method;

public class ExchangeDemo {
	// ������������ֵ���н�������ӡ���
	public void swap(int a, int b) {
		int temp;
		System.out.println("����ǰ��a=" + a + ",b=" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("������a=" + a + ",b=" + b);
	}

	public void swapTest() {
		int m = 45, n = 34;
		System.out.println("����ǰ��m=" + m + ",n=" + n);
		// �������ͬһ�����У�������������ķ����ڵ�����������ʱ�����Բ��ô�������
		swap(m, n);
		System.out.println("������m=" + m + ",n=" + n);
	}

	public static void main(String[] args) {
		ExchangeDemo exchangeDemo = new ExchangeDemo();
		exchangeDemo.swapTest();
	}

}
