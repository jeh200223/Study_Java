import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        // 값을 담을 변수들을 선언한다.
        // 1부터 1씩 증가되는 숫자값
        int number = 1;
        // 사용자가 입력한 정수값
        int inputNumber;
        // 현재 숫자를 10으로 나눈 몫을 담을 변수
        int tempNumber = 0;
        // 짝의 개수를 담을 변수
        int clapCount = 0;

        // 사용자에게 정수를 입력 받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수값을 입력해주세요 : ");
        inputNumber = scanner.nextInt();

        // 1부터 1씩 증가하며 사용자가 입력한 정수까지 반복한다.
        while(number <= inputNumber) {
            // 현재숫자를 tempNumber 변수에 담아준다.
            tempNumber = number;
            // 짝의 개수를 0으로 초기화한다.
            clapCount = 0;
            // 현재 숫자를 10으로 나는 몫이 0이 아닐 때 까지 반복한다.
            do {
                // 현재 숫자를 10으로 나눈 나머지가 3의 배수인지를 검사한다.
                int a1 = tempNumber % 10;
                if (a1 % 3 == 0 && a1 != 0) {
                    // 짝의 개수를 증가시킨다.
                    clapCount++;
                }
                // 현재 숫자를 10으로 나눈 몫을 구해 다시 담아준다.
                tempNumber = tempNumber / 10;
            } while (tempNumber != 0);

            // 3의 배수가 없다면 그냥 출력한다.
            if (clapCount == 0) {
                System.out.println(number);
            }
            // 3의 배수가 있다면 3의 배수의 개수 만큼 짝을 출력한다.
            else {
                for(int i = 0 ; i < clapCount ; i++){
                    System.out.print("짝");
                }
                System.out.println();
            }
            // 현재 숫자를 증가시킨다.
            number++;
        }
    }
}