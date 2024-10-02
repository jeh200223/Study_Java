학생관리 프로그램

축구부 학생들, 야구부 학생들, 농구부 학생들이 있다.
3명씩 있다고 가정한다.

축구부 학생
데이터 : 이름, 나이, 골 넣은 횟수
기능 : 달린다, 태클을 한다.

야구부 학생
데이터 : 이름, 나이, 안타 개수
기능 : 달린다, 공을 친다.

농구부 학생
데이터 : 이름, 나이, 키
기능 : 달린다, 리바운드를 한다.

학생들의 정보를 입력을 받는다.
축구부, 야구부, 농구부 순으로 받는다.

입력이 모두 완료되면
축구부, 야구부, 농구부 순서대로 출력한다.

---

### 출력 화면

```java
        // 출력화면
        System.out.println("축구부 학생들");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("골 넣은 횟수 : 20골");

        System.out.println("야구부 학생들");
        System.out.println("이름 : 최길동");
        System.out.println("나이 : 11살");
        System.out.println("안타개수 : 10개");

```

### 필요한 데이터
- 이름
- 나이
- 골 넣은 회수
- 안타 개수
- 키

### 구현할 기능들
- 학생들의 정보를 입력받는 기능
- 학생들의 정보를 출력하는 기능
- 달리는 기능
- 태클을 하는 기능
- 공을 치는 기능
- 리바운드를 하는 기능

### 데이터 선별
- 이름 -> 축구부, 야구부, 농구부
- 나이 -> 축구부, 야구부, 농구부
- 골 넣은 회수 -> 축구부
- 안타 개수 -> 야구부
- 키 -> 농구부

### 기능 선별
- 학생들의 정보를 입력받는 기능 -> 축구부, 야구부, 농구부
- 학생들의 정보를 출력하는 기능 -> 축구부, 야구부, 농구부
- 달리는 기능 -> 축구부, 야구부, 농구부 
- 태클을 하는 기능 -> 축구부
- 공을 치는 기능 -> 야구부
- 리바운드를 하는 기능 -> 농구부

### com.lion.school 패키지에 클래스를 만들어준다.
- BaseBallStudentClass
- BasketBallStudentClass
- SoccerStudentClass

### SoccerStudentClass.java를 구현한다.
```java
package com.lion.school;

public class SoccerStudentClass {
    // 이름
    String studentName;
    // 나이
    int studentAge;
    // 골 넣은 횟수
    int goalCount;
    // 학생 정보를 입력받는 메서드
    public void inputStudentInfo(){

    }
    // 학생 정보를 출력하는 메서드
    public void showStudentInfo(){

    }
    // 달리는 메서드
    public void run(){

    }
    // 태클하는 메서드
    public void takkle(){
        
    }
}


```

### BaseBallStudentClass 를 구현한다.

```java
package com.lion.school;

public class BaseBallStudentClass {
    // 이름
    String studentName;
    // 나이
    int studentAge;
    // 안타 개수
    int HitCount;
    // 학생들의 정보를 입력받는 기능
    public void inputStudentInfo(){

    }
    // 학생들의 정보를 출력하는 기능
    public void showStudentInfo(){

    }
    // 달리는 메서드
    public void run(){

    }
    // 공을 치는 기능
    public void HitBall(){

    }
}


```

### BasketBallStudentClass를 구현해준다.

```java
package com.lion.school;

public class BasketBallStudentClass {
    // 이름
    String studentName;
    // 나이
    int studentAge;
    // 키
    int height;

    // 학생들의 정보를 입력받는 메서드
    public void inputStudentInfo() {

    }

    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfo() {

    }

    // 달리는 기능
    public void run() {

    }

    // 리바운드를 하는 기능
    public void rebound() {

    }
}


```

### school 패키지에 부모클래스 역할을 할 클래스를 만들어준다.
StudentClass

### StudentClass에 각 클래가 가지고 있는 맴벼 변수 중 중복되는 변수를 작성해준다.
```java
package com.lion.school;

public class StudentClass {
    // 이름
    String studentName;
    // 나이
    int studentAge;
}

```

### SoccerStudentClass, BaseBallStudentClass, BasketBallStudentClass 에 있는 studentName과 studentAge변수를 삭제해준다.

### 각 클래스가 StudentClass를 상속받도록 한다.

extends StudentClass

### StudentClass에 다음 메서드들을 추가한다.

```java

    // 학생들의 정보 중 공통 부분을 입력받는 메서드
    public void inputStudentInfoBase(Scanner scanner) {

    }

    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfoBase() {

    }

    // 달리는 기능
    public void run() {

    }

```

### SoccerStudentClass, BaseBallStudentClass, BasketBallStudentClass 에 있는 run 메서드들은 삭제한다.

### StudentClass에서 학생 정보를 입력받는 부분을 구현한다.
```java
    public void inputStudentInfoBase(Scanner scanner) {
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
    }
```

### StudentClass에서 학생 정보를 출력하는 부분을 구현한다.
```java
    public void showStudentInfoBase() {
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d살", studentAge);
    }
```

