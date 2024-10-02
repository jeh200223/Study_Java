학생정보 관리 프로그램을 배열을 적용하여 만들어 본다.

배열은 배열이 관리할 기억장소의 개수가 결정되어 있어야만
생성할 수 있기 때문에 처음에 학생 수를 입력 받을 것이다.

StudentClass의 내용은 17번 예제에 있는 내용을 그대로 복사해서
넣어준다.

---

### StudentClass 작성
- 17번 예제에 있는 코드를 그대로 복사해서 넣어준다.

```java
package com.lion.data;

import java.util.Scanner;

public class StudentClass {
    // 학생번호
    int idx;
    // 이름
    String name;
    // 나이
    int age;
    // 국어점수
    int kor;
    // 영어점수
    int eng;
    // 수학점수
    int math;
    // 총점
    int total;
    // 평균
    int avg;

    // 학생 1명의 정보를 입력받는 메서드
    void setStudentInfo(){
        // 학생의 정보를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("학생번호 : ");
        idx = scanner.nextInt();
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
    }
    // 입력받은 점수를 통해 총점과 평균을 구하는 메서드
    void setStudentTotalAndAvg(){
        // 총점을 구한다.
        total = kor + eng + math;
        // 평균을 구한다.
        avg = total / 3;
    }
    // 각 학생에 대한 정보를 출력하는 메서드
    void showStudentInfo(){
        System.out.println();
        System.out.printf("학생 번호 : %d\n", idx);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d살\n", age);
        System.out.printf("국어점수 : %d점\n", kor);
        System.out.printf("영어점수 : %d점\n", eng);
        System.out.printf("수학점수 : %d점\n", math);
        System.out.printf("총점 : %d점\n", total);
        System.out.printf("평균 : %d점\n", avg);
    }
}


```

### SchoolClass 작성
- 17번 예제의 내용과 동일한 부분만 복사해서 넣어준다.

```java
package com.lion.data;

public class SchoolClass {
    // 전체 총점
    int total = 0;
    // 전체 평균
    int avg;


    // 학생 전체의 총점과 평균을 구하는 메서드
    void setTotalAndAvg(){

    }
    // 학생 전체의 총점과 평균을 출력하는 메서드
    void showTotalAndAvg(){
        System.out.println();
        System.out.printf("전체 총점 : %d점\n", total);
        System.out.printf("전체 평균 : %d점\n", avg);
    }
}

```

### SchoolClass에 변수를 추가한다.

```java

    // 학생수를 담을 변수
    int studentCnt;
    // 학생 객체들을 담을 배열
    StudentClass [] studentArray;

```

### SchoolClass에 기능을 추가로 정리한다.

```java
    // 학생수를 입력받는 메서드

    // 학생들의 정보를 입력받는 메서드

    // 학생들의 정보를 출력하는 메서드
```

### schoolClass에 학생수를 입력받는 메서드를 구현해준다.
```java
    // 학생수를 입력받는 메서드
    public void setStudentCnt(){
        Scanner scanner = new Scanner(System.in);
        // 학생수를 입력받는다.
        System.out.print("학생 수를 입력해주세요 : ");
        studentCnt = scanner.nextInt();

        // 학생의 수 만큼 기억장소를 관리하는 배열을 생성한다.
        studentArray = new StudentClass[studentCnt];

        // 입력받은 학생 수 만큼 객체를 생성해서 배열에 담아준다.
        for(int i = 0 ; i < studentCnt ; i++){
            studentArray[i] = new StudentClass();
        }
    }

```

### schoolClass에 학생 정보를 입력받는 메서드를 구현한다.
```java
    // 학생들의 정보를 입력받는 메서드
    void setStudentInfo(){
        // 학생의 수 만큼 반복한다.
        for(StudentClass s1 : studentArray) {
            // 학생의 정보를 입력받는다.
            s1.setStudentInfo();
            // 학생의 총점과 평균을 구한다.
            s1.setStudentTotalAndAvg();
        }
    }

```

### 전체 총점과 평균을 구하는 메서드를 구현해준다.
```java

    // 학생 전체의 총점과 평균을 구하는 메서드
    void setTotalAndAvg(){
        // 학생의 수 만큼 반복한다.
        for(StudentClass s1 : studentArray) {
            // 학생의 총점을 전체 총점에 누적한다.
            total = total + s1.total;
        }
        // 평균을 구한다.
        avg = total / (studentCnt * 3);
    }
```

### MainClass의 main에 작업 순서를 정리한다.

```java

        // 학교 객체를 생성한다.

        // 학생수를 입력받는다.

        // 학생들의 정보를 입력받는다.

        // 전체 총점과 평균을 구한다.

        // 학생들의 정보를 출력한다.

        // 전체 총점과 평균을 출력한다.

```

### 설계한 순서대로 메서드를 호출한다.

```java
        // 학교 객체를 생성한다.
        SchoolClass schoolClass = new SchoolClass();
        // 학생수를 입력받는다.
        schoolClass.setStudentCnt();
        // 학생들의 정보를 입력받는다.
        schoolClass.setStudentInfo();
        // 전체 총점과 평균을 구한다.
        schoolClass.setTotalAndAvg();
        // 학생들의 정보를 출력한다.
        schoolClass.showStudentInfo();
        // 전체 총점과 평균을 출력한다.
        schoolClass.showTotalAndAvg();

```