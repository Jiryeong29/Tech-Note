# Chapter06

# 객체지향 언어

## 객체지향 언어

```java
1. 코드의 재사용성이 높다
	새로운 코드를 작성할 때 기존의 코드를 이용하여 쉽게 작성할 수 있다.
2. 코드의 관리가 용이하다.
	코드관의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할 수 있다.
3. 신뢰성이 높은 프로그램잉을 가능하게 한다.
	제어자와 메서드를 이용해서 데이터를 보호하고 올바른 값을 유지하도록 하며, 코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방해할 수 있다.
```

너무 객체 지향개념에 얽매여서 고민하기 보다는 일단 프로그램을 기능적으로 완성한 다음 어떻게 하다보면 객체지향적으로 코드를 개선할 수 있ㅇ르지를 고민하여 점차 개선해 나가는 것이 좋다.

## 클래스와 객체의 정의와 용도

```java
**클래스의 정의** 클래스란 객체를 정의해 놓은 것이다
**클래스의 용도** 클래스는 객체를 생성하는데 사용된다
```

```java
**객체의 정의** 실제로 존재하는 것. 사물또는 개념
**객체의 용도** 객체가 가지고 있는 기능과 속성에 따라 다름

**유형의 객체** 책상, 의자, 자동차, TV와 같은 사물
**무형의 객체** 수학 공식, 프로그램 에러와 같은 논리나 개념
```

## 객체와 인스턴스

인스턴스화

```java
클래스 -> 인스턴스(객체)
```

## 객체의 구성요소- 속성과 기능

```java
**속성(property)** 멤버변수, 특성, 필드
**기능(function)** 메서드, 함수, 행위
```

## 인스턴스의 생성과 사용

```java
클래스 변수명;
변수명 = new 클래스명();

Tv t;
t = new Tv();
```

```java
인스턴스는 참조변수를 통해서만 다룰 수 있으며 참조변수의 타입은 인스턴스의 타입과 일치해야한다.
```

## 2.5 객체 배열

```java
Class TvTest4{
    public static void main(String args[]){
        Tv[] tvArr = new Tv[3];
        for(int i=0; i<tvArr.length; i++){
            tvArr[i] =  new Tv();
            tvArr[i].channel = i+10;
        }
        for(int i=0; i< tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channnel = %d%n",i,tvArr[i].channel);
        }
    }
}
class Tv{
    String color;
    boolean power;
    int channel;
    
    void power() { power = !power;}
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
```

## 클래스의 또 다른 정의

```java
**변수**     하나의 데이터를 저장할 수 있는 공간
**배열**     같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
**구조체**   서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간
**클래스**    데이터와 함수의 결합(구조체 + 함수)
```

### 비객체지향적 코드와 객체지향적 코드

| 비객체지향적 코드 | 객체지향적 코드 |
| --- | --- |
| int hour1, hour2, hour3;
int minutel1, minutel2, minutel3;
int second1, second2, second3; | int[] hour = new int[3];
int[] minute = new int[3];
int[] second = new int[3]; |
| Time t1 = new Time();
 Time t2 = new Time();
 Time t3 = new Time(); | Time[] t = new Time[3];
t[0] = new Time();
t[1] = new Time();
t[3] = new Time(); |

| 구조체 |
| --- |
| class Time{
    int hour;
    int minute;
    int second;
} |

# 3. 변수와 메서드

## 3.1 선언위치에 따른 변수의 종류

변수는 클래스 변수, 인스턴스 변수, 지역변수 모두 세종류가 있다. 변수의 종류를 결정짓는 중요한 요소는 변수의 선언된 위치 이므로 변수의 종류를 파악하기 위해서는 변수가 어느 영역에 선언되었는지를 확인하는 것이 중요하다. 멤버변수를 제외한 나머지 변수들은 모두 지역변수이며, 멤버변수 중 static이 붙은 것은 클래스 변수, 붙지 않은 것은 인스턴스 변수이다.

| 변수의 종류 | 선언 위치 | 생성시기 |
| --- | --- | --- |
| 클래스 변수 | 클래스 영역 | 클래스 메모리에 올라갔을 때 |
| 인스턴스 변수 | 클래스 영역 | 인스턴스 생성됐을 때 |
| 지역변수 | 클래스 영역 이외의 영역
(메서드, 생성자, 초기화 블럭내부) | 변수 선언문이 수행됐을 때 |

