package com.imooc;

public class VarDemo {

	public static void main(String[] args) {
		// �����������ͱ���x��y
		// ֱ�ӶԱ������г�ʼ��
		// int x = 0, y = 0;

		// �������������ͱ������ͣ������ٶԱ��������и�ֵ
		int x, y;
		x = 2;
		y = 5;
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		// �����ַ������еļӷ���������ƴ������
		// ���мӷ�����
		System.out.println(x + '\t' + y + '\n');
		// ����ƴ������
		System.out.println("" + x + '\t' + y + '\n');
		// �����ϵ��ܽ���ǣ������Լ�Ҫ���ֺ������ַ�������˵���ǵ��ַ����������'\t'��'\n'�����ϳɵ��ַ�

		// ����һ�����ֵ��ַ�
		char ch = 'ϼ';
		System.out.println("ch=" + ch);

		// ����һ���������ı����������ǲ�����ʹ��
		char ���� = '��';
		System.out.println("����=" + ����);

		// �ÿ�ѧ��������ʾ����������
		double d = 1.23E5;
		float f = 1.23E5f;
		double d1 = .2;
		System.out.println("d=" + d + '\t' + "f=" + f + '\t' + "d1=" + d1);
	}

}
