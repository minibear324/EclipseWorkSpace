package com.imooc.operator;

public class ProPracticeMathOperator {

	public static void main(String[] args) {
		// ������m�ĳ�ֵ��ֵΪ10������n�ĳ�ֵ��ֵΪ5
		int m = 10, n = 5;
		// ����m��ֵ��3��n��ֵ��5
		m += 3;
		n += 5;
		// ��m��n��ƽ��ֵ�������������ڱ���p��
		double p;
		p = (double) (m + n) / 2;
		// ��m��ƽ������n��ƽ��������������ڱ���q��
		int q;
		q = (m * m) * (n * n);
		// ��p��q��ֵ��ӡ���
		System.out.println("p=" + p);
		System.out.println("q=" + q);

		// �����������α���a,b,c
		int a, b, c;
		// �ֱ�Ϊa,b,c��ֵΪ4,15,20
		a = 4;
		b = 15;
		c = 20;
		// ����(b/a)+c��ֵ������ֵ������x
		int x = (b / a) + c;
		// ����(c%b)*a-c��ֵ������ֵ������y
		int y = (c % b) * a - c;
		// ���x��y��ֵ
		System.out.println("x=" + x + "\ty=" + y);

	}

}
