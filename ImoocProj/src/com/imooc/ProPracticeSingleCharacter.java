package com.imooc;

public class ProPracticeSingleCharacter {

	public static void main(String[] args) {
		// �����ϰ���ֱ���float��double��int���͵����ݣ�����ӡ���
		// ����һ��float���͵ı���f1��ֵΪ98.4
		float f1 = 98.4f;
		System.out.println("f1=" + f1);

		// ����һ��float���͵ı���f2.��f1��ֵ��ֵ��f2
		float f2 = f1;
		System.out.println("f2=" + f2);

		// ����һ�������ͱ���n��ֵΪ55
		int n = 55;
		System.out.println("n=" + n);

		// ����һ��double���͵ı���d1��ֵΪ555.3
		double d1 = 555.3;
		System.out.println("d1=" + d1);

		// ��n��ֵ��ֵ��d1
		d1 = n;
		System.out.println("d1=" + n);
	}

}
