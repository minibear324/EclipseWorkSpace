package com.imooc.method;

// Javad�İ����ĵ����ĵ�ע��
/**
 * ���ڿɱ���������ص����� ͨ���ĵ�ע�����ɰ����ĵ���ͨ��javadoc������ĵ�ע�͵�����ȡAPI�����ĵ��� ���磺javadoc -d doc
 * ArgsDemo2.java,��cmd��,�������������ڴ˷������ڵ��ļ���������doc�ļ�����鿴�����ĵ�ʱ����doc�е�index.html�ļ��Ϳ��Բ鿴��
 * *
 * 
 * @author queen
 * @version 1.0
 *
 */

public class ArgsDemo2 {
	// �ɱ�����б�ķ�������󱻷��ʵ�
	// �����������ĺ�
	public int plus(int a, int b) {
		System.out.println("�����ɱ�����ķ��������ã�");
		return a + b;
	}

	// ���ɱ�����б�ķ��������
	public int plus(int... a) {
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		System.out.println("���ɱ�����ķ��������ã�");
		return sum;
	}

	public static void main(String[] args) {
		// ���ɱ�����ķ�������ʹ��
		ArgsDemo2 argsDemo2 = new ArgsDemo2();
		System.out.println("��Ϊ��" + argsDemo2.plus(1, 2));

	}

}
