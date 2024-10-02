# 다형성에 대한 개념과 Overriding에 대한 개념을 적용해본다.

---

1. StudentClass에 필요한 변수를 선언한다.

```java
    // 이름
    String studentName;
    // 나이
    int studentAge;
    // 학생이 소속된 운동부
    int studentType; 
```

---

2. StudentClass에 기본적인 메서드들을 구현한다.

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
}
```
---

3. StudentClass를 상속받은 3개의 클래스를 만들어준다.
- BaseBallStudentClass
- BaketBallStudentClass
- SoccerStudentClass

---

4. SchoolClass를 생성하고 기본적은 변수와 메서드를 구현한다.

```java
public class SchoolClass {
    // 학생 객체들을 담을 배열
    StudentClass [] studentArray;
    // 학생 수를 담을 변수
    int studentCount;

    // 학생 수를 입력받는다.
    public void inputStudentCount(){
    }

    // 학생 정보를 입력받는다.
    public void inputStudentInfo(){
    }

    // 학생 정보를 출력한다.
    public void showStudentInfo(){
    }
}

```
5. MainClass를 생성하고 코드를 작성해준다.
- 이전에 만든 예제와 동일하게 작성한다.
```java
public class MainClass {
    public static void main(String[] args) {
        // 학교 객체를 생성한다.
        SchoolClass schoolClass = new SchoolClass();
        // 학생 수를 입력받는다.
        schoolClass.inputStudentCount();
        // 학생 정보를 입력받는다.
        schoolClass.inputStudentInfo();
        // 학생 정보를 출력한다.
        schoolClass.showStudentInfo();
    }
} 
```

---

6. SchoolClass에서 학생수를 입력받는 메서드를 구현한다.
- 이전 예제와 동일하게 한다.
```java
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 : ");
        studentCount = scanner.nextInt();
        studentArray = new StudentClass[studentCount];
```
---

7. SchoolClass의 inputStudentInfo 메서드에 반복문을 구현한다.

```java
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentCount ; i++){

        }

```

8. 학생의 운동부 타입을 입력 받는 코드를 작성한다.
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

9. 학생 객체를 담을 변수를 선언한다. 부모타입으로 선언한다.

```java
            // 생성된 학생 객체를 담을 변수
            StudentClass studentClass = null;
```

10. 운동부 타입에 따른 객체를 생성한다.

```java
// 운동부에 따라 분기한다.
            switch (studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 학생 정보 입력");
                    // 축구부 학생 객체를 생성한다.
                    studentClass = new SoccerStudentClass();
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 학생 정보 입력");
                    // 야구부 학생 객체를 생성한다.
                    studentClass = new BaseBallStudentClass();
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 학생 정보 입력");
                    // 농구부 학생 객체를 생성한다.
                    studentClass = new BasketBallStudentClass();
                    break;
            }

```

11. 학생 정보를 입력받는 메서드를 호출해 준다.

```java
            // 부모형 변수를 통해 자식에 구현해 놓은 정보를 입력받는
            // 메서드를 호출한다.
            studentClass.inputStudentInfoBase(scanner);
            // 배열에 담는다.
            studentArray[i] = studentClass; 
```

---

12. StudentClass에 운동부 타입을 받는 생성자를 작성해준다.

```java
    // 생성자
    // 소속된 운동부 번호를 받는다.
    public StudentClass(int studentType){
        this.studentType = studentType;
    }
```

---

13. BaseBallStudentClass에 생성자를 추가하여 준다.

```java
    // 생성자
    public BaseBallStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }
```
---

14. BasketBallStudentClass에 생성자를 추가하여 준다.

```java
    // 생성자
    public BasketBallStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }
```
---

15. SocceerStudentClass에 생성자를 추가하여 준다.

```java
    // 생성자
    public SoccerStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }

