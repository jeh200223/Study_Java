import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // 변수를 선언한다.
        // 사용자에게 입력받을 단수
        int dan;

        // 사용자에게 단수를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("단수를 입력해주세요 : ");
        dan = scanner.nextInt();

        // 구구단을 출력한다.
        // 출력 화면
        System.out.printf("%d단\n", dan);
//        System.out.println("5 X 1 = 5");
//        System.out.println("5 X 2 = 10");
//        System.out.println("5 X 3 = 15");
//        System.out.println("5 X 4 = 20");
//        System.out.println("5 X 5 = 25");
//        System.out.println("5 X 6 = 30");
//        System.out.println("5 X 7 = 35");
//        System.out.println("5 X 8 = 40");
//        System.out.println("5 X 9 = 45");
        for(int i = 0 ; i < 9 ; i++){
            int a1 = 1 + i;
            int a2 = dan + (i * dan);
            System.out.printf("%d X %d = %d\n", dan, a1, a2);
        }
    }
}
