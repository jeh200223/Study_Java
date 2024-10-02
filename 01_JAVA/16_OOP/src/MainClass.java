public class MainClass {
    public static void main(String[] args) {
        // 객체를 생성한다.
        new TestClass1();
        // 객체를 생성하면 객체에 접근할 수 있는 정보가 전달된다.
        // 이를 변수에 담아두면 필요할 때 생성된 객체에 접근할 수 있다.
        TestClass1 t1 = new TestClass1();
        System.out.printf("t1 : %s\n", t1);

        TestClass1 t2 = new TestClass1();
        System.out.printf("t2 : %s\n", t2);

        // 객체의 맴버 변수에 값을 저장한다.
        t1.memberA1 = 100;
        t1.memberA2 = "문자열1";

        t2.memberA1 = 200;
        t2.memberA2 = "문자열2";
        // 객체의 맴버 변수를 사용한다.
        System.out.printf("t1.memberA1 : %d\n", t1.memberA1);
        System.out.printf("t1.memberA2 : %s\n", t1.memberA2);

        System.out.printf("t2.memberA1 : %d\n", t2.memberA1);
        System.out.printf("t2.memberA2 : %s\n", t2.memberA2);

        // 객체의 맴버 메서드를 호출한다.
        t1.testMethod1();
        t2.testMethod1();

        // 매개변수가 있는 메서드를 호출할 때는 반드시 값을 전달해야 한다.
        t1.testMethod2(10, 20);
        t2.testMethod2(100, 200);

        t1.testMethod3(2);
        t1.testMethod3(0);

        // 값을 반환하는 메서드를 호출한다.
        int k1 = t1.testMethod4(10, 20);
        System.out.printf("k1 : %d\n", k1);
    }
}

// 클래스를 작성한다.
class TestClass1{
    // 맴버 변수를 정의한다.
    int memberA1;
    String memberA2;

    // 맴버 메서드를 정의한다.
    void testMethod1(){
        System.out.println("TestClass1의 testMethod1이 호출되었습니다");
        System.out.printf("memberA1 : %d\n", memberA1);
        System.out.printf("memberA2 : %s\n", memberA2);
    }

    // 매개 변수
    // 메서드를 호출할 때 값을 전달할 수 있다.
    // 이 전달하는 값을 매개변수를 통해 받을 수 있다.
    void testMethod2(int a1, int a2){
        System.out.printf("memberA + a1 + a2 : %d\n", memberA1 + a1 + a2);
    }

    // return
    // 메서드 내부의 코드가 남아 있다고 하더라도 메서드의 수행을 중단시키고
    // 메서드를 호출한 쪽으로 코드의 흐름을 되돌리는 의미의 키워드이다.
    void testMethod3(int a1){
//        if(a1 != 0){
//            System.out.printf("10을 a1으로 나누면 %d 입니다\n", 10 / a1);
//        } else {
//            System.out.println("10은 0으로 나눌 수 없습니다");
//        }

        if(a1 == 0){
            System.out.println("10은 0으로 나눌 수 없습니다");
            return;
        }

        System.out.printf("10을 a1으로 나누면 %d 입니다\n", 10 / a1);
    }

    // return 은 메서드를 호출한 쪽으로 되돌아가 갈때 값 하나를 전달할 수 있다.
    // 이 때, 전달할 값의 타입을 명시해야 한다.
    // 만약 전달할 값이 없다면 void 라고 명시한다.
    int testMethod4(int a1, int a2){
        int r1 = a1 + a2;
        return r1;
    }
}









