package com.imooc;

public class Exchange {

	public static void main(String[] args) {
		// char���ͺ�int����֮���ת��
		char c = (char) 65536;
		int n;
		n = c;// ��ʽ����ת��
		c = (char) n;

		// ���κ͸����͵�����ת������
		int x = 100;
		long y = x;
		x = (int) y;
		float f = 100000000000000L;
		System.out.println("f=" + f);
		float f1 = (float) 14563534656756765L;
		System.out.println("f1=" + f1);
	}

}
