public class MainClass{
    public static void main(String[] args) {
        // 객체를 생성한다.
        // 생성자를 작성하지 않는 클래스는
        // 매개변수가 없는 생성자가 자동으로 추가된다.
        // 객체를 생성할 때 매개변수가 없는 생성자를 선택해야 한다.
        TestClass1 t1 = new TestClass1();
        System.out.printf("t1 : %s\n", t1);

        // TestClass2에는 생성자를 작성했다.
        // 생성자를 작성해두면 매개변수가 없는 생성자가 자동으로 추가되지 않는다.
        // 따라서 매개변수가 없는 생성자를 추가로 작성해주지 않으면
        // 매개변수가 없는 생성자는 선택할 수 없다.
        // TestClass2 t2 = new TestClass2();
        TestClass2 t2 = new TestClass2(100);
        System.out.printf("t2 : %s\n", t2);

        TestClass3 t30 = new TestClass3();
        TestClass3 t31 = new TestClass3(100);
        TestClass3 t32 = new TestClass3(11.11);
        TestClass3 t34 = new TestClass3(100, 11.11);

    }
}

// 클래스를 통해 객체를 생성하면 생성자가 무조건 동작한다.
// 클래스를 작성할 때 생성자를 작성하지 않았다면
// 매개변수가 없고 코드가 없는 생성자가 자동으로 추가된다.
class TestClass1{

}

class TestClass2{
    // 생성자
    // 생성자는 반환 타입이 없고 클래스의 이름과 동일하게 해준다.
    TestClass2(int a1){
        System.out.printf("TestClass2의 생성자(int a1) : %d\n", a1);
    }
}

// 매개변수의 형태만 다르게 한다면 하나의 클래스는 다수의 생성자를 가질 수 있다.
// 단 객체를 생성할 때는 하나의 생성자만 선택할 수 있다.
class TestClass3{

    TestClass3(){
        System.out.println("매개변수가 없는 생성자");
    }

    TestClass3(int a1){
        System.out.println("int a1 생성자");
    }

    TestClass3(double a1){
        System.out.println("double a1 생성자");
    }

    TestClass3(int a1, double a2){
        System.out.println("int a1, double a2 생성자");
    }
}









