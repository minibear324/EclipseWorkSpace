package com.imooc;

public class StringDemo {

	public static void main(String[] args) {
		// ����һ�����ַ���
		String s1 = "";
		System.out.println("s1=" + s1);
		// ����һ��hello�ַ���
		String s2 = "hello";
		System.out.println("s2=" + s2);

		// ʹ��Unicode��������ַ��������Ķ���
		String s3 = "A\u005d\u005fB";
		System.out.println("s3=" + s3);

		// ����һ�������ո���ַ���(�ո���Ϊһ���ַ�������һ���ո� ռһλ)
		String s4 = "Hello   Imooc!";
		System.out.println("s4=" + s4);
	}

}
