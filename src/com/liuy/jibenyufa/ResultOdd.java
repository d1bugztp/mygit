package com.liuy.jibenyufa;

import java.util.Scanner;

/**
 * 0~100之间 偶数之和
 * 
 * @author Administrator
 *
 */
public class ResultOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		for (int i = 0; i <= 100; i += 2) {
			result += i;
		}
		System.out.println(result);

		int oddNum = 0;
		int evenNum = 0;

//		Scanner input = new Scanner(System.in);
//		while (true) {
//			int num = input.nextInt();
//			if (num == 0) {
//				break;
//			}
//			if (num < 0) {
//				oddNum++;
//			} else if (num > 0) {
//				evenNum++;
//			}
//		}
//		System.out.println("the oddNum is " + oddNum + "\nthe evenNum is "+evenNum);
		
		label1:for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++){
				if(j==5) {
					break label1;
				}
				oddNum++;
				System.out.println(i+" "+j+" "+oddNum);
			}
		}
		System.out.println(oddNum);
		
		
		
		
		
		char[] anChar = new char[2];
		System.out.println("me"+anChar[0]+"me"+anChar[1]==" ");
		
		
		
		
		
		
		
	}
	
	
}
