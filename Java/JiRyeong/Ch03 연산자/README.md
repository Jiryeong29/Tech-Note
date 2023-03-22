# Chapter03 연산자

## 효율적인연산

| x | y | x || y | x && y |
| --- | --- | --- | --- |
| true | true | true | true |
| ture | false | true | false |
| false | true | true | false |
| false | false | false | false |

Or연산의 경우 두 피연산자 중 어느 한쪽만 ‘참’이어도  전체 연산결과가 ‘참

이다.

and연산의 경우 마찬가지로 어느 한쪽만 ‘거짓’이어도 전체 연산결과가 거짓이므로 나머지 피연산자는 평가하지 않는다

따라서 같은 조건식이어도 피연산자의 위치에 따라서 연산 속도가 달라질 수 있다.

## 비트 연산자 | & ^

```csharp
| (OR연산자) 피연산자 중 한 쪽의 값이 1이면, 1을 결과로 얻는다. 그 외에는 0을 얻는다.
& (AND연산자) 피연산자 양 쪽이 모두 1이어야만 1을 결과로 얻는다. 그외에는 0을 얻는다.
^ (XOR연산자) 피연산자의 값이 서로 다를때만 1을 결과로 얻는다. 같을때에는 0을 얻는다.
```

| x | y | x | y | x & y | x ^ y |
| --- | --- | --- | --- | --- |
| 1 | 1 | 1 | 1 | 0 |
| 1 | 0 | 1 | 0 | 1 |
| 0 | 1 | 1 | 0 | 1 |
| 0 | 0 | 0 | 0 | 0 |

## 비트 전환 연산자 ~

| x | ~x |
| --- | --- |
| 1 | 0 |
| 0 | 1 |

```csharp
class OperatorEx29{
    public static void main(String[] args){
        byte p = 10;
        byte n = -10;

        System.out.printf("p   = %d \t%s%n", p);
        System.out.printf("~p  = %d \t%s%n", ~p);
        System.out.printf("~p+1= %d \t%s%n", ~p+1);
        System.out.printf("~~p = %d \t%s%n", ~~p);
        System.out.printf();
        System.out.printf(" n   = %d%n",n);
    }
}
```

## 쉬프트 연산자 << >>
