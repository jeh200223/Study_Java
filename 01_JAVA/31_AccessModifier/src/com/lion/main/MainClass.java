package com.lion.main;

import com.lion.test.TestClass9;
import com.sun.tools.javac.Main;

public class MainClass {
    // 생성자
    public MainClass(){

    }
    MainClass(int a1){

    }
    protected MainClass(int a1, int a2){

    }
    private MainClass(int a1, int a2, int a3){

    }

    public int memberA1 = 100;
    int memberA2 = 200;
    protected int memberA3 = 300;
    private int memberA4 = 400;

    public void method1(){

    }
    void method2(){

    }
    protected void method3(){

    }
    private void method4(){

    }

    public MainClass(double a1){
        // 같은 클래스의 public 생성자 호출 : 가능
        // this();
        // 같은 클래스의 default 생성자 호출 : 가능
        // this(10);
        // 같은 클래스의 protected 생성자 호출 : 가능
        // this(10, 20);
        // 같은 클래스의 private 생성자 호출 : 가능
        // this(10, 20, 30);
    }

    public static void main(String[] args) {
        // 같은 패키지, 같은 파일, public class : 객체 생성 가능
        MainClass m1 = new MainClass();
        // 같은 패키지, 같은 파일, default class : 객체 생성 가능
        TestClass2 t2 = new TestClass2();
        // 같은 패키지, 다른 파일, public class : 객체 생성 가능
        TestClass5 t5 = new TestClass5();
        // 같은 패키지, 다른 파일, default class : 객체 생성 가능
        TestClass6 t6 = new TestClass6();
        // 다른 패키지, public class : 객체 생성 가능
        TestClass9 t9 = new TestClass9();
        // 다른 패키지, default class : 객체 생성 불가
        // TestClass10 t10 =new TestClass10();

        // 생성자
        // 같은 패키지, 같은 클래스의 public 생성자 : 사용 가능
        MainClass m10 = new MainClass();
        // 같은 패키지, 같은 클래스의 default 생성자 : 사용 가능
        MainClass m11 = new MainClass(10);
        // 같은 패키지, 같은 클래스의 protected 생성자 : 사용 가능
        MainClass m12 = new MainClass(10, 20);
        // 같은 패키지, 같은 클래스의 private 생성자
        MainClass m13 = new MainClass(10, 20, 30);

        // 다른 패키지, public 생성자 : 사용 가능
        TestClass9 t90 = new TestClass9();
        // 다른 패키지, default 생성자 : 사용 불가
        // TestClass9 t91 = new TestClass9(10);
        // 다른 패키지, protected 생성자 : 사용 불가
        // TestClass9 t92 = new TestClass9(10, 20);
        // 다른 패키지, private 생성자 : 사용 불가
        // TestClass9 t93 = new TestClass9(10, 20, 30);

        // 맴버 변수, 맴버 메서드
        MainClass m100 = new MainClass();
        // 같은 클래스, public 맴버 : 사용 가능
        m100.memberA1 = 100;
        m100.method1();
        // 같은 클래스, default 맴버 : 사용 가능
        m100.memberA2 = 200;
        m100.method2();
        // 같은 클래스, protected 맴버 : 사용 가능
        m100.memberA3 = 300;
        m100.method3();
        // 같은 클래스, private 맴버 : 사용 가능
        m100.memberA4 = 400;
        m100.method4();

        TestClass5 t50 = new TestClass5();
        // 같은 패키지, 다른 클래스, 객체 생성, public 맴버 : 사용 가능
        t50.memberA1 = 100;
        t50.method1();
        // 같은 패키지, 다른 클래스, 객체 생성, default 맴버 : 사용 가능
        t50.memberA2 = 200;
        t50.method2();
        // 같은 패키지, 다른 클래스, 객체 생성, protected 맴버 : 사용 가능
        t50.memberA3 = 300;
        t50.method3();
        // 같은 패키지, 다른 클래스, 객체 생성, private 맴버 : 사용 불가
        // t50.memberA4 = 400;
        // t50.method4();

        TestClass9 t900 = new TestClass9();
        // 다른 패키지, 객체 생성, public 맴버 : 사용 가능
        t900.memberA1 = 100;
        t900.method1();
        // 다른 패키지, 객체 생성, default 맴버 : 사용 불가
        // t900.memberA2 = 200;
        // t900.method2();
        // 다른 패키지, 객체 생성, protected 맴버 : 사용 불가
        // t900.memberA3 = 300;
        // t900.method3();
        // 다른 패키지, 객체 생성, private 맴버 : 사용 부락
        // t900.memberA4 = 400;
        // t900.method4();

    }
}

