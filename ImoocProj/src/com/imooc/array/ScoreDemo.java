package com.imooc.array;

import java.util.Scanner;

public class ScoreDemo {

	public static void main(String[] args) {
		// ��һ����ά�����д������ѧ�������ĺ���ѧ�ĳɼ����Ӽ�����������ѧ���ɼ��洢����ά�����У��ֱ������ĺ���ѧ���ܳɼ���ƽ���ֲ����
		// ����һ���������е���������intArray
		int[][] intArrray = new int[3][2];

		// �Ӽ�������ѧ���ɼ���Ҫ������˳����Ч��ͼһ��
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArrray.length; i++) {
			for (int j = 0; j < intArrray[i].length; j++) {
				if (j == 0) {
					System.out.println("�������" + (i + 1) + "��ѧ�����ĳɼ�");
					intArrray[i][j] = sc.nextInt();
				} else {
					System.out.println("�������" + (i + 1) + "��ѧ����ѧ�ɼ�");
					intArrray[i][j] = sc.nextInt();
				}
			}
		}
		// �����ĵ��ܳɼ���ƽ����
		int sum1 = 0;
		float avg1;
		for (int i = 0; i < intArrray.length; i++) {
			sum1 += intArrray[i][0];
		}
		avg1 = sum1 / intArrray.length;
		System.out.println("�����ܷ�Ϊ��" + sum1 + "����ƽ����Ϊ��" + avg1);

		// ����ѧ���ܳɼ���ƽ����
		int sum2 = 0;
		float avg2;
		for (int i = 0; i < intArrray.length; i++) {
			sum2 += intArrray[i][1];
		}
		avg2 = sum2 / intArrray.length;
		System.out.println("��ѧ�ܷ�Ϊ��" + sum2 + "��ѧƽ����Ϊ��" + avg2);

	}

}
