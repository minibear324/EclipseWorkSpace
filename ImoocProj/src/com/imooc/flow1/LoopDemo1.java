package com.imooc.flow1;

public class LoopDemo1 {

	public static void main(String[] args) {
		// ��дһ���������200��300֮�����������������������������֮��Ϊ42��������֮��Ϊ12
		// �������bi��shi��bai�����ڴ�Ÿ�λ��ʮλ����λ�ϵ�����
		int ge, shi, bai;
		// ʹ��forѭ��������200-300����
		for (int i = 200; i <= 300; i++) {
			// ȡ����λ��
			bai = i / 100;
			// ȡ��ʮλ��
			shi = (i % 100) / 10;
			// ȡ����λ��
			ge = i % 10;
			// ����������֮��
			int muls = bai * shi * ge;
			// ����������֮��
			int sum = bai + shi + ge;
			// ������֮��Ϊ42��������֮��Ϊ12
			if (muls == 42 & sum == 12) {
				System.out.println(i);
			}
		}

	}

}
