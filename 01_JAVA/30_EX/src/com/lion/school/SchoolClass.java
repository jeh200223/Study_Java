package com.lion.school;

import java.util.Scanner;

public class SchoolClass {
    // 학생 객체들을 담을 배열
    StudentClass [] studentArray;
    // 학생 수를 담을 변수
    int studentCount;

    // 학생 수를 입력받는다.
    public void inputStudentCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 : ");
        studentCount = scanner.nextInt();
        studentArray = new StudentClass[studentCount];
    }

    // 학생 정보를 입력받는다.
    public void inputStudentInfo(){
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentCount ; i++){
            // 학생이 소속된 운동부를 입력받는다.
            // 1 : 축구부
            // 2 : 야구부
            // 3 : 농구부
            Scanner scanner = new Scanner(System.in);
            System.out.println("소속 운동부");
            System.out.println("1. 축구부");
            System.out.println("2. 야구부");
            System.out.println("3. 농구부");
            System.out.print("운동부 입력 : ");
            int studentType = scanner.nextInt();

            // 생성된 학생 객체를 담을 변수
            StudentClass studentClass = null;

            // 운동부에 따라 분기한다.
            switch (studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 학생 정보 입력");
                    // 축구부 학생 객체를 생성한다.
                    studentClass = new SoccerStudentClass(1);
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 학생 정보 입력");
                    // 야구부 학생 객체를 생성한다.
                    studentClass = new BaseBallStudentClass(2);
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 학생 정보 입력");
                    // 농구부 학생 객체를 생성한다.
                    studentClass = new BasketBallStudentClass(3);
                    break;
            }
            // 부모형 변수를 통해 자식에 구현해 놓은 정보를 입력받는
            // 메서드를 호출한다.
            studentClass.inputStudentInfoBase(scanner);
            // 배열에 담는다.
            studentArray[i] = studentClass;

        }
    }

    // 학생 정보를 출력한다.
    public void showStudentInfo(){
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentArray.length ; i++){
            // 정보를 출력하는 메서드를 호출한다.
            studentArray[i].showStudentInfoBase();
            studentArray[i].run();
            studentArray[i].doAction();
        }
    }
}
