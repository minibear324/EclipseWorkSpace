package com.imooc;

public class FloatDemo {

	public static void main(String[] args) {
		// ���������ȶ��壬��ʹ��
		// float f = 1234.328;�൱�ڽ�double���͵�ֵ��ֵ��float���ͣ���Χ����С��Χ�����ᱨ��
		// ����һ�������ȸ����ͱ��������1234.328
		float f = 1234.328f;
		System.out.println("f=" + f);

		// ����һ��˫���ȸ����ͱ��������5623.465
		double d = 5623.465;
		System.out.println("d=" + d);
		// �������͸�ֵ�������ͣ�����������ֵ��ֵ��˫���ȸ����Ͳ�����˵��˫���ȸ����͵ķ�Χ������
		double dl = 123l;
		System.out.println("dl=" + dl);

		// ������ĸ�ֵ,������d��ֵ��ֵ��between����
		double between = d;
		System.out.println("between=" + between);
	}

}
