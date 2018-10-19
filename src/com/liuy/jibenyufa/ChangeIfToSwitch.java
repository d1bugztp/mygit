package com.liuy.jibenyufa;

public class ChangeIfToSwitch {
	public static void main(String[] agrs) {
		/*
		 * int a = 3; int x = 100; if(a==1) x+=5; else if(a==2) x+=10; else
		 * if(a==3) x+=16; else if(a==4) x+=34; else x += 100;
		 * 
		 */
 
		int a = 3;
		int x = 100;
		switch (a) {
		case 1: {
			x += 5;
		}
			break;
		case 2: {
			x += 10;
		}
			break;
		case 3: {
			x += 16;
		}
			break;
		case 4: {
			x += 34;
		}
			break;
		default: {
			x += 100;
		}
		}
		
		int score = 70;
		switch(score/10){
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
	
	}
}
