package com.imooc.flow;

import java.util.Scanner;

public class IntCompare {

	public static void main(String[] args) {
		// �Ӽ����������������������ж�������ǵĹ�ϵ�����ڣ�С�ڣ����ڣ�
		System.out.println("�������һ����num1��");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("������ڶ�����num2��");
		int num2 = sc.nextInt();
		// ���ж�num1��num2�Ƿ����
		if (num1 != num2) {
			if (num1 > num2) {
				System.out.println(num1 + "����" + num2);
			} else {
				System.out.println(num1 + "С��" + num2);
			}
		} else {
			System.out.println("������ȣ�");
		}
		sc.close();
	}

}
