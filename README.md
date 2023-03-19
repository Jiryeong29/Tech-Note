# Tech-Study
📂엔지니어 기술 면접 스터디 - Java
- [변수](#1)

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

 

  
  
  
