package com.lion.main;

import com.lion.data.SchoolClass;

public class MainClass {
    public static void main(String[] args) {
        // 학교 객체를 생성한다.
        SchoolClass schoolClass = new SchoolClass();
        // 학생수를 입력받는다.
        schoolClass.setStudentCnt();
        // 학생들의 정보를 입력받는다.
        schoolClass.setStudentInfo();
        // 전체 총점과 평균을 구한다.
        schoolClass.setTotalAndAvg();
        // 학생들의 정보를 출력한다.
        schoolClass.showStudentInfo();
        // 전체 총점과 평균을 출력한다.
        schoolClass.showTotalAndAvg();
    }
}
