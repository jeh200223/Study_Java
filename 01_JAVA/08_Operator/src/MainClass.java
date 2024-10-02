public class MainClass {
    public static void main(String[] args) {
        // 최우선 연산자
        // . : 객체에 접근하여 맴버를 사용하는 연산자
        // [ ] : 배열에 접근하여 값을 가져오는 연산자
        // ( ) : 가장 먼저 연산을 수행하는 부분

        // 산술 연산자
        // 더하기
        int a1 = 10 + 3;
        // 빼기
        int a2 = 10 - 3;
        // 곱하기
        int a3 = 10 * 3;
        // 나누기
        int a4 = 10 / 3;
        // 나머지
        int a5 = 10 % 3;

        System.out.printf("10 + 3 : %d\n", a1);
        System.out.printf("10 - 3 : %d\n", a2);
        System.out.printf("10 * 3 : %d\n", a3);
        System.out.printf("10 / 3 : %d\n", a4);
        System.out.printf("10 %% 3 : %d\n", a5);

        // 단항 연산자
        // 부정 연산자
        // ! : true나 false를 반대로 부정한다.
        // 제어문에서 사용한다.
        boolean a6 = true;
        boolean a7 = !a6;
        System.out.printf("a6 : %s\n", a6);
        System.out.printf("a7 : %s\n", a7);

        // 부호 연산자
        // + : 양수를 양수로, 음수를 음수로 변환한다
        // - : 양수를 음수로, 음수를 양수로 변환한다.
        int a8 = 10;
        int a9 = +a8;
        int a10 = -a8;
        System.out.printf("a9 : %d\n", a9);
        System.out.printf("a10 : %d\n", a10);

        // 증감연산자
        // 변수안에 저장되어 있는 값을 추출하여 1을 증가 또는 감소시킨다음
        // 다시 변수에 저장하는 연산자
        int a11 = 10;
        int a12 = 10;

        a11 = a11 + 1;
        a12++;
        System.out.printf("a11 : %d\n", a11);
        System.out.printf("a12 : %d\n", a12);

        a11 = a11 + 1;
        ++a12;
        System.out.printf("a11 : %d\n", a11);
        System.out.printf("a12 : %d\n", a12);

        a11 = a11 - 1;
        a12--;
        System.out.printf("a11 : %d\n", a11);
        System.out.printf("a12 : %d\n", a12);

        a11 = a11 - 1;
        --a12;
        System.out.printf("a11 : %d\n", a11);
        System.out.printf("a12 : %d\n", a12);

        // 증감연산자(++/--)가 변수 앞에 있을 때는 대입 연산자 보다
        // 우선순위가 높다. 변수 뒤에 있을 때는 대입 연산자 보다
        // 우선순위가 낮다.
        int a13;
        int a14;

        // 변수에 저장되어 있는 값을 먼저 증가 혹은 감소 시킨 다음
        // 변수의 값을 다른 변수에 저장한다.
        a11 = a11 + 1;
        a13 = a11;
        System.out.printf("a11 : %d\n", a11);
        System.out.printf("a13 : %d\n", a13);

        a14 = ++a12;
        System.out.printf("a12 : %d\n", a12);
        System.out.printf("a14 : %d\n", a14);

        // 변수에 저장되어 있는 값을 다른 변수에 먼저 저장하고
        // 변수에 저장되어 있는 값을 증가 혹은 감소시킨다.
        a13 = a11;
        a11 = a11 + 1;
        System.out.printf("a11 : %d\n", a11);
        System.out.printf("a13 : %d\n", a13);

        a14 = a12++;
        System.out.printf("a12 : %d\n", a12);
        System.out.printf("a14 : %d\n", a14);

        // 형변환
        // (자료형) : 다른 타입으로 변환할 때 사용하는 연산자

        // 시프트 연산자
        // 비트를 이동 시키는 연산자
        // 현재는 잘 쓰지 않는다.

        // 시프트 연산자
        // 비트를 좌측 혹은 우측으로 옮겨주는 연산자
        int a15 = 10;
        // << n : 2의 n 승 만큼을 곱한 효과를 얻을 수 있다.
        int a16 = a15 << 1;
        // >> n : 2의 n 승으로 나눈 효과를 얻을 수 있다.
        // 과거에 성능이 매우 좋지 않은 장치에서 주로 사용했던 연산자.
        int a17 = a15 >> 1;
        System.out.printf("a15 : %d\n", a15);
        System.out.printf("a16 : %d\n", a16);
        System.out.printf("a17: %d\n", a17);

        // 관계 연산자
        // 좌측의 값을 우측과 비교하여 어떠한지를 파악하는 연산자
        // 연산의 결과는 true 또는 false가 된다.
        // 큰가
        boolean a18 = 10 > 2;
        // 작은가
        boolean a19 = 10 < 2;
        // 크거나 같은가
        boolean a20 = 10 >= 10;
        // 작거나 같은가
        boolean a21 = 10 <= 10;
        // 같은가
        boolean a22 = 10 == 2;
        // 다른가
        boolean a23 = 10 != 2;

        System.out.printf("a18 : %s\n", a18);
        System.out.printf("a19 : %s\n", a19);
        System.out.printf("a20 : %s\n", a20);
        System.out.printf("a21 : %s\n", a21);
        System.out.printf("a22 : %s\n", a22);
        System.out.printf("a23 : %s\n", a23);

        // 논리 연산자
        // 좌측과 우측의 값을 비교하여 어떠한가를 판단하는 연산자
        // 좌측과 우측의 값은 true나 false로 되어 있어야 한다.
        // 앞서 살표보았던 관계연산자 식이 다수일 때 (조건이 다수일 경우)
        // 각 관계 연산자 식의 결과를 모아 최종 결과를 계산할 때 사용한다.

        // && (and) : 좌측과 우측의 결과가 모두 true여야지만 최종결과가
        // true가 된다.
        boolean a24 = true && true;
        boolean a25 = true && false;
        boolean a26 = false && true;
        boolean a27 = false && false;

        System.out.printf("a24 : %s\n", a24);
        System.out.printf("a25 : %s\n", a25);
        System.out.printf("a26 : %s\n", a26);
        System.out.printf("a27 : %s\n", a27);

        // || (or) : 좌측과 우측의 결과가 모두 false 여야지만 최종결과가
        // false 가 된다.
        boolean a28 = true || true;
        boolean a29 = true || false;
        boolean a30 = false || true;
        boolean a31 = false || false;

        System.out.printf("a28 : %s\n", a28);
        System.out.printf("a29 : %s\n", a29);
        System.out.printf("a30 : %s\n", a30);
        System.out.printf("a31 : %s\n", a31);

        // 삼항 연산자
        // 조건식 ? 값1 : 값2
        // 조건식의 결과가 true 이면 값1이 결과가 되고
        // false 이면 값2가 결과가 된다.
        String str1 = 10 > 2 ? "문자열1" : "문자열2";
        System.out.printf("str1 : %s\n", str1);

        // 대입 연산자
        // 연산자 중 가장 우선순위 낮은(후위형 증감 연산자 제외) 연산자이다.
        // 우측의 값을 좌측의 변수에 저장하는 연산자로써 식의 최종 결과를
        // 변수에 담아주는 역할을 한다.

        // 이때 배정 대입 연산자는 것을 이용할 수 있다.
        int a32 = 10;
        int a33 = 10;

        a32 = a32 + 10;
        a33 += 10;
        System.out.printf("a32 : %d\n", a32);
        System.out.printf("a33 : %d\n", a33);
    }
}











