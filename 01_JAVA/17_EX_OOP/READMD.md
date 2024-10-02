학생관리 예제인 15_EX 를 객체지향 기법을 적용하여 구현해본다.

---

### 출력화면

```java
        // 출력화면
        System.out.printf("1번학생\n");
        System.out.printf("이름 : 홍길동\n");
        System.out.printf("나이 : 10살\n");
        System.out.printf("국어점수 : 100점\n");
        System.out.printf("영어점수 : 100점\n");
        System.out.printf("수학점수 : 100점\n");
        System.out.printf("총점 : 300점\n");
        System.out.printf("평균 : 100점\n");
        System.out.println();

        System.out.printf("1번학생\n");
        System.out.printf("이름 : 홍길동\n");
        System.out.printf("나이 : 10살\n");
        System.out.printf("국어점수 : 100점\n");
        System.out.printf("영어점수 : 100점\n");
        System.out.printf("수학점수 : 100점\n");
        System.out.printf("총점 : 300점\n");
        System.out.printf("평균 : 100점\n");
        System.out.println();

        System.out.printf("1번학생\n");
        System.out.printf("이름 : 홍길동\n");
        System.out.printf("나이 : 10살\n");
        System.out.printf("국어점수 : 100점\n");
        System.out.printf("영어점수 : 100점\n");
        System.out.printf("수학점수 : 100점\n");
        System.out.printf("총점 : 300점\n");
        System.out.printf("평균 : 100점\n");
        System.out.println();


        System.out.printf("전체 총점 : 1000점\n");
        System.out.printf("전체 평균 : 100점\n");

```


### 필요한 데이터
- 학생번호, 이름, 나이, 국어점수, 영어점수, 수학점수, 총점, 평균이 학생 수 만큼
- 전체 총점, 전체 평균

### 필요한 기능
- 학생 1명의 정보를 입력받는 기능
- 입력받은 점수를 통해 총점과 평균을 구하는 기능
- 학생 전체의 총점과 평균을 구하는 기능
- 각 학생에 대한 정보를 출력하는 기능
- 학생 전체의 총점과 평균을 출력하는 기능

### 데이터 선별
- 학생 1명의 데이터 : 학생번호, 이름, 나이, 국어점수, 영어점수, 수학점수, 총점, 평균
- 학생 전체 데이터 : 전체 총점, 전체 평균

### 기능 선별
- 학생 1명의 정보를 입력받는 기능 -> 학생
- 입력받은 점수를 통해 총점과 평균을 구하는 기능 -> 학생
- 학생 전체의 총점과 평균을 구하는 기능 -> 학교
- 각 학생에 대한 정보를 출력하는 기능 -> 학생
- 학생 전체의 총점과 평균을 출력하는 기능 -> 학교

### 학교 클래스와 학생 클래스를 작성해준다.
```java
// 학교 클래스
class SchoolClass{

}

// 학생 클래스
class StudentClass{

}
```

### 학교 클래스를 설계한다.
```java
class SchoolClass{
    // 전체 총점
    // 전체 평균

    // 학생 전체의 총점과 평균을 구하는 메서드
    // 학생 전체의 총점과 평균을 출력하는 메서드
}
```
### 학생 클래스를 설계한다.
```java
// 학생 클래스
class StudentClass{
    // 학생번호
    // 이름
    // 나이
    // 국어점수
    // 영어점수
    // 수학점수
    // 총점
    // 평균

    // 학생 1명의 정보를 입력받는 메서드
    // 입력받은 점수를 통해 총점과 평균을 구하는 메서드
    // 각 학생에 대한 정보를 출력하는 메서드
}

```

### 학교 클래스의 변수와 메서드를 정의한다.
```java

class SchoolClass{
    // 전체 총점
    int total;
    // 전체 평균
    int avg;

    // 학생 전체의 총점과 평균을 구하는 메서드
    void setTotalAndAvg(){

    }
    // 학생 전체의 총점과 평균을 출력하는 메서드
    void showTotalAndAvg(){

    }
}

```

