# Visitor Pattern
* 데이터 구조와 처리를 분리하기 위해 고안된 패턴
***

![diagram](URL)

## EXAMPLE
### 파일 디렉터리 구조에 Visitor 패턴을 적용시켜보자.
### Element Interface
* Entry 이하는 기존의 파일 디렉토리 구조를 구성하는 클래스들이다.

* Visitor 패턴을 적용하기 위해 Entry 상위에 인터페이스를 생성.
```
public interface Element {
    void accept(Visitor v);
}
```
이 인터페이스는 Entry 이하의 모든 객체를 Visitor가 순회할 수 있도록
Visitor 인스턴스를 매개변수로 받는다.

### Visitor 추상클래스
```
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
```
* Entry 이하 파일과 디렉토리 모두에 대해 오버로딩된 메소드를 만든다.
***
**왜 오버로딩하는가?**
* 인터페이스와 추상클래스로 하위 클래스에 대한 다형성을 표현할 수 있다.
오버로딩는 메서드에 대한 다형성을 표현할 수 있다. 같은 visit()을 호출하더라도 매개변수에 따라 다른 메서드가 호출된다. 단순히 매개변수만 다른 메서드가 아니라
이런 의미가 숨겨져 있다.
***

### 이때까지 본 패턴 중 가장 매력적이다.
* 재귀호출과 이 패턴으로 계층구조를 설계한다면 정말 확장성 있는 설계를 할 수 있다.

### 핵심 코드
```
    @Override
    public void visit(File file) {
        System.out.println(currentdir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir+"/"+directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        List<Entry> dl = directory.getDirList();
        for (int i = 0; i < dl.size(); i++) {
            Entry entry = dl.get(i);
            entry.accept(this);  <- keypoint
        }
        currentdir = savedir;
    }
```
* 위 메서드는 매개변수가 디렉토리일 경우에만 재귀호출로 넘어가게 된다.
* entry.accept(this) <-- 매개변수로 this를 준것도 포인트. 그리고 메서드명은 다르지만 내부적으로 다시 visit()을 호출하기 때문에 재귀호출이 된다.
