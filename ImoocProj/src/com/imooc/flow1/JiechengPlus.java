package com.imooc.flow1;

public class JiechengPlus {

	public static void main(String[] args) {
		// �׳�֮��
		// ��������������s��Ž׳˽����sum��Ž׳�֮��
		int s = 1, sum = 0;

		for (int i = 1; i <= 10; i++) {
			s = 1;
			for (int j = 1; j <= i; j++) {
				s = s * j;
			}
			sum += s;
		}
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("okok");
		System.out.println("1-10�Ľ׳�֮��Ϊ" + sum);

	}

}
