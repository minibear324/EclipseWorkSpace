package com.imooc.operator;

public class MathDemo {

	public static void main(String[] args) {
		// ���������
		int num1 = 1, num2 = 5;
		int result;// ��Ž��
		// �ӷ�����
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		// �ַ���������
		System.out.println("" + num1 + num2);
		// ��������
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		// �˷�����
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
		// ��������
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		// ����뱣�����ȫ����ֵ�����Խ����ӻ��߷�ĸ�ĳɸ���������
		System.out.println("1.0/5" + "=" + 1.0 / 5);
		// ������
		result = num1 % num2;
		System.out.println(num1 + "%" + num2 + "=" + result);
		System.out.println("14.3%" + num2 + "=" + (14.3 % num2));

		int a = 3;
		result = a += a *= a;// a*a+a=result
		System.out.println(result);
	}

}
