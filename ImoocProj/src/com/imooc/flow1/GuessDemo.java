package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// ������Ϸ��Ҫ���һ������1��10֮������֡�Ȼ�󽫲²��ֵ��ʵ��ֵ���бȽϣ���������ʾ���Ա��ܸ��ӽ�ʵ��ֵ��ֱ������Ϊֹ��
		// ����Ҫ�µ���
		int number = (int) ((Math.random() * 100) + 1);// �������[1-100)
		System.out.println(number);
		int guess;
		// ����һ���������������Ʋ²�Ĵ���
		boolean flag = true;

		System.out.println("��������������100����Ŷ~��");
		while (flag) {
			System.out.println("������5�εĻ�����в�������Ϸ�����ʵ����ս�����~");
			int count = 5;
			System.out.println("���������²������");
			do {
				Scanner sc = new Scanner(System.in);
				guess = sc.nextInt();
				if (guess > number) {
					System.out.println("���������̫������");
				} else {
					System.out.println("���������̫С����");
				}
				if (count > 1) {
					flag = true;
					count--;
					System.out.println("����ʣ��" + count + "�λ���Ŷ");
					System.out.println("���������²������");
				} else {
					flag = false;
					System.out.println("���Ļ��������꣬��ӭ�´������棡");

				}

			} while (number != guess);

			System.out.println("��ϲ�������ˣ��㽫�������Ĵ����Ŷ��");

		}

	}

}
