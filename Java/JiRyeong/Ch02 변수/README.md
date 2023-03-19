# Chapter02 변수

## 변수 명명 규칙

### 변수명 규칙

- 대소문자가 구분되며 길이에 제한이 없다.
    - Byte와 byte는 서로 다른것
- 예약어 사용금지
    - True→O, true →X : 변수로 사용불가
- 숫자로 시작해서는 안된다.
    - top10→ O, 10top →X
- 특수문자는 `_`와  `$`만 사용 가능

### 네이밍 관례

- 클래스 이름의 첫 글자는 항상 대문자로 한다.
    - 변수와 메서드의 이름의 첫 글자는 항상 소문자로 한다.
- 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
    - lastIndexOf, StringBuffer
- 상수의 이름은 모두 대문자로 한다. 여러단어로 이루어진 경우 ‘-’로 구분한다.
    - PI, MAX_NUMBER

⇒ 반드시 지켜야 하는 것은 아니지만 자바 개발자들 사이의 암묵적인 약속이다.

### 참고 예약어

소문자인 점 참고

| abstract | boolean | break | byte | case |
| --- | --- | --- | --- | --- |
| catch | char | class | continue | default |
| do | double | else | extends | false |
| final | finally | float | for | if |
| implements | import | instanceof | int | interface |
| long | native | new | package | private |
| protected | public | return | short | static |
| super | switch | synchronized | this | throw |
| throws | transient | true | try | void |
| volatile | while |  |  |  |

## 기본형과 참조형

