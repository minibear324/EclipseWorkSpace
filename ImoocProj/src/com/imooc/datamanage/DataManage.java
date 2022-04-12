package com.imooc.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * �Ӽ��̽����������ݴ�ŵ������У����������е����ݽ��й���
 * 
 * @author queen
 *
 */

public class DataManage {

	/**
	 * �Ӽ��̽�������
	 * 
	 * @return �������������
	 */
	public int[] insertData() {
		// ����һ������
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// �ٽ���һ�����ݣ�Ϊ��ָ��λ�ô�����������׼��
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("�������" + (i + 1) + "�����ݣ�");
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				// �׳��쳣
				System.out.println("��������������󣬲�����������ֵ��ַ���");
				// �������ʽ��������ݽ��д����Ƚ��մ��ַ������ó���ֱ�����е������
				sc.next();
				// i--��ǰһ�����벻�ɹ������ݵ�Ҫ�����������룬�ص�����ǰһ��λ��
				i--;
			}
		}
		return a;
	}

	/**
	 * ��ʾ�����е�Ԫ��
	 * 
	 * @param a:����
	 * @param length:Ҫ��ʾ������Ԫ�صĸ���
	 */
	public void showData(int[] a, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * �������в�������
	 * 
	 * @param a:����
	 * @param n:���������
	 * @param k:��Ҫ�����λ�ã���������±�һ��
	 */
	public void insertAtArray(int[] a, int n, int k) {
		// ע������һ�����ݿ�ʼ�ƶ����������ݸ���
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	/**
	 * ����������ܱ�3������Ԫ��
	 * 
	 * @param a
	 */
	public void divThree(int[] a) {
		String str = "";
		int count = 0;
		for (int n : a) {
			if (n % 3 == 0) {
				str = str + n + " ";
				count++;
			}
		}
		if (count == 0) {
			System.out.println("������û���ܱ�3������Ԫ�أ�");
		} else {
			System.out.println("�������ܱ�3������Ԫ��Ϊ��" + str);
		}
	}

	/**
	 * ��ʾ��Ϣ
	 */
	public void notice() {
		System.out.println("************************************");
		System.out.println("       1--��������");
		System.out.println("       2--��ʾ��������");
		System.out.println("       3--��ָ��λ�ò�������");
		System.out.println("       4--��ѯ�ܱ�3����������");
		System.out.println("       0--�˳�");
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		// ʹ�÷���
		DataManage dataManage = new DataManage();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int[] a = null;
		int n = 0, k = 0;// n��ʾҪ��������ݣ�k��ʾָ�������λ��
		while (true) {
			dataManage.notice();
			try {
				System.out.println("�������Ӧ�����ֽ�����Ӧ�Ĳ�����");
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("��������������󣬲�����������ֵ��ַ���");
				sc.next();
				continue;
			}
			if (input == 0) {
				System.out.println("�˳�����");
				break;
			}
			switch (input) {
			case 1:
				// ��������
				a = dataManage.insertData();
				// ��ʾ����
				System.out.println("����Ԫ��Ϊ��");
				dataManage.showData(a, a.length - 1);
				break;
			case 2:
				if (a != null) {
					System.out.println("����Ԫ��Ϊ��");
					if (a[a.length - 1] == 0) {
						// �����������һ��Ԫ��Ϊ0��˵������û�н������ݵĲ�������������ǲ���ʾ���һ��Ԫ��
						dataManage.showData(a, a.length - 1);
					} else {
						dataManage.showData(a, a.length);
					}
				} else {
					System.out.println("�����л�û�����ݣ������½��в�����ѡ��");
				}
				break;
			case 3:
				// ��ָ��λ�ô���������
				if (a != null) {
					try {
						System.out.println("������Ҫ��������ݣ�");
						n = sc.nextInt();
						System.out.println("������Ҫ�������ݵ�λ�ã�");
						k = sc.nextInt();
					} catch (InputMismatchException e) {
						// �׳��쳣
						System.out.println("��������������󣬲�����������ֵ��ַ���");
						// �������ʽ��������ݽ��д����Ƚ��մ��ַ������ó���ֱ�����е������
						sc.next();
						break;
					}

					dataManage.insertAtArray(a, n, k);
					dataManage.showData(a, a.length);
				} else {
					System.out.println("�����л�û�����ݣ������½��в�����ѡ��");
				}
				break;
			case 4:
				// ��ѯ�������ܱ�3��������
				if (a != null) {
					dataManage.divThree(a);
				} else {
					System.out.println("�����л�û�����ݣ������½��в�����ѡ��");
				}
				break;
			default:
				System.out.println("������������д��󣬲���0~5֮�䣡");
				break;
			}
		}
	}

}
