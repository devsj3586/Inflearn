package spring.core.singleton;

public class StatefulService {

    /*
        price는 공유 되는 필드, 특정 클라이언트가 값을 변경한다.
        A가 B 의 price 를 변경할수 있다. -> stateful 설계 (큰 장애 발생)

        해경방안 stateless(무상태)
        필드 대신 지역변수, 파라미터 등을 사용해야한디.
     */
//    private int price; // 상태를 유지하는 필드

    /*
        필드사용 (공유되었을때)
     */
//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제
//    }
    /*
        필드 대신 지역변수, 파라미터 등을 사용
     */
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }


//    public int getPrice() {
//        return price;
//    }
}
