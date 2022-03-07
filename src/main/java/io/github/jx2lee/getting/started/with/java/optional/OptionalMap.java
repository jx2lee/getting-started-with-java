package io.github.jx2lee.getting.started.with.java.optional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class OptionalMap {
    private String name;
    private Integer age;
    private String birth;

    public OptionalMap(String name, Integer age, String birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public LocalDate getBirthday() {
        return LocalDate.parse(this.birth, DateTimeFormatter.ISO_DATE);
    }
}
