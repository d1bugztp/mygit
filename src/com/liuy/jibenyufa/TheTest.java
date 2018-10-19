package com.liuy.jibenyufa;

public class TheTest {

	public static void main(String[] args) {
		Student[] students = new Student[20];
		
		for(int i=0; i<students.length; i++){
			int num = i+1;
			int state = (int)( Math.random()*3 +1);
			int score = (int)Math.round((Math.random()*100));
			students[i] = new Student(num,state,score);
		}
		
		for(int i=0; i<students.length; i++){
			if(students[i].getState() == 3){
				System.out.println(students[i]);
			}
		}
	}

}
