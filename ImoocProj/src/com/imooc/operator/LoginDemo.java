package com.imooc.operator;

public class LoginDemo {

	public static void main(String[] args) {
		// ����һ���ַ����ж��Ƿ���'a'��'z'֮����ַ�
		// ����һ��char���͵ı�����������ֵΪ'f'
		char ch = 'f';
		// ���ch��ֵ����'a'��'z'֮�䣬�������a-z֮����ַ��������������a-z֮����ַ�
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("��a-z֮����ַ�");
		} else {
			System.out.println("����a-z֮����ַ�");
		}
	}

}
