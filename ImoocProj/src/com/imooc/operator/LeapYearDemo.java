package com.imooc.operator;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// ��if-else����ж����������Ƿ�Ϊ����
		System.out.println("��������ݣ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println(year + "�������꣡");
		} else {
			System.out.println(year + "�겻�����꣡");
		}
		sc.close();
	}

}
