package com.imooc.method;

public class Rectangle {
	// �󳤷�������ķ���
	public int area() {
		int length = 10;
		int width = 5;
		int getArea = length * width;
		return getArea;
	}

	public static void main(String[] args) {
		// ʹ��area����
		Rectangle re = new Rectangle();
		int area = re.area();
		System.out.println("�����ε����Ϊ��" + area);

	}

}
