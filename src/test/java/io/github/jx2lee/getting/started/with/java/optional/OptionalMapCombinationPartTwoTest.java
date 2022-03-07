package io.github.jx2lee.getting.started.with.java.optional;

import io.github.jx2lee.getting.started.with.java.optional.combination_part2.Member;
import io.github.jx2lee.getting.started.with.java.optional.combination_part2.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class OptionalMapCombinationPartTwoTest {
    /**
     * 기존 로직
        Member m1 = ...;
        Member m2 = ...;
        if (m1 == null && m2 == null)
            return null;
        if (m1 == null) return m2;
        if (m2 == null) return m1;
        return m1.year > m2.year ? m1: m2;
     */
    Optional<Member> memberOpt01 = Optional.of(new Member("jaejun1", 33, "nhn-soft"));
    Optional<Member> memberOpt02 = Optional.of(new Member("jaejun2", 32, "nhn-soft"));

    @Test
    @DisplayName("Optional: 복잡한 if null 을 flatmap & map 으로 해결한다")
    void optionalMapCombinationPartTwoTestCaseOne() {
        Optional<Member> result = memberOpt01.flatMap(m1 ->
                        Optional.of(memberOpt02.map(m2 ->
                                MemberService.getMember(m1, m2))).orElse(Optional.of(m1))
        ).or(() -> memberOpt02);

        Assertions.assertFalse(result.isEmpty());
        Assertions.assertTrue(result.get().getClass() == Member.class);
    }
}
