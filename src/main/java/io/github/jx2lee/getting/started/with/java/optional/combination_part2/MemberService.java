package io.github.jx2lee.getting.started.with.java.optional.combination_part2;

public class MemberService {
    public static Member getMember(Member mem1, Member mem2) {
        return mem1.getYear() > mem2.getYear() ? mem1 : mem2;
    }
}
