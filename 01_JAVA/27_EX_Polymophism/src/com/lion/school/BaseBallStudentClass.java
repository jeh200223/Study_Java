package com.lion.school;

import java.util.Scanner;

public class BaseBallStudentClass extends StudentClass{

    // 안타 개수
    int HitCount;
    // 학생들의 정보를 입력받는 기능
    public void inputStudentInfo(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // 부모에 있는 메서드를 호출한다.
        inputStudentInfoBase(scanner);
        // 나머지를 입력받는다.
        System.out.print("안타 개수 : ");
        HitCount = scanner.nextInt();
    }
    // 학생들의 정보를 출력하는 기능
    public void showStudentInfo(){
        System.out.println();
        // 부모의 매서드를 호출한다.
        showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("안타 개수 : %d\n", HitCount);
    }
    // 공을 치는 기능
    public void HitBall(){
        System.out.println("안타를 친다");
    }
}
