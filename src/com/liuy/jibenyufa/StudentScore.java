package com.liuy.jibenyufa;

import java.util.Scanner;

/*
 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
	成绩>=最高分-10  等级为’A’   成绩>=最高分-20  等级为’B’
	成绩>=最高分-30  等级为’C’   其余     等级为’D’
提示：先读入学生人数，根据人数创建int数组，存放学生成绩。

 */
public class StudentScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxScore = 0;
		
		//声明数组
		System.out.println("请输入学生数量:");
		int studentCount = input.nextInt();
		int[] scores = new int[studentCount];
		
		//获取输入，为数组赋值,并获取最高分数
		for(int i=0; i<scores.length; i++){
			System.out.printf("请输入第"+(i+1)+"位学生的成绩：");
			int score = input.nextInt();
			scores[i]=score;
			if(maxScore	 < score) maxScore = score;
		}
		System.out.println("成绩录入完毕。\n");
		
		//成绩信息输出
		for(int i=0; i<scores.length; i++){
			if ((maxScore-scores[i])<=10){
				System.out.println("成绩为:"+scores[i]+",等级为A。");
			}else if ((maxScore-scores[i])<=20){
				System.out.println("成绩为:"+scores[i]+",等级为B。");
			}else if ((maxScore-scores[i])<=30){
				System.out.println("成绩为:"+scores[i]+",等级为C。");
			}else {
				System.out.println("成绩为:"+scores[i]+",等级为D。");
			}
		}
	}

}
