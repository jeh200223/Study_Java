### 학생 관리 프로그램에 다음 개념들을 적용해본다.
1. 각 학생의 운동부 타입을 나타내는 값을 static final 변수로 사용한다.
2. 부모부터 물려받아 overriding하는 메서드들을 추상 메서드로 구현한다.
3. 접근 제한자를 통해 데이터의 무결성을 보장한다.
4. 접근 제한자를 통해 메서드를 마음대로 호출하는 것을 막는다.

---
### 패키지 생성
com.lion.main
com.lion.school
---

### 클래스 생성
com.loin.main 에 MainClass를 만들어준다.

```java
package com.lion.main;

public class MainClass {
    public static void main(String[] args) {

    }
}

```

---

### 각 운동부 타입을 나타내는 값을 정의한다.
- school 패키지에 Values라는 인터페이스를 만들어준다.

```java
public interface Values {
    // 운동부를 나타내는 값
    // 축구부
    int TYPE_SCOCCER = 1;
    int TYPE_BASEBALL = 2;
    int TYPE_BASKETBALL = 3;
}
```

---

### 30번 예제에 있는 StudentClass.java를 복사해 넣어준다.

---

### StudentClass의 run과 doAction을 추상 메서드로 정의해준다.

```java
    // 달리는 기능
    abstract public void run();

    // 기타 행동 메서드
    abstract public void doAction();

```

---

### StudentClass를 추상 클래스로 정의해준다.

```java

abstract public class StudentClass
```

---

### 30번 예제에서 다음 3개의 파일을 복사해 넣어준다.
- BaseBallStudent.java
- BasketBallStudent.java
- ScoccerStudentClass.java
---

### 각 학생 클래스에 추상 메서드를 구현해준다.

---

### 30번 예제에 있는 SchoolClass를 복사해 넣어준다

---

### SchoolClass에서 각 학생부를 나타내는 값을 static final를 사용하는 것으로 변경한다.

```java
                case Values.TYPE_SCOCCER :

                    studentClass = new SoccerStudentClass(Values.TYPE_SCOCCER);

                case Values.TYPE_BASEBALL :

                    studentClass = new BaseBallStudentClass(Values.TYPE_BASEBALL);

                case Values.TYPE_BASKETBALL :

                    studentClass = new BasketBallStudentClass(Values.TYPE_BASKETBALL);

```
---
### 모든 클래스의 변수를 private로 정의해준다.

---

### SchoolClass에 있는 다음 3개의 메서드들을 private로 정의해준다.
- 호출하는 순서가 중요한 메서드들은 private 로 정의한다
- inputStudentCount
- inputStudentInfo
- showStudentInfo

---

### 위의 3개의 메서드를 순서대로 호출하는 메서드를 구현한다.
```java
    // 위의 3개의 메서드를 순서대로 호출하는 메서드
    public void startSchoolAction(){
        inputStudentCount();
        inputStudentInfo();
        showStudentInfo();
    }
```
---





