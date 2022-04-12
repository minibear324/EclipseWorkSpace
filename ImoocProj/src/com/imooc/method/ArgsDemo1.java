package com.imooc.method;

public class ArgsDemo1 {
	// 查找
	public void search(int n, int... a) {// 参数列表如果有两个以上的参数，可变参数一定在最后！
		boolean flag = false;
		for (int a1 : a) {
			if (a1 == n) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("找到了！" + n);
		} else {
			System.out.println("没找到!" + n);
		}
	}

	public static void main(String[] args) {
		// 两个参数，其中有一个是可变参数的使用
		ArgsDemo1 argsDemo1 = new ArgsDemo1();
		argsDemo1.search(1, 24, 4, 56, 67, 3, 23, 23, 2, 34, 24, 1);
		int[] a = { 1, 23, 4, 5, 6, 7, 8 };

		argsDemo1.search(23, a);
	}

}