### 학생 클래스의 변수와 메서드를 정의한다.
```java
// 학생 클래스
class StudentClass{
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

    }
    // 입력받은 점수를 통해 총점과 평균을 구하는 메서드
    void setStudentTotalAndAvg(){

    }
    // 각 학생에 대한 정보를 출력하는 메서드
    void showStudentInfo(){
        
    }
}

```

### 학생 클래스에서 학생 한 명의 정보를 받는 메서드를 구현한다.
```java
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

```

### 학생 한명의 총점과 평균을 구하는 메서드를 구현한다.
```java
    // 입력받은 점수를 통해 총점과 평균을 구하는 메서드
    void setStudentTotalAndAvg(){
        // 총점을 구한다.
        total = kor + eng + math;
        // 평균을 구한다.
        avg = total / 3;
    }
```

### 학생 한명의 정보를 출력하는 메서드를 구현한다.
```java

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
```

### 학교 클래스에 있는 총점 변수를 0으로 초기화 한다.
```java
    int total = 0;
```

### 학교 클래스에 학생 객체를 담을 변수를 정의한다.
```java
    // 학생 객체를 담을 변수
    StudentClass s1, s2, s3;
```

### 학교 클래스에 전체 총점을 구하는 메서드를 구현한다.
```java
    // 학생 전체의 총점과 평균을 구하는 메서드
    void setTotalAndAvg(){
        // 총점을 누적한다.
        total = s1.total + s2.total + s3.total;
        // 평균을 구한다.
        avg = total / 9;
    }
```

### 학교 클래스에 총점과 평균을 출력하는 메서드를 구현한다.
```java
    // 학생 전체의 총점과 평균을 출력하는 메서드
    void showTotalAndAvg(){
        System.out.println();
        System.out.printf("전체 총점 : %d점\n", total);
        System.out.printf("전체 평균 : %d점\n", avg);
    }
```

### main() 메서드에서 출력화면을 구성했던 코드는 모두 삭제한다.

### 학교 객체를 생성한다.
```java
        // 학교의 객체를 생성한다.
        SchoolClass schoolClass = new SchoolClass();
```

### 학생들의 객체를 생성한다.
```java
        // 학생들의 객체를 생성한다.
        schoolClass.s1 = new StudentClass();
        schoolClass.s2 = new StudentClass();
        schoolClass.s3 = new StudentClass();
```

###  작업 순서를 설계한다.
```java
        // 각 학생들의 정보를 입력받는다.

        // 각 학생들의 총점과 평균을 구한다.

        // 전체 총점과 평균을 구한다.

        // 각 학생들의 정보를 출력한다.

        // 전체 총점과 평균을 출력한다.
```
### 학생들의 정보를 입력받는다.
```java
        // 각 학생들의 정보를 입력받는다.
        schoolClass.s1.setStudentInfo();
        schoolClass.s2.setStudentInfo();
        schoolClass.s3.setStudentInfo();
```

### 학생들의 총점과 평균을 구한다.
```java
        // 각 학생들의 총점과 평균을 구한다.
        schoolClass.s1.setStudentTotalAndAvg();
        schoolClass.s2.setStudentTotalAndAvg();
        schoolClass.s3.setStudentTotalAndAvg();
```

### 전체 총점과 평균을 구하는 메서드를 구현한다.
```java
        // 전체 총점과 평균을 구한다.
        schoolClass.setTotalAndAvg();
```
### 학생들의 정보를 출력하는 메서드를 구현한다.
```java
        // 각 학생들의 정보를 출력한다.
        schoolClass.s1.showStudentInfo();
        schoolClass.s2.showStudentInfo();
        schoolClass.s3.showStudentInfo();
```

### 전체 총점과 평균을 출력하는 메서드를 구현한다.
```java
        // 전체 총점과 평균을 출력한다.
        schoolClass.showTotalAndAvg();
```