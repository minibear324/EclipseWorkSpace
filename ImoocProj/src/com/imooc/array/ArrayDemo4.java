package com.imooc.array;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// ����һ���ַ����鲢��ʼ����ͳ���ַ�'a'��'A'���ֵĴ���
		// ����һ���ַ������ch����ʼ��
		char[] ch = { 'a', 'A', 's', 'a', 'f', 'a', 'A', 'R' };
		// ѭ���������飬ͳ���ַ�'a'��'A'���ֵĴ���
		int i;
		int count1 = 0;
		int count2 = 0;
		for (i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				count1++;
			}
			if (ch[i] == 'A') {
				count2++;
			}
		}
		// ��ӡ���ͳ�ƵĴ���
		int sum = count1 + count2;
		System.out.println("�ܴ���Ϊ��" + sum);
	}

}
