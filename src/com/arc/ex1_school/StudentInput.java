package com.arc.ex1_school;

import java.util.Scanner;

public class StudentInput {

	//메서드명은 deleteStudent
	//확인은 4번하고 2번 눌러서 전체조회로~

	public Student [] deleteStudent(Student [] students,int select) {
		Scanner sc = new Scanner(System.in);


		System.out.println("삭제할 학생의 번호를 입력하세요.");
		int n=sc.nextInt();
		int i = 0;

		for(i=0;i<students.length;i++) {
			if(n==students[i].num) {

				break;
			}//if
		}//for

		Student [] student2 = new Student [select-1];

		for(int idx=0;idx<students.length;idx++) {
			if(i==idx) {
				continue;

			}//if
			student2[idx]=students[i];
			idx++;

		}//for



		students = student2;

		return students;


	}//deleteStudent




	//메서드명은  makeStudents
	//
	public Student [] makeStudents() {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 수를 입력하세요.");
		int select = sc.nextInt();

		Student [] students = new Student [select];
		int i = 0;

		for(i=0;i<students.length;i++) {
			//Student stu = new Student();
			//굳이 변수를 하나 더 만드는 이유가 뭘까?

			students[i]=new Student();

			System.out.println("학생의 이름을 입력하세요.");
			students[i].name = sc.next();
			System.out.println("학생의 번호를 입력하세요.");
			students[i].num = sc.nextInt();
			System.out.println("학생의 국어 점수를 입력하세요.");
			students[i].kor = sc.nextInt();
			System.out.println("학생의 영어 점수를 입력하세요.");
			students[i].eng = sc.nextInt();
			System.out.println("학생의 수학 점수를 입력하세요.");
			students[i].math = sc.nextInt();
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = students[i].sum/3.0;
			System.out.println("=================");

			//students[i]=stu;

		}//for

		return students;

	}//makeStudents



	//메서드명은 findByNum
	//번호를 스캐너로 입력 받아서 학생들 중에서 한 명 찾아서

	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 번호를 입력하세요.");
		int select = sc.nextInt();
		Student student = null;

		for(int i=0;i<students.length;i++) {
			if(select==students[i].num) {
				student=students[i];
				break;
			}
		}

		//int i = 0;

		//for(i=0;i<students.length;i++) {
		//if(select==students[i].num) {

		//break;
		//}
		//}

		return student;

	}//findByNum

}
