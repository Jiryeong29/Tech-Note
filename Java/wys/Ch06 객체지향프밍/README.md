# Tech-Study
📂엔지니어 기술 면접 스터디 - Java   
   
#6
==
### 객체지향 프로그래밍I
* 객체지형언어
   * 주요특징
      1) 코드의 재사용성이 높다
        -새로운 코드를 작성할 때 기존의 코드를 이용하여 쉽게 작성할 수 있다.
      2) 코드의 관리가 용이하다
        -코드간의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할 수 있다.
      3) 신뢰성이 높은 프로그래밍을 가능하게 한다.
        -제어자와 메서드를 이용해서 데이터를 보호하고 올바른 값을 유지하도록 한다
        -코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지할 수 있다.   
   
* 클래스와 객체
   * 클래스의 정의와 용도
      * 클래스란 객체를 정의해 놓은 것이다
      * 객체를 생성하는데 사용된다
   * 객체의 정의와 용도
      * 객체는 실제로 존재하는 것이다 (사물 또는 개념)
      * 용도는 객체가 가지고 있는 기능과 속성에 따라 다르다
      * 속성(property): 멤버변수(member variable), 특성(attribute), 필드(field), 상태(state)
      * 기능(function): 메서드(method), 함수(function), 행위(behavior)
   * 인스턴스
      * 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화(instantiate)라고 한다
      * 어떤 클래스부로부터 만들어진 객체를 그 클래스의 인스턴스(instance)라고 한다
      * 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야한다
      * 클래스로부터 인스턴스 생성 방법
      ```
      클래스명 변수명;   // 클래스의 객체를 참조하기 위한 참조변수를 선언
      변수명 = new 클래스명();   // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
      
      Tv t;   // Tv클래스 타입의 참조변수 t선언
      t = new Tv();   // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
      ```
      * 예제 6-1 P.235 < Tv클래스로부터 인스턴스를 생성하고 인스턴스의 속성과 메서드를 사용하는 방법을 보여 주는 것이다 >
      ```
      Class Tv {
            // Tv의 속성 (멤버변수)
            String color;   // 생상
            boolean power;   // 전원상태 (on/off)
            int channel;   // 채널
            
            // Tv의 기능 (메서드)
            void power()    { power = !power; }   // Tv를 켜거나 끄는 기능을 하는 메서드
            void channelUp   { ++channel; }   // Tv의 채널을 높이는 기능을 하는 메서드
            void channelDown   { --channel; }   // Tv의 채널을 낮추는 기능을 하는 메서드
      }
      
      class Tvtest {
             public static void main(String args[]) {
                Tv t;   //  Tv인스턴스를 참조하기 위한 변수 t를 선언
                t = new Tv();   // Tv인스턴스를 생성한다
                t.channel = 7;   // Tv인스턴스의 멤버변수 channel의 값을 7로 한다
                t.channelDown();   // Tv인스턴스의 메서드 channelDown()을 호출한다
                System.out.println("현재 채널은 " + t.channel + " 입니다.");   
      }
      // 실행결과: 현재 채널은 6 입니다
      ```
      * 예제 6-2 P.237 <인스턴스 t1과 t2를 생성한 후에, 인스턴스 t1의 멤버변수인 channel의 값을 변경하였다.
      ```
      class Tv {
      // Tv의 속성 (멤버변수)
      String color;    // 색상
      boolean power;   // 전원상태(on/off)
      int channel;     // 채널

      // Tv의 기능 (메서드)
      void power() {power =! power;}    // Tv를 켜거나 끄는 기능을 하는 메서드
      void channelUp() {++channel;}     // Tv의 채널을 높이는 기능을 하는 메서드
      void channelDown() {--channel;}   // Tv의 채널을 낮추는 기능을 하는 메서드
      }

      class TvTest2 {
      public static void main (String args[]) {
        Tv t1 = new Tv();    // Tv t1; t1 = new Tv(); 를 한 문장으로 가능
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;      // channel 값을 7으로 한다 
        System.out.println("t1의 channel값을 7로 변경하였습니다");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다." );
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
         }
      }
      // 실행결과
      t1의 channel값은 0입니다.
      t1의 channel값은 0입니다.
      t2의 channel값은 7로 변경하였습니다.
      t1의 channel값은 7입니다.
      t2의 channel값은 0입니다.
      ```
      * 예제 6-3 P.238 
      ```
      class Tv {
      // Tv의 속성 (멤버변수)
      String color;    // 색상
      boolean power;   // 전원상태(on/off)
      int channel;     // 채널

      // Tv의 기능 (메서드)
      void power() {power =! power;}    // Tv를 켜거나 끄는 기능을 하는 메서드
      void channelUp() {++channel;}     // Tv의 채널을 높이는 기능을 하는 메서드
      void channelDown() {--channel;}   // Tv의 채널을 낮추는 기능을 하는 메서드
      }

      class TvTest3 {
      public static void main (String args[]) {
        Tv t1 = new Tv();    // Tv t1; t1 = new Tv(); 를 한 문장으로 가능
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1;             // t1이 저장하고 있는 값 (주소) 을 t2에 저장한다
        t1.channel = 7;      // channel 값을 7으로 한다 
        System.out.println("t1의 channel값을 7로 변경하였습니다");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다." );
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
         }
        }
        // 실행결과
        t1의 channel값은 0입니다.
        t2의 channel값은 0입니다.
        t1의 channel값을 7로 변경하였습니다.
        t1의 channel값은 7입니다.
        t2의 channel값은 7입니다.
        ```
   * 객체 배열      
      * 객체를 배열로 다루는 것을 말한다
      * 객체 배열 안에 객체가 저장되는 것이 아닌, 객체의 주소가 저장된다
      ```
      Tv[] tvArr = new Tv[3];  // 참조변수 배열 (객체 배열)을 생성
      
      //객체를 생성해서 배열의 각 요소에 저장
      tvArr[0] = new Tv();
      tvArr[1] = new Tv();
      tvArr[2] = new Tv();
      
      //다뤄야 할 객체가 많은 경우에는 for문을 사용한다
      Tv[] tvArr = new Tv[100];
      for(int i=0; i<tvArr.length; i++) {
          tvArr[i]=new Tv();
      }
      ```
        * 예제 6-4 P.242
        ```
        class TvTest4 {
        public static void main (String args[]) {
        Tv[] tvArr = new Tv[3];

        // Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for (int i=0; i<tvArr.lenght; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;   // tvArr[i]의 channel에 i+10을 저장
        }
        for(int i=0; i<tvArr.lenght; i++){
            tvArr[i].channelUp();      // tvArr[i]의 메서드를 호출. 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d\n", i, tvArr[i].channel);
               }
            } // main의 끝
        }

        class Tv{
        String color;    // 색상
        boolean power;   // 전원상태(on/off)
        int channel;     // 채널

        void power() {power = !power;}
        void channelUp() {++channel;}
        void channelDown() {--channel;}
        }
        // 실행결과
        tvArr[0].channel=11
        tvArr[1].channel=12
        tvArr[2].channel=13
        ```
