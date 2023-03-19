# Tech-Study
📂엔지니어 기술 면접 스터디 - Java

## Ch01 Java란 무엇인가?
: Java는 방대한 라이브러리와 다양한 싱행 환경을 가지고 있는 하나의 거대한 플랫폼
#### -특징
  
플랫폼 독립성: Java 코드는 JVM(Java Virtual Machine)이 설치된 모든 플랫폼에서 실행될 수 있는 바이트 코드로 컴파일될 수 있다.

객체 지향: Java는 객체 지향 언어로, 데이터와 동작을 캡슐화하는 객체 생성에 중점을 둔다

Garbage collection: Java는 가비지 컬렉션을 통한 자동 메모리 관리 기능이 있어, 프로그래머가 수동으로 메모리를 할당하거나 해제할 필요가 없음.

견고: Java는 강력한 오류 처리 및 예외 처리 메커니즘을 갖추어 프로그램이 갑작스럽게 중단되지 않도록 보장.

멀티 스레드: Java는 다중 실행 스레드를 지원하여 동시에 실행되는 프로그램을 작성하기 쉬움.

이식성: Java 코드는 수정 없이 쉽게 다른 플랫폼으로 이동할 가능.

학습 용이성: Java는 간단한 구문과 대규모 사용자 및 개발자 커뮤니티로 쉽게 학습하고 사용할 수 있도록 설계.

인터프리터와 컴파일러: Java 소스 코드는 바이트 코드로 컴파일될 수 있으며, JVM에서 실행할 수 있다. 혹은 Java 코드는 JVM에서 직접 사용가능.

## Ch02 Java 기초 프로그래밍

#### -클래스(class)
: Java가 속한 객체 지향 언어의 기초적인 빌딩 블록이다. 하나의 자바 프로그램은 클래스들의 집합이다.

#### -메소드(method)
: 특정한 작업을 수행하는 코드의 묶음

#### -문장(statement)
: 사용자가 컴퓨터에게 작업을 지시하는 단위

#### -변수
: 데이터를 담아두는 상자로 비유(자세한 설명 예정)

#### -자료형
기초형(primitive type)
: 정수형, 실수형, 문자형, 논리형으로 분류 가능

참조형(reference type)
: 클래스, 배열, 인터페이스

#### -System.in과 Scanner 객체
: 이를 통해 콘솔에서 정수나 실수, 문자열을 리딩

#### -import 문장
: 다른 클래스를 포함시키는 문장

#### -산술연산자
: +, -, *, /, %

#### -관계연산자
: <, >, <=, >=

#### -논리연산자
: &&, ||, !

## Ch03 조건문, 반복문, 배열

#### -조건문
: 조건에 따라 여러 샐행 경로로 분가하는 구조 => if-else와 switch가 있음

#### -break문
: 현재의 반복을 중단하고 반복 루프를 빠져나갈 때 사용

#### -switch문의 case절
: 정수, 문자, 문자열이 올 수 있음

#### -반복문
: 조건에 따라 문장을 반복하여 실행하는 구조 => for와 while이 있음

#### -do-while
: 문장을 무조건 한번 실행한 후에 조건을 검사하여 반복

#### -반복문안 다른 반복문 사용 가능 여부
: 가능

#### -배열
: 같은 자료형의 데이터를 여러 개 순차적으로 저장하는 자료 구조(Java에서 배열은 객체)
 
 배열 생성 규칙
 1. 참조 변수(배열 객체의 주소를 저장하는 변수)를 선언
 2. 배열을 생성하여 저장 공간 확보

<h4>예시<h4/>
정수 6개를 저장하는 배열 int[] a = new int[7]

=> 배열의 크기는 배열 객체의 length 필드에 저장
