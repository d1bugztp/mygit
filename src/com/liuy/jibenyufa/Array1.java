package com.liuy.jibenyufa;
public class Array1{
	   public  static void main(String [] args){
		   //00000010(2 ²¹Âë)     <<   00001000  =8
		   System.out.println(2<<2);
		   //10000010 -¡·11111101-¡· 11111110 << 11111000->11110111->10001000=-8
		   System.out.println(-2<<2);
		   //10000100-> 11111011->11111100>>11111111->11111110->1000000001=-1
		   System.out.println(-4>>2);
	       //
		  System.out.println(8>>>2);
	   }

	}

