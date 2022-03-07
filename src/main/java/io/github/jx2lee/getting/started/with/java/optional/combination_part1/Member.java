package io.github.jx2lee.getting.started.with.java.optional.combination_part1;

public class Member {
    private String name;
    private int age;
    private String companyName;

    public Member(String name, int age, String companyName) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }
}
