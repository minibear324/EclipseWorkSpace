package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// �ж�һ����������������ż�������������ӡ���
		// ����һ�������������
		// int number;
		// number = 10;
		// �Ӽ�����������
		System.out.println("����������Ҫ���������");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("�������ż��");
		} else {
			System.out.println("�����������");
		}
		sc.close();
	}

}
