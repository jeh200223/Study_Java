package com.lion.school;

public class SchoolClass {
    // 학생 수를 담을 변수
    int studentCount;
    // 학생 객체들을 담을 배열
    SoccerStudentClass [] soccerArray;
    BaseBallStudentClass [] baseBallArray;
    BasketBallStudentClass [] basketBallArray;

    // 생성자
    public SchoolClass(){
        // 배열을 생성한다.
        soccerArray = new SoccerStudentClass[3];
        baseBallArray = new BaseBallStudentClass[3];
        basketBallArray = new BasketBallStudentClass[3];
    }

    // 학생 정보를 입력받는다.
    public void inputStudentInfo(){
        System.out.println("축구부 학생 정보 입력");
        for(int i = 0 ; i < 3 ; i++){
            // 축구부 학생 객체를 생성한다.
            SoccerStudentClass soccer = new SoccerStudentClass();
            // 축구부 학생 정보를 입력받는다.
            soccer.inputStudentInfo();
            // 객체를 배열에 담는다.
            soccerArray[i] = soccer;
        }

        System.out.println("야구부 학생 정보 입력");
        for(int i = 0 ; i < 3 ; i++){
            // 야구부 학생 객체를 생성한다.
            BaseBallStudentClass baseball = new BaseBallStudentClass();
            // 야구부 학생 정보를 입력받는다.
            baseball.inputStudentInfo();
            // 객체를 배열에 담는다.
            baseBallArray[i] = baseball;
        }

        System.out.println("농구부 학생 정보 입력");
        for(int i = 0 ; i < 3 ; i++){
            // 농구부 학생 객체를 생성한다.
            BasketBallStudentClass basketball = new BasketBallStudentClass();
            // 농구부 학생 정보를 입력받는다.
            basketball.inputStudentInfo();
            // 객체를 배열에 담는다.
            basketBallArray[i] = basketball;
        }
    }

    // 학생 정보를 출력한다.
    public void showStudentInfo(){
        System.out.println("축구부 선수 정보");
        for(SoccerStudentClass soccer : soccerArray){
            soccer.showStudentInfo();
            soccer.run();
            soccer.takkle();
        }

        System.out.println("야구부 선수 정보");
        for(BaseBallStudentClass baseball : baseBallArray){
            baseball.showStudentInfo();
            baseball.run();
            baseball.HitBall();
        }

        System.out.println("농구부 선수 정보");
        for(BasketBallStudentClass basketball : basketBallArray){
            basketball.showStudentInfo();
            basketball.run();
            basketball.rebound();
        }
    }

}
