package com.lion.school;

import java.util.Scanner;

public class BasketBallStudentClass extends StudentClass {

    // 키
    int height;

    // 학생들의 정보를 입력받는 메서드
    public void inputStudentInfo() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // 부모에 있는 메서드를 호출한다.
        inputStudentInfoBase(scanner);
        // 나머지를 입력받는다.
        System.out.print("키: ");
        height = scanner.nextInt();
    }

    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfo() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("키 : %d\n", height);
    }

    // 리바운드를 하는 기능
    public void rebound() {
        System.out.println("라바운드 한다");
    }
}
