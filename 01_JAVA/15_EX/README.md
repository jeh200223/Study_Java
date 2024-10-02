학생 3명의 정보를 입력받는다.
학생 한 명의 데이터는 이름, 나이, 국어, 영어, 수학점수로 구성된다.
입력이 모두 완료되면 학생의 정보를 출력한다.

1번학생
이름 : 홍길동
나이 : 10살
국어점수 : 100점
영어점수 : 80점
수학점수 : 70점
총점 : 200점
평균 : 50점

2번학생
이름 : 홍길동
나이 : 10살
국어점수 : 100점
영어점수 : 80점
수학점수 : 70점
총점 : 200점
평균 : 50점

3번학생
이름 : 홍길동
나이 : 10살
국어점수 : 100점
영어점수 : 80점
수학점수 : 70점
총점 : 200점
평균 : 50점

전체 총점 : 500점
전체 평균 : 50점

---

이 예제는 반복문을 사용할 수 없다.

학생 정보를 입력받는 코드와 정보를 출력하는 코드가 학생마다 동일하긴 하다.

허나 각 학생의 정보를 담을 변수를 각각 다 만들어야 하기 때문에 변수의 이름이 모두 다르다.

이에 반복문을 사용할 수가 없다.

---

### 출력화면 구성

```java
        // 출력 화면
        System.out.println("1번학생");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("국어점수 : 100점");
        System.out.println("영어점수 : 80점");
        System.out.println("수학점수 : 70점");
        System.out.println("총점 : 200점");
        System.out.println("평균 : 50점");
        System.out.println();

        System.out.println("2번학생");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("국어점수 : 100점");
        System.out.println("영어점수 : 80점");
        System.out.println("수학점수 : 70점");
        System.out.println("총점 : 200점");
        System.out.println("평균 : 50점");
        System.out.println();

        System.out.println("3번학생");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("국어점수 : 100점");
        System.out.println("영어점수 : 80점");
        System.out.println("수학점수 : 70점");
        System.out.println("총점 : 200점");
        System.out.println("평균 : 50점");
        System.out.println();

        System.out.println("전체 총점 : 500점");
        System.out.println("전체 평균 : 50점");

```

### 필요한 데이터
- 학생번호, 이름, 나이, 국어점수, 영어점수, 수학점수, 총점, 평균이 학생 수 만큼
- 전체 총점, 전체 평균

### 데이터를 구하기 위한 전략
- 학생 번호 : 1, 2, 3 중에 하나를 설정한다.
- 이름, 나이, 국어점수, 영어점수, 수학점수 : 사용자에게 입력을 받는다.
- 총점, 평균 : 입력받은 국어점수, 영어점수, 수학점수를 통해 계산한다.
- 전체 총점, 전체 평균 : 각 학생들의 점수를 통해 계산한다

### 작업 순서 설계

```java

        
        // 변수를 선언한다.
        
        // 학생의 정보를 입력받는다
        
        // 학생의 총점과 평균을 구한다.
        
        // 전체 총점과 전체 평균을 구한다.

        // 출력 화면
```

### 변수들을 선언한다.

```java

        // 학생 번호
        int idx1, idx2, idx3;
        // 학생 이름
        String name1, name2, name3;
        // 나이
        int age1, age2, age3;
        // 국어점수
        int kor1, kor2, kor3;
        // 영어점수
        int eng1, eng2, eng3;
        // 수학점수
        int math1, math2, math3;
        // 총점
        int total1, total2, total3;
        // 평균
        int avg1, avg2, avg3;
        // 전체 총점
        int totalAll;
        // 전체 평균
        int avgAll;
```

### 학생들의 정보를 입력 받는다.
```java

        // 학생의 정보를 입력받는다
        Scanner scanner = new Scanner(System.in);
        // 첫 번째 학생
        idx1 = 1;
        System.out.print("이름 : ");
        name1 = scanner.next();
        System.out.print("나이 : ");
        age1 = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor1 = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng1 = scanner.nextInt();
        System.out.print("수학점수 : ");
        math1 = scanner.nextInt();
        total1 = kor1 + eng1 + math1;
        avg1 = total1 / 3;

        // 두 번째 학생
        idx2 = 2;
        System.out.print("이름 : ");
        name2 = scanner.next();
        System.out.print("나이 : ");
        age2 = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor2 = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng2 = scanner.nextInt();
        System.out.print("수학점수 : ");
        math2 = scanner.nextInt();
        total2 = kor2 + eng2 + math2;
        avg2 = total2 / 3;

        // 세 번째 학생
        idx3 = 3;
        System.out.print("이름 : ");
        name3 = scanner.next();
        System.out.print("나이 : ");
        age3 = scanner.nextInt();
        System.out.print("국어점수 : ");
        kor3 = scanner.nextInt();
        System.out.print("영어점수 : ");
        eng3 = scanner.nextInt();
        System.out.print("수학점수 : ");
        math3 = scanner.nextInt();
        total3 = kor3 + eng3 + math3;
        avg3 = total3 / 3;

```

### 전체 총점과 평균을 구한다.
```java
        totalAll = total1 + total2 + total3;
        avgAll = totalAll / 9;

```

### 출력 부분을 수정한다.
```java

        // 출력 화면
        System.out.printf("%d번학생\n", idx1);
        System.out.printf("이름 : %s\n", name1);
        System.out.printf("나이 : %d살\n", age1);
        System.out.printf("국어점수 : %d점\n", kor1);
        System.out.printf("영어점수 : %d점\n", eng1);
        System.out.printf("수학점수 : %d점\n", math1);
        System.out.printf("총점 : %d점\n", total1);
        System.out.printf("평균 : %d점\n", avg1);
        System.out.println();

        System.out.printf("%d번학생\n", idx2);
        System.out.printf("이름 : %s\n", name2);
        System.out.printf("나이 : %d살\n", age2);
        System.out.printf("국어점수 : %d점\n", kor2);
        System.out.printf("영어점수 : %d점\n", eng2);
        System.out.printf("수학점수 : %d점\n", math2);
        System.out.printf("총점 : %d점\n", total2);
        System.out.printf("평균 : %d점\n", avg2);
        System.out.println();

        System.out.printf("%d번학생\n", idx3);
        System.out.printf("이름 : %s\n", name3);
        System.out.printf("나이 : %d살\n", age3);
        System.out.printf("국어점수 : %d점\n", kor3);
        System.out.printf("영어점수 : %d점\n", eng3);
        System.out.printf("수학점수 : %d점\n", math3);
        System.out.printf("총점 : %d점\n", total3);
        System.out.printf("평균 : %d점\n", avg3);
        System.out.println();

        System.out.printf("전체 총점 : %d점\n", totalAll);
        System.out.printf("전체 평균 : %d점\n", avgAll);
```


