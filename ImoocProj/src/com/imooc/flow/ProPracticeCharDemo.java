package com.imooc.flow;

public class ProPracticeCharDemo {

	public static void main(String[] args) {
		// ����һ���ַ��������жϸñ����Ƿ�ΪԪ����ĸ�����
		// ����һ���ַ���������ʼ��
		char ch = 'a';
		// ʹ��switch�ṹ�ж��Ƿ�ΪԪ����ĸ���������Ӧ����Ϣ
		switch (ch) {
		case 'a':
			System.out.println("Ԫ����ĸa");
			break;
		case 'e':
			System.out.println("Ԫ����ĸe");
			break;
		case 'i':
			System.out.println("Ԫ����ĸi");
			break;
		case 'o':
			System.out.println("Ԫ����ĸo");
			break;
		case 'u':
			System.out.println("Ԫ����ĸu");
			break;
		default:
			System.out.println("����Ԫ����ĸ");
			break;
		}

	}

}
