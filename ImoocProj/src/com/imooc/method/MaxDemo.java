package com.imooc.method;

public class MaxDemo {
	// ����һ��������float�����������ֵ�ķ������ڷ����н����ֵ��ӡ���
	public void max(float a, float b) {
		float max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("������" + a + "��" + b + "�����ֵΪ" + max);
	}

	public static void main(String[] args) {
		// �ȴ���һ��MaxDemo��Ķ�����ͨ�����������������÷���
		// ��������
		MaxDemo maxDemo = new MaxDemo();
		// ֱ�Ӵ�����ֵ
		maxDemo.max(3, 7);
		// ������
		float m = 5.6f, n = 8.3f;
		maxDemo.max(m, n);
	}

}
