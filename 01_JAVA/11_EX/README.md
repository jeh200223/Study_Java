사용자가 0을 입력할 때까지 정수값을 입력받는다.
입력받은 값들의 총합과 평균을 구해 출력한다.

---

### 출력화면을 만들어준다.

```java
        // 출력 화면
        System.out.println("총점 : 100");
        System.out.println("평균 : 50");
```

### 필요한 데이터
- 사용자가 입력한 정수값들의 총점과 평균
- 사용자가 입력한 정수값
- 사용자가 입력한 숫자의 개수

### 데이터를 구하기 위한 전략
- 총점 : 사용자가 입력한 정수값들을 누적한다.
- 평균 : 구한 총점을 입력한 숫자의 개수로 나눈다.
- 사용자가 입력한 정수값 : 사용자에게 입력을 받는다.
- 사용자가 입력한 숫자의 개수 : 입력을 할 때마다 1씩 증가한다.

### 작업 순서를 정리한다.
```java
        // 필요한 변수들을 선언한다.

        // 사용자가 0을 입력할 때 까지 반복해서 입력을 받는다.

        // 입력한 숫자를 누적하여 총점을 계산한다.

        // 입력한 숫자의 개수를 1 증가시킨다.

        // 입력이 완료되면 평균을 구한다.

        // 출력 화면
        System.out.println("총점 : 100");
        System.out.println("평균 : 50");

```
### 필요한 변수들을 선언한다.
```java
        // 총점
        int total;
        // 평균
        int avg;
        // 사용자가 입력한 정수값
        int inputNumber;
        // 사용자가 입력한 숫자의 개수
        int inputCount;

```

### 기본적인 반복문을 작성한다.
```java
        Scanner scanner = new Scanner(System.in);

        do {
            // 사용자가 0을 입력할 때 까지 반복해서 입력을 받는다.

            // 입력한 숫자를 누적하여 총점을 계산한다.

            // 입력한 숫자의 개수를 1 증가시킨다.
        }while(inputNumber != 0);

```

### 정수값을 입력받는 부분을 구현한다.

```java
            // 정수를 입력 받는다.
            System.out.print("정수값을 입력해주세요 : ");
            inputNumber = scanner.nextInt();
```

### total 변수를 초기화 한다.
```java
        // 총합은 누적을 할 것이기 때문에 초기값으로 0을 설정한다.
        total = 0;
```

### total 변수에 사용자가 입력한 값으로 누적한다.

```java
            // 입력한 숫자를 누적하여 총점을 계산한다.
            // total += inputNumber;
            total = total + inputNumber;

```
### inputCount 변수를 초기화 한다.
```java
        // 입력한 숫자의 개수를 누적할 것이기 때문에 초기값으로 0을 설정한다.
        inputCount = 0;

```

### 입력한 숫자의 개수를 1 증가시킨다.
```java
            // 입력한 숫자의 개수를 1 증가시킨다.
            // inputCount = inputCount + 1;
            inputCount++;

```

### 평균을 구한다.
```java
        // 입력이 완료되면 평균을 구한다.
        avg = total / inputCount;
```

### 입력 값이 0이 아닐때만 누적되도록 처리한다.
```java
            // 0이 아닐 경우에만..
            if(inputNumber != 0) {
                // 입력한 숫자를 누적하여 총점을 계산한다.
                // total += inputNumber;
                total = total + inputNumber;
                // 입력한 숫자의 개수를 1 증가시킨다.
                // inputCount = inputCount + 1;
                inputCount++;
            }

```