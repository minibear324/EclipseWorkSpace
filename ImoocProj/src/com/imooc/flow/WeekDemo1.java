package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		// ���ڵ����,����ʱΪӢ�ĵ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ʾ���ڵ�Ӣ�ĵ��ʣ�");
		String week = sc.next();
		week = week.toUpperCase();// ���ַ����ĵ���ת��Ϊ��д
		switch (week) {
		case "MONDAY":
			System.out.println("����һ");
			break;
		case "TUESDAY":
			System.out.println("���ڶ�");
			break;
		case "WEDNESDAY":
			System.out.println("������");
			break;
		case "THURSDAY":
			System.out.println("������");
			break;
		case "FRIDAY":
			System.out.println("������");
			break;
		case "SATURDAY":
			System.out.println("������");
			break;
		case "SUNDAY":
			System.out.println("������");
			break;
		default:
			System.out.println("���������Ϣ�������������룡");
			break;
		}
		sc.close();
	}

}