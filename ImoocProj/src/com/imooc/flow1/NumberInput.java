package com.imooc.flow1;

import java.util.Scanner;

public class NumberInput {

	public static void main(String[] args) {
		// �Ӽ��̽�������
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			System.out.println(n);
		}

		// ��i��ֵ
		for (int i = 0, j = 1; j < 5; j += 3) {
			i = i + j;

		}

	}

}