* 변수와 메서드
   * 선언위치에 따른 변수의 종류
      * 클래스변수, 인스턴스변수, 지역변수 세 종류가 있다.
      * 멤버변수를 제외한 나머지 변수들은 모두 지역변수이다
      * static이 붙은 것은 클래스변수, 붙지 않은 것은 인스턴스변수이다
      ```
      class Variables
      {
         int iv           // 인스턴스변수
         static int cv;   // 클래스변수(static변수, 공유변수)
         void method()
         {
            int lv = 0;   // 지역변수
            }
        }
       ```
    * 인스턴스변수 (instance variable)
       * 클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어진다
       * 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다
       * 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우, 인스턴스변수로 선언
    * 클래스변수 (class variable) 
       * 인스턴스변수 앞에 static을 붙여서 선언하면 된다
       * 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다
       * 공통적인 값을 유지해야하는 속성의 경우 선언
    * 지역변수(local variable)
       * 메서드 내에 선언되어 메서드 내에서만 사용가능함
       * 메서드가 종료되면 소멸하고, 블럭{}을 벗어나면 소멸한다
    * 6-5 P.248 <클래스변수와 인스턴스변수를 활용한 예제>
    ```
    class CardTest {
    public static void main (String args[]) {
    
    // 클래스 변수 (static)은 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능하다
        System.out.println("Card.width = " + Card.width);    
        System.out.println("Card.height = " + Card.height);    

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

    // 인스턴스변수의 값을 변경한다
        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height +")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height +")" );
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        
     // 클래스변수의 값을 변경한다
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height +")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height +")" );
        

        
            } 
        }

        class Card{
         String kind;    
         int number;
         static int width = 100;
         static int height = 250;
        }
        
     // 실행결과
     Card.width = 100
     Card.height = 250
     c1은 Heart, 7이며, 크기는 (100, 250)
     c2은 spade, 4이며, 크기는 (100, 250)
     c1의 width와 height를 각각 50, 80으로 변경합니다.
     c1은 Heart, 7이며, 크기는 (50, 80)
     c2은 spade, 4이며, 크기는 (50, 80)
    ```    
       * 인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있다
       * 클래스변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다
       
   * 메서드(method)
       * 특정 작업을 수행하는 일련의 문장들을 하나러 묶은 것
       * 어떤 값을 입력하면 그 값으로 작업을 수행하여 결과를 반환함
       * 메서드를 사용하는 이유   
          a) 높은 재사용성(reusability)   
              -한번 만들어 놓은 메서드는 몇 번이고 호출할 수 있으며, 다른 프로그램에서도 사용 가능   
          b) 중복된 코드의 제거   
              -반복되는 문장들을 묶어서 하나의 메서드로 작성해 놓으면, 메서드를 호출하는 한 문장으로 대체가능   
              -변경사항이 발생했을때 이 메서드만 수정하면 되므로 관리도 쉽고 오류의 발생 가능성이 낮아짐   
          c) 프로그램의 구조화   
              -문장들을 작업단위로 나눠서 여러 개의 메서드에 담아 프로그램의 구조를 단순화 시키는것이 유리하다   
          
