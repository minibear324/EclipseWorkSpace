package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// ������������ۼӺ�
		// ������������
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		// �Ӽ��̽������ݣ�Ϊ����Ԫ�ظ�ֵ
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "��Ԫ��");
			a[i] = sc.nextInt();
		}
		System.out.println("����Ԫ�ص�����Ϊ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// ��ǿ��forѭ���������
		System.out.println("\n��ǿ��forѭ�����a�����Ԫ�أ�");
		for (int n : a) {
			System.out.print(n + " ");
		}
		sc.close();

		// ������Ԫ�ص��ۼӺ�
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println();
		System.out.println("������ۼӺ�Ϊ��" + sum);
	}

}
