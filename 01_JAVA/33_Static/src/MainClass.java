public class MainClass {
    public static void main(String[] args) {
        TestClass1 t1 = new TestClass1();
        TestClass1 t2 = new TestClass1();

        // 정적 맴버 사용
        System.out.printf("t1.memberA2 : %d\n", t1.memberA2);
        System.out.printf("t2.memberA2 : %d\n", t2.memberA2);
        System.out.printf("TestClass1.memberA2 : %d\n", TestClass1.memberA2);

        // 정적 변수는 객체를 생성했다고 해서 계속 생성되는 변수가 아니고 딱 하나만 존재한다.
        // 따라서 어떻게 접근하든 모두 같은 기억장소를 사용하게 된다.
        TestClass1.memberA2 = 2000;
        System.out.printf("t1.memberA2 : %d\n", t1.memberA2);
        System.out.printf("t2.memberA2 : %d\n", t2.memberA2);
        System.out.printf("TestClass1.memberA2 : %d\n", TestClass1.memberA2);

        t1.memberA1 = 1000;
        System.out.printf("t1.memberA1 : %d\n", t1.memberA1);
        System.out.printf("t2.memberA1 : %d\n", t2.memberA1);
        // 클래스의 이름을 통해 일반 맴버 변수를 사용하는 것은 불가능하다.
        // System.out.printf("TestClass1.memberA1 : %d\n", TestClass1.memberA1);

        t1.method1();
        t2.method1();
        // 정적 메서드가 아니기 때문에 호출 불가
        //TestClass1.method1();

        // 정적 메서드 호출
        t1.method2();
        t2.method2();
        TestClass1.method2();
    }
}

class TestClass1{
    // 맴버 변수
    int memberA1 = 100;
    // 정적 변수
    static int memberA2 = 200;

    // 맴버 메서드
    void method1(){
        System.out.println("맴버 메서드");
    }
    // 정적 메서드
    static void method2(){
        System.out.println("정적 메서드");
    }

    void testMethod1(){
        // Method1은 맴버 메서드이다. 맴버 메서드는 객체를 생성해야지만
        // 사용할 수 있는 메서드이다. 따라서 이 메서드가 호출이 되었다는 것은
        // 객체가 생성되어 있다는 것이 되고 맴버들이 메모리상에 만들어져 있다는 것을 보장받을 수 있기 때문에
        // 사용할 수 있다.
        // 맴버 변수 : 가능
        memberA1 = 1000;
        // 맴버 메서드 : 가능
        method1();
        // 정적 변수나 메서드들은 프로그램이 실행되면 무조건 메모리에 생성된다.
        // 객체 생성은 프로그램이 실행되고 객체를 생성하는 코드가 수행될 때 객체가 생성된다.
        // 즉 정적 변수나 메서드가 메모리에 자리를 잡는 시기는 객체가 생성되기 전이다.
        // 정적 변수 : 가능
        memberA2 = 2000;
        // 정적 메서드 : 가능
        method2();
    }

    static void testMethod2(){
        // 정적 메서드는 객체를 생성하지 않아도 호출할 수 있는 메서드이다.
        // 허나 맴버 변수와 맴버 메서드는 객체를 생성해야지만 사용할 수 있는 변수와 메서드이다.
        // 이에 정적 메서드가 호출된 시점에 객체가 생성되어 있다는 것을 보장받을 수 없다.
        // 따라서 사용이 불가능하다.
        // 맴버 변수
        // memberA1 = 1000;
        // 맴버 메서드
        // method1();

        // 정적 메서드는
        // 다른 정적 메서드나 정적 변수, 매개변수와 지역변수만 사용이 가능하고
        // 맴버 변수와 맴버 메서드는 사용이 불가능하다.
        memberA2 = 2000;
        method2();
    }
}







