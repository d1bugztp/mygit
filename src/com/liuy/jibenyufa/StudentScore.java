package com.liuy.jibenyufa;

import java.util.Scanner;

/*
 �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
	�ɼ�>=��߷�-10  �ȼ�Ϊ��A��   �ɼ�>=��߷�-20  �ȼ�Ϊ��B��
	�ɼ�>=��߷�-30  �ȼ�Ϊ��C��   ����     �ȼ�Ϊ��D��
��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ���

 */
public class StudentScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxScore = 0;
		
		//��������
		System.out.println("������ѧ������:");
		int studentCount = input.nextInt();
		int[] scores = new int[studentCount];
		
		//��ȡ���룬Ϊ���鸳ֵ,����ȡ��߷���
		for(int i=0; i<scores.length; i++){
			System.out.printf("�������"+(i+1)+"λѧ���ĳɼ���");
			int score = input.nextInt();
			scores[i]=score;
			if(maxScore	 < score) maxScore = score;
		}
		System.out.println("�ɼ�¼����ϡ�\n");
		
		//�ɼ���Ϣ���
		for(int i=0; i<scores.length; i++){
			if ((maxScore-scores[i])<=10){
				System.out.println("�ɼ�Ϊ:"+scores[i]+",�ȼ�ΪA��");
			}else if ((maxScore-scores[i])<=20){
				System.out.println("�ɼ�Ϊ:"+scores[i]+",�ȼ�ΪB��");
			}else if ((maxScore-scores[i])<=30){
				System.out.println("�ɼ�Ϊ:"+scores[i]+",�ȼ�ΪC��");
			}else {
				System.out.println("�ɼ�Ϊ:"+scores[i]+",�ȼ�ΪD��");
			}
		}
	}

}
