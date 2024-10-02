package com.lion.school;

import java.util.Scanner;

public class SoccerStudentClass extends StudentClass{
    // 골 넣은 횟수
    int goalCount;
    // 학생 정보를 입력받는 메서드
    public void inputStudentInfo(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // 부모에 있는 메서드를 호출한다.
        inputStudentInfoBase(scanner);
        // 나머지를 입력받는다.
        System.out.print("넣은 골 개수 : ");
        goalCount = scanner.nextInt();
    }
    // 학생 정보를 출력하는 메서드
    public void showStudentInfo(){
        System.out.println();
        // 부모의 매서드를 호출한다.
        showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("넣은 골 개수 : %d\n", goalCount);
    }
    // 태클하는 메서드
    public void takkle(){
        System.out.println("태클 한다");
    }
}