```
---

16. 각 학생 클래스의 객체를 생성할 때 운동부 번호를 전달하는 것으로 수정한다.

```java
            // 운동부에 따라 분기한다.
            switch (studentType){
                // 축구부
                case 1 :
                    System.out.println("축구부 학생 정보 입력");
                    // 축구부 학생 객체를 생성한다.
                    studentClass = new SoccerStudentClass(1);
                    break;
                // 야구부
                case 2 :
                    System.out.println("야구부 학생 정보 입력");
                    // 야구부 학생 객체를 생성한다.
                    studentClass = new BaseBallStudentClass(2);
                    break;
                // 농구부
                case 3 :
                    System.out.println("농구부 학생 정보 입력");
                    // 농구부 학생 객체를 생성한다.
                    studentClass = new BasketBallStudentClass(3);
                    break;
            }

```

---

17. SchoolClass의 showStudentInfo 메서드에 학생 수 만큼 반복하는 반복문을 작성한다.

```java
        // 학생의 수 만큼 반복한다.
        for(int i = 0 ; i < studentArray.length ; i++){

        }
```
---

18. 정보를 출력하는 메서드를 호출한다.

```java
            // 정보를 출력하는 메서드를 호출한다.
            studentArray[i].showStudentInfoBase();
            studentArray[i].run();
```
---

19. BaseBallStudentClass에 필요한 변수를 선언한다.

```java

    // 안타 개수
    int HitCount;
```
---

20. 부모클래스인 StudentClass의 inputStudentInfoBase 메서드에 각 클래스의 메서드에서 필효한 공통 부분을 구현해준다.

```java
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
```
---

21. BaseBallStudentClass에 입력받는 메서드를 구현한다.

```java
    // 학생정보를 입력받는 메서드
    // 부모의 메서드를 재구현한다.
    @Override
    public void inputStudentInfoBase(Scanner scanner) {
        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        // 부모의 메서드를 호출한다.
        super.inputStudentInfoBase(scanner);
        // 나머지 부분을 입력 받는다.
        System.out.print("안타 개수 : ");
        HitCount = scanner.nextInt();
    }

```
---

22. 부모클래스인 StudentClass에 학생 정보의 공통부분을 출력하는 메서드를 구현한다.

```java
    // 학생들의 정보를 출력하는 메서드
    public void showStudentInfoBase() {
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d살", studentAge);
    }
```

---

23. StudentClass에 추가 행동을 위한 메서드를 작성해준다.

```java
    // 기타 행동 메서드
    public void doAction(){

    }
```
---
24. BaseBallStudentClass에 기타 행동을 하는 메서드를 작성해준다.

```java
    // 공을 치는 기능
    public void HitBall(){
        System.out.println("안타를 친다");
    }

    // 기타 행동을 하는 메서드
    // 부모의 메서드를 재구현 한다.
    @Override
    public void doAction() {
        HitBall();
    }

```

---

25. BasketBallStudentClass도 비슷하게 구현해준다.


```java
public class BasketBallStudentClass extends StudentClass{

    // 키
    int height;

    // 생성자
    public BasketBallStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }

    @Override
    public void inputStudentInfoBase(Scanner scanner) {
        System.out.println();
        System.out.println("농구부 학생 정보 입력");
        // 부모의 메서드를 호출한다.
        super.inputStudentInfoBase(scanner);
        // 나머지 부분을 입력 받는다.
        System.out.print("키: ");
        height = scanner.nextInt();
    }

    @Override
    public void showStudentInfoBase() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        super.showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("키 : %d\n", height);
    }

    // 리바운드를 하는 기능
    public void rebound() {
        System.out.println("라바운드 한다");
    }

    @Override
    public void doAction() {
        rebound();
    }
}

```
---

26. SoccerStudentClass도 비슷하게 구현해준다.

```java
public class SoccerStudentClass extends StudentClass{

    // 골 넣은 횟수
    int goalCount;

    // 생성자
    public SoccerStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }

    public void inputStudentInfoBase(Scanner scanner) {
        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        // 부모의 메서드를 호출한다.
        super.inputStudentInfoBase(scanner);
        // 나머지 부분을 입력 받는다.
        System.out.print("넣은 골 개수 : ");
        goalCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfoBase() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        super.showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("넣은 골 개수 : %d\n", goalCount);
    }

    // 태클하는 메서드
    public void takkle(){
        System.out.println("태클 한다");
    }

    @Override
    public void doAction() {
        takkle();
    }
}

```

