package com.imooc.operator;

public class MathDemo1 {

	public static void main(String[] args) {
		// 自增自减运算
		// x++
		int x = 4;
		int y = (x++) + 5;// y=x+5;x=x+1;
		System.out.println("x=" + x + ",y=" + y);
		// ++x
		x = 4;
		y = (++x) + 5;// x=x+1;y=x+5;
		System.out.println("x=" + x + ",y=" + y);
		// x--
		x = 4;
		y = (x--) + 5;// y=x+5;x=x-1;
		System.out.println("x=" + x + ",y=" + y);
		// --x
		x = 4;
		y = (--x) + 5;// x=x-1;y=x+5;
		System.out.println("x=" + x + ",y=" + y);

		// a
		int a = 3;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);

		// 执行以下程序后，m,p,q的值分别是
		int p = 2, q = 4;
		boolean m;
		m = ++p > q--;
		System.out.println(p);
		System.out.println(q);
		System.out.println(m);

	}

}
