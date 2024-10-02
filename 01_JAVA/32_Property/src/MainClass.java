public class MainClass {
    public static void main(String[] args) {
        TestClass1 t1 = new TestClass1();
        // private 이므로 변수에 직접 접근이 불가능하다.
        //t1.memberA1 = 100;
        // setter를 이용해 값 설정
        t1.setMemberA1(100);
        // getter를 통해 값을 가져온다.
        System.out.printf("t1.memberA1 : %d\n", t1.getMemberA1());

        t1.setMemberA1(-100);
        System.out.printf("t1.memberA1 : %d\n", t1.getMemberA1());
    }
}

class TestClass1{
    // 맴벼 변수들은 직접 적인 접근을 막기 위해 private 접근 제한자를 붙혀준다.
    private int memberA1 = 0;
    private double memberA2 = 0.0;
    private boolean memberA3 = false;

    // 이중에 변수에 값을 저장하는 것을 허용하고자 하는 변수들에 대한 setter 메서드을
    // 만들어 제공한다.
    // 메서드 네이밍 규칙 : set + 변수명(변수명 첫 글자는 대문자로 한다)
    public void setMemberA1(int memberA1) {
        // setter 메서드에는 데이터의 무결성을 위한 코드를 작성해도 된다.
        if(memberA1 > 0) {
            this.memberA1 = memberA1;
        }
    }
    // 변수에 저장되어 있는 값을 사용할 수 있게 하겠다면 값을 반환하는 getter 메서드를
    // 만들어 제공한다.
    // 메서드 네이밍 규칙 : get(boolean인 경우 is) + 변수명(변수명 첫 글자는 대문자로 한다)
    public int getMemberA1() {
        return memberA1;
    }

    // getter만 제공
    public boolean isMemberA3() {
        return memberA3;
    }

    // setter/getter를 제공하지 않는 경우
    // setter와 getter를 제공하지 않는 다는 것은 클래스를 가지고 만든 객체 내부에서만 사용하겠다는 의미이다.
}