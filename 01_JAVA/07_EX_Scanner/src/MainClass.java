//학생의 정보를 입력받는다.
//학생의 정보는 이름, 나이, 국어점수, 수학점수, 영어점수로 구성되어 있다.
//
//학생의 정보를 입력받고 입력받은 정보를 출력한다.
//
//입력부터 먼저 다 받고 출력을 해주세요

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        // 필요한 데이터를 담을 변수를 선언한다.
        String name;
        int age;
        int kor;
        int math;
        int eng;

        // 키보드로 부터 각 정보를 입력 받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor = scanner.nextInt();
        System.out.print("수학점수 : ");
        math = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng = scanner.nextInt();


        // 화면 구성
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d살\n", age);
        System.out.printf("국어점수 : %d점\n", kor);
        System.out.printf("수학점수 : %d점\n", math);
        System.out.printf("영어점수 : %d점\n", eng);
    }
}
