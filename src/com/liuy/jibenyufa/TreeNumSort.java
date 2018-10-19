package com.liuy.jibenyufa;

/**
 * Èı¸öÊı×ÖÅÅĞò
 * @author Administrator
 *
 */
public class TreeNumSort {
	public static void main(String[] agrs)
	{
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		int max ;
		int midden;
		int min;
		
		if(num1>num2){
			max = num1;
			min = num2;
		}else{
			max = num2;
			min = num1;
		}
		
		if (max < num3){
			max = num3;
		}
		if(min > num3){
			min = num3;
		}
		
		midden = num1+num2+num3-max-min;
		
		System.out.println(max+" "+midden+" "+ min);
	}
}
