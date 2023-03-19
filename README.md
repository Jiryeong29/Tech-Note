# Tech-Study
📂엔지니어 기술 면접 스터디 - Java   
   
   
#1
==
#### 자바(Java)의 특징   
* 운영체제에 독립적이다   
   * 자바로 작성된 프로그램은 운영체제와 하드웨어에 관계없이 실행이 가능함(JVM)   
* 객체지향언어이다    
   * 캡슐화, 상속, 다형성이 잘 적용이 되어있다   
* 비교적 배우기 쉽다   
   * 다른 언어들의 장점을 취하고 불필요한 부분은 없애고 단순하고 간결하게 이해하기 쉬운 코드를 작성하게끔 하였다   
* 자동 메모리 관리   
   * 프로그램이 실행되면 가비지컬렉터가 자동적으로 메모리 관리를 해주기 때문에 따로 관리 안 해도 된다   
* 네트워크와 분산처리 지원   
   * 다양한 네트워크 라이브러리(Java API)를 통해 네트워크 관련 프로그램 개발 지원   
* 멀티쓰레드 지원   
   * 관련된 Java API가 제공되어 구현이 쉽고 시스템과 관계없이 가능    
   * 여러 쓰레드에 대한 스케줄링은 자바 인터프리터가 담당   
* 동적 로딩   
   * 여러개로 구성된 클래스가 실행 시 모두 로딩되지 않고 필요한 시점에 클래스를 로딩하여 사용할 수 있다   
   * 일부 클래스가 변경되어도 전체 애플리케이션을 다시 컴파일하지 않아도 됨   
   
* * *
#2
==
#### 변수(variable) / 상수(constant)   
## 변수
* 데이터를 저장할 수 있는 메모리 공간을 의미함   
      
* 변수 이름 생성 규칙      
   * 영문자(대소문자), 숫자, 언더스코어 _ , 달러 $로만 구성할 수 있다   
   * 숫자로 시작 불가능   
   * 이름 사이에 공백 포함 불가능   
   * 자바에서 미리 정의된 키워드는 사용 불가능   
      
* 변수의 종류   
   * 기본형(primitive) 변수   
      * 실제 연산에 사용되는 변수   
         -정수형 : byte, short, int, long      
         -실수형 : float, double      
         -문자형 : char   
         -논리형 : boolean   
    * 참조형(reference) 변수
      * 8개의 기본형 변수를 사용하여 사용자가 직접 만들어 사용하는 변수  
   
 * 변수의 선언      
    * 변수를 사용하기 전에는 반드시 변수를 선언하고 초기화 해야함   
      * 변수의 선언과 초기화를 따로 하는 경우
      ```   
      int a;      //변수의 선언
      a = 10;     //변수의 초기화
      system.out.println(a);    //10
      ```   
      * 변수의 선언과 초기화를 동시에 하는 경우   
      ```
      int a = 10;    //변수의 선언 및 초기화
      int b = 15, int c = 20;   //2개의 변수를 동시에 선언 및 초기화   
      system.out.println(b)   //15   
      ```
   
## 상수
* 변수처럼 데이터를 저장할 수 있는 메모리 공간을 의미하지만, 프로그램이 실행되는 동안 메모리에 지정된 데이터를 변경 할 수 없다는 차이가 있다   
* 선언과 동시에 초기화를 해줘야한다   
* final 키워드를 사용하여 선언해야함
   ```
   final int a = 10;  //선언과 동시에 초기화 해줌, 앞에 final붙임
   system.out.println(a)   //10
   ```   
   
* * *
#4
==
#### 연산자(operator)
* 프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산(operation)이라고 함
* 연산에 사용되는 표시나 기호를 연산자(operator)이라고 함
* 연산되는 데이터는 피연산자(operand)이라고 함
* 연산자의 종류 및 설명: <https://phantom.tistory.com/19>   

* * *
#5
==
#### 스캐너(Scanner) 클래스


   
      
      
      
      
 



    


