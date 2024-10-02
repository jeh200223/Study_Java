학생의 정보를 입력 받는다.

학생의 정보는 이름, 나이, 국어점수, 영어점수, 수학점수로 구성되어 있다.

학생의 정보를 입력 받은 후 다음과 같이 출력한다.

이름 : 홍길동
나이 : 10살
국어점수 : 100점
영어점수 : 80점
수학점수 : 70점
총점 : 250점
평균 : 74점

11시 50분까지 작업해주세요. 식사 하고 오셔서 1시에 같이 만들어보겠습니다.
다 끝났다고 하더라도 자리를 이탈하시면 안됩니다.

---
### 출력 화면 만들기

```java
        // 결과 출력
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("국어점수 : 100점");
        System.out.println("영어점수 : 80점");
        System.out.println("수학점수 : 70점");
        System.out.println("총점 : 250점");
        System.out.println("평균 : 74점");
```

### 필요한 데이터 확인
- 이름, 나이, 국어점수, 영어점수, 수학점수, 총점, 평균

### 데이터를 구하기 위한 전략
- 이름, 나이, 국어점수, 영어점수, 수학점수는 입력을 받는다.
- 총점, 평균은 계산한다.

### 작업의 순서를 정리한다.

```java

        //데이터를 담을 변수를 선언
        
        // 필요한 데이터를 입력받는다.
        
        // 총점과 평균을 계산한다

        // 결과 출력
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("국어점수 : 100점");
        System.out.println("영어점수 : 80점");
        System.out.println("수학점수 : 70점");
        System.out.println("총점 : 250점");
        System.out.println("평균 : 74점");
        
```

### 데이터를 담을 변수를 선언한다.
```java

        // 데이터를 담을 변수를 선언
        String name;
        int age;
        int kor;
        int eng;
        int math;
        int total;
        int avg;
        
```

### 필요한 데이터를 입력받는다.

```java

        // 필요한 데이터를 입력받는다.
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng = scanner.nextInt();
        System.out.print("수학점수 : ");
        math = scanner.nextInt();

```

### 총점과 평군을 구한다.

```java
        // 총점과 평균을 계산한다
        total = kor + eng + math;
        avg = total / 3;

```

### 출력문을 수정해준다.

```java

        // 결과 출력
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n살", age);
        System.out.printf("국어점수 : %d점\n", kor);
        System.out.printf("영어점수 : %d점\n", eng);
        System.out.printf("수학점수 : %d점\n", math);
        System.out.printf("총점 : %d점\n", total);
        System.out.printf("평균 : %d점\n", avg);

```