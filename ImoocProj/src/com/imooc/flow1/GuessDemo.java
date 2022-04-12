package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// 猜字游戏。要求猜一个介于1到10之间的数字。然后将猜测的值与实际值进行比较，并给出提示，以便能更接近实际值，直到猜中为止。
		// 设置要猜的数
		int number = (int) ((Math.random() * 100) + 1);// 随机数，[1-100)
		System.out.println(number);
		int guess;
		// 定义一个变量，用来控制猜测的次数
		boolean flag = true;

		System.out.println("请猜数，这个数在100以内哦~：");
		while (flag) {
			System.out.println("您将有5次的机会进行猜数字游戏！请适当掌握节奏啦~");
			int count = 5;
			System.out.println("请输入您猜测的数：");
			do {
				Scanner sc = new Scanner(System.in);
				guess = sc.nextInt();
				if (guess > number) {
					System.out.println("您输入的数太大啦！");
				} else {
					System.out.println("您输入的数太小啦！");
				}
				if (count > 1) {
					flag = true;
					count--;
					System.out.println("您还剩余" + count + "次机会哦");
					System.out.println("请输入您猜测的数：");
				} else {
					flag = false;
					System.out.println("您的机会已用完，欢迎下次再来玩！");

				}

			} while (number != guess);

			System.out.println("恭喜您猜中了，你将获得神奇的大礼包哦！");

		}

	}

}
