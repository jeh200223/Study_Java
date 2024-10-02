public class MainClass {
    public static void main(String[] args) {
        // 일반 중첩 클래스의 내부클래스의 객체를 생성하기 위해서는
        // 외부 클래스의 객체가 필요한다.
        // 일반 중첩 클래스의 내부 클래스는 외부 클래스의 맴버이다.
        // 따라서 맴버를 사용하기 위해서는 객체를 생성해야 하기 때문이다.
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass1 innerClass1 = outerClass1.new InnerClass1();
        System.out.printf("%s\n", innerClass1);

        // static 중첩 클래스의 객체를 생성한다.
        // 외부 클래스의 객체가 없이 바로 생성이 가능하다.
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
        System.out.printf("%s\n", innerClass2);

        // 익명 중첩 클래스
        // TestClass100을 상속 받은 이름이 없는 클래스가 만들어지고 TestClass100(부모클래스)가 가진
        // 메서드를 overriding 한 경우가 된다. 그리고 바로 객체를 생성해서 객체의 정보를 반환해준다.
        TestClass100 t100 = new TestClass100(){
            @Override
            public void testMethod1() {
                System.out.println("익명 중첩 클래스의 testMethod1");
            }
        };
        t100.testMethod1();
    }
}

// 일반 중첩 클래스
class OuterClass1{

    int outerMember1 = 100;

    void outerMethod1(){
        // 내부 클래스의 맴버 사용
        // 외부 클래스의 객체가 생성되었다고 해서 자동으로
        // 내부 클래스의 객체가 생성되는 것이 아니기 때문에
        // 외부 클래스는 내부 클래스의 맴버 사용이 불가능하다.
        // innerMember1 = 2000;
        // innerMethod1();
    }

    class InnerClass1{

        int innerMember1 = 200;

        void innerMethod1(){
            // 외부 클래스의 맴버 사용
            // 내부 클래스를 통해 객체를 생성하려면 외부 클래스의
            // 객체가 생성되어 있어야 한다.
            // 이에 내부 클래스는 외부 클래스의 맴버를 자유롭게 사용할 수 있다.
            outerMember1 = 1000;
            outerMethod1();
        }
    }
}

// static 중첩 클래스
class OuterClass2{

    int outerMember1 = 100;

    void outerMethod1(){
        // 내부 클래스의 맴버 사용
        // 외부 클래스의 객체가 생성되었다고 해서 자동으로
        // 내부 클래스의 객체가 생성되는 것이 아니기 때문에
        // 외부 클래스는 내부 클래스의 맴버 사용이 불가능하다.
        // innerMember1 = 2000;
        // innerMethod1();
    }

     static class InnerClass2{
         int innerMember1 = 200;

         void innerMethod1(){
             // 외부 클래스의 맴버 사용
             // static 중첩클래스는 외부 클래스의 객체 없이 바로 생성이 가능하다.
             // 이에 내부 클래스의 객체가 생성되었을 때 외부 클래스를 통해 만든 객체가 있다는 것을
             // 완벽하게 보장 받을 수 없기 때문에 외부 클래스에 정의한 맴버를 사용하는 것이 불가능하다.
             // outerMember1 = 1000;
             // outerMethod1();
         }
     }
}

class OuterClass3 {

    int memberA1 = 100;

    void method1(){

        int memberA2 = 200;

        // 메서드 내부의 중첩클래스
        class LocalClass{
            void localMethod(){
                // 외부 클래스의 맴버 사용
                memberA1 = 1000;
                // 지역 변수 사용
                // final 변수만 사용이 가능하다.
                // 따라서 지역 변수에 값을 새롭게 저장하는 것은 불가능하고
                // 값을 가져다 사용하는 것만 가능하다.
                // memberA2 = 2000;
            }
        }
        // 중첩 클래스의 객체를 생성한다.
        LocalClass localClass = new LocalClass();
    }

    void method2(){
        // 다른 메서드에 작성한 지역 중첩 클래스의 객체를 생성한다.
        // 사용할 수 없다.
        // LocalClass localClass = new LocalClass();
    }
}

class TestClass100{

    public void testMethod1(){
        System.out.println("TestClass100의 testMethod1");
    }
}




