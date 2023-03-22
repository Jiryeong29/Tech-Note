# Chapter04

### switch 문의 제약 조건

1. switch문의 조건식 결과는 정수 또는 문자열이여야 한다.
2. case문의 값은 정수 상수만 가능하며 , 중복되지 않아야 한다.

```java
package test;

import java.util.*;
public class HelloWorld {
    public static void main(String[] args) 
    {
    	final int january = 1;
    	final int february =2;
    	final int march =3;
    	System.out.print("현재 월을 입력하세요.>");
    	
    	Scanner scanner = new Scanner(System.in);
    	int month = scanner.nextInt();
    	
    	switch(month) {
    		case march: 
    		case 4:
    		case 5: 
    			System.out.println("현재의 계절은 봄입니다.");
    			break;
    		case 6: case 7: case 8: 
    			
    			System.out.println("현재의 계절은 여름입니다.");
    			break;
    		case 9: case 10: case 11:
    			System.out.println("현재의 계절은 가을입니다.");
    			break;
    			default:
    		case 12: case january: case february:
    			System.out.println("현재의 계절은 겨울입니다.");
    	}
    	
    }
}
```

### 난수사용

Math.random()을 사용한다.

이 메서드는 0.0과 1.0 사이의 범위에 속하는 하나의 double값을 반홚나다.

0.0 ≤ Math.random() <1.0