```java
class Variables
{
    int iv;           // 인스턴스 변수
    static int cv;    // 클래스 변수(static변수, 공유변수)
    
    void method()
    {
        int lv =0;    // 지역변수
    }
}
```

### 1. 인스턴스 변수

클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때마다 만들어진다. 

인스턴스 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스를 생성해야한다.

인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 없다. 인스턴스마다 고융한 상태를 유지해얗나느 속서으이 경우, 인스턴스 변수로 선언한다.

### 2. 클래스 변수

클래스 변수를 선언하려면 인스턴스 변수 앞에 static을 붙이기만 하면 된다.  클래스 변수는 공통된 저장공간(변수)을 공유하게 된다. 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 하는 속성의 경우, 클래스 변수로 선언해야한다.

클래스 변수는 인스턴스 변수와 달리 인스턴스를 생성하지 않고도 언제라도 바로 사용할 수 있어서 `'클래스 이름.클래스변수` 와 같은 형식으로 사용한다. 예를 들어 Variables클래스의 클래스 변수 cv를 사용하려면 `Variables.cv`  와 같이 하면 된다.

클래스가 메모리에 `로딩(loading)` 될때 생성되어 프로그램이 종료 될때까지 유지되며, public을 앞에 붙이면 같은 프로그램 내에서 어디서나 접근할 수 있는 `전역변수`의 성격을 갖는다. 

### 3. 지역 변수

메서드 내에서 선언되어 메서드 내에서만 사용가능 하며 메서드가 종료되면 소멸되어 사용하 룻 없게 된다. 

예) for, while , 블럭{}, 메서드에 선언됨

## 3.2 클래스 변수와 인스턴스 변수

```java
인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로 인스턴스 마다 각기 다른 값을 유지할 수 있지만, 클래스 변수는 모든 인스턴스 하나의 저장공간을 공유하므로 항상 공통된 값을 가진다.
```

## 3.3 메서드

메서드(method)란 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것이다. 메서드가 작업을 수행하는데 필요한 값만 넣고 원하는 결과를 얻으면 될뿐, 이 메서드가 내부적으로 어떤 과정을 거쳐 결과를 만들어내는지 전혀 몰라도 된다. 즉 넣을 값(입력)과 반환하는 결과(출력)만 알면된다. sqrt()외에도  printlin()이나 random()과 같은 메서드들 역시 내부적으로 어떻게 동작하는 지 몰라도 사용하는데 문제 없다.

## 3.4 메서드의 선언과 구현

메서드는 크게 두부분 `선언부(header,머리)` 와 `구현부(body,몸통)` 로 이루어져 있다.

/코드 작성해보기

### 매개변수의 유효성 검사

메서드 구현부{}를 작성할 때, 제일 먼저 해야하는 일이 매개변수의 값이 적절한 것인지 확인하는 것이다. 

```java
float(divide(int x, int y){
		//작업을 하기전에는 나누는 수가 (y)가 0인지 확인한다.
		if( y == 0){
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		}
		return x/(float)y;
}
```

divide는 매개변수 x를 y로 나눈 결과를 실수로 반환하는데, 0으로 나누는 것은 금지되어 있기 때문에 계산 전에 y값이 0인지 확인해야 한다. y의 값이 0이면 나누기를 계산할 수 없으므로 return문을 이용해서 작업을 중단하고 메서드를 빠져나와야 한다. 그렇지 않으면 나누기를 하는 문장에서 프로그램이 비정상적으로 종료된다.

적절하지 않은 값이 매개변수를 통해 넘어온다면 매개변수의 값을 보정하던가, 보정하는 것이 불가능하다면 return문을 사용해서 작업을 중단하고 호출한 메서드로 되돌아가야한다.

매개변수의 유효성 검사는 메서드 작성에 있어서 간과하가 쉬운 중요한 부분이다.

## 3.7 JVM의 메모리 구조

응용 프로그램이 실행되면, JVM은 시스템으로 부터 프로그램을 수행하는데 필요한 메모리를 할당받고 이 메모리를 용도에 따라 여러 영역으로 나누어 관리한다.

그 중 3가지 주요  영역은 (method area, call stack, heap)이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f833b9c0-f1d8-4040-a910-5a47007ac4f3/Untitled.png)

### 1. 메서드 영역(method area)

