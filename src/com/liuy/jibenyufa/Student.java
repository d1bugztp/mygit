package com.liuy.jibenyufa;
/*
 ������Student�������������ԣ�ѧ��number(int)���꼶state(int)���ɼ�score(int)������20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����		
 ��ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ��
��ʾ�������������Math.randon()������ֵ����double;  
	 ��������ȡ����Math.round()������ֵ����long��

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
		return "ѧ�ţ�"+number+" �꼶��"+state+"�ɼ�:"+score;
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
