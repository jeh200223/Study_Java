public class MainClass {
    public static void main(String[] args) {
        // 변수를 정의할 때
        // 자료형 변수이름;
        // 형태로 작성 한다.

        // = : 대입 연산자. 우측에 있는 값을 좌측의 변수에 저장하는 연산자.
        // 정수형 변수
        // 1byte
        byte a1 = 100;
        // 2byte
        short a2 = 200;
        // 4byte
        int a3 = 300;
        // 8byte
        long a4 = 400;

        // 변수에 저장되어 있는 값을 사용하고자 할 때는 변수의 이름만 작성한다.
        System.out.printf("a1 : %d\n", a1);
        System.out.printf("a2 : %d\n", a2);
        System.out.printf("a3 : %d\n", a3);
        System.out.printf("a4 : %d\n", a4);

        System.out.printf("byte 크기 : %d\n", Byte.BYTES);
        System.out.printf("short 크기 : %d\n", Short.BYTES);
        System.out.printf("int 크기 : %d\n", Integer.BYTES);
        System.out.printf("long 크기 : %d\n", Long.BYTES);

        System.out.printf("byte : %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short : %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int : %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long : %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);

        // 실수 자료형
        float a5 = 11.11f;
        double a6 = 11.11;

        System.out.printf("a5 : %f\n", a5);
        System.out.printf("a6 : %f\n", a6);

        System.out.printf("float 크기 : %d\n", Float.BYTES);
        System.out.printf("double 크기 : %d\n", Double.BYTES);

        System.out.printf("float : %f ~ %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double : %f ~ %f\n", Double.MIN_VALUE, Double.MAX_VALUE);

        // 논리형
        boolean a7 = true;
        boolean a8 = false;

        System.out.printf("참 : %s\n", a7);
        System.out.printf("거짓 : %s\n", a8);

        // 문자
        // 글자 하나를 표현하기 위한 값
        // 내부적으로 정수값으로 관리한다.
        char a9 = 'a';

        System.out.printf("a9 : %c\n", a9);
        System.out.printf("char 용량  : %d\n", Character.BYTES);

        // 문자열
        // 사실은 기본 자료형은 아닙니다.
        // 문자열은 많이 사용하는 값이므로 다른 리터럴을 사용하는 것처럼 문법적으로 허용이 된다.
        String a10 = "문자열";
        System.out.printf("a10 : %s\n", a10);
    }
}
