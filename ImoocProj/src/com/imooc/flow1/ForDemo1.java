package com.imooc.flow1;

public class ForDemo1 {

	public static void main(String[] args) {
		// ��100���ڵ�ֵ��ӡ������10��������
		for (int i = 1; i < 101; i++) {
			// �����������
			System.out.print(i + "    ");
			// ���ƻ���
			if (i % 10 == 0) {
				System.out.println();
			}

		}

	}

}
