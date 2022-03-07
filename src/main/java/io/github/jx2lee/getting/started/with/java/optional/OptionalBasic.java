package io.github.jx2lee.getting.started.with.java.optional;

import java.util.Optional;

public class OptionalBasic {
    /**
     * Optional: 값이 있거나 없는 값을 표현하는 type
        * null 대체
        * 8 버전 이후 추
     **/

    private String name;
    private Integer age;

    public OptionalBasic(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

}
