package com.imooc.flow1;

public class DoWhileDemo {

	public static void main(String[] args) {
		// ��1��100���ۼӺ�
		// ����һ������
		int n = 1;
		int sum = 0;
		do {
			sum += n;
			n++;
		} while (n < 101);
		System.out.println("1��100���ۼӺ�Ϊ��" + sum);
	}

}
