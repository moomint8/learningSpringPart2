package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();    // private 를 사용해 혹시라도 외부에서 new를 이용해 객체 인스턴스 생성하는 것을 막는다.

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
