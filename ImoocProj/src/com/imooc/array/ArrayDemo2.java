package com.imooc.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// ������Ԫ�ص����ֵ
		int[] a = { 34, 23, 78, 56, 31 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max=" + max);
	}

}
