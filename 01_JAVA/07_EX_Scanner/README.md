학생의 정보를 입력받는다.
학생의 정보는 이름, 나이, 국어점수, 수학점수, 영어점수로 구성되어 있다.

학생의 정보를 입력받고 입력받은 정보를 출력한다.

입력부터 먼저 다 받고 출력을 해주세요

---

1. 일단 결과부터 먼저 작성한다.
2. 결과를 작업할 때 필요한 데이터가 있다면 일단 아무 값이나 설정하여 작성한다.
3. 결과를 구성하기 위해 필요한 데이터가 무엇이 있는지 뽑아낸다.
4. 각 데이터를 구하기 위해서는 어떻게 해야 하는지 전략을 세운다.
5. 세운 전략대로 값을 구하는 코드를 작성해준다

---

### 화면 구성

```java
        // 화면 구성
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 20살");
        System.out.println("국어점수 : 100점");
        System.out.println("수학점수 : 90점");
        System.out.println("영어점수 : 80점");
```

### 구해야 할 데이터
- 학생의 이름, 나이, 국어점수, 수학점수, 영어점수를 구해야 한다.

### 데이터를 어떻게 구할 것인가...
- 키보드로 부터 모든 데이터를 입력받는다.

### 각 값을 담을 변수를 선언한다.

```java

        // 필요한 데이터를 담을 변수를 선언한다.
        String name;
        int age;
        int kor;
        int math;
        int eng;
        
```
### 키보드로 부터 정보를 입력받는다.

```java
        // 키보드로 부터 각 정보를 입력 받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor = scanner.nextInt();
        System.out.print("수학점수 : ");
        math = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng = scanner.nextInt();

```
### 출력하는 부분에 변수를 적용해서 수정한다.

```java
        // 화면 구성
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d살\n", age);
        System.out.printf("국어점수 : %d점\n", kor);
        System.out.printf("수학점수 : %d점\n", math);
        System.out.printf("영어점수 : %d점\n", eng);

```

