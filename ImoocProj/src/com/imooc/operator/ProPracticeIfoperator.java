package com.imooc.operator;

public class ProPracticeIfoperator {

	public static void main(String[] args) {
		// ʹ��if-else�����ɣ�����x��ֵ�����y��ֵ
		// �������α���x��y��ֵ�ֱ�Ϊ-2��0
		int x = -2, y = 0;
		// ���x����0����y��ֵΪ2*x+1������y��ֵΪx+5
		if (x > 0) {
			y = 2 * x + 1;
		} else {
			y = x + 5;
		}
		// �ֱ����x��y��ֵ
		System.out.println("x��ֵΪ" + x + "\ty��ֵΪ" + y);
	}

}
