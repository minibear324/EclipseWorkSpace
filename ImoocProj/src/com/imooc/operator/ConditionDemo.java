package com.imooc.operator;

public class ConditionDemo {

	public static void main(String[] args) {
		// �̳����ۣ����������Ʒ�ļ۸����100���20������ԭ�ۺ��ۺ�۸�ֱ����
		// ���������������ֱ��������·��ļ۸�
		double price1, price2;
		price1 = 80;
		price2 = 55;
		// ����������Ʒ���ܼ۸�
		double sum = price1 + price2;
		// ���ԭ��
		System.out.println("ԭ��Ϊ" + sum);
		if (sum >= 100) {
			sum -= 20;
		}
		// ����ۺ�۸�
		System.out.println("�ۺ��Ϊ" + sum);

	}

}
