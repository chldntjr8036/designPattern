# Factory Method Pattern Summary

<hr/>

## Factory Method Pattern 이란?

* 인스턴스를 생성하는 공장을 Template Method 패턴으로 구성한 것이 Factory Method 패턴이다.

<hr/>

## 왜 쓰는가? 어떤 경우에 쓰는가?

* 왜 쓰는가에 대한 답은 아직 모르겠다. 경험이 부족한지라. 이점에 대해서는 어느 정도는 짐작이 된다.
인스턴스를 만드는 과정을 둘러싼 중복된 로직이 있다면 객체와 Factory를 추상화해서 템플릿 메서드 패턴을 이용해
중복을 제거할 수 있다. 비슷한 로직의 여러 객체를 생성하고 그 이후 해야할 공통 로직이 있다면 편할 것 같다.



