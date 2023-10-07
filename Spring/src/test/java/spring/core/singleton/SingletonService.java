package spring.core.singleton;

public class SingletonService {
    /**
     * 싱글톤만 간딘히 만들어서 test -> 객체를 미리 생성해두는 가장 단순하고 안전한 방법, 방법은 여러가지가 있다.
     * 자바 실행 될때 객체를 띄어 놓는다.
     * 스프링 컨데이너가 기본적으로 싱글톤으로 만들어 관리해준다.
     */

    private static final SingletonService instance = new SingletonService();
    // 이 객체기 필요하면 오직 getInstance() 메서드를 통해서만 조회할 수 있다. 외부에서 new 키워드로 객체 생성되는 것을 막는다.
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
