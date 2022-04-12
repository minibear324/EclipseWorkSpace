package com.imooc.operator;

public class ConditionDemo {

	public static void main(String[] args) {
		// 商场大折，如果两件商品的价格大于100则减20，并把原价和折后价格分别输出
		// 定义两个变量，分别存放两件衣服的价格
		double price1, price2;
		price1 = 80;
		price2 = 55;
		// 计算两件商品的总价格
		double sum = price1 + price2;
		// 输出原价
		System.out.println("原价为" + sum);
		if (sum >= 100) {
			sum -= 20;
		}
		// 输出折后价格
		System.out.println("折后价为" + sum);

	}

}
