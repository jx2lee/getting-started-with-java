package io.github.jx2lee.getting.started.with.java.generic.restrict;

import io.github.jx2lee.getting.started.with.java.generic.domain.Noodle;

public class NoodleCategory<T extends Noodle> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public<T> void printClassName(T t) {
        System.out.println("클래스 필드에 정의된 타입 = " + this.t.getClass().getName());
        System.out.println("제네릭 메서드에 의해 정의된 타입 = " + t.getClass().getName());
    }
}
