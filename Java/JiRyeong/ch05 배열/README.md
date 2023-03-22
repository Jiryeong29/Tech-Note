# ch05 배열
## 배열이란?

같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

## 배열 생성

```csharp
타입[] 변수이름;
변수이름 = new 타입[길이];

int[] score = new score[6];

int[] num = {10,30,30,40};      //O

int[] num;
num = new int[] {10,30,30,40};  //X
num ={10,30,30,40}              //에러

```

> println메서드는 출력 후에 줄바꿈을 하므로 줄바꿈을 원하지 않을때 print메서드 사용
> 

## Arrays.toStrinng()메서드

배열의 모든 요소를 출력함

```csharp
int[] num = {10,30,30,40}; 

System.out.println(Araays.toString(num)); //[10,30,30,40]
```

## System.out.println()로 배열 출력

### int형식

```csharp
int[] num = {10,30,30,40}; 
System.out.println(num) //타입@주소 : I@14318bb
```

### char형식

```csharp
char[] ch = {'a', 'b', 'c', 'd'}; 
System.out.println(ch) // abcd
```

## 배열의 길이

```csharp
배열의 길이는 int범위의 양의 정수(0도)포함되어야 한다.
```

> `int[] arr = new int[0]` 과 같이
길이가 0인 배열도 생성이 가능한다.
> 

## 배열의 길이 변경하기

```csharp
**배열의 길이를 변경하는법:**
1. 더 큰 배열을 새로 생성한다.
2. 기존의 배열의 내용을 새로운 배열에 복사한다.
```

## System.arraycopy()를 이용한 배열의복사

```csharp
for문 대신System클래스의 arraycopy()를 사용하는 것이 더 효율적이다
```

for문은 배열의 요소 하나하나에 접근해서 복하자만 arraycopy()는 지정된 범위의 값들을 한 번에 통째로 복사한다. 각 요소들이 연속적으로 저장되어 있다는 배열의 특성때문에 이런 처리가 가능하다.

```csharp
for(int i=0; i<num.length; i++)
	{ newNum[i] = num[i]; }

System.arraycopy(num,0,newNum,0,num.length);
// num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
```

# String배열

## String배열의 선언과 생성

```csharp
String [] name = new String[3];

String[] name = new String[] {"Kim", "Park", "Yi"};
String[] name =  {"Kim", "Park", "Yi"};
```

## char배열과 String클래스

```csharp
String클래슨는 char배열에 기능(메서드)를 추가한것이다.
```

## String클래스의 주요 메서드

| char charAt(int index) | 문자열에서 해당위치(index)에 있는 문자를 반환한다. |
| --- | --- |
| int length() | 문자열의 길이를 반환한다. |
| String substring(int for, int to) |  문자열에서 해당범위(from~to)에 있는 문자열을 반환한다.(to는 범위에 포함되지 않음) |
| boolean equals(Object obj) | 문자열의 내용이 obj와 같은지 확인한다. 같으면 결과는 true다르면false |
| char[] toCharArray() | 문자열을 문자배열(char[])로 변환해서 반환한다. |

# 다차원 배열

## 선언방법

```csharp
타입[][] 변수이름;
타입 변수이름[][];
타입[] 변수이름[];

int[][] score;
int score[][];
int[] score[];
```
