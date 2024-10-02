import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // 필요한 변수들을 선언한다.
        // 총점
        int total;
        // 평균
        int avg;
        // 사용자가 입력한 정수값
        int inputNumber;
        // 사용자가 입력한 숫자의 개수
        int inputCount;

        Scanner scanner = new Scanner(System.in);

        // 총합은 누적을 할 것이기 때문에 초기값으로 0을 설정한다.
        total = 0;
        // 입력한 숫자의 개수를 누적할 것이기 때문에 초기값으로 0을 설정한다.
        inputCount = 0;

        // 사용자가 0을 입력할 때 까지 반복해서 입력을 받는다.
        do {
            // 정수를 입력 받는다.
            System.out.print("정수값을 입력해주세요 : ");
            inputNumber = scanner.nextInt();

            // 0이 아닐 경우에만..
            if(inputNumber != 0) {
                // 입력한 숫자를 누적하여 총점을 계산한다.
                // total += inputNumber;
                total = total + inputNumber;
                // 입력한 숫자의 개수를 1 증가시킨다.
                // inputCount = inputCount + 1;
                inputCount++;
            }
        }while(inputNumber != 0);

        // 입력이 완료되면 평균을 구한다.
        avg = total / inputCount;

        // 출력 화면
        System.out.printf("총점 : %d\n", total);
        System.out.printf("평균 : %d\n", avg);
    }
}
