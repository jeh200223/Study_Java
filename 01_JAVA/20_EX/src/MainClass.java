public class MainClass {
    public static void main(String[] args) {
        // 첫날은 100원로 설정한다.
        int number1 = 0;
        int number2 = 0;
        int number3 = 100;
        System.out.println("1일차 : 100원");
        // 2일차에서 부터 30일차까지 반복한다.
        for(int date = 2 ; date <= 30 ; date++) {
            // 전날 잔고액의 4배를 곱한다.
            number1 = number1 * 4;
            number2 = number2 * 4;
            number3 = number3 * 4;
            // 오버플로우 처리를 해준다.
            // 0 ~ 99999999로 제한할 것이기 때문에 1억으로 나눈 몫을 구해 다음 변수에 더해준다.
            number2 = number2 + (number3 / 100000000);
            // 1억으로 나눌때의 나머지를 구해 변수에 다시 담는다.
            number3 = number3 % 100000000;

            number1 = number1 + (number2 / 100000000);
            number2 = number2 % 100000000;

            // 출력한다.
            if(number1 != 0){
                System.out.printf("%d일차 : %d%08d%08d원\n", date, number1, number2, number3);
            } else if(number1 == 0 && number2 != 0){
                System.out.printf("%d일차 : %d%08d원\n", date, number2, number3);
            } else if(number1 == 0 && number2 == 0){
                System.out.printf("%d일차 : %d원\n", date, number3);
            }
        }
    }
}
