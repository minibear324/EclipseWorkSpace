package com.imooc.method;

import java.util.Scanner;

public class ArraySearch {
	// ��������Ԫ�ص�ֵ
	public boolean search(int n, int[] arr) {
		// �ȶ���һ��������Ĭ��ֵΪfalse
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				// �����ȣ���ʾ�����������
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ҫ���ҵ���:");
		int number = sc.nextInt();
		// ��������
		ArraySearch arraySearch = new ArraySearch();
		// ���÷���
		boolean flag = arraySearch.search(number, arr);
		if (flag == true) {
			System.out.println("����Ҫ���ҵ��������������Ŷ��");
		} else {
			System.out.println("��������������");
		}
	}

}
