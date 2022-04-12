package com.imooc.operator;

public class AndOperator {

	public static void main(String[] args) {
		// 与运算符
		// 升学考试，英语、数学、C语言三门总成绩大于等于230，并且英语成绩大于等于60，才能升学
		// 定义四个变量
		int en = 80, ma = 59, cgr = 79;
		int sum = en + ma + cgr;
		if (sum >= 230 && en >= 60) {
			System.out.println("你可以升学！");
		} else {
			System.out.println("你不能升学！");
		}

		// &运算符，此运算符不管是什么情况，都会将左右两边的表达式都计算一遍
		int n = 3;
		boolean b = (3 > 7) & ((n++) < 2);
		System.out.println("b=" + b + "\tn=" + n);

		// &&运算符又叫短路运算符，如果第一个表达式的值就能决定表达式最后的结果，运算符右边的表达式就不再计算了
		int m = 3;
		boolean c = (3 > 7) && ((m++) < 2);// 因为是短路运算符，所以后面的表达式并不会进行运算，因此m++不执行，m依旧为3
		System.out.println("c=" + c + "\tm=" + m);
	}

}
