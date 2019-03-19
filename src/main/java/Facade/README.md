# Facade Pattern

## Facade Pattern 이란?

* Facade 라는 단어의 뜻은 '외관, 겉' 이라는 의미다. 
* 이 패턴은 사용자에게 단순화된 API를 제공하기 위해 사용된다. 컨테이너(창구) 역할을 하는 클래스가 존재하며,  
이 클래스의 객체 내에서 필요한 컴포넌트의 객체를 생성하고, 관계를 구성한다.

***

## Diagram

![](https://github.com/chldntjr8036/designPattern/blob/master/src/main/java/Facade/facadeDiagram.jpg?raw=true)
***

## 클래스 설명

### Database
* 역할 : 클래스 패스 위치에 있는 text 데이터를 읽어들이고 Properties 객체에 저장한다.  
text는 key와 value의 쌍으로 이루어져 있다.
**data의 형태**
```
chldntjr8036@naver.com=choi
b@good=b
c@good=c
```

* Properties 클래스는 위 형식의 데이터를 맵 형식으로 저장한다. Stream을 이용해서 데이터를 객체에 저장하기도, 특정 형식의 파일을 만들어 저장하기도 한다.  
자바에서 Properties 클래스는 HashTable을 상속한다.
***

### HTMLWriter
* 역할 : Writer 스트림을 이용해 HTML 파일을 생성한다. 내부에 title, paragraph, link 구를 생성하는 메서드를 가진다.
***

### PageMaker 
* 역할 : Database 클래스와 HtmlWriter 클래스를 조합해서 사용자의 웹 페이지를 작성하기 위한 클래스다.

* 외부에 대해서 단 하나의 makeWelcomePage 메소드만을 보이고 있다. 컨테이너(창구)의 역할을 하는 클래스이다.
***

## Facade 의 역할

* 핵심은 인터페이스(API)를 적게 하는 일이다.
* 클래스를 설계할 때에는 어떤 메소드를 public으로 할지 생각해야한다. 너무 많은 메소드를 public으로 하면 클래스 내부를 수정하기 힘들다.  
뜻하지 않게 필드를 public 으로 하면 다른 클래스가 그 필드의 내용을 멋대로 참조하거나 변경하기 때문이다.  
클래스의 설계와 마찬가지로 패키지를 설계할 때에는 어떤 클래스를 public으로 할지 생각할 필요가 있다.  
클래스를 지나치게 외부(패키지의 외부)에 노출시키면 패키지 내부를 수정하기 힘들게 된다.