### StudentClass에서 달리는 메서드를 구현한다.
```java
    public void run() {
        System.out.println("달린다");
    }
```

### SoccerStudentClass 에 학생 정보를 입력하는 메서드를 구현한다.
```java

    public void inputStudentInfo(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // 부모에 있는 메서드를 호출한다.
        inputStudentInfoBase(scanner);
        // 나머지를 입력받는다.
        System.out.print("넣은 골 개수 : ");
        goalCount = scanner.nextInt();
    }
```
### SoccerStudentClass에 학생 정보를 출력하는 메서드를 구현한다.
```java
    // 학생 정보를 출력하는 메서드
    public void showStudentInfo(){
        System.out.println();
        // 부모의 매서드를 호출한다.
        showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("넣은 골 개수 : %d\n", goalCount);
    }

```
### SoccerStudentClass에 태클하는 메서드를 구현한다.
```java

    // 태클하는 메서드
    public void takkle(){
        System.out.println("태클 한다");
    }
```

### BaseBallStudentClass도 비슷하게 구현해준다.

```java

    // 학생들의 정보를 입력받는 기능
    public void inputStudentInfo(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // 부모에 있는 메서드를 호출한다.
        inputStudentInfoBase(scanner);
        // 나머지를 입력받는다.
        System.out.print("안타 개수 : ");
        HitCount = scanner.nextInt();
    }
    // 학생들의 정보를 출력하는 기능
    public void showStudentInfo(){
        System.out.println();
        // 부모의 매서드를 호출한다.
        showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("안타 개수 : %d\n", HitCount);
    }
    // 공을 치는 기능
    public void HitBall(){
        System.out.println("안타를 친다");
    }
```

### BasketBallStudentClass 도 비슷하게 구현해준다.
```java
    // 학생들의 정보를 입력받는 메서드
    public void inputStudentInfo() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // 부모에 있는 메서드를 호출한다.
        inputStudentInfoBase(scanner);
        // 나머지를 입력받는다.
        System.out.print("키: ");
        height = scanner.nextInt();
    }

    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfo() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("키 : %d\n", height);
    }

    // 리바운드를 하는 기능
    public void rebound() {
        System.out.println("라바운드 한다");
    }

```

### school 패키지에 SchoolClass를 생성해준다.

### SchoolClass에 배열을 생성해준다.
```java
    // 학생 객체들을 담을 배열
    SoccerStudentClass [] soccerArray;
    BaseBallStudentClass [] baseBallArray;
    BasketBallStudentClass [] basketBallArray;

    // 생성자
    public SchoolClass(){
        // 배열을 생성한다.
        soccerArray = new SoccerStudentClass[3];
        baseBallArray = new BaseBallStudentClass[3];
        basketBallArray = new BasketBallStudentClass[3];
    }


```

### SchoolClass에 필요한 메서드들을 구현해준다.
```java
    // 학생 정보를 입력받는다.
    public void inputStudentInfo(){

    }

    // 학생 정보를 출력한다.
    public void showStudentInfo(){

    }
```

### 학생 정보를 입력받는 메서드를 구현한다.
```java
    // 학생 정보를 입력받는다.
    public void inputStudentInfo(){
        System.out.println("축구부 학생 정보 입력");
        for(int i = 0 ; i < 3 ; i++){
            // 축구부 학생 객체를 생성한다.
            SoccerStudentClass soccer = new SoccerStudentClass();
            // 축구부 학생 정보를 입력받는다.
            soccer.inputStudentInfo();
            // 객체를 배열에 담는다.
            soccerArray[i] = soccer;
        }

        System.out.println("야구부 학생 정보 입력");
        for(int i = 0 ; i < 3 ; i++){
            // 야구부 학생 객체를 생성한다.
            BaseBallStudentClass baseball = new BaseBallStudentClass();
            // 야구부 학생 정보를 입력받는다.
            baseball.inputStudentInfo();
            // 객체를 배열에 담는다.
            baseBallArray[i] = baseball;
        }

        System.out.println("농구부 학생 정보 입력");
        for(int i = 0 ; i < 3 ; i++){
            // 농구부 학생 객체를 생성한다.
            BasketBallStudentClass basketball = new BasketBallStudentClass();
            // 농구부 학생 정보를 입력받는다.
            basketball.inputStudentInfo();
            // 객체를 배열에 담는다.
            basketBallArray[i] = basketball;
        }
    }

```

### MainClass의 main 메서드 내부를 설계한다.
```java
        // 학교 객체를 생성한다.

        // 학생 정보를 입력받는다.

        // 학생 정보를 출력한다.

```

### MainClass의 main 메서드를 구현한다.
```java

    public static void main(String[] args) {
        // 학교 객체를 생성한다.
        SchoolClass schoolClass = new SchoolClass();
        // 학생 정보를 입력받는다.
        schoolClass.inputStudentInfo();
        // 학생 정보를 출력한다.
        schoolClass.showStudentInfo();
    }
```
