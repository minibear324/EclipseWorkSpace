package com.imooc;

public class TypeExchange {

	public static void main(String[] args) {
		// ��������������͵ı�����Ϊ���Ǹ�ֵ������ӡ���
		// ����һ�����ͱ���n��ֵΪ98
		int n = 98;
		System.out.println("n=" + n);

		// ����һ��char���͵ı���ch��������n��ֵ��ch��Ȼ�����ch��ֵ,���͵�ǿ��ת��
		char ch = (char) n;
		System.out.println("ch=" + ch);

		// ����һ�������ͱ���var��ֵΪ190000000�������
		long var = (long) 1.9E8;
		System.out.println("var=" + var);

		// ����һ��double���͵ı���d��������var��ֵ��ֵ��d
		double d;
		// �Զ�����ת��
		d = var;
		System.out.println("d=" + d);

	}

}
