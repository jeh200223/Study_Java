import java.io.*;

public class MainClass {
    public static void main(String[] args) {
        // 파일에 쓸 객체
        TestClass t1 = new TestClass();
        t1.memberA1 = 100;

        try{
            // 기본 스트림
            FileOutputStream fos = new FileOutputStream("object.dat");
            // 객체를 내보낼 수 있는 형태로 변환해 주는 필터 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // 객체를 파일이 쓴다
            oos.writeObject(t1);
            // 파일을 닫아준다.
            oos.flush();
            oos.close();
            fos.close();

            // 읽어온다.
            FileInputStream fis = new FileInputStream("object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // 객체를 정보를 읽어온다.
            TestClass t2 = (TestClass) ois.readObject();
            // 파일을 닫아준다.
            ois.close();
            fis.close();

            System.out.printf("t2.memberA1 : %d\n", t2.memberA1);
            t2.method1();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

// Serializable : 객체 직렬화
// 객체 관리하는 요소들(맴버 변수, 맴버 메서드 등등)은 효율적인 관리를 위해
// 메모리상에 분산 저장되어 관리된다.
// 이러한 형태로 관리되는 객체의 요소를 한 공간안에 모아서 가공할 수 있도록
// 해주는 작업을 객체 직렬화 라고 부른다.
class TestClass implements Serializable {
    int memberA1 = 0;

    void method1(){
        System.out.println("method1입니다");
        System.out.printf("memberA1 : %d\n", memberA1);
    }
}