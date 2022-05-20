package io.github.jx2lee.getting.started.with.java.generic;

public class Category<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public<T> void printClassName(T t) {
        System.out.println("클래스 필드에 정의된 타입 = " + this.t.getClass().getName());
        System.out.println("제네릭 메서드에 의해 정의된 타입 = " + t.getClass().getName());
    }
}
