package com.imooc.method;

public class AverageDemo {
	// �������ƽ��ֵ
	public void avgArray(float[] a) {
		float average = 0;
		float sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		average = sum / a.length;
		System.out.println("�����ƽ��ֵΪ��" + average);
	}

	public static void main(String[] args) {
		// ����һ���������������ƽ��ֵ
		// ��������������󣬲���ʼ��һ��float���͵����飬���÷���������Ԫ�ص�ƽ��ֵ������ƽ��ֵ��ӡ���
		// ����Ԫ�ص�����Ϊ��78.5,98.5,65.5,32.5��75.5
		AverageDemo averageDemo = new AverageDemo();
		float[] a = { 78.5f, 98.5f, 65.5f, 32.5f, 75.5f };
		averageDemo.avgArray(a);

	}

}
