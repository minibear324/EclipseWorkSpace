package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo {

	public static void main(String[] args) {
		// ���ڵ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������1-7֮������֣�");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("���������Ϣ�������������룡");
			break;
		}
		sc.close();

	}

}