package com.imooc.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		// ��1��100���ۼӺ�
		// 1+2+3+...+100
		// �������
		int n = 1;
		// �����ۼӺ͵ı���
		int sum = 0;
		// whileѭ��
		while (n < 101) {
			sum += n;
			n++;
		}
		System.out.println("sum=" + sum);

		// ��1+3+5+7+...+99
		// �������
		int m = 1;
		// ����ʹsumֵΪ0
		sum = 0;
		// whileѭ������
		while (m < 100) {
			sum += m;
			m = m + 2;
		}
		System.out.println("sum=" + sum);
	}

}
