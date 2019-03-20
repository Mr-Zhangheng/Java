package com.qianfeng.week2.day3.aExercise.SJB;

public class Program {
	public static void main(String[] args) {


		GameControl.start();
	}
}

// 分析:
// 用户类: 
// 		属性: 姓名、总局数、胜场、平场、负场、胜率
// 排行榜:
// 		属性: 存所有用户的数组（第一阶段：数组固定长度）
// 		方法: 排序，添加，展示、获取
// AI类:
// 		行为: 随机出石头剪刀布
// 游戏操作:
// 		负责界面显示逻辑
