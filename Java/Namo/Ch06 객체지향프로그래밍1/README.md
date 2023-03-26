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
   
   ```
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

- **클래스**
  -  
 
  
