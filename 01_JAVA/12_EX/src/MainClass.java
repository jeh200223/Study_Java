public class MainClass {
    public static void main(String[] args) {
        // 변수를 선언한다.
        // 7의 배수를 담을 변수
        int number7 = 0;
        // 누적값을 담을 변수
        int sumNumber = 0;

        // 누적합이 1000이 넘어갈 때까지 반복한다.
        do {
            // 7의 배수를 누적한다.
            number7 = number7 + 7;
            sumNumber = sumNumber + number7;
        }while(sumNumber <= 1000);

        // 출력 화면 구성
        System.out.printf("누적값이 1000이 넘어갈때의 7의 배수 : %d\n", number7);
    }
}