- 클래스 정보와 클래스변수가 저장되는 곳
- 프로그램 실행중 어떤 클래스가 사용되면, JVM은 해당 클래스의 클래스파일(*.class)을 읽어서 분석하여 클래스에 대한 정보(클래스 데이터)를 이곳에 저장한다. 이때, 그 클래스의 클래스 변수도 이 영역에 함께 생성되된다.

### 2. 힙(heap)

- 인스턴스가 생성되는 공간, 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다.
- new연산자에 의해서 생성되는 배열과 객체는 모두 여기에 생성된다.

### 3. 호출스택(call stack 또는 execution stack)

- 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다. 메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당되며, 이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용된다. 그리고 메서드가 작업을 마치면 할당되었던 메모리공간은 반환되어 비워진다

### **호출 스택 실행 과정**

```java
- 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다
- 메서드가 수행을 마치고 나면 사용했던 메모리를 반환하고 스택에서 제거된다.
- 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
- 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
```

```java
class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}
	static void firstMethod() {
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/60e6ae97-760a-49f2-b4e4-caca05b3bb7a/Untitled.png)

### 3.8 기본형 매개변수와 참조형 매개변수

자바에서는 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다. 매개변수의 타입이 기본형 일때는 기본형 값이 복사되겠지만, 참조형 타입일때는 인스턴스 주소가 복사된다. 메서드의 매개변수를 기본형으로 선언하면 단순히 저장된 값만 얻지만 참조형으로 선언하면 값이 저장된 곳의 주소를 할 수 있기 때문에 값을 읽어 오는 것은 물론 값을 변경 가능하다.

```java
**기본형 매개변수** 변수의 값을 일기만 할 수 있다.
**참조형 매개변수** 변수의 값을 읽고 변경할 수 있다.
```

### 3.9 참조형 반환타입

코드 반환타입이 참조형이라는 것은 메서드가 객체의 주소를 반환한다는 것을 의미한다.

## 3.11 클래스 메서드(static메서드)와 인스턴스메서드

1. 클래스드를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
    - 생성된 각 인스턴스는 서로 독립적이기 때문에 각 인스턴스 변수(iv)는 서로 다른 값을 유지한다. 그러나 모든 인스턴스에서 같은 값이 유지되어야 하는 변수 static을 붙여서 클래스 변수로 정의해야한다.
2. 클래스 변수(static변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
    - static이 붙은 변수(클래스 변수)는 클래스가 메모리에 올라갈대 이미 자동적으로 생성되기 때문이다.
3. 클래스 메서드(static 메서드) 는 인스턴스 변수를 사용할 수 없다.
    - 인스턴스변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 클래스 메서드(static이 붙은 메서드)는 인스턴스 생성없이 호출가능하므로 클래스 메서드가 호출되었을 떄 인스턴스가 조냊하지 않을 수도 있다. 그래서 클래스 메서드에서 인스턴스 변수의 사용을 금지한다.
    - 반면에 인스턴스 변수나 인스턴스메서드에넌 static이 붙은 멤버들을 사용하는 것이 ㄴ언제나 가능하다. 인스턴스 변수가 존재한다는 것은 static변수가 이미 메모리에 존재한다는 것을 의미하기 대문이다.
4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면 static을 붙이는 것을 고려한다.
    - 메서드의 작업내용 중에서 인스턴스 변수를 필요로 한다면, static을 붙일 수 없다. 반대로 인스턴스변수를 필요로 하지 않는다면 static을 붙이자. 메서드 호출시간이 짧아지므로 성능이 향상된다. staitc을 안붙이면 메서드는 실행시 호출되어야 할 메서드를 찾는 과정이 추가적으로 필요하기 때문에 시간이 더 걸린다.
    

1

```java
class TV {
   // Tv의 속성(멤버변수)
   String color;
   boolean power;
   int channel;
   
   //Tv의 기능(메소드
   void power() { power = !power; }
   void channelUP() { ++channel; }
   void channelDown() { --channel; }
   }
   class TvTest {
    public static void main(String args[]) {
     Tv t;
     t = new TV();
     t.channel = 7;
     t.channelDown();
     }
   }
```

2

```java
class TV {
   // Tv의 속성(멤버변수)
   String color;
   boolean power;
   int channel;
   
