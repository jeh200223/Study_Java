public class MainClass {
    public static void main(String[] args) {

        int a1 = 10;
        // 기본 if 문.
        // ( ) 에 있는 식의 결과가 true인 경우 관리하는 코드가 수행된다.
        if (a1 > 5) {
            System.out.println("a1은 5보다 큽니다");
        }

        if (a1 < 5) {
            System.out.println("a1은 5보다 작습니다");
        }

        // else : ( ) 이 false 인 경우 수행될 부분
        if (a1 > 5) {
            System.out.println("a1은 5보다 큽니다");
        } else {
            System.out.println("a1은 5보다 크지 않습니다");
        }

        if(a1 < 5){
            System.out.println("a1은 5보다 작습니다");
        } else {
            System.out.println("a1은 5보다 작지 않습니다");
        }
        
        // else if : 조건이 다수일 경우 각각의 조건을 else if 설정해 준다.
        if(a1 == 3){
            System.out.println("a1은 3과 같습니다");
        } else if(a1 == 5){
            System.out.println("a1은 5와 같습니다");
        } else if(a1 == 10){
            System.out.println("a1은 10과 같습니다");
        } else {
            System.out.println("a1은 3, 5, 10이 아닙니다");
        }

        // switch
        // 특정 변수의 값이 이것과 같은가라는 if 문을 대체하기 위해
        // 제공되는 제어문이다.
        // if 문은 조건식이 true은 것을 만날 때 까지 위에서 아래방향으로
        // 내려오며 연산을 계속 수행한다.
        // 하지만 switch는 변수의 수식의 값에 해당하는 부분으로 바로 이동하기
        // 때문에 시간이 오래 걸리지 않는다.
        // 하지만 특 정부분으로 이동하여 코드가 그냥 흘러가기 때문에 이동한 곳
        // 이후의 모든 코드가 실행된다.
        // 특정 부분만 실행하고 싶다면 break로 제어문 수행을 중단 시켜준다.
        switch (a1){
            case 3 :
                System.out.println("a1은 3입니다");
                break;
            case 5 :
                System.out.println("a1은 5입니다");
                break;
            case 10 :
                System.out.println("a1은 10입니다");
                break;
            default :
                System.out.println("a1은 3, 5, 10이 아닙니다");
                break;
        }

        // for 문
        // for(초기식 ; 조건식 ; 증감식){
        //    코드
        // }
        // 초기식 -> 조건식 -> 코드 -> 증감식 -> 조건식 -> 코드 -> 증감식 ->...
        // 조건식 검삭때 결과가 false라면 반복문 수행이 중단된다.
        // 반복 횟수가 결정되어 있을 때 사용한다.
        for(int i = 0 ; i < 10 ; i++){
            System.out.printf("for - %d\n", i);
        }

        System.out.println("-------------------------");

        // while 문
        int a10 = 0;

        while(a10 < 10){
            System.out.printf("while - %d\n", a10);
            a10++;
        }

        // do ~ while문
        int a20 = 0;

        do{
            System.out.printf("do while - %d\n", a20);
            a20++;
        } while(a20 < 10);
    }
}
