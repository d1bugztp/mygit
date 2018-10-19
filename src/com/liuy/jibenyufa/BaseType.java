package com.liuy.jibenyufa;	

public class BaseType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteData ;
		short shortData;
		int intData;
		long longData = (2<<62)-1L+(2<<62);
		
		System.out.println(longData);
		
		System.out.println((int)'a');
		System.out.println((int)'0');
		System.out.println((int)'A');
		System.out.println('\b');
	}

}
