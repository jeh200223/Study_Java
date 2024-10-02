package com.lion.school;

import java.util.Scanner;

public class StudentClass {
    // 이름
    String studentName;
    // 나이
    int studentAge;
    // 학생이 소속된 운동부
    int studentType;


    // 학생들의 정보 중 공통 부분을 입력받는 메서드
    public void inputStudentInfoBase(Scanner scanner) {
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
    }

    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfoBase() {
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d살", studentAge);
    }

    // 달리는 기능
    public void run() {
        System.out.println("달린다");
    }


}