![Untitled](https://github.com/Jiryeong29/Tech-Study/blob/main/Java/JiRyeong/Img/01.png?raw=true)

- 기본형(primitive type) : boolean, char, byte, short, int, long, float, double 모두 8개
- 참조형(reference type) : 8개의 기본형을 제외한 나머지 타입, 객체의 주소를 저장함

boolean을 제외한 나머지 7개 기본형은 서로 연산과 변환이 가능하다.

**int :  byte 혹은 short 의 변수가 연산을 하면 연산의 결과는 int형이 된다.**

### ‼️주의

```java
byte a = 10;
byte b = 20;
byte c = a + b;  // a+b 는 int형이 된다.
System.out.println(c); //오류 발생
```

큰 자료형의 값을 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용해서 형변환해주어야 한다.
 a와 b는 모두 int형보다 작은 byte형이기 때문에 연산자 '+'는 이 두 개의 피연산자들의 자료형을 int형으로 변환한 다음 연산을 수행한다. 
그래서 'a+b'의 연산결과는 byte형이 아닌 int형(4byte)이기 때문에 명시적으로 형변환을 진행해야하는데 그러지 않아, byte c에 저장할 수 없어 오류가 발생하는 것이다.

### 기본형의 종류와 크기

|  | 1 byte | 2 byte | 3 byte | 4 byte |
| --- | --- | --- | --- | --- |
| 논리형 | boolean |  |  |  |
| 문자형 |  | char |  |  |
| 정수형 |  byte | short | int(기본) | long |
| 실수형 |  |  | float | double(기본) |

### 변수 저장 가능 범위

| 자료형 | 범위 | bit | byte | 기본값(접미사) |
| --- | --- | --- | --- | --- |
| boolean | true, false | 8 | 1 | false |
| char | 0~65,535(유니코드문자) | 16 | 2 | ‘\u0000’ |
| byte | -128 ~ 127 | 8 | 1 | 0 |
| short | -32,768 ~ 32,767 | 16 | 2 | 0 |
| int | -2,147,483,648 ~ 2,147,483,647 | 32 | 4 | 0 |
| long | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 | 64 | 8  | 0L |
| float | ±1.4E-45 ~ 3.4E38 | 32 | 4 | 0.0f |
| double | ±4.9E-324 ~ 1.8E308 | 64 | 8 | 0.0 또는 0.0d |

에러를 피하려면 리터럴에 접미사를 붙여야한다.

리터럴 접두사와 접미사는 대소문자를 구별하지 않는다.

```csharp
float pi = 3.14f;
double rate = 1.618d;
long big = 100_000_000_000L;
```

### 상수와 리터럴

상수는 변수의 타입 앞에 키워드 `final`을 붙여주기만 하면 된다.

```java
final int MAX_SPEED;
```

## 타입의 불일치

```java
String name = “Ja” +”va”; //Java

System.out.println(“Ja” +”va”)  //Java
System.out.println(‘A' + 'B') // 131
System.out.println('1' + 2) // 99
System.out.println(true + null) //에러
System.out.println(true + "") //"ture"
```

‘A’와 같이 작은 따옴표로 문자하나를 감싼 것을 `문자리터럴`이라고 한다. 

두 문자 이상은 큰 따옴표로 감싸야 하며 `문자열 리터럴`이라고 한다.

`문자 리터럴`은 `‘’`안에 반드시 하나의 문자가 있어야 하지만 `문자열 리터럴`은 `“”` 안에 아무런 문자도 넣지 않아도 된다.

String은 클래스 이므로 아래와 같이 객체를 생성하는 연산자 new를 사용해야하지만 

```java
String name = new String("Java");
```

 객체를 생성하는 연산자 new를 사용해야하지만 기본자료형과 같이

```java
 String str =”” ;
```

와 같은 표현도 허용한다

## 입력받기

```java
import java.util.*; // Scanner 클래스를 사용하기 위해 추가
Scanner scanner = new Scanner(System.in); //Scanner클래스의 객체를 생성
String input = scanner.nextLine(); //입력받을 내용을 input에 저장
int num = Integer.parseInt(input); //입력받은 내용을 int 타입의 값으로 저장
int floatnum = Integer.parseFloat(input); //입력받은 내용을 float 타입의 값으로 저장
```

`nextInt()` 나 `nextFloat()` 와 같이 변환없이 바로 숫자로 입력받을 수 있는 메서드들이 있다. 이 메서드를 사용하면  문자열을 숫자로 변환하는 과정을 거치지 않아도 된다.

## 2의 보수법

n의 보수 : 더했을때 n이 되는 수

```java
2의 보수 = 1의 보수 +1
```

1의 보수는 0을 1로 1을 0으로만 바꾸면 ㅗ딘다.

### 음수의 2진 표현을 구하는 방법

1. 음수의 절대값을 2진수로 변환한다.
    
    : -5의 절대값인 5를 2진수로 변환한다. 10진수 5를 2진수로 변환하면 ‘0101’이다.
    
2. (1)에서 구한 2진수의 1을 0으로 0은 1로 바꾼다(1의보수 구하기)
    
    : ‘0101’이 ‘1010’이 된다.
    
3. (2)의 결과에 1을 더한다.(2의 보수구하기, 1의보수 +1)
    
    :  ‘1010’에 1을 더하면 ‘1011’이 되고 이것이 -5의 2진표현이다.
    

## 인코딩 디코딩

컴퓨터는 문자를 인식할 수 없기 때문에 숫자로 변환되어 저장하는데 변환해주기 위한 기준이 문자코드며 대표적을 ASCII코드 또는 유니코드가 있음 

따라서 이 문자코드를 기준으로 문자를 코드로 변환하는 것을 문자인코딩이라하고, 코드를 문자로 변환하는 것을 문자 디코딩이라 한다. 

- 인코딩 : 정해진 규칙에 따라 코드화, 암호화, 부호화 하는것
- 디코딩 : 인코딩의 반대되는 개념으로 복호화, 역코드화하는것

인코딩을 어떻게 했는지 알아야 디코딩이 가능하며, 문자를 저장할 때는 인코딩을 해서 숫자로 변환해 저장하고, 저장된 문자를 읽어올 때는 디코딩 해서 숫자를 원래의 문자로 되돌려야 한다.

## 실수형의 저장형식

![Untitled](https://github.com/Jiryeong29/Tech-Study/blob/main/Java/JiRyeong/Img/02.png?raw=true)

| 기호 | 의미 | 설명 |
| --- | --- | --- |
| S | 부호(Sign nit) | 0이면 양수, 1이면 음수 |
| E | 지수(Exponent) | 부호 있는 정수, 지수의 범위는
-127~128(float), -1023~1024(double) |
| M | 가수(Mantissa) | 실제값을 저장하는 부분,
10진수로 7자리(float), 15자리 (double)의 정밀도로 저장가능 |

## 형변환(캐스팅,Casting)

형변환: 변수나 리터럴 타입을 다른 타입으로 변환하는 것

```java
(타입) 피연산자
double d = 85.4;
int score = (int)d;
```

위에서 사용되는 괄호 `()` 는 `캐스트 연산자` 또는 `형변환 연산자` 라고 하며 형변환을 `캐스팅` 이라고 한다.

형변환 연산자는 피연산자의 값을 읽어서 지정된 타입으로 형변환한고 그 결과를 반환할 뿐이다.따라서 피연산자인 변수 d의 값은 형변환 후에도 아무 변화가 없다.

기본형에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다. 그리고 기본형과 참조형간의 형변화는 불가능하다. (자세한 설명은 7장)
