package com.imooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// ʹ��Ƕ��whileѭ�����10��10�е��Ǻ�
		int m = 1;// ����ѭ����ѭ������
		int n = 1;// ����ѭ����ѭ������
		System.out.println("���10��10�е��Ǻ�");
		// ����ѭ�������������
		while (m <= 10) {
			// ����ѭ���������������
			n = 1;
			while (n <= m) {
				System.out.print("* ");
				n++;
			}
			System.out.println();
			m++;

		}

	}

}
