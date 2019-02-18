# Builder Pattern 정리

***

## Builder Pattern 이란 ? 

* 이름과 비슷하게 쌓아 올리는 패턴이다. 기본적으로 구조 내에 상태정보를 가지게 된다.

* 이 예제만 놓고 봤을 땐 템플릿 패턴과 유사하다. 다른 점이 있다면 템플릿 메서드 패턴은 상위 추상 클래스에서
로직을 제어하지만 Builder 패턴은 추상메서드 객체 참조를 가지는 다른 클래스에서 제어한다는 점인데... 이 예제는 
상황이 간단해서 그런지 이 패턴의 장점이 잘 와닿지는 않는다. 템플릿 메서드 패턴으로 충분히 구현 가능해보이고, 추상메서드와
사용자 사이에 매개하는 클래스가 하나 더 끼어들어가는 이유를 잘 모르겠다.(아마 Builder 클래스 레벨에서 확장이 필요한 경우를 대비한 듯하다.)

***
## UML 
![UML](https://github.com/chldntjr8036/designPattern/blob/master/src/main/resources/builder_uml.png?raw=true)

### 클래스 설명
* Builder : 문서를 구성하기 위한 메서드를 결정하는 추상 클래스
* Director : 한 개의 문서를 만드는 클래스. contruct() 메서드가 템플릿 역할을 하며, Builder 객체참조를 필드로 갖는다.
사용자가 사용하게 될 클래스
* TextBuilder : 추상클래스인 Builder를 상속한 하위클래스. 상태를 쌓아가기 위한 buffer(저장소)가 필요하며, Builder의 추상메서드를 구현.
* HTMLBuilder : 위와 동일하지만 마지막 HTML문서를 만들기 위해 마지막 close()에서 버퍼를 flush하면서 출력스트림으로 HTML문서를 작성한다.
* Main : 동작 테스트용 클래스. 사용자.

***
## 연습문제 1 - 예제 프로그램의 Builder 클래스를 인터페이스로 변경하고, 그것에 맞게 다른 클래스를 수정하시오.

* 이 문제를 통해 왜 Director 클래스를 사용자와 Builder 사이에 뒀는지 약간 이해가 됐다. 
* 문제 해결 자체는 간단한데 그냥 interface로 바꾸고 하위 클래스에 extends를 implements로 바꾸면 된다.
만약 Director클래스가 없이 Builder클래스에서 템플릿 메서드를 구성했다면 수정해야 될게 더 많았을 것이다.
(결국 현재 클래스 구조가 될것이다.)

***
## 참고 - StringBuffer와 StringBuilder의 차이
* StringBuffer는 동기화되어 있고, StringBuilder는 그렇지 않다.
