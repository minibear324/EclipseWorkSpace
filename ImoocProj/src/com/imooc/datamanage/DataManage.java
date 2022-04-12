package com.imooc.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 从键盘接收整型数据存放到数组中，并对数组中的数据进行管理
 * 
 * @author queen
 *
 */

public class DataManage {

	/**
	 * 从键盘接收数据
	 * 
	 * @return 接收数组的数据
	 */
	public int[] insertData() {
		// 创建一个数组
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// 少接收一个数据，为在指定位置处插入数据做准备
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据：");
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				// 抛出异常
				System.out.println("您输入的类型有误，不能输入非数字的字符！");
				// 对输入格式错误的数据进行处理，先接收此字符串，让程序不直接运行到最后面
				sc.next();
				// i--对前一个输入不成功的数据的要求再重新输入，回到数组前一个位置
				i--;
			}
		}
		return a;
	}

	/**
	 * 显示数组中的元素
	 * 
	 * @param a:数组
	 * @param length:要显示的数组元素的个数
	 */
	public void showData(int[] a, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 往数组中插入数据
	 * 
	 * @param a:数组
	 * @param n:插入的数据
	 * @param k:想要插入的位置，与数组的下标一致
	 */
	public void insertAtArray(int[] a, int n, int k) {
		// 注意从最后一个数据开始移动，避免数据覆盖
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	/**
	 * 输出数组中能被3整除的元素
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
			System.out.println("数组中没有能被3整除的元素！");
		} else {
			System.out.println("数组中能被3整除的元素为：" + str);
		}
	}

	/**
	 * 提示信息
	 */
	public void notice() {
		System.out.println("************************************");
		System.out.println("       1--插入数据");
		System.out.println("       2--显示所有数据");
		System.out.println("       3--在指定位置插入数据");
		System.out.println("       4--查询能被3整除的数据");
		System.out.println("       0--退出");
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		// 使用方法
		DataManage dataManage = new DataManage();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int[] a = null;
		int n = 0, k = 0;// n表示要插入的数据，k表示指定插入的位置
		while (true) {
			dataManage.notice();
			try {
				System.out.println("请输入对应的数字进行相应的操作：");
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("您输入的类型有误，不能输入非数字的字符！");
				sc.next();
				continue;
			}
			if (input == 0) {
				System.out.println("退出程序！");
				break;
			}
			switch (input) {
			case 1:
				// 插入数据
				a = dataManage.insertData();
				// 显示数据
				System.out.println("数组元素为：");
				dataManage.showData(a, a.length - 1);
				break;
			case 2:
				if (a != null) {
					System.out.println("数组元素为：");
					if (a[a.length - 1] == 0) {
						// 如果数组的最后一个元素为0，说明我们没有进行数据的插入操作，则我们不显示最后一个元素
						dataManage.showData(a, a.length - 1);
					} else {
						dataManage.showData(a, a.length);
					}
				} else {
					System.out.println("数组中还没有数据，请重新进行操作的选择！");
				}
				break;
			case 3:
				// 在指定位置处插入数据
				if (a != null) {
					try {
						System.out.println("请输入要插入的数据：");
						n = sc.nextInt();
						System.out.println("请输入要插入数据的位置：");
						k = sc.nextInt();
					} catch (InputMismatchException e) {
						// 抛出异常
						System.out.println("您输入的类型有误，不能输入非数字的字符！");
						// 对输入格式错误的数据进行处理，先接收此字符串，让程序不直接运行到最后面
						sc.next();
						break;
					}

					dataManage.insertAtArray(a, n, k);
					dataManage.showData(a, a.length);
				} else {
					System.out.println("数组中还没有数据，请重新进行操作的选择！");
				}
				break;
			case 4:
				// 查询数组中能被3整除的数
				if (a != null) {
					dataManage.divThree(a);
				} else {
					System.out.println("数组中还没有数据，请重新进行操作的选择！");
				}
				break;
			default:
				System.out.println("您输入的数字有错误，不在0~5之间！");
				break;
			}
		}
	}

}
