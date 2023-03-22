# Tech-Study
📂엔지니어 기술 면접 스터디 - Java
- [연산자](#5)

 ## #5
#### 배열

- **배열의 선언과 생성**
  ```Java
  int[] score = new int[5]; // 크기가 5인 int타입의 score라는 배열을 생성
  ```
  
- **배열의 길이와 인덱스, 초기화** 
  - 크기가 5인 배열을 만들었다면 인덱스는 0~4까지이다.
   ```Java
   int[] score = new int[5];
   score[0] = 1; //배열의 크기는 1 인덱스는 0 1로 초기화
   score[1] = 2; //배열의 크기는 2 인덱스는 1 2로 초기화
   score[2] = 3; //배열의 크기는 3 인덱스는 2 3로 초기화
   score[3] = 4; //배열의 크기는 4 인덱스는 3 4로 초기화
   score[4] = 5; //배열의 크기는 5 인덱스는 4 5로 초기화
   ```

- **배열의 복사**
  - for문을 돌리면 된다.
  - arraycopy()함수를 쓰면된다.
  ```Java
  for(int i = 0; i < num.length; i++) { newNum[i] = num[i]}; // 기본적인 for문으로 배열 복사
  System.arraycopy(num, 0, newNum, 0, num.length) // arraycopy 함수 사용
  ```
