package com.imooc.flow1;

public class CharDemo {

	public static void main(String[] args) {
		// ѭ�����26��Ӣ��Сд��ĸ�����������
		char ch = 'a';
		int count = 1;
		while (ch <= 'z') {
			System.out.print(ch + " ");
			if (count % 13 == 0) {
				System.out.println();
			}
			count++;
			ch++;
		}

		// ��j��ֵ
		int j = 9, i = 6;
		while (i-- > 3)
			--j;
		System.out.println(j);

		// ��k��ֵ
		int m = 3, n = 6, k = 0;
		while (m < n) {
			++k;
			m++;
			--n;
		}
		System.out.println(k);
	}

}
