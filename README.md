# Getting Started With Java
- at least 20 min per day
- must have test code
- `go hard`!

# 간단한 내용 정리에요.
- generic
  - 컴파일 시점 타입을 체크하여 코드의 안정성을 높여주는 기능
    ```java
    List<T>
    -> T: 타입 매개변수
    List<String> stringList = new ArrayList<String>();
    -> String: 매개변수화된 타입
    ```
  - 특징
    - 강력한 타입 검사
    - 캐스팅(타입 변환) 제거
  - 제한
    - 상한 제한
    - 하한 제한
    - 언제 사용하는가?
      - effective java: PECS
      - producer extends, consumer super
- jdk 버젼 별 특징 정리
  - 현재 사용중인 11 까지만 정리했어요.
  - jdk 9
    - private method in interface
    - try with resource (try 에 변수 선언 가능. 단, final)
    - collection 의 팩토리 메서드(List.of, Map.of, Set.of)
    - Arrays (compare/mismatch)
  - jdk 10
    - var: 로컬 변수 타입 추론
    - 11 부터는 lambda 식에서 사용가능
  - jdk 11
    - String (isBlank, lines, repeat, strip/stripLeading/stripTailing)

# Reference
- [https://www.youtube.com/watch?v=7SlDdzVk6GE](https://www.youtube.com/watch?v=7SlDdzVk6GE)
- [https://www.youtube.com/watch?v=w5AKXDBW1gQ](https://www.youtube.com/watch?v=w5AKXDBW1gQ)