   //Tv의 기능(메소드
   void power() { power = !power; }
   void channelUP() { ++channel; }
   void channelDown() { --channel; }
   }
   
   class TvTest2 {
    public static void main(String args[]) {
     Tv t1;
     t1 = new TV();
     Tv t2 = new TV();
     t1.channel = 7;
     t.channelDown();
     System.out.println("t1.channel의 채널은" + t1.channel + "입니다.") // 7출력
     System.out.println("t2.channel의 채널은" + t2.channel + "입니다.") // 0출력
     }
   }
```

3

```java
class TV {
   // Tv의 속성(멤버변수)
   String color;
   boolean power;
   int channel;
   
   //Tv의 기능(메소드
   void power() { power = !power; }
   void channelUP() { ++channel; }
   void channelDown() { --channel; }
   }
   
   class TvTest3 {
    public static void main(String args[]) {
     Tv t1;
     t1 = new TV();
     Tv t2 = new TV();
     t2 = t1 // ?? 주소라서 되는듯
     t1.channel = 7;
     t.channelDown();
     System.out.println("t1.channel의 채널은" + t1.channel + "입니다.") // 7출력
     System.out.println("t2.channel의 채널은" + t2.channel + "입니다.") // 7출력
     }
   }
```

4

```java
class TV {
   // Tv의 속성(멤버변수)
   String color;
   boolean power;
   int channel;
   
   //Tv의 기능(메소드
   void power() { power = !power; }
   void channelUP() { ++channel; }
   void channelDown() { --channel; }
   }
   
   class TvTest4 {
   public static void main(String args[]) {
    Tv[] tvArr = new Tv[3];
    
    for(int i = 0; i < tvArr.length; i++){
     tvArr[i] = new Tv();
     tvArr[i].channel = i+10;
   }
    for(int i = 0; i < tvArr.length; i++){
     tvArr[i].channelUp();
     System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
    }
   }
```

5

```java
public class CardTest {
   public static void main(String[] args) {
      System.out.println("Card.width = " + Card.width);
      System.out.println("Card.heigth = " + Card.height);
      
      Card c1 = new Card();
      c1.kind = "Heart";
      c1.number = 7;
      
      Card c2 = new Card();
      c2.kind = "Spade";
      c2.number = 4;
      
      System.out.println("c1은" + c1.kind +"," + c1.number + "이며, 크기는 (" + c1.width + "," +c1.height +"))" );
      System.out.println("c2은" + c2.kind +"," + c2.number + "이며, 크기는 (" + c2.width + "," +c2.height +"))" );
      c1.width = 50;
      c1.height = 80;
      System.out.println("c1은" + c1.kind +"," + c1.number + "이며, 크기는 (" + c1.width + "," +c1.height +"))" );
      System.out.println("c2은" + c2.kind +"," + c2.number + "이며, 크기는 (" + c2.width + "," +c2.height +"))" );
   }

}
class Card{
   String kind;
   int number;
   static int width = 100;
   static int height = 250;
   
}
```

6

```java
public class MymathTest {
   public static void main(String args[]){
      MyMath mm = new MyMath();
      long result1 = mm.add(5L, 3L);
      long result2 = mm.subtract(5L, 3L);
      long result3 = mm.multiply(5L, 3L);
      double result4 = mm.divide(5L, 3L);
      
      System.out.println("add(5L, 3L) = " + result1);
      System.out.println("subtract(5L, 3L) = " + result2);
      System.out.println("multiply(5L, 3L) = " + result3);
      System.out.println("divide(5L, 3L) = " + result4);
   }
}
class MyMath{
   long add(long a, long b) {
      long result = a+b;
      return result;
   }
   long subtract(long a, long b) { return a- b;}
   long multiply(long a, long b) { return a * b;}
   long divide(long a, long b) { return a / b;}
}
```

7

```java
public class CallStackTest {
   public static void main(String[] args){
      firstMethod(); 
   }
   static void firstMethod() {secondMethod();}
   static void secondMethod() {
      System.out.println("secondMethod()");
   }

}
```

8

```java
public class CallStackTest2 {
   public static void main(String[] args) {
      System.out.println("main(String[] args)이 시작되었습니다.");
      firstMethod();
      System.out.println("main(String[] args)이 시작되었습니다.");
   }
   static void firstMethod() {
      System.out.println("firstMethod()이 시작되었음.");
      secondMethod();
      System.out.println("firstMethod()이 끝났음.");
   }
   static void secondMethod() {
      System.out.println("secondMethod()이 시작되었음.");
      System.out.println("secondMethod()이 시작되었음.");
   }
}
```

9

```java
class Data { int x; }

public class DataTest {
   public static void main(String args[]) {
      Data d = new Data();
      d.x = 10;
      System.out.println("main() : x =" + d.x);
      change(d.x);
      System.out.println("After change(d.x)");
      System.out.println("main() : x =" + d.x);
   }
   static void change(int x) {
      x = 1000;
      System.out.println("change() : x = " + x );
   }
}
```

10

```java
class Data { int x; }

public class DataTest2 {
   public static void main(String args[]) {
      Data d = new Data();
      d.x = 10;
      System.out.println("main() : x =" + d.x);
      change(d);
      System.out.println("After change(d.x)");
      System.out.println("main() : x =" + d.x);
   }
   static void change(Data d) {
      d.x = 1000;
      System.out.println("change() : x = " + d.x );
   }
}
```

11

```java
class ReferenceParamEx2 {
	public static void main(String[] args) 
  {
		int[] x = {10};  // 크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x = " + x[0]);

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}

	static void change(int[] x) { // 참조형 매개변수
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}
```

12

```java
class ReferenceParamEx3 {
	public static void main(String[] args) 
	{
		int[] arr = new int[] {3,2,1,6,5,4};

		printArr(arr);  // 배열의 모든 요소를 출력
		sortArr(arr);   // 배열을 정렬
		printArr(arr);  // 정렬후 결과를 출력
		System.out.println("sum="+sumArr(arr)); // 배열의 총합을 출력
	}

	static void printArr(int[] arr) {  // 배열의 모든 요소를 출력
		System.out.print("[");

		for(int i : arr)  // 향상된 for문
			System.out.print(i+",");
		System.out.println("]");
	}

	static int sumArr(int[] arr) {  // 배열의 모든 요소의 합을 반환
		int sum = 0;

		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}

	static void sortArr(int[] arr) {  // 배열을 오름차순으로 정렬
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-1-i;j++)
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
	} // sortArr(int[] arr)
}
```

13

```java
class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3,5);
		System.out.println(result);

		int[] result2 = {0}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3,5,result2);  // 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);
	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) {
		result[0] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
	}
}
```

14

```java
class Data { int x; }

