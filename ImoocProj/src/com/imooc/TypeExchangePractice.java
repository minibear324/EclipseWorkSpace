package com.imooc;

public class TypeExchangePractice {

	public static void main(String[] args) {
		// ��������������͵ı�������Ҫ��Ϊ���Ǹ�ֵ������ӡ���
		// ��һ����������ֵ67832��ֵ��char���ͱ���c
		int z = 67832;
		char c;
		c = (char) z;
		// ����c��ֵ���
		System.out.println("c=" + c);
		// ����һ�����ͱ���n��ֵΪ65
		int n = 65;
		// ����һ���ַ��ͱ���c1����ֵΪn,�����c1��ֵ
		char c1;
		c1 = (char) n;
		System.out.println("c1=" + c1);
		// ����һ�����α���l��ֵΪ987654321
		long l = 987654321;
		// ����һ�����ͱ���i����ֵΪl,�����i��ֵ
		int i;
		i = (int) l;
		System.out.println("i=" + i);
		// ����һ��float���ͱ���f��������l��ֵ��ֵ��f�������f��ֵ
		float f;
		f = (float) l;
		System.out.println("f=" + f);
		// ��float��ֵf�����¸�ֵ������l�������l��ֵ
		l = (long) f;
		System.out.println("l=" + l);
	}

}
