package com.lion.data;

import java.util.Scanner;

public class SchoolClass {
    // 전체 총점
    int total = 0;
    // 전체 평균
    int avg;
    // 학생수를 담을 변수
    int studentCnt;
    // 학생 객체들을 담을 배열
    StudentClass [] studentArray;

    // 학생수를 입력받는 메서드
    public void setStudentCnt(){
        Scanner scanner = new Scanner(System.in);
        // 학생수를 입력받는다.
        System.out.print("학생 수를 입력해주세요 : ");
        studentCnt = scanner.nextInt();

        // 학생의 수 만큼 기억장소를 관리하는 배열을 생성한다.
        studentArray = new StudentClass[studentCnt];

        // 입력받은 학생 수 만큼 객체를 생성해서 배열에 담아준다.
        for(int i = 0 ; i < studentCnt ; i++){
            studentArray[i] = new StudentClass();
        }
    }

    // 학생들의 정보를 입력받는 메서드
    public void setStudentInfo(){
        // 학생의 수 만큼 반복한다.
        for(StudentClass s1 : studentArray) {
            // 학생의 정보를 입력받는다.
            s1.setStudentInfo();
            // 학생의 총점과 평균을 구한다.
            s1.setStudentTotalAndAvg();
        }
    }

    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfo(){
        // 학생의 수 만큼 반복
        for(StudentClass s1 : studentArray) {
            // 학생 정보를 출력한다.
            s1.showStudentInfo();
        }
    }

    // 학생 전체의 총점과 평균을 구하는 메서드
    public void setTotalAndAvg(){
        // 학생의 수 만큼 반복한다.
        for(StudentClass s1 : studentArray) {
            // 학생의 총점을 전체 총점에 누적한다.
            total = total + s1.total;
        }
        // 평균을 구한다.
        avg = total / (studentCnt * 3);
    }

    // 학생 전체의 총점과 평균을 출력하는 메서드
    public void showTotalAndAvg(){
        System.out.println();
        System.out.printf("전체 총점 : %d점\n", total);
        System.out.printf("전체 평균 : %d점\n", avg);
    }
}
