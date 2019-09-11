package com.arc.ex1_school;

import java.util.Scanner;

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

	
	
	//viewOne
	public void viewOne(Student student) {
		if(student != null) {
			System.out.println(student.name);
			System.out.println(student.num);
			System.out.println(student.kor);
			System.out.println(student.eng);
			System.out.println(student.math);
			System.out.println(student.sum);
			System.out.println(student.avg);
			System.out.println("======");
		}else {
			System.out.println("해당 학생이 없어요.");
		}//if
		
	}//viewOne
}
