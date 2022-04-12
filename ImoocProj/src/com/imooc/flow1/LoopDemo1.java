package com.imooc.flow1;

public class LoopDemo1 {

	public static void main(String[] args) {
		// 编写一个程序，求出200到300之间的数，且满足条件：她们三个数之积为42，三个数之和为12
		// 定义变量bi、shi、bai，用于存放个位、十位、百位上的数字
		int ge, shi, bai;
		// 使用for循环，遍历200-300的数
		for (int i = 200; i <= 300; i++) {
			// 取出百位数
			bai = i / 100;
			// 取出十位数
			shi = (i % 100) / 10;
			// 取出个位数
			ge = i % 10;
			// 计算三个数之积
			int muls = bai * shi * ge;
			// 计算三个数之和
			int sum = bai + shi + ge;
			// 三个数之积为42，三个数之和为12
			if (muls == 42 & sum == 12) {
				System.out.println(i);
			}
		}

	}

}
