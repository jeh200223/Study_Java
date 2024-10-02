public class MainClass {

    public static void main(String[] args) {
        // 이 부분한 한 줄 주석입니다.
        /*
        이 부분은 여러
        줄 주석입니다.

        주석은 class 파일로 변경될 때 빠지는 부분입니다.

        원하는 부분을 선택하고
        ctrl + / : 선택한 부분들을 한 줄 주석으로 토글할 수 있다.
        ctrl + shift + / : 선택한 부분들을 여러 줄 주석으로 토글할 수 있다.
         */

        // 출력 후 밑으로 내려준다
        System.out.println("안녕하세요");
        System.out.println(100);

        System.out.print("안녕하세요");
        System.out.print(100);
        System.out.println();

        System.out.println("---------------------------------");

        // 자바는 문장의 마지막에 반드시 세미콜론을 찍어줘야 한다.
        System.out.println("안녕하세요");
        System.out.println("반갑습니다"); System.out.println("감사합니다");
    }
}
