package com.imooc.method;

import java.util.Scanner;

public class DisCountDemo {

	// ����һ������Ʒ���ۿۼ۷���
	public double disCount(double cost) {
		if (cost > 200.0) {
			return cost * 0.85;
		} else if (cost > 100.0) {
			return cost * 0.95;
		} else {
			return cost;
		}
	}

	public static void main(String[] args) {
		// ����disCount�����ٵ����䷽��
		DisCountDemo disCount = new DisCountDemo();
		// ������Ʒ�ܼ۴�ŵ�������
		double totle;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ���ܼ۸�");
		totle = sc.nextDouble();
		// ���÷���������ۺ���Ʒ���ܼ�
		System.out.println("�ۺ���Ʒ�ܼ�Ϊ��" + disCount.disCount(totle));

	}

}
