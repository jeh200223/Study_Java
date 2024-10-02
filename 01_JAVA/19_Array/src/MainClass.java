public class MainClass {
    public static void main(String[] args) {
        // 배열이 관리할 값들을 지정하여 배열을 생성한다.
        // 지정한 값의 수 만큼 배열이 관리하는 기억장소가 만들어진다.
        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 값들이 사전에 정해져 있지 않다면 크기를 지정하여 배열을 생성한다.
        int [] array3 = new int[10];
        int array4[] = new int[10];

        // 배열이 가지고 있는 기억 장소의 개수를 확인한다.
        System.out.printf("배열이 관리하는 기억장소의 개수 : %d\n", array1.length);

        // 배열이 관리하는 기억 장소에 접근한다.
        // 0부터 1씩 증가하는 순서값을 통해 접근한다.
        array3[0] = 100;
        array3[1] = 200;
        System.out.printf("array3[0] : %d\n", array3[0]);
        System.out.printf("array3[1] : %d\n", array3[1]);

        // for문 이용해서 처음부터 끝까지 값을 사용한다.
        for(int i = 0 ; i < array1.length ; i++){
            System.out.printf("array1[%d] : %d\n", i, array1[i]);
        }
        // 위의 for 문에서는 변수 i 를 통해 현재 몇 번째 기억장소를 사용하고 있는지
        // 파악할 수 있다.
        // 만약 순서는 사용하지 않고 값만 사용하겠다면 다음과 같은 for을 사용할 수 있다.
        // 배열이 관리하는 값 만큼 반복을 하고 반복 횟차에 해당하는 기억장소의 값을 변수에 담아준다.
        for(int value1 : array1){
            System.out.printf("value1 : %d\n", value1);
        }
    }
}









