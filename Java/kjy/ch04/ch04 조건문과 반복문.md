# Tech-Note
📂엔지니어 기술 면접 스터디 - Java

# ch04 조건문과 반복문

## if 문

if 문은 조건식이 참인 경우와 거짓인 경우에 각각 다른 문장을 수행한다.

```csharp

if(조건식) {
  // 조건식이 참일 때 실행할 코드
} else {
  // 조건식이 거짓일 때 실행할 코드
}
}

```

> if 문에서 else는 선택이다. else 블록이 없는 경우, 조건식이 거짓인 경우에는 아무런 코드도 실행되지 않는다.

## switch

switch 문은 다양한 값에 대한 조건을 체크하여 각각의 조건에 맞는 코드를 실행하는 구문

>  switch 문은 else-if 문과 비슷한 역할을 하지만, 여러 개의 조건을 체크할 때 else-if 문보다 간결하게 코드를 작성 가능
> 
```csharp
switch(변수) {
  case 값1:
    // 값1에 해당하는 코드 블록
    break;
  case 값2:
    // 값2에 해당하는 코드 블록
    break;
  // ...
  default:
    // 모든 조건에 해당하지 않을 때 실행되는 코드 블록
}
```
> 위의 코드에서 switch 문의 변수는 체크할 값이며, case 문은 체크할 값과 일치하는 경우 실행

> break 문은 각 case 문의 끝에 위치하여, 해당 case 문이 실행된 후에 switch 문에서 이탈

> default 문은 모든 case 문에 해당하지 않는 경우 실행

```csharp
int month = 5;
String season;

switch(month) {
  case 12:
  case 1:
  case 2:
    season = "겨울";
    break;
  case 3:
  case 4:
  case 5:
    season = "봄";
    break;
  case 6:
  case 7:
  case 8:
    season = "여름";
    break;
  case 9:
  case 10:
  case 11:
    season = "가을";
    break;
  default:
    season = "잘못된 입력";
}

System.out.println(season);
```
> 위의 코드에서 변수 month는 현재 월을 나타내는 정수값이며, switch 문을 사용하여 각각의 계절에 해당하는 값을 출력 

> month가 3, 4, 5 중 하나인 경우에는 "봄"을 출력하며, 이 외의 값이 입력된 경우에는 "잘못된 입력"을 출력

## 조건문의 장점과 단점

조건문을 사용하면 프로그램의 플로우를 컨트롤할 수 있지만 조건문을 남발할 경우 코드의 가독성이 떨어지고, 디버깅이 어려워 질 수 있다.

## for 문

for 문은 초기값, 조건식, 증감식을 이용하여 반복문을 실행

> 초기값은 반복문의 시작점을 정의
> 조건식은 반복문이 실행될 조건을 정의
> 증감식은 반복문이 실행될 때마다 실행되며, 변수의 값을 변화

```csharp
for(int i=0; i<10; i++) {
  System.out.println(i);
}
```
0부터 9까지의 정수를 출력하는 예제
초기값 i=0으로 설정되어 있으며, 조건식 i<10이 참인 동안 반복문이 실행
반복문이 실행될 때마다 i의 값은 1씩 증가

## while 문
while 문은 조건식이 참인 동안 반복문을 실행
```csharp
int i = 0;
while(i < 10) {
  System.out.println(i);
  i++;
```
> for 문의 예제와 동일한 결과를 출력하는 예시. 초기값을 설정하는 부분은 while 문의 조건식 앞에서 수행!

## do-while 문
do-while 문은 while 문과 유사하지만, 조건식을 반복문 실행 후에 검사
```csharp
int i = 0;
do {
  System.out.println(i);
  i++;
} while(i < 10);
```
> 위의 코드도 for 문과 while 문의 예제와 동일한 결과를 출력!

> i의 초기값은 반복문 밖에서 설정되며, 반복문 내에서 i의 값을 증가

>  do-while 문은 반복문이 최소한 한 번은 실행되도록 보장
