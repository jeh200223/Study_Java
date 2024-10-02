public class MainClass {
    public static void main(String[] args) {
        TestClass1 t1 = new TestClass1();
        int r1 = t1.add(10, 20);
        System.out.printf("r1 : %d\n", r1);

        double r2 = t1.add(11.11, 22.22);
        System.out.printf("r2 : %f\n", r2);

        int r3 = t1.add(100, 200, 300);
        System.out.printf("r3 : %d\n", r3);

        int r4 = t1.add2Array(10, 20, 30);
        System.out.printf("r4 : %d\n", r4);

        int r5 = t1.add2Array(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.printf("r5 : %d\n", r5);
    }
}

class TestClass1{

    int add(int a1, int a2){
        return a1 + a2;
    }

    double add(double a1, double a2){
        return a1 + a2;
    }

    int add(int a1, int a2, int a3){
        return a1 + a2 + a3;
    }

    // 가변형 매개변수
    // 메서드를 호출할 때 전달되는 값을 배열에 담아 사용하는 매개변수
    int add2Array(int...a1){
        int r1 = 0;

        for(int v1 : a1){
            r1 = r1 + v1;
        }

        return r1;
    }
}
