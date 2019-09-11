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
		StudentView v = new StudentView();
		StudentInput si = new StudentInput();
		
		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체조회");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생삭제");
			System.out.println("5. 종      료");

			int select = sc.nextInt();

			switch(select) {
			case 1:
				students = si.makeStudents();
				
				break;

			case 2:
				v.viewAll(students);
				
				break;

			case 3:
				
				//findByNum이 실행
				Student student = si.findByNum(students);
				//								(보내줄 값)
				v.viewOne(student);

				break;
			
			case 4:
				
				System.out.println("학생 삭제 코드 실행");
				
				si.deleteStudent(students,select);
				
				
				
				break;
				
			default:
				check=!check;
			}//switch

		}//while

	}//main

}
