package com.arc.ex1_school;

import java.util.Scanner;

public class SchoolMain3 {

	public static void main(String[] args) {
		//1. 성적입력
		//학생의 수를 입력
		//이름, 번호, 국어, 영어, 수학 입력
		//2. 전체조회
		//전체 정보 출력
		//3. 학생검색
		//학생의 번호 입력
		//해당 학생의 정보만 출력
		//4. 종료

		Scanner sc = new Scanner(System.in);
		int i =0;
		boolean check = true;
		Student [] students = null;


		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체조회");
			System.out.println("3. 학생검색");
			System.out.println("4. 종      료");

			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("학생의 수를 입력하세요.");
				select = sc.nextInt();
				students = new Student [select];

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
				break;

			case 2:
				StudentView v = new StudentView();
				
				v.viewAll(students);
				
				break;

			case 3:
				System.out.println("학생의 번호를 입력하세요.");
				select = sc.nextInt();
				boolean flag = false;//false면 못 찾은 거.

				for(i=0;i<students.length;i++) {
					if(select==students[i].num) {
						System.out.println(students[i].name);
						System.out.println(students[i].num);
						System.out.println(students[i].kor);
						System.out.println(students[i].eng);
						System.out.println(students[i].math);
						System.out.println(students[i].sum);
						System.out.println(students[i].avg);
						System.out.println("======");
						flag = true;
						break;
					}//if
				}//for

				if(!flag) {
					System.out.println("해당 번호가 없습니다.");
				}

				break;

			default:
				check=!check;
			}//switch

		}//while

	}//main

}
