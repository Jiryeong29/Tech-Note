# Tech-Study
📂엔지니어 기술 면접 스터디 - Java
- [객체지향프로그래밍](#5)

 ## #5
#### 객체지향프로그래밍

- **객체지향언어**
  - `객체지향언어` 실제 세계는 사물(객체)로 이루어져 있으며, 발생하는 모든 사건들은 사물간의 상호작용이다. 즉, 객체지향언어란 객체들로 이루어진 언어이다.
  - `코드의 재사용성` 새로운 코드를 작성할 때 기존의 코드를 이용하여 쉽게 작성할 수 있다.
  - `코드의 관리 용이` 코드간의 관계를 이용하여 쉽게 코드를 변경할 수 있다.

- **클래스**
  - `클래스` 객체의 정의 또는 객체의 설계도 또는 틀이라고 생각하면 된다.
  - 객체란?
    - `정의` 실제로 존재하는 것, 사물 또는 개념
    - `용도` 객체가 가지고 있는 기능과 속성에 따라 다름
  - 객체와 클래스의 차이점은 클래스가 "제품 설계도"이면 객체는 "제품"이다.

- **객체의 구성요소**
  - `속성` 멤버변수, 특성, 필드, 상태
  - `기능` 메서드, 함수, 행위
  - 객체의 TV 예시
    - `속성` 크기, 길이, 높이, 색상, 볼륨, 채널 = int ch
    - `기능` 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 켜기 = chUp()
  - 인스턴스의 생성과 사용 예제
  ```Java
  //예제 6-1
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
   ```Java
   //6-2
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
  
   ```Java
   //6-3
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

- **객체배열**
  - `객체 배열` 많은 수의 객체를 다룰 때 배열로 다루면 편리하다. 객체 역시 배열로 다루는 것이 가능하며, 이를 '객체 배열'이라고 한다.
  - `Tv tv1, tv2, tv3` -> `Tv[] tvArr = new Tv[3]`
  -  모든 배열이 그렇듯이 객체 배열로 같은 타입의 객체만 저장할 수 있다.
  ```Java
  //6-4
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
   
- **변수와 메소드**
  - `인스턴스 변수` 인스턴스는 독립적인 공간이기 때문에 서로 다른 값을 가질 수 있다.
  - `클래스변수` 선언 방법은 인스턴스 변수 앞에 static을 붙이기만 하면 된다. 공통된 저장공간
  - `지역변수` 메소드 내에 선언되어 메소드 내에서만 사용 가능 
  ```Java
  //6-5
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
  ```Java
  //6-6
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
  - `반환값` return x + y; -> return 5 + 3; -> return 8;

- **메모리 구조**
  - `메서드 영역`
  - `힙 영역`
  - `스택영역`
  ```Java
  //6-7
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
  ```Java
  //6-8
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
  
- **참조형 매개변수**
  - `기본형 매개변수` 변수의 값을 읽기만 할 수 있다
  - `참조형 매개변수` read & write
  ```Java
  //6-9
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
  ```Java
  //6-10
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
  ```Java
  //6-11
  ```
  ```Java
  //6-12
  ```
  ```Java
  //6-13
  ```
  
- **참조형 반환타입**
  - 반환타입이 참조형이라는 것은 반환하는 값의 타입이 참조형이라는 뜻
  - 메서드가 객체의 주소를 반환한다는 것을 의미
  
  ```Java
  //6-14
  ```
  
- **재귀호출**
  - 메서드가 자기 자신을 다시 호출하는 것
  - 대표적인 예로 팩토리얼이 있다.
  ```Java
  //6-15
  ```
  ```Java
  //6-16
  ```
  ```Java
  //6-17
  ```
  ```Java
  //6-18
  ```
- **클랠스 메서드와 인스턴스 메서드**
  - 모든 인스터스에 공통으로 사용하는 것은 static을 붙인다.
  - 클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.
  - 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
  - 메소드 내에[서 인스턴스 변수를 사용하지 않는다면 static을 붙이는 것을 고려한다.
  ```Java
  //6-19
  ```
  ```Java
  //6-20
  ```


   
 
  
