package com.imooc.flow1;

public class LoopDemo {

	public static void main(String[] args) {
		// ʹ��whileѭ����1~5��ƽ����
		// �������α���n��Ϊѭ������������ʼ��
		int n = 1;
		// �������α���sum��źͣ�����ʼ����
		int sum = 0;
		// ʹ��whileѭ����1~5��ƽ����
		while (n <= 5) {
			sum += Math.pow(n, 2);// ����math���е�pow()������������ƽ��
			n++;
		}
		System.out.println("1��5��ƽ����Ϊ��" + sum);

		// ��i��ֵ
		int i = 10;
		do {
			i -= 2;
		} while (i > 6);
		System.out.println(i);
	}

}
