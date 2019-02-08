# Adaptor pattern summary

* 이미 제공 되어 있는 것과 필요한 것 차이를 없애주는 디자인 패턴이다.

<hr/>

## 상속을 사용한 어댑터 패턴
 
제공 되어 있는 클래스 -> Banner 클래스 <br>
클라이언트 -> Main 클래스<br>
제시된 API -> Print 인터페이스<br>
어댑터 -> PrintBanner 클래스<br>
<br>
* 클래스를 재사용하기 위해 배너 클래스를 재이용하고 싶다. 그런데 사용하려는 API가 기존의
Banner API와 맞지 않을 때 API의 구현체를 어댑터로 이용해 해당 어댑터가 Banner를 상속하도록 해서
기능을 위임한다.


## 인스턴스를 사용한 어댑터 패턴

제공 되어 있는 클래스 -> Banner 클래스 <br>
클라이언트 -> Main 클래스<br>
제시된 API -> Print abstract 클래스<br>
어댑터 -> PrintBanner 클래스<br>
<br>

* 위와 구조는 동일하다. 어렵게 생각하지 말자. 위는 상속을 통해 기능을 위임했고,
이 구조는 필드를 통해 객체를 생성해 기능을 위임했다.
PrintBanner 클래스에서 Banner의 생성자를 직접 호출해 기능 위임.
<hr/>

