package com.lion.main;

import com.lion.school.SchoolClass;

public class MainClass {
    public static void main(String[] args) {
        // 학교 객체를 생성한다.
        SchoolClass schoolClass = new SchoolClass();
        // 학생 정보를 입력받는다.
        schoolClass.inputStudentInfo();
        // 학생 정보를 출력한다.
        schoolClass.showStudentInfo();
    }
}
