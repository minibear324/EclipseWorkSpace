package com.imooc.method;

public class ArrayDemo {
	// ����һ�������޸�ĳ������Ԫ��ֵ�ķ���
	public void updataArray(int[] a) {
		a[3] = 15;
		System.out.println("����Ԫ��Ϊ��");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// ��������
		ArrayDemo arrayDemo = new ArrayDemo();
		int[] a = { 1, 2, 3, 4, 5, 6, 67 };
		System.out.println("��������ǰ����Ԫ��ֵΪ��");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		arrayDemo.updataArray(a);
		System.out.println("�������ú�����Ԫ�ص�ֵ");
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