// 같은 파일에 있는 public class
// 하나의 java 파일안에서 public 클래스는 두 개 이상 존재할 수 없다.
// java 파일의 이름은 반드시 클래스 명과 동일해야 한다.
// 만약 public class가 없다면 아무 클래스의 이름이나 상관이 없다.
//public class TestClass1{
//
//}

// default class
class TestClass2{

}

// 같은 패키지, 같은 파일, public class를 상속받는다 : 가능
class TestClass3 extends MainClass{
    
}

// 같은 패키지, 같은 파일, default class를 상속 받는다. : 가능
class TestClass4 extends TestClass2{
    
}
// 같은 패키지, 다른 파일, public class를 상속 받는다 : 가능
class TestClass7 extends TestClass5{
    
}
// 같은 패키지, 다른 파일, default class를 상속 받는다 : 가능
class TestClass8 extends TestClass6{
    
}
// 다른 패키지, public class : 상속 가능
class TestClass11 extends TestClass9{

}
// 다른 패키지, default class : 상속 불가능
//class TestClass12 extends TestClass10{
//
//}

class TestClass12{

    void testMethod(){
        // 생성자
        // 같은 패키지, 다른 클래스, public 생성자 : 사용 가능
        MainClass m1 = new MainClass();
        // 같은 패키지, 다른 클래스, default 생성자 : 사용 가능
        MainClass m2 = new MainClass(10);
        // 같은 패키지, 다른 클래스, protected 생성자 : 사용 가능
        MainClass m3 = new MainClass(10, 20);
        // 같은 패키지, 다른 클래스, private 생성자 : 사용 불가
        // MainClass m4 = new MainClass(10, 20, 30);
    }
}

class TestClass13 extends MainClass{

    TestClass13(){
        // 같은 패키지, 상속관계, public 생성자 : 사용가능
        // super();
        // 같은 패키지, 상속관계, default 생성자 : 사용가능
        // super(10);
        // 같은 패키지, 상속관계, protected 생성자 : 사용가능
        // super(10, 20);
        // 같은 패키지, 상속관계, private 생성자 : 사용불가
        // super(10, 20, 30);
    }
}

class TestClass14 extends TestClass9{
    TestClass14(){
        // 다른 패키지, public 생성자 : 사용 가능
        // super();
        // 다른 패키지, default 생성자 : 사용 불가
        // super(10);
        // 다른 패키지, protected 생성자 : 사용 가능
        // super(10, 20);
        // 다른 패키지, private 생성자 : 사용 불가
        // super(10, 20, 30);
    }
}

class TestClass15 extends MainClass{

    void testMethod(){
        // 같은 패키지, 상속, public 맴버 : 사용 가능
        memberA1 = 100;
        method1();
        // 같은 패키지, 상속, default 맴버 : 사용 가능
        memberA2 = 200;
        method2();
        // 같은 패키지, 상속, protected 맴버 : 사용 가능
        memberA3 = 300;
        method3();
        // 같은 패키지, 상속, private 맴버 : 사용 불가
        // memberA4 = 400;
        // method4();
    }
}

class TestClass200 extends TestClass9{

    void method(){
        // 다른 패키지, 상속, public 맴버 : 사용 가능
        memberA1 = 100;
        method1();
        // 다른 패키지, 상속, default 맴버 : 사용 불가
        // memberA2 = 200;
        // method2();
        // 다른 패키지, 상속, protected 맴버 : 사용 가능
        memberA3 = 300;
        method3();
        // 다른 패키지, 상속, private 맴버 : 사용 불가
        // memberA4 = 400;
        // method4();
    }
}
