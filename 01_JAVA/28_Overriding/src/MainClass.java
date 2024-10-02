public class MainClass {
    public static void main(String[] args) {
        // 객체의 정보를 부모형 변수에 담아준다.
        SuperClass1 superClass1 = new SubClass1();
        // 부모가 가지고 있는 메서드 호출 (가능)
        superClass1.superMethod1();
        // 자식이 가지고 있는 메서드 호출 (오류)
        // superClass1.subMethod1();

        // 부모형 변수를 통해 메서드를 호출하면 자식에서 재 구현한(Overriding)
        // 메서드가 호출된다.
        superClass1.superMethod2();
    }
}

class SuperClass1{
    void superMethod1(){
        System.out.println("SuperClass1의 superMethod1 입니다");
    }
    void superMethod2(){
        System.out.println("SuperClass1의 superMethod2 입니다");
    }
}

class SubClass1 extends SuperClass1{
    void subMethod1(){
        System.out.println("SubClass1의 subMethod1 입니다");
    }

    // 부모의 메서드를 다시 구현한다.
    // @뭐뭐뭐 : 어노테이션. 주석과 비슷한 개념이지만 컴파일러나 VM에게 무언가를 알려주는 용도로 사용한다.
    // 컴파일러를 위한 어노테이션들은 class 파일을 생성할 때 참고할 정보를 알려주는 목적이고
    // VM을 위한 어노테이션들은 실행시 참고할 정보를 알려주는 목적으로 사용한다.
    // @Override : 컴파일 시 부모가 가진 메서드를 구현한 것인지 확인하라는 의미이다.
    @Override
    void superMethod2() {
        System.out.println("SubClass1의 superMethod2 입니다");
    }
}