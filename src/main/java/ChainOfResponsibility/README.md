# Chain of Responsibility Pattern
***
## Diagram
![diagram](URL)
***
## Example scenario
* Trouble 은 문제를 나타내는 클래스다. 해결돼야할 문제는 number 로 정의된다.

* Support 는 Trouble 의 해결을 지원하는 클래스다. number 을 참고해 각 클래스에서 지원할 수 있는 number라면 문제를 해결한다.

* Support 객체들을 연결해 일련의 문제 해결을 위한 체인을 형성한다. 각 체인에서 해결하지 못할 경우 다음으로 지정되어 있는 객체에 문제를 넘긴다.
***

## Key point
```
    //핵심 메서드
    public final void support(Trouble trouble) {
        if(resolve(trouble)) {
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }
    protected abstract boolean resolve(Trouble trouble); //해결용 메서드

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by "+this+".");
    }
    protected void fail(Trouble trouble) { //미해결
        System.out.println(trouble + " cannot be resolved.");
    }
```

* 위는 Support 추상메서드의 메서드들이다. 문제의 해결에 관한 구체적인 사항은 하위 클래스들에게 위임한다.

* 해결한 경우 done을 호출해 해당 객체에서 해결됐음을 알리고, 해결하지 못한 경우 그리고 다음에 지정된 Support 인스턴스가 있는 경우 재귀적으로 다음을 호출하고 
문제를 넘긴다.

* 마지막까지 해결 하지 못한 경우 fail()을 호출한다.