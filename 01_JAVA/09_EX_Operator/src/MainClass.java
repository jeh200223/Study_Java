import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        // 데이터를 담을 변수를 선언
        String name;
        int age;
        int kor;
        int eng;
        int math;
        int total;
        int avg;

        // 필요한 데이터를 입력받는다.
        Scanner scanner = new Scanner(System.in);

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

        // 총점과 평균을 계산한다
        total = kor + eng + math;
        avg = total / 3;

        // 결과 출력
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n살", age);
        System.out.printf("국어점수 : %d점\n", kor);
        System.out.printf("영어점수 : %d점\n", eng);
        System.out.printf("수학점수 : %d점\n", math);
        System.out.printf("총점 : %d점\n", total);
        System.out.printf("평균 : %d점\n", avg);
    }
}
