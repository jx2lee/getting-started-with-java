package io.github.jx2lee.getting.started.with.java.private_interface;

public interface Client {
    /**
     * jdk 9 부터 Interface 안에 private method 추가 가능
     * 이전에는..
        * default method
        * static method
        * 위 2가지 method 추가만 가능
     * private method 는 interface 내 코드 재사용성 향상
     * ref: https://howtodoinjava.com/java9/java9-private-interface-methods/
     */
    void exchange();

    default void get() {
        logging("before");
        exchange();
        logging2("call get");
    }

    private void logging(String msg) {
        System.out.println(msg);
    }

    private void logging2(String msg) {
        System.out.println(msg);
    }
}
