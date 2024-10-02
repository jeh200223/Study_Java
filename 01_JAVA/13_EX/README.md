사용자에게 정수를 입력받는다.
입력 받은 정수에 해당하는 구구단을 출력한다.
---

### 출력 화면을 구성한다.

```java
        // 출력 화면
        System.out.println("5단");
        System.out.println("5 X 1 = 5");
        System.out.println("5 X 2 = 10");
        System.out.println("5 X 3 = 15");
        System.out.println("5 X 4 = 20");
        System.out.println("5 X 5 = 25");
        System.out.println("5 X 6 = 30");
        System.out.println("5 X 7 = 35");
        System.out.println("5 X 8 = 40");
        System.out.println("5 X 9 = 45");

```

### 반복문으로 바꾼다
```java

        // 출력 화면
        System.out.println("5단");
//        System.out.println("5 X 1 = 5");
//        System.out.println("5 X 2 = 10");
//        System.out.println("5 X 3 = 15");
//        System.out.println("5 X 4 = 20");
//        System.out.println("5 X 5 = 25");
//        System.out.println("5 X 6 = 30");
//        System.out.println("5 X 7 = 35");
//        System.out.println("5 X 8 = 40");
//        System.out.println("5 X 9 = 45");
        for(int i = 0 ; i < 9 ; i++){
            int a1 = 1 + i;
            int a2 = 5 + (i * 5);
            System.out.printf("5 X %d = %d\n", a1, a2);
        }
        
```

### 필요한 데이터
1. 사용자에게 입력받는 단수

### 데이터를 구하는 전략
1. 단수 : 사용자에게 입력 받는다.

### 작업 순서 설계

```java
        // 사용자에게 단수를 입력받는다.

        // 구구단을 출력한다.
        // 출력 화면
        System.out.println("5단");
//        System.out.println("5 X 1 = 5");
//        System.out.println("5 X 2 = 10");
//        System.out.println("5 X 3 = 15");
//        System.out.println("5 X 4 = 20");
//        System.out.println("5 X 5 = 25");
//        System.out.println("5 X 6 = 30");
//        System.out.println("5 X 7 = 35");
//        System.out.println("5 X 8 = 40");
//        System.out.println("5 X 9 = 45");
        for(int i = 0 ; i < 9 ; i++){
            int a1 = 1 + i;
            int a2 = 5 + (i * 5);
            System.out.printf("5 X %d = %d\n", a1, a2);
        }
    }

```

### 데이터를 담을 변수를 선언한다.
```java
        // 변수를 선언한다.
        // 사용자에게 입력받을 단수
        int dan;

```

### 단수를 입력받는다.

```java

        // 사용자에게 단수를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("단수를 입력해주세요 : ");
        dan = scanner.nextInt();
```

### 출력문을 수정한다.
```java
// 구구단을 출력한다.
        // 출력 화면
        System.out.printf("%d단\n", dan);
//        System.out.println("5 X 1 = 5");
//        System.out.println("5 X 2 = 10");
//        System.out.println("5 X 3 = 15");
//        System.out.println("5 X 4 = 20");
//        System.out.println("5 X 5 = 25");
//        System.out.println("5 X 6 = 30");
//        System.out.println("5 X 7 = 35");
//        System.out.println("5 X 8 = 40");
//        System.out.println("5 X 9 = 45");
        for(int i = 0 ; i < 9 ; i++){
            int a1 = 1 + i;
            int a2 = dan + (i * dan);
            System.out.printf("%d X %d = %d\n", dan, a1, a2);
        }

```