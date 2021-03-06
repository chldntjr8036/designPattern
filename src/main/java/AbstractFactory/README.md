# Abstract Factory Pattern
***

## Abstract Factory Pattern이란?

* Factory란 보통 인스턴스를 생성하는 컨테이너 역할을 하는데, 추상 팩토리 패턴은
추상적인 부품을 조립해서 추상적인 제품을 만든다.

* 팩토리 메서드 패턴과는 다르다. 여기서 팩토리 역할을 하는 클래스는 로직을 가지지 않고, 인스턴스를 생성하는 역할만 한다.

* 자세한건 UML을 보면서 정리하자.
***
## UML

![UML](https://github.com/chldntjr8036/designPattern/blob/master/src/main/resources/abstractFactory_uml.jpg?raw=true)

***

## 클래스 설명

* Item : Tray와 Link의 상위 클래스다. 왜 이 두가지가 Item의 하위 클래스가 되도록 설계했을까?
Tray와 Link가 동등한 레벨의 컴포넌트이기 때문이다. Tray는 List형의 자료구조를 가지고 컴포넌트를 담을 수 있도록 설계되는데,
담는 컴포넌트는 Link와 Tray자신의 컴포넌트가 가능하기 때문에 이 두 클래스를 하나의 상위클래스로 표현하기 위해 Item을 설계한 것 같다.

* Tray, Link : 각각의 기능을 가진 소규모 컴포넌트. 추상클래스이며 기능에 따른 HTML구성은 하위 클래스에게 맡긴다.
* Page : HTML 문서 전체를 담는 컨테이너. 담을 컴포넌트를 저장할 리스트형 자료구조를 가진다. 추상클래스이며 전체 HTML을 구성하는 makeHTML의 구현은 하위클래스에게 맡긴다.

* ListTray, ListLink : 각각 HTML에서 하이퍼링크, 리스트 태그를 구현한 컴포넌트.  각각의 상위클래스를 상속한다.
* ListPage : Page를 상속한 클래스.

* Factory : getFactory 메서드는 자바의 Class의 api를 사용해 동적으로 인스턴스를 생성한다.
책에 나온 관련메서드가 자바9 이후로 폐기되고 다른 걸로 대체되었으니 문서를 참고하자.
 인스턴스를 제공하는 추상메서드로 구성되어 있으며, 하위 클래스에 자세한 구현을 위임.
 
* ListFactory : Factory의 하위 클래스.

***

## 주목할 점

* 이 예제에선 사용자는 ListFactory의 이름만 알면 된다. 나머지 List관련 하위 요소는 알 필요가 없다.
ListFactory클래스의 이름만 알면 나머지는 Factory에 의해 상위 추상 메서드의 다형성을 이용해 로직을 구성할 수 있다.



