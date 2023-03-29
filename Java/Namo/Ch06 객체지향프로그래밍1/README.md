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
  ```Java
  //6-12
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
	} 
	}
  ```
  ```Java
  //6-13
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
  
- **참조형 반환타입**
  - 반환타입이 참조형이라는 것은 반환하는 값의 타입이 참조형이라는 뜻
  - 메서드가 객체의 주소를 반환한다는 것을 의미
  
  ```Java
  //6-14
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
  
- **재귀호출**
  - 메서드가 자기 자신을 다시 호출하는 것
  - 대표적인 예로 팩토리얼이 있다.
  ```Java
  //6-15
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
  ```Java
  //6-16
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
	} 
	}
  ```
  ```Java
  //6-17
  class MainTest {
	public static void main(String args[]) {
		main(null);		// 자기 자신을 다시 호출한다.
	}
	}
  ```
  ```Java
  //6-18
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
- **클랠스 메서드와 인스턴스 메서드**
  - 모든 인스터스에 공통으로 사용하는 것은 static을 붙인다.
  - 클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.
  - 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
  - 메소드 내에[서 인스턴스 변수를 사용하지 않는다면 static을 붙이는 것을 고려한다.
  ```Java
  //6-19
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
  ```Java
  //6-20
  class MemberCall {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	//	static int cv2 = iv;		// 에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;	 

	static void staticMethod1() {
		System.out.println(cv);
	//		System.out.println(iv); // 에러. 클래스메서드에서 인스턴스변수를 사용불가.
		MemberCall c = new MemberCall();	
		System.out.println(c.iv);   
	}

	void instanceMethod1() {
		System.out.println(cv);		
		System.out.println(iv); 
	}

	static void staticMethod2() {
		staticMethod1();
	//		instanceMethod1(); // 에러. 
		MemberCall c = new MemberCall();
		c.instanceMethod1(); 
 		}
	
	void instanceMethod2() {	
		staticMethod1();		
		instanceMethod1();
	}
	}
  ```
  
 - **오버로딩**
   -
  

	
