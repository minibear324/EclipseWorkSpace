package com.imooc.operator;

import java.util.Scanner;

public class IntDemo {

	public static void main(String[] args) {
		// �ж�������������Ƿ����5����7��������������ǣ������yes���������no
		// ����һ�����ͱ���n�����Ӽ��̽�������
		System.out.println("������һ����������");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// �ж�n�Ƿ�ͬʱ�ܱ�5��7 ������������㣬�����yes�����������no
		if ((number % 5 == 0) & (number % 7 == 0)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}
}
