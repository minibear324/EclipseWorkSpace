package com.imooc;

public class CharDemo {

	public static void main(String[] args) {
		// ����һ����������ַ�'a'
		char a = 'a';
		System.out.println("a=" + a);

		// ���κ��ַ��Ϳ��Ի���ת���ģ����õľ���ASCII��
		char ch = 65;
		// �������A����Ϊ65��Ӧ��ASCII��Ӧ���ַ���A
		System.out.println("ch=" + ch);

		// char����ռ2���ֽڣ�16λ����ʾ��ΧΪ0~(2^16)-1����0~65535
		char ch2 = 65535;
		System.out.println("ch2="+ch2);
		// ����ֵ�ķ�Χ�ڿ�����������������������ֵ�ķ�Χ�ڣ���Ҫ����ǿ���Ե�ת�������²���
		char ch1 = (char) 65536;
		System.out.println("ch1="+ch1);

		// ����������Unicode�����ʾ���ַ�
		char c = '\u005d';
		System.out.println("c=" + c);
	}

}
