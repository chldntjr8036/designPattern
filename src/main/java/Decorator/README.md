# Decorator Pattern

## Decorator Pattern란?
* 어떤 컴포넌트에 대해 장식하듯이 기능을 덮어 씌우는 패턴이다.

## 어떨 때 사용하는가? 
* 컴포넌트의 내용을 변화시키지 않으면서 다양하게 기능을 추가하고 싶을 때

***
## diagram

![uml](https://github.com/chldntjr8036/designPattern/blob/master/src/main/java/Decorator/diagram.jpg?raw=true)

* Display : 최상위 Component 추상 클래스.
* StringDisplay : 구체적인 Display 하위클래스.
* Border : Decorator 역할을 하는 추상클래스
* SideBorder, FullBorder : Concrete Decorator 역할을 하는 클래스

**바로 전에 배웠던 Compoenet Pattern에서 봤었던 점이 사용됐다. 컴포넌트와 데코레이션 기능을 가진
클래스를 덮어 씌울 수 있게(상하 포함 관계가 가능하도록) 두 종류의 기능을 최상위 Display로 추상화했다는 점이다.**

## 클래스에 관한 디테일
* Display : 문자열의 문자수와 행수를 반환하는 추상메서드와 출력 방식을 위임하는 추상메서드.
그리고 문자열 전체를 출력하는 템플릿 메서드 show()로 구성되어 있다.
* StringDisplay :  문자열을 한 줄의 문자열을 입력 받고 출력하는 Display의 구체 하위 클래스다.
* Border : 추상클래스. Decorator역할을 하는 추상클래스. 꾸밀 대상의 참조가 필요하다.
그래서 Display에 대한 참조를 생성자로 받고, 필드에 저장한다.
* 그 외 Border 하위 클래스 : 기능을 추가하는 하위클래스. 


## 단점
* 
