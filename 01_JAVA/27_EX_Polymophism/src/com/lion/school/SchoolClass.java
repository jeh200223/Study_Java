package com.lion.school;

import java.util.Scanner;

public class SchoolClass {
    // 학생 객체들을 담을 배열
    StudentClass [] studentArray;
    // 학생 수를 담을 변수
    int studentCount;

    // 생성자
    public SchoolClass(){

    }

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

            // 운동부에 따라 분기한다.
            switch (studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 학생 정보 입력");
                    // 축구부 학생 객체를 생성한다.
                    SoccerStudentClass soccer = new SoccerStudentClass();
                    // 운동부 타입 값을 넣어준다.
                    soccer.studentType = 1;
                    // 축구부 학생 정보를 입력받는다.
                    soccer.inputStudentInfo();
                    // 객체를 배열에 담는다.
                    studentArray[i] = soccer;
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 학생 정보 입력");
                    // 야구부 학생 객체를 생성한다.
                    BaseBallStudentClass baseball = new BaseBallStudentClass();
                    // 운동부 타입 값을 넣어준다.
                    baseball.studentType = 2;
                    // 야구부 학생 정보를 입력받는다.
                    baseball.inputStudentInfo();
                    // 객체를 배열에 담는다.
                    studentArray[i] = baseball;
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 학생 정보 입력");
                    // 농구부 학생 객체를 생성한다.
                    BasketBallStudentClass basketball = new BasketBallStudentClass();
                    // 운동부 타입 값을 넣어준다.
                    basketball.studentType = 3;
                    // 농구부 학생 정보를 입력받는다.
                    basketball.inputStudentInfo();
                    // 객체를 배열에 담는다.
                    studentArray[i] = basketball;
                    break;
            }
        }
    }

    // 학생 정보를 출력한다.
    public void showStudentInfo(){
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentArray.length ; i++){
            // 학생 객체의 타입별로 분기한다.
            switch (studentArray[i].studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 선수 정보");
                    SoccerStudentClass soccer = (SoccerStudentClass) studentArray[i];
                    soccer.showStudentInfo();
                    soccer.run();
                    soccer.takkle();
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 선수 정보");
                    BaseBallStudentClass baseball = (BaseBallStudentClass) studentArray[i];
                    baseball.showStudentInfo();
                    baseball.run();
                    baseball.HitBall();
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 선수 정보");
                    BasketBallStudentClass basketball = (BasketBallStudentClass) studentArray[i];
                    basketball.showStudentInfo();
                    basketball.run();
                    basketball.rebound();
                    break;
            }
        }
    }

}
