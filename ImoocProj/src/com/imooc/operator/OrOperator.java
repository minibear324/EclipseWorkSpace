package com.imooc.operator;

public class OrOperator {

	public static void main(String[] args) {
		// �������
		// |�����
		int n = 3;
		boolean b = (3 < 7) | ((n++) < 2);
		System.out.println("n=" + n + "\tb=" + b);

		// ||�����
		// ||������ֽж�·������������һ�����ʽ��ֵ���ܾ������ʽ���Ľ����������ұߵı��ʽ�Ͳ��ټ�����
		int m = 3;
		boolean c = (3 < 7) || ((n++) < 2);// ��&&�����һ��
		System.out.println("m=" + m + "\tc=" + c);
	}

}
