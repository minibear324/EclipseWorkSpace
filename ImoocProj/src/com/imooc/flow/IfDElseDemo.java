package com.imooc.flow;

public class IfDElseDemo {

	public static void main(String[] args) {
		// ������֪������д���򣬲����x��y��ֵ(ʹ�ö���if-else�ṹ���)
		// �������ͱ���x����ʼ��Ϊ-5
		int x = -5;
		// �������ͱ���y����ʼ��Ϊ0
		int y = 0;
		// ��������������ʹ�ö���if-else�ṹ��y��ֵ
		// ��x<0ʱִ��y=-1;��x=0ʱִ��y=0;��x>0ʱִ��y=1
		if (x < 0) {
			y = -1;
		} else if (x == 0) {
			y = 0;
		} else {
			y = 1;
		}
		System.out.println("x=" + x + ",y=" + y);
	}

}
