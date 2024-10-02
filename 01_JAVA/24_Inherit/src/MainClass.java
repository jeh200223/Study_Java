public class MainClass {
    public static void main(String[] args) {
        // SubClass1을 통해 객체를 생성한다.
        SubClass1 sub1 = new SubClass1();
        System.out.printf("sub1.superMemberA : %d\n", sub1.superMemberA);
        System.out.printf("sub1.subMemberA : %d\n", sub1.subMemberA);
        sub1.superMethod1();
        sub1.subMethod1();
    }
}

class SuperClass1{
    int superMemberA = 100;

    void superMethod1(){
        System.out.println("SuperClass1의 superMethod1 입니다");
    }
}

// SuperClass1을 상속받은 클래스
class SubClass1 extends SuperClass1{
    int subMemberA = 200;

    void subMethod1(){
        System.out.println("SubMethod1의 subMethod1 입니다");
        // 자식클래스는 부모클래스가 가지고 있는 요소들을 자유롭게 사용할 수 있다.
        System.out.printf("superMemberA : %d\n", superMemberA);
        superMethod1();
    }
}
