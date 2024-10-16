package 과제.교과서.sec02;


//객체지향 - 추상에 대하여 (인터페이스) p. 346
public class Television implements RemoteControl{

    //인터페이스에 선언된 메소드의 재정의 무조건 있어야한다. (강제적)
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }
}
//인터페이스 = 선언적인 요소 , 완전한 추상화는 인터페이스 사용
