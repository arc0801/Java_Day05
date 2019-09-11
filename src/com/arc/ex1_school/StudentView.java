package com.arc.ex1_school;

public class StudentView {


	//메서드명이 viewAll
	//학생 전체 정보 출력
	public void viewAll(Student [] students) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<students.length;i++) {
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].sum+"\t");
			System.out.print(students[i].avg+"\t");
			System.out.println();
		}//for

	}//viewAll

}
