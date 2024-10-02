// 패키지 않에 있는 java 파일은 어떤 패키지 있는 파일인지를 명시해줘야 한다.
package com.lion.main;

// 이 파일에서 사용하는 TestClass2는 com.lion.pkg1에 있는 것이라는 것을 명시한다.
import com.lion.pkg1.TestClass2;
// 만약 패키지가 다르지만 클래스 이름이 동일할 경우 import로 모두 명시하지 못한다.
// 이는 import로 명시하는 목적 자체가 패키명을 생략하고 클래스명만 사용하기 위함이다.
// 따라서 클래스이름만 작성할 경우 어떤 패키지의 클래스인지 판단하기 어렵기 때문이다.
// 이럴 때는 모두 import 하지 않고 패키지명을 명시해서 사용하거나
// 하나면 import로 명시하고 나머지는 패키명을 명시해서 사용해야 한다.
import com.lion.pkg1.TestClass3;
//import com.lion.pkg2.TestClass3;

// 만약 특정 패키지에 있는 모든 클래스를 패지명을 생략하고 쓰겠다고 한다면..
import com.lion.pkg3.*;

public class MainClass {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용
        com.lion.pkg1.TestClass1 t1 = new com.lion.pkg1.TestClass1();
        System.out.printf("t1.testA1 : %d\n", t1.testA1);
        t1.testMethod1();

        // 만약 패키지명을 생략하고 싶다면 import를 이용해야 한다.
        TestClass2 t2 = new TestClass2();
        System.out.printf("t2.testA1 : %d\n", t2.testA2);
        t2.testMethod2();

        // import 명시한 TestClass3
        TestClass3 t30 = new TestClass3();
        System.out.printf("t30.testA1 : %d\n", t30.testA3);
        t30.testMethod3();

        // import 명시를 하지 않은 TestClass3
        com.lion.pkg2.TestClass3 t31 = new com.lion.pkg2.TestClass3();
        System.out.printf("t31.testA1 : %d\n", t31.testA3);
        t31.testMethod3();

        // pkg3에 있는 모든 클래스는 패키지명을 생략하고 사용할 수 있다.
        TestClass4 t4 = new TestClass4();
        System.out.printf("t4.testA1 : %d\n", t4.testA4);
        t4.testMethod4();

        TestClass5 t5 = new TestClass5();
        System.out.printf("t5.testA1 : %d\n", t5.testA5);
        t5.testMethod5();
    }
}







