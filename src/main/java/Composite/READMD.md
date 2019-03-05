# Composite Pattern
* 어떤 컴포넌트가 있고 그 컴포넌트끼리 포함관계를 가질 수 있을 때, 사용되는 패턴.
* 컴포넌트는 포함관계를 가지는 대상들에 대해 추상화된 무엇이어야 한다. 
***

## Key point
```
    @Override
    public int getSize() {

        int size = 0;

        for (int i = 0; i < directory.size(); i++) {
            Entry entry = directory.get(i);
            size += entry.getSize();  // <- keyPoint
        }

        return size;
    }
```
* 이 예제는 파일 디렉토리를 컴포넌트 패턴으로 구현한 예제이다. 위 코드는 Entry(디렉토리와 파일을 추상화한 상위 클래스)를 상속한
디렉토리에서의 파일 크기를 구하는 메서드다. 
* 주목할 점은 **size += entry.getSize();** 코드다. 위 메서드는 재귀호출을 포함하는데, 일반적인 재귀호출에 다형성의 개념을 더해, 파일일땐
그냥 자신의 사이즈를 반환하고, 디렉터리 일 땐 위 메서드가 재귀호출 된다.

## 다형성을 이용한 재귀호출의 재밌는 응용!!