public class MainClass {
    public static void main(String[] args) {
        // SubClass1을 통해 객체를 생성한다.
        // 이 때, SubClass1 타입 변수에 담는다.
        SubClass1 sub1 = new SubClass1();
        System.out.printf("sub1.subMember1 : %d\n", sub1.subMember1);
        sub1.subMethod1();

        System.out.printf("sub1.superMember1 : %d\n", sub1.superMember1);
        sub1.superMethod1();

        // SubClass1을 통해 객체를 생성한다.
        // 부모인 SuperClass1 타입 변수에 담는다.
        // SuperClass1을 상속받는 클래스가 다양하게 있다고 하더라도
        // 그 클래스들을 통해 생성한 모든 객체들은 부모 타입형 변수에 담을 수 있다.
        // 하지만 SuperClass1 타입형 변수에는 SuperClass1을 가지고 만든 객체의 정보가
        // 담겨 있을 수도 있기 때문에 SuperClass1 영역에만 접근이 가능하다.
        SuperClass1 super1 = new SubClass1();
        System.out.printf("super1.superMember1 : %d\n", super1.superMember1);
        super1.superMethod1();

        // System.out.printf("super1.subMember1 : %d\n", super1.subMember1);
        // super1.subMethod1();

        // 만약 부모형 변수에 담긴 객체의 정보를 자식형에 담겠다면 형변환을 해주면 된다.
        // 만약 변환할 수 없는 상황이라면(객체를 생성할 때 사용한 클래스가 변환할 타입과 관련이 없다면)
        // 오류가 발생한다.
        SubClass1 sub2 = (SubClass1) super1;
        System.out.printf("sub2.subMember1 : %d\n", sub2.subMember1);
        sub2.subMethod1();
    }
}

class SuperClass1{

    int superMember1 = 100;

    void superMethod1(){
        System.out.println("SuperClass1의 superMethod1 입니다");
    }
}

class SubClass1 extends SuperClass1{

    int subMember1 = 200;

    void subMethod1(){
        System.out.println("SubClass1의 subMethod1 입니다");
    }
}









