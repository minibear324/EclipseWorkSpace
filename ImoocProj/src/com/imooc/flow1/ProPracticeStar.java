package com.imooc.flow1;

public class ProPracticeStar {

	public static void main(String[] args) {
		// ���Ǻ����һ�����Σ�ʹ��forѭ����ɣ�
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int t = 1; t <= 11 - (5 - i) * 2; t++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
