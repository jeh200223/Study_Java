public class MainClass {
    public static void main(String[] args) {

    }
}

// final class
final class TestClass1{

}

// final class를 상속 받는다. : 오류
// class TestClass2 extends TestClass1{
//
// }

// final method
class TestClass3{
    final void testMethod3(){
        System.out.println("testMethod3");
    }
}

class TestClass4 extends TestClass3{
    // final로 정의된 메서드는 overriding이 불가능하다.
    // void testMethod3(){

    // }
}

class TestClass5{
    // final 변수는 나중에 값을 저장하는 것이 불가능하기 때문에
    // 변수를 선언할 때 관리할 값을 지정해줘야 한다.
    final int memberA1 = 100;

    void testMethod5(){
        // final 변수는 새로운 값을 저장할 수 없다.
        // memberA1 = 1000;
    }
}

class TestClass6{
    final int memberA1 = 100;

    public void testMethod1(){
        // 기본 자료형 값을 가지고 있는 final 변수를 사용하는 모든 코드들은
        // 컴파일 단계에서 실제 값으로 모두 변경된다.
        System.out.printf("memberA1 : %d\n", memberA1);
    }
}






