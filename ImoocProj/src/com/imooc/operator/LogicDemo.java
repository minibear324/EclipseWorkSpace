package com.imooc.operator;

import java.util.Scanner;

public class LogicDemo {

	public static void main(String[] args) {
		// ����һ������
		System.out.println("����һ��������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (!(n % 3 == 0)) {
			System.out.println(n + "���ܱ�3������");
		} else {
			System.out.println(n + "�ܱ�3������");
		}

		// ��k��ֵ
		int i = 4, j = 5, k = 9, m = 5;
		if (i > j && m < k++) {
			k++;
		} else {
			k--;
		}
		System.out.println("k=" + k);
		sc.close();
	}

}
