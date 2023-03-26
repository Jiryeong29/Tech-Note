# ch06 상속
## Java에서의 상속에 대한 개념

하나의 클래스가 다른 클래스로부터 필드와 메소드를 물려받는 것
상속을 통해 코드 중복을 줄이고, 코드의 재사용성과 유지보수성을 높일 수 있다

## Java의 상속 예시

```csharp

HighClass와 Subclass는 각각 부모 클래스와 자 클래스

class HighClass{
 // 부모 클래스에서 사용할 필드와 메소드를 정의
}

class Downclass extends HighClass{
// 자식 클래스에서 사용할 필드와 메소드를 정의
}

```

> extends를 사용하여 하위 클래스가 상위 클래스를 상속받을 수 있다
> 

## 메소드 오버라이딩

자식 클래스가 부모 클래스의 메소드를 자신의 필요에 맞추어서 재정의하는 것.
> 단, 메소드의 이름이나 매개 변수, 반환형을 동일해야 함.
> 
```csharp
class HighClass{
   public void sayHello() {
      System.out.println("Hello from HighClass!");
   }
}

class DownClass extends HighClass {
   @Override
   public void sayHello() {
      System.out.println("Hello from DownClass!");
   }
}
```
> 자식클래스에서 'sayHello' 메소드를 오버라이딩하여 기존 메소드를 수정.
> 자식 클래스의 인스턴스에서 'sayHello' 메소드를 호출하면, "Hello from DownClass!"가 print 됨.

## 상속의 장점

1. 코드 중복을 줄여서 코드의 길이를 간결하게 만든다.
2. 비슷한 클래스들 간의 관계를 알 수 있다.
3. 코드 재사용과 유지보수가 원활하다.

## 상속의 단점

1. 상속은 코드 복잡성을 유발할 수 있다. 부모 클래스와 자식 클래스간의 관계는 코드 이해도를 저하시킴
2. 부모 클래스를 변경하는 것이 어려움. 부모 클래스가 변경되면 자식 클래스들에게도 영향을 준다.
3. 오버라이딩 오류 가능성(조사예정)
4. 성능저하 : 메소드 호출시 우선 부모 클래스에서 해당 메소드를 찾고 그 다음 자식 클래스로 넘어간다. 그러므로 메소드 호출 시간을 늘린다.
