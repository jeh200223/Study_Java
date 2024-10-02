### 학생 관리 프로그램에 다형성을 적용해 본다.
- 학생 객체를 관리하는 배열을 하나만 사용한다.
---
- BaseBallStudentClass, BasketBallStudentClass, SoccerStudentClass는 모두
StudentClass를 생속받고 있다. 이에 모든 학생 객체들은 Student 타입형 변수에 담아서 관리한다.
---
### StudentClass에 학생 타입을 담을 변수를 추가한다.

```java
    // 학생이 소속된 운동부
    int studentType;
```
---

### SchoolClass에 학생 수를 담을 변수를 추가한다.
```java
    // 학생 수를 담을 변수
    int studentCount;
```
---
### SchoolClass에 정의한 배열은 Student 타입으로 변경한다.
```java
    // 학생 객체들을 담을 배열
    StudentClass [] studentArray;

    // 생성자
    public SchoolClass(){

    }

```
---

### SchoolClass에 학생 수를 입력받는 메서드를 구현한다.
```java

    // 학생 수를 입력받는다.
    public void inputStudentCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 : ");
        studentCount = scanner.nextInt();
        studentArray = new StudentClass[studentCount];
    }

```

---

### SchoolClass의 inputStudentInfo에 학생수 만큼 반복하는 반복문을 작성한다.
```java
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentCount ; i++){

        }

```


### SchoolClass의 inputStudentInfo 메서드에 소속 운동부 정보를 입력받는 코드를 작성한다.
```java

        // 학생이 소속된 운동부를 입력받는다.
        // 1 : 축구부
        // 2 : 야구부
        // 3 : 농구부
        Scanner scanner = new Scanner(System.in);
        System.out.println("소속 운동부");
        System.out.println("1. 축구부");
        System.out.println("2. 야구부");
        System.out.println("3. 농구부");
        System.out.print("운동부 입력 : ");
        int studentType = scanner.nextInt();
```
---
### 소속 운동부에 따라 분기한다.
```java
            // 운동부에 따라 분기한다.
            switch (studentType){
                // 축구부
                case 1 :
                    break;
                // 야구부
                case 2 :
                    break;
                // 농구부
                case 3 :
                    break;
            }
```

---

### 소속 운동부에 따라 객체를 생성하고 정보를 입력받는다

```java

            // 운동부에 따라 분기한다.
            switch (studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 학생 정보 입력");
                    // 축구부 학생 객체를 생성한다.
                    SoccerStudentClass soccer = new SoccerStudentClass();
                    // 운동부 타입 값을 넣어준다.
                    soccer.studentType = 1;
                    // 축구부 학생 정보를 입력받는다.
                    soccer.inputStudentInfo();
                    // 객체를 배열에 담는다.
                    studentArray[i] = soccer;
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 학생 정보 입력");
                    // 야구부 학생 객체를 생성한다.
                    BaseBallStudentClass baseball = new BaseBallStudentClass();
                    // 운동부 타입 값을 넣어준다.
                    baseball.studentType = 2;
                    // 야구부 학생 정보를 입력받는다.
                    baseball.inputStudentInfo();
                    // 객체를 배열에 담는다.
                    studentArray[i] = baseball;
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 학생 정보 입력");
                    // 농구부 학생 객체를 생성한다.
                    BasketBallStudentClass basketball = new BasketBallStudentClass();
                    // 운동부 타입 값을 넣어준다.
                    basketball.studentType = 3;
                    // 농구부 학생 정보를 입력받는다.
                    basketball.inputStudentInfo();
                    // 객체를 배열에 담는다.
                    studentArray[i] = basketball;
                    break;
            }
```
---
### SchoolClass의 showStudentInfo 메서드에 학생 수 만틈 반복하는 반복문을 작성한다

```java
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentArray.length ; i++){

        }
```
---

### for 문안에 운동부 타입별로 분기한다.
```java
            // 학생 객체의 타입별로 분기한다.
            switch (studentArray[i].studentType){
                // 축구부
                case 1 :
                    break;
                // 야구부
                case 2 :
                    break;
                // 농구부
                case 3 :
                    break;
            }

```
---

### 운동부 타입별로 정보를 출력할 수 있도록 구현해준다.
```java
    // 학생 정보를 출력한다.
    public void showStudentInfo(){
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentArray.length ; i++){
            // 학생 객체의 타입별로 분기한다.
            switch (studentArray[i].studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 선수 정보");
                    SoccerStudentClass soccer = (SoccerStudentClass) studentArray[i];
                    soccer.showStudentInfo();
                    soccer.run();
                    soccer.takkle();
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 선수 정보");
                    BaseBallStudentClass baseball = (BaseBallStudentClass) studentArray[i];
                    baseball.showStudentInfo();
                    baseball.run();
                    baseball.HitBall();
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 선수 정보");
                    BasketBallStudentClass basketball = (BasketBallStudentClass) studentArray[i];
                    basketball.showStudentInfo();
                    basketball.run();
                    basketball.rebound();
                    break;
            }
        }
    }

```

---

