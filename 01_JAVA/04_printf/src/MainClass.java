public class MainClass {
    public static void main(String[] args) {
        // %d : 정수
        System.out.printf("정수 : %d\n", 100);
        // %f : 실수
        System.out.printf("실수 : %f\n", 11.11);
        // %c : 글자
        System.out.printf("글자 : %c\n", 'a');
        // %s : 문자열
        System.out.printf("문자열 : %s\n", "문자열");

        System.out.printf("%f\n", 11.11);
        System.out.printf("%s\n", 11.11);
        System.out.printf("%s\n", true);

        System.out.println("이름은 " + "홍길동" + "이고 나이는" + 10 + "살 입니다");
        System.out.printf("이름은 %s이고 나이는 %d살 입니다", "홍길동", 10);
    }
}
