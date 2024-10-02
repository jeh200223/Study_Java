import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        // 변수를 선언한다.
        // 학생 번호
        int idx1, idx2, idx3;
        // 학생 이름
        String name1, name2, name3;
        // 나이
        int age1, age2, age3;
        // 국어점수
        int kor1, kor2, kor3;
        // 영어점수
        int eng1, eng2, eng3;
        // 수학점수
        int math1, math2, math3;
        // 총점
        int total1, total2, total3;
        // 평균
        int avg1, avg2, avg3;
        // 전체 총점
        int totalAll;
        // 전체 평균
        int avgAll;

        // 학생의 정보를 입력받는다
        Scanner scanner = new Scanner(System.in);
        // 첫 번째 학생
        idx1 = 1;
        System.out.print("이름 : ");
        name1 = scanner.next();
        System.out.print("나이 : ");
        age1 = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor1 = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng1 = scanner.nextInt();
        System.out.print("수학점수 : ");
        math1 = scanner.nextInt();
        total1 = kor1 + eng1 + math1;
        avg1 = total1 / 3;

        // 두 번째 학생
        idx2 = 2;
        System.out.print("이름 : ");
        name2 = scanner.next();
        System.out.print("나이 : ");
        age2 = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor2 = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng2 = scanner.nextInt();
        System.out.print("수학점수 : ");
        math2 = scanner.nextInt();
        total2 = kor2 + eng2 + math2;
        avg2 = total2 / 3;

        // 세 번째 학생
        idx3 = 3;
        System.out.print("이름 : ");
        name3 = scanner.next();
        System.out.print("나이 : ");
        age3 = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor3 = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng3 = scanner.nextInt();
        System.out.print("수학점수 : ");
        math3 = scanner.nextInt();
        total3 = kor3 + eng3 + math3;
        avg3 = total3 / 3;

        // 전체 총점과 전체 평균을 구한다.
        totalAll = total1 + total2 + total3;
        avgAll = totalAll / 9;

        // 출력 화면
        System.out.printf("%d번학생\n", idx1);
        System.out.printf("이름 : %s\n", name1);
        System.out.printf("나이 : %d살\n", age1);
        System.out.printf("국어점수 : %d점\n", kor1);
        System.out.printf("영어점수 : %d점\n", eng1);
        System.out.printf("수학점수 : %d점\n", math1);
        System.out.printf("총점 : %d점\n", total1);
        System.out.printf("평균 : %d점\n", avg1);
        System.out.println();

        System.out.printf("%d번학생\n", idx2);
        System.out.printf("이름 : %s\n", name2);
        System.out.printf("나이 : %d살\n", age2);
        System.out.printf("국어점수 : %d점\n", kor2);
        System.out.printf("영어점수 : %d점\n", eng2);
        System.out.printf("수학점수 : %d점\n", math2);
        System.out.printf("총점 : %d점\n", total2);
        System.out.printf("평균 : %d점\n", avg2);
        System.out.println();

        System.out.printf("%d번학생\n", idx3);
        System.out.printf("이름 : %s\n", name3);
        System.out.printf("나이 : %d살\n", age3);
        System.out.printf("국어점수 : %d점\n", kor3);
        System.out.printf("영어점수 : %d점\n", eng3);
        System.out.printf("수학점수 : %d점\n", math3);
        System.out.printf("총점 : %d점\n", total3);
        System.out.printf("평균 : %d점\n", avg3);
        System.out.println();

        System.out.printf("전체 총점 : %d점\n", totalAll);
        System.out.printf("전체 평균 : %d점\n", avgAll);
    }
}
