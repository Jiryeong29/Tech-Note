# Tech-Study
📂엔지니어 기술 면접 스터디 - Java
 

## Ch06. 객체지향프로그래밍-1
- **[객체지향언어](#객체지향언어 )**   
- **[클래스와 객체](#클래스와객체)**   
- **[변수와 메서드](#변수와메서드)**
- **[오버로딩(overloading)](#오버로딩(overloading) )**   
- **[생성자(constructor)](#생성자(constructor))**   
- **[변수의 초기화](#변수의초기화)**



## #객체지향언어 
  >### 코드의 재사용성이 높다.
   - 새로운 코드를 작성 할 때, 기존의 코드를 이용하여 쉽게 작성할 수 있다.
>### 코드의 관리가 용이하다.
  - 코드간의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할 수 있다.
>### 신뢰성이 높은 프로그래밍 가능하게 한다.
 - 제어자와 메서드를 이용해서 데이터를 보호하고 올바른 값을 유지하도록 하며,       
 코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지 할 수 있다.


## #클래스와객체
### - 클래스와 객체의 정의와 용도

- **클래스의 정의** : 객체를 정의해 놓은 것 **(EX. TV 설계도 , 붕어빵 기계)**
- **객체의 정의** : 실제로 존재하는 것. 사물 또는 개념 **(EX. TV , 붕어빵)**

### - 객체와 인스턴스

>클래스로부터 객체를 만드는 과정을 클래스의 **인스턴스화(instantiate)** 라고 하며,  
  어떤 클래스로부터 만들어진 객체를 그 클래스의 **인스턴스(instance)** 라고 한다.


### - 객체의 구성요소
> 객체의 구성요소는 크게 속성(property)와 기능(fuhction)이 있다. 
<br> 객체지향 프로그래밍에서는 이를 각각 변수와 메서드로 표현한다.
```
  Class = TV
  속성(변수) = 크기, 길이, 높이, 색상, 볼륨, 채널 등
  기능(메서드) = 켜기, 끄기, 볼륨 업, 볼륨 다운, 채널 변경 등

  채널 -> int channel
  채널 변경 -> channel_change() { .... }  
```

### - 인스턴스의 생성과 사용
```
클래스명 변수명; // 클래스의 객체를 참조하기 위한 참조변수를 선언
변수명 = new 클래스명 (); // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
  
EX)  
  Tv t;
  t  = new TV();

```

### - 객체 배열
- 객체 역시 배열로 다는 것이 가능하다. 

``TV tv1,tv2,tv3 -> TV[] tvArr = new Tv [3];``
 - 이렇게 하면 객체를 다루기위한 참조변수만 만들어 진 것이지 아직 객체가 저장되지 않았기에, 객체를 생성해서 객체 배열의 각 요소에 저장하는 것을 잊으면 안된다.
``` 
TV[] tvArr = new Tv [3]; // 참조변수 배열(객체 배열을 생성)

//객체를 생성해서 배열의 각 요소에 저장
tvArr[0] = new TV();
tvArr[1] = new TV();
tvArr[2] = new TV();

TV[] tvArr = { new TV() , new TV() , new TV()} // 이렇게 한 줄로 요약도 된다.
```
## #변수와메서드
### JVM의 메모리 구조
- 응용프로그램이 실행되면, JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고 JVM은 이 메모리를 용도에 따라 여러 영역으로 나누어 관리한다.

<details><summary>JVM의 주요영역( Method area , heap , call stack)
</summary>

- **Method area**  - 프로그램 실행 중 어떤 클래스가 사용되면, 해당 클래스의 클래스 파일을 읽어서 분석하여 클래스에 대한 정보를 이곳에 보관한다.
- **heap** - 인스턴스변수들이 생성되는 공간
- **call stack** - 메서드의 작업에 필요한 메모리 공간을 제공한다.
</details>

### 기본형 매개변수와 참조형 매개변수
>`` 기본형 매개변수: 변수의 값을 읽기만 할 수 있다.  ``

>`` 참조형 매개변수: 변수의 값을 읽고 변경 할 수 있다. ``
```
# 기본형 매개변수 예
class Data { int x;}
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = "+d.x);
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = "+d.x);
    }

    static void change(int x){ # 기본형 매개변수
        x= 1000;
        System.out.println("change() : x = "+x);
    }
}
```
```
기본형 매개변수 예시 실행결과
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10
```

```
# 참조형 매개변수 예

class Data { int x;}
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = "+d.x);
        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = "+d.x);
    }

    static void change(Data d){ //참조형 매개변수
        d.x= 1000;
        System.out.println("change() : x = "+d.x);
    }
```
```
참조형 매개변수 예시 실행결과
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 1000
```

- 위에 예제와는 달리 아래 예제는 change메서드의 매개변수가 참조형이라서 값이 아니라 '값이 저장된 주소'를 change메서드에 넘겨주었기에 값을 읽어 올수도 변경할수도 있다.

### - 클래스 메서드(static메서드)와 인스턴스 메서드
 - 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로하는 메서드이다.<br>
**- 그런데 인스턴스 변수는 인스턴스를 생성해야 만들어지기에 인스턴스 메서드역시    
 인스턴스가 생성해야만 호출 할 수 있다.**

- 반면, 인스턴스와 관계없는 메서드를 클래스 메서드(static메서드)로 정의한다.

```
1. 클래스를 설계 할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
2. 클래스 변수는 인스턴스를 생성하지 않아도 사용가능하다.
3. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면 static을 붙이는 것을 고려한다.
```
### 클래스 멤버와 인스턴스 멤버간의 참조와 호출
- 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스 없이 서로 참조와 호출이 가능.
- 단, 클래스멤버가 인스턴스 멤버를 참조, 호출하고자 하는경우에는 인스턴스를 생성해야한다.<br>
- **그 이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수 있다.**

## etc
   MemberCall c = new MemberCall();<br>
   int result = c.instanceMethod1();
- 위의 두 줄을 다음과 같이 한 줄로 할 수 있다.

 int result = new MemberCall().instanceMethod1();
- 대신 참조변수를 선언하지 않았기에 생성된 MemberCall인스턴스는 더이상 사용할 수 없다.
 
## #오버로딩(overloading) 
  >### 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것
### 오버로딩의 조건
  ``1. 메서드의 이름이 같아야한다.``

  ``2. 매개변수의 개수 또는 타입이 달라야한다``
 - 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.
### 오버로딩의 예
 - 대표적인것은 prinln()메서드이다.
 ```
    void println()
    void println(boolean x)
    void println(char x)
    void println(char[] x)
    void println(Object x)
    void println(int x)
    ....
```
### 오버로딩의 장점
 - 만약 오버로딩이 안된다면 위의 println()메서드들은 이렇게 표현되어야 할 것이다.
```
    void println()
    void printlnBool(boolean x)
    void printlnChar(char x)
    void printlnCharArr(char[] x)
    void printlnObj(Object x)
    void printlnInt(int x)
    ....
```
- 이렇게 모두 근본적으로는 같은 기능을 하는 메서드들이지만, 서로 다른 이름을 가져야 하기 때문에 메서드를 작성하는 쪽에서 이름을 짓기도 어렵고, 사용하는 쪽에서도 일일히 기억하기가 어렵다.
- 하지만 이것을 오버로딩을 통해 println() 하나로 표현 할 수 있다는 것이 장점이다 
<br>**// 예제코드 OverloadingTest 참고**

### 가변인자(varargs)와 오버로딩
- 기존의 메서드의 매개변수가 고정적이었으나 JDK1.5부터 동적으로 지정해 줄 수 있게 되었다. 
- 이것을 **가변인자**라고한다
- 선언은 **'타입...  변수명'** 과 같은 형식으로 선언한다. ex) PrintStream.printf()

``public PrintStream printf(String format,Object...args) { ... }``

- 주의할점은 **가변인자는 매개변수 중 가장 마지막에 선언**해야한다. 그렇지 않으면 컴파일 에러 발생

``public PrintStream printf(Object...args,String format) { ... } // 컴파일 에러 발생 - 가변인자는 제일 마지막``

```
String concatenate(String s1, String s2){ ... }
String concatenate(String s1, String s2, String s3){ ... }
String concatenate(String s1, String s2, String s3, String s4){ ... }
```
- 위의 코드를 가변인자를 사용하면 한번에 줄일 수 있다.

`` String concatenate(String... str){ ... }``

- 이 메서드를 호출 할때 아래와 같이 인자를 개수를 가변적으로 할 수 있다. 심지어는 인자가 아예 없어도 되고, 배열도 인자가 될 수 있다.
```
System.out.println(concatenate());
System.out.println(concatenate("a"));
System.out.println(concatenate("a","b"));
System.out.println(concatenate(new String[]{"A","B"})); // 배열도 가능

```

## #생성자(constructor)


### - 생성자란?

- **1. 생성자의 이름은 클래스의 이름과 같아야 한다,**
- **2. 생성자는 리턴 값이 없다.**
```
# 생성자

클래스이름(타입 변수명, 타입 변수명, ...){
      // 인스턴스 생성 시 수행될 코드,
      // 생성자는 리턴 값이 없다.
}


public class Card{
    Card() { // 매개변수 없는 생성자

   }

  Card(String k, int num){ // 매개변수 있는 생성자

   }
}
```
- **연산자 new**가 인스턴스를 생성하는 것이지, 생성자가 인스턴스를 만드는 것이    
 아니라 단순히 인스턴스 변수들의 초기화에 사용되는 조금 특별한 메서드이다.

### - 기본 생성자

>원래 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야한다.

`` Card() { } // 매개변수도 없고 아무런 내용도 없는 생성자``

### - 매개변수가 있는 생성자

>인스턴스마다 각기 다른값으로 초기화를 해야하는 경우에 유용하다,

```Car c1 = new Car();
c1.color = "white";
c1.gearType = "auto";
c1.door = 4;

Car c1 = new Car("white","auto",4);
```

### - 생성자에서 다른 생성자 호출하기 - this() , this
- 생성자 간에도 다음 조건을 만족하면 생성자 간에 호출이 가능하다.

>생성자 이름으로 클래스이름 대신 this를 사용한다.

> 한 생성자에서 다른 생성자를 호출 할 때는 반드시 첫 줄에서만 호출이 가능하다.
```
Car(String color){
  door = 5;
  this(color, "auto" ,4);
}
```

### - 생성자를 이용한 인스턴스의 복사
```
Car(Car c1){ // 인스턴스 복사를 위한 생성자

  // c1의 인스턴스 변수 color값을 인스턴스 자신으로 복사
  color = c1.color; 
  gearType = c1.gearType;
  door = c1.door;
}
```
#### 인스턴스를 생성할 때는 다음의 2가지 사항을 결정해야한다.
1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
2. 생성자 - 성택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?


## #변수의초기화

### JVM의 메모리 구조
- 응용프로그램이 실행되면, JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고 JVM은 이 메모리를 용도에 따라 여러 영역으로 나누어 관리한다.