class ReferenceReturnEx {
	public static void main(String[] args) 
	{
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d); 
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;

		return tmp;
	}
}
```

15

```java
class FactorialTest {
	public static void main(String args[]) {
		System.out.println(factorial(4)); // FactorialTest.factorial(4)
	}

	static long factorial(int n) {
		long result=0;

		if (n == 1) return 1;		

		return n * factorial(n-1); // 다시 메서드 자신을 호출한다.
	}
}
```

16

```java
class FactorialTest2 {
	static long factorial(int n) {
		if(n<=0 || n>20) return -1;  // 매개변수의 유효성 검사.
		if(n<=1) 
			 return 1;
	    return n * factorial(n-1); 
	}

	public static void main(String args[]) {
		int  n = 21;
		long result = 0;

		for(int i = 1; i <= n; i++) {
			result = factorial(i);

			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
				break;
			}

			System.out.printf("%2d!=%20d%n", i, result);
		}
	} // main의 끝
}
```

17

```java
class MainTest {
	public static void main(String args[]) {
		main(null);		// 자기 자신을 다시 호출한다.
	}
}
```

18

```java
class PowerTest { 
	public static void main(String[] args) { 
		int x = 2; 
		int n = 5; 
		long result = 0; 

		for(int i=1; i<=n; i++) { 
			result += power(x, i); 
		} 

		System.out.println(result); 
	} 

	static long power(int x, int n) { 
		if(n==1) return x; 

		return x * power(x, n-1);
	} 
}
```

19

```java
class MyMath2 {
	long a, b;
	
	// 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() 	    { return a + b; }  // a, b는 인스턴스변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }

	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long   add(long a, long b) 	   	 { return a + b; } // a, b는 지역변수
	static long   subtract(long a, long b)   { return a - b; }
	static long   multiply(long a, long b)	 { return a * b; }
	static double divide(double a, double b) { return a / b; }
}

class MyMathTest2 {
	public static void main(String args[]) {
		// 클래스메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));

		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
```

20