public class MainClass {
    public static void main(String[] args) {
        TestClass1 t1 = new TestClass1();
        t1.testMethod1();

        t1.superMethod1();

        SuperClass1 superClass1 = new TestClass1();
        superClass1.superMethod1();

        TestClass2 t2 = new TestClass2();

    }
}

class SuperClass1{
    int memberA1 = 300;

    void superMethod1(){
        System.out.println("SuperClass1의 superMethod1");
    }
}

class TestClass1 extends SuperClass1{
    // 맴버 변수
    // 객체를 생성할 때 메모리에 생성되고 객체가 소멸될때 같이 소멸된다.
    // 객체가 살아있는 동안 계속 사용이 가능한 변수
    int memberA1 = 100;

    void testMethod1(){
        // 지역 변수
        // 매개 변수도 지역변수의 일종이다.
        // 매개 변수는 메서드가 호출 될 때 생성되고 메서드 수행이 끝나면 소멸된다.
        // 지역 변수는 변수 선언 부분을 만들 때 생성되고 변수가 생성된 곳의 수행이 끝나면 소멸된다.
        int memberA1 = 200;
        System.out.printf("memberA1 : %d\n", memberA1);
        // 만약 맴버 변수의 이름과 지역변수 혹은 매개변수의 이름이 같을 경우
        // 맴버 변수를 사용하고자 한다면 this를 통해 접근한다.
        System.out.printf("this.memberA1 : %d\n", this.memberA1);
        // 만약 맴버 변수의 이름과 부모 클래스에 정의 되어 있는 맴벼 변수의 이름이 같다면
        // 부모의 변수에 접근하고자 할 때 super를 사용한다.
        System.out.printf("super.memberA1 : %d\n", super.memberA1);

        // 자바는 변수의 사용 범위 (스코프)는 블럭 스코프를 적용하고 있다.
        // 변수를 선언한 블럭이 종료되면 해당 변수가 소멸된다.
        for(int i = 0 ; i < 10 ; i++){

        }
        // System.out.printf("i : %d\n", i);
        {
            int a1 = 100;
            System.out.printf("a1 : %d\n", a1);
        }
        // System.out.printf("a1 : %d\n", a1);
    }

    // overriding
    @Override
    void superMethod1() {
        // 자식클래스에서 부모가 가지고 있는 메서드를 호출하고자 할 때 super를 이용한다.
        super.superMethod1();
        System.out.println("TestClass1의 superMethod1");
    }
}

class SuperClass2{
    
    SuperClass2(){
        System.out.println("SuperClass2의 생성자 : 매개 변수 없음");
    }

    SuperClass2(int a1){
        System.out.println("SuperClass2의 생성자 : 정수형 매개변수 1개");
    }
}

class TestClass2 extends SuperClass2{

    // 생성자들
    TestClass2(){
        // 같은 클래스 안에는 무수히 많은 생성자가 존재할 수 있다.
        // 하지만 개발자는 객체를 생성할 때 단 하나의 생성자만 선택할 수 있고
        // 선택된 생성자만 동작을 한다.
        // 만약 생성자 안에서 다른 생성자에 구현한 코드가 필요하다면 this() 를 통해
        // 같은 클래스에 있는 다른 생성자를 호출할 수 있다.
        // 생성자에서 다른 생성자를 호출하고자 할 때는 무조건 제일 첫 번째 줄에 작성해야 한다.
        this(100);
        // 생성자 호출은 무조건 첫 번째 줄에만 작성할 수 있기 때문에 여러 생성자를 호출하는 것은 불가능하다.
        // this(100, 200);
        System.out.println("매개변수가 없는 생성자");
    }

    TestClass2(int a1){
        // 다른 생성자를 호출하는 코드를 작성하지 않으면 부모가 가진 생성자 중
        // 매개변수가 없는 생성자를 호출하게 된다.
        // 만약 부모가 가진 다른 생성자를 호출하겠다면 super를 통해 생성자를 선택할 수 있다.
        super(100);
        System.out.println("정수형 매개변수가 하나 있는 생성자");
    }
    TestClass2(int a2, int a3){
        System.out.println("정수형 매개변수가 두개 있는 생성자");
    }
}









