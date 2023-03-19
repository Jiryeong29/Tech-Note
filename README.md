# Tech-Study
📂엔지니어 기술 면접 스터디 - Java
- [변수](#1)
- [연산자](#2)

## #1
#### 변수

변수는 단 하나의 값을 저장할 수 있는 메모리 공간

- **다양한 변수 선언방법**
  ```Java
  int age = 5; // age라는 int형 변수를 선언하고 5로 초기화 크기는 2^4byte
  boolean a = true; // bool타입은 true와 false의 값을 가짐, 조건식과 논리적 계산에 사용
  char a = 'a'; //char는 자바에서는 하나의 문자가 2byte, 크기는 2^2byte 
  float a =  5.2; // 부동소수점까지 표현 가능 크기는 2^4byte
  double a = 5; // double은 float의 두배의 크기를 가짐 2^8byte
  ```
- **변수의 명명규칙(필수)**
  - 대소문자가 구분되며 길이에 제한이 없다.
  - 예약어를 사용해서는 안된다.
  - 숫자로 시작해서는 안된다.
  - 특수문자는 '_'와 '$'만 허용한다. 
 
- **권장하는 규칙(권장)**
  - 클래스 이름의 첫 글자는 항상 대문자로 한다.
  - 여려 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
  - 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우 '_'로 구분한다.
 
- **참조형**
  - 참조형은 객체의 주소를 저장한다. 8개의 기본형을 제외한 나머지 타입 아래는 Date클래스의 참조변수 today를 선언하는 방법이다.
  ```Java
  class Date{
    void aa();
  }
  public class test{
    public static void main(String[] args){
      Date today = new Date(); //Date객체를 생성하고 그 주소를 today에 저장
    }
  }
  ```
- **상수와 선언방법**
  - 상수는 변수와 마찬가지로 값을 저장할 수 있는 공간이지만, 변수와 달리 한번 저장된 값은 변경할 수 없다.
 
   ```Java
  final int MAX; // 에러, 상수는 선언과 동식에 초기화해야함
  final MAX = 100;
  MAX = 333; // 에러, 상수는 값을 변경할 수 없다.
  ```
  
- **String**
  - char는 하나의 문자밖에 저장이 안된다 문자열을 저장하기 위해서는 String을 사용해야함
  ```Java
  char a = 'J'; //char a = "Java"를 하면 에러 하나의 문자밖에 저장이 안되기때문에
  String s = "Java" // OK
  String s = new String("Java") // String은 원래 클래스이기때문에 이와같이 선언해야하나 특별히 위에 방식도 허용
  ```

- **입출력**
  - 입출력은 방식의 차이일뿐 대체로 유사하기때문에 코드로 대체
  ```Java
  int age = 14;
  System.out.println("JAVA"); //Java 출력
  System.out.println("%d", age); // 14출력
  
  Scanner scanner = new scanner(System.in);
  String input = scanner.nextLine(); // 입력받은 문자열을 input에 저장
  int n = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
  ```
- **2의 보수**
  - 어떤 수의 'n의 보수'는 더했을 때 n이 되는 수를 말한다.
  - 2의 보수를 해주는 이유는 음수를 표현하기 위해서
  - -5를 2의 보수를 해주는 과정은 0101(5의 절대값)  -> 1010(1의 보수)  -> 1011(1의 보수 + 1)이다.

- **형변환**
  - 형변환은 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
  ```Java
  double d = 85.4
  int score = (int)d; // int형으로 형변환해주기 때문에 85가 저장된다
  System.out.println(score) // 85가 출력
  ```
 
 ## #2
#### 연산자

- **연산자와 피연산자**
  - `연산자` 연산을 수행하는 기호(+,-,*,/등)
  - `피연산자` 연산자의 작업 대상(뱐수, 상수, 리터럴, 수식) 

- **연산자의 종류**
  - `산술 연산자` 사칙 연산(+,-,*,/)과 나머지 연산(%)
  - `비교 연산자` 크고 작음(<, >, ==)
  - `논리 연산자` &&(AND) ||(OR)
  - `대입 연산자` =(우변의 값을 좌변의 저장)
 
- **연산자의 우선순위**
  - `산술 연산자` `비교 연산자` `논리 연산자` `대입 연산자` 순으로 우선순위가 높다.   
  
- **산술 변환**
  - 이항 연산자는 두 피연산자의 타입이 일치해야한다.
  ```Java
  int n = 5;
  double m = 10.5;
  float result = m + (float)n; // 형변환으로 타입 일치
  float result = m + n; // 오류x, 자동적으로 큰 타입으로 형변환 왜냐하면, 작은 타입으로 형변환 할 시 10.5가 10이 되면서 손실이 발생
  ``` 
- **증감 연산자**
  - `증가 연산자(++)` 피연산자의 값을 1 증가시킨다.
  - `감소 연산자(--)` 피연산자의 값을 1 감소시킨다. 
  - `전위형` 값이 참조되기 전에 증가시킨다
  - `후위형` 값이 참조된 후에 증가시킨다.
  ```Java
  int i = 0;
  System.out.println(i++) // 0출력
  i = 0;
  System.out.println(++i) // 1출력
  ```
- **char의 사칙연산**
  ```Java
  char c = 'a';
  int i = c + 1 // a의 아스키코드인 97 + 1이 돼서 98이 된다
  char c2 = (char)(c + 1); // char로 형변환을 해줬기 때문에 아스키 코드 98에 해당하는 b가 나온다.
  
  char c3 = c + 1; // 컴파일 에러
  char c3 = 'a' + 1; 컴파일 에러X, 리터럴 연산이기 때문에 실행과정동안 변하는 값이 아니기 때문에
  ```
- **논리연산자**
  - `||(OR결합)` 피연산자 중 어느 한 쪽만 true이면 true로 결과를 얻는다.
  ```Java
  int x = 5;
  int y = 9;
  if(x == 5 || x == 9) // true
  if(x == 3 || x == 9) // true
  if(x == 5 || x == 7) // true
  if(x == 4 || x == 3) // false
  ```
  - `&&(AND)` 피연산자 양쪽 다 true여야지 true로 결과를 얻는다.
  ```Java
  int x = 5;
  int y = 9;
  if(x == 5 || x == 9) // true
  if(x == 5 || x == 8) // false
  if(x == 3 || x == 9) // false
  ```

- **삼항연산자**
  - `조건식 ? 식1 : 식2`
  ```Java
  result = (x > y) ? x : y; //조건식이 참이면 x를 거짓이면 y를 반환
  ```
- **복합대입연산자**
  - `다양한 복합대입연산자`
  ```Java
  int i = 3;
  i += 1; // i = i + 1;
  //여기서부터 i = 3으로 초기화 했다고 가정
  i -= 1; // i = i - 1;
  i *= 3 // i = i * 3;
  i /= 3 // i = i / 3;
  i %= 3 // i = i % 3;
  ```
