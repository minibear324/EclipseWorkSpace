package com.imooc.operator;

public class AndOperator {

	public static void main(String[] args) {
		// �������
		// ��ѧ���ԣ�Ӣ���ѧ��C���������ܳɼ����ڵ���230������Ӣ��ɼ����ڵ���60��������ѧ
		// �����ĸ�����
		int en = 80, ma = 59, cgr = 79;
		int sum = en + ma + cgr;
		if (sum >= 230 && en >= 60) {
			System.out.println("�������ѧ��");
		} else {
			System.out.println("�㲻����ѧ��");
		}

		// &��������������������ʲô��������Ὣ�������ߵı��ʽ������һ��
		int n = 3;
		boolean b = (3 > 7) & ((n++) < 2);
		System.out.println("b=" + b + "\tn=" + n);

		// &&������ֽж�·������������һ�����ʽ��ֵ���ܾ������ʽ���Ľ����������ұߵı��ʽ�Ͳ��ټ�����
		int m = 3;
		boolean c = (3 > 7) && ((m++) < 2);// ��Ϊ�Ƕ�·����������Ժ���ı��ʽ������������㣬���m++��ִ�У�m����Ϊ3
		System.out.println("c=" + c + "\tm=" + m);
	}

}
