package com.liuy.jibenyufa;
/*
 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。创建20个学生对象，学号为1到20，年级和成绩都由随机数确定，		
 打印出3年级(state值为3）的学生信息。
提示：生成随机数：Math.randon()，返回值类型double;  
	 四舍五入取整：Math.round()，返回值类型long。

 */
public class Student {
	private int number;
	private int state;
	private int score;
	
	public Student(){
		
	}
	
	public Student(int number, int state, int score) {
		super();
		this.number = number;
		this.state = state;
		this.score = score;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "学号："+number+" 年级："+state+"成绩:"+score;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
