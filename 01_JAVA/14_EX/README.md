369게임 프로그램을 작성한다.
사용자에게 정수값을 입력받는다. 1부터 입력받은 정수값까지 출력한다.
3에 해당하는 숫자에는 숫자대신 짝을 출력한다.
1, 2, 짝, 4, 5, 짝, 7, 8, 짝, 10, 11, 12, 짝, 14, 15, 짝... 28, 짝, 짝, 짝, 짝, 짝짝....

---

### 출력화면

```java
        // 출력화면
        System.out.println(1);
        System.out.println(2);
        System.out.println("짝");
        System.out.println(4);
        System.out.println(5);
        System.out.println("짝");
```

### 필요한 데이터
- 1 부터 1씩 증가되는 숫자 값
- 사용자가 입력한 정수 값

### 데이터를 구하기 위한 전략
- 1 부터 1씩 증가되는 숫자 값 : 1씩 증가시킨다
- 사용자가 입력한 정수 값 : 사용자로 부터 입력을 받는다

### 작업 순서를 설계한다.

```java

        // 값을 담을 변수들을 선언한다.

        // 사용자에게 정수를 입력 받는다.

        // 1부터 1씩 증가하며 사용자가 입력한 정수까지 반복한다.

        // 3의 배수가 없다면 그냥 출력한다.

        // 3의 배수가 있다면 3의 배수의 개수 만큼 짝을 출력한다.
        // 출력화면
        System.out.println(1);
        System.out.println(2);
        System.out.println("짝");
        System.out.println(4);
        System.out.println(5);
        System.out.println("짝");

```

### 변수를 선언한다.

```java
        // 1부터 1씩 증가되는 숫자값
        int number = 1;
        // 사용자가 입력한 정수값
        int inputNumber;

```

### 반복문을 작성해준다.
```java
        // 1부터 1씩 증가하며 사용자가 입력한 정수까지 반복한다.
        while(number <= inputNumber) {
            // 3의 배수가 없다면 그냥 출력한다.

            // 3의 배수가 있다면 3의 배수의 개수 만큼 짝을 출력한다.
            // 출력화면
            System.out.println(1);
            System.out.println(2);
            System.out.println("짝");
            System.out.println(4);
            System.out.println(5);
            System.out.println("짝");
        }

```

### 변수를 추가해준다.
```java
        // 현재 숫자를 10으로 나눈 몫을 담을 변수
        int tempNumber = 0;
        // 짝의 개수를 담을 변수
        int clapCount = 0;
```

### 현재 숫자를 가지고 3의 배수의 개수를 계산하기 위한 반복문을 작성해준다.
```java
            // 현재 숫자를 10으로 나는 몫이 0이 아닐 때 까지 반복한다.
            do{

            }while(tempNumber != 0);
```

### 현재 숫자를 tempNumber 변수에 담아준다.

```java
            // 현재숫자를 tempNumber 변수에 담아준다.
            tempNumber = number;
```

### 3의 배수의 개수를 계산한다.
```java
                // 현재 숫자를 10으로 나눈 나머지가 3의 배수인지를 검사한다.
                int a1 = tempNumber % 10;
                if (a1 % 3 == 0 && a1 != 0) {
                    // 짝의 개수를 증가시킨다.
                    clapCount++;
                }
                // 현재 숫자를 10으로 나눈 몫을 구해 다시 담아준다.
                tempNumber = tempNumber / 10;

```

### 3의 배수가 없다면 숫자를 출력한다.
```java
            if(clapCount == 0){
                System.out.println(number);
            }
```

### 3의 배수가 있다면 짝을 출력한다.
```java
            // 3의 배수가 있다면 3의 배수의 개수 만큼 짝을 출력한다.
            else {
                for(int i = 0 ; i < clapCount ; i++){
                    System.out.print("짝");
                }
                System.out.println();
            }
```

### 현재 숫자를 증가시킨다.
```java
            // 현재 숫자를 증가시킨다.
            number++;

```

### 짝의 개수를 초기화 하는 코드를 넣어준다.
```java
            // 짝의 개수를 0으로 초기화한다.
            clapCount = 0;

```