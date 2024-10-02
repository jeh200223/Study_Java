package com.lion.data;

import java.util.Scanner;

public class StudentClass {
    // 학생번호
    int idx;
    // 이름
    String name;
    // 나이
    int age;
    // 국어점수
    int kor;
    // 영어점수
    int eng;
    // 수학점수
    int math;
    // 총점
    int total;
    // 평균
    int avg;

    // 학생 1명의 정보를 입력받는 메서드
    void setStudentInfo(){
        // 학생의 정보를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("학생번호 : ");
        idx = scanner.nextInt();
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng = scanner.nextInt();
        System.out.print("수학점수 : ");
        math = scanner.nextInt();
    }
    // 입력받은 점수를 통해 총점과 평균을 구하는 메서드
    void setStudentTotalAndAvg(){
        // 총점을 구한다.
        total = kor + eng + math;
        // 평균을 구한다.
        avg = total / 3;
    }
    // 각 학생에 대한 정보를 출력하는 메서드
    void showStudentInfo(){
        System.out.println();
        System.out.printf("학생 번호 : %d\n", idx);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d살\n", age);
        System.out.printf("국어점수 : %d점\n", kor);
        System.out.printf("영어점수 : %d점\n", eng);
        System.out.printf("수학점수 : %d점\n", math);
        System.out.printf("총점 : %d점\n", total);
        System.out.printf("평균 : %d점\n", avg);
    }
}
