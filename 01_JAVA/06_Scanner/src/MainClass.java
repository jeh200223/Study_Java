import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Scanner
        // 자바에는 키보드로 입력받을 수 있는 다양한 도구들은 제공한다.
        // 그 중에서 가장 사용하기가 쉬운 도구가 Scanner
        Scanner scanner = new Scanner(System.in);

        // 정수값을 입력받는다.
        // 사용자가 입력할 때까지 코드의 흐름은 대기 상태가 된다.
        System.out.print("정수값 입력 : ");
        int a1 = scanner.nextInt();
        System.out.printf("a1 : %d\n", a1);

        System.out.print("실수값 입력 : ");
        double a2 = scanner.nextDouble();
        System.out.printf("a2 : %f\n", a2);

        System.out.print("문자열 입력 : ");
        String a3 = scanner.next();
        System.out.printf("a3 : %s\n", a3);
    }
}
