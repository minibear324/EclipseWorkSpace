package com.imooc.array;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// ��ά�����ʹ��
		// ��ά�����������������ʽ
		// ����int���͵Ķ�ά����
		int[][] intArray;
		// ����float���͵Ķ�ά����
		float floatArray[][];
		// ����double���͵Ķ�ά����
		double[] doubleArray[];
		// ��ά����Ĵ�����������
		intArray = new int[3][3];
		System.out.println("intArray����ĵ����е����е�Ԫ��Ϊ��" + intArray[2][2]);
		// Ϊ�ڶ��е����е�Ԫ�ظ�ֵΪ9
		intArray[1][2] = 9;
		System.out.println("intArray����ڶ��е����е�Ԫ��Ϊ+" + intArray[1][2]);
		// ���������ͬʱ���д���
		char[][] ch = new char[3][5];
		// ����float���͵�ͬʱ��ָֻ������
		floatArray = new float[3][];
		// Ŀǰ���ܶ������е�Ԫ�ؽ����������Ϊû�д���������
		// Ҫ��ʹ��float���飬����Ҫ�ڶ�ÿһ�����鴴��������,�������ǿ��Դ���ÿ��֮��������һ�������
		floatArray[0] = new float[3];// ��һ��������
		floatArray[1] = new float[10];// �ڶ�����ʮ��
		floatArray[2] = new float[5];// ������������
		// ���ڶ�floatArray�����Ԫ�ؽ��������ע�⣬���ܳ����±�Խ��
		System.out.println(floatArray[0][2]);
		System.out.println(floatArray[1][8]);
		System.out.println(floatArray[2][4]);

		// ��ά�����ʼ��
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6, 54, 123, 78, 2 }, { 7, 8, 9 } };
		System.out.println("num�����һ�еڶ��е�Ԫ��Ϊ��" + num[0][1]);
		System.out.println("num���������Ϊ��" + num.length);
		System.out.println("num����ĵ�һ�е�����Ϊ:" + num[0].length);

		// ѭ�������ά���������
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
		}
	}

}
