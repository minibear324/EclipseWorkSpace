package com.imooc.method;

public class ArgsDemo1 {
	// ����
	public void search(int n, int... a) {// �����б�������������ϵĲ������ɱ����һ�������
		boolean flag = false;
		for (int a1 : a) {
			if (a1 == n) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("�ҵ��ˣ�" + n);
		} else {
			System.out.println("û�ҵ�!" + n);
		}
	}

	public static void main(String[] args) {
		// ����������������һ���ǿɱ������ʹ��
		ArgsDemo1 argsDemo1 = new ArgsDemo1();
		argsDemo1.search(1, 24, 4, 56, 67, 3, 23, 23, 2, 34, 24, 1);
		int[] a = { 1, 23, 4, 5, 6, 7, 8 };

		argsDemo1.search(23, a);
	}

}
