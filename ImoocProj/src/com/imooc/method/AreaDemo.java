package com.imooc.method;

public class AreaDemo {
	// ��Բ�ε����
	public double area(double radius) {
		double areaOfCircl = 0;
		areaOfCircl = radius * radius * Math.PI;
		return areaOfCircl;
	}

	// �󳤷��ε����
	public double area(double length, double width) {
		double rectangularArea = 0;
		rectangularArea = length * width;
		return rectangularArea;
	}

	public static void main(String[] args) {
		// �����������صķ������ֱ���Բ�ͳ����ε����
		// �������
		AreaDemo areaDemo = new AreaDemo();
		// ����һ��double���͵ı�����Ű뾶������ʼ��
		double radius = 4.5;
		// ��������������ų��Ϳ�����ʼ��
		double length = 8, width = 5;
		// ���÷�������Բ���������ӡ���
		System.out.println("Բ�����Ϊ��" + areaDemo.area(radius));
		// ���÷������󳤷����������ӡ���
		System.out.println("�����ε����Ϊ��" + areaDemo.area(length, width));
	}

}
