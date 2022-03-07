package io.github.jx2lee.getting.started.with.java.optional;

import io.github.jx2lee.getting.started.with.java.optional.combination_part1.Card;
import io.github.jx2lee.getting.started.with.java.optional.combination_part1.Company;
import io.github.jx2lee.getting.started.with.java.optional.combination_part1.CompanyCardService;
import io.github.jx2lee.getting.started.with.java.optional.combination_part1.Member;
import org.junit.jupiter.api.*;

import java.util.Optional;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OptionalMapCombinationPartOneTest {
    /**
     * 기존 로직
        Member m = ...;
        if (m == null) return null;
        Company c = getCompany(m)
        if (c == null) return null;
        Card car = createCard(m, c);
        return card;
     */
    Optional<Member> memberOpt = Optional.of(new Member("jaejun", 32, "nhn-soft"));
    CompanyCardService service = new CompanyCardService();

    @Test
    @DisplayName("Optional: case1: 지저분한 if null 을 flatmap & map 으로 해결한다.")
    @Order(1)
    void optionalMapCombinationPartOneTestCaseOne() {
        Optional<Company> companyOptional = memberOpt.map(mem -> service.getCompany(mem));
        Optional<Card> cardOptional = memberOpt.flatMap(mem -> companyOptional.map(
                comp -> service.createCard(mem, comp)
        ));

        Assertions.assertFalse(cardOptional.isEmpty());
        Assertions.assertTrue(cardOptional.get().getClass() == Card.class);
    }
    @Test
    @DisplayName("Optional: case2: 지저분한 if null 을 flatmap & map 으로 해결한다.")
    @Order(2)
    void optionalMapCombinationPartOneTestCaseTwo() {
        Optional<Card> cardOptional = memberOpt.flatMap(mem -> {
            Optional<Company> companyOptional = Optional.of(service.getCompany(mem));
            return companyOptional.map(comp -> service.createCard(mem, comp));
        });

        Assertions.assertFalse(cardOptional.isEmpty());
        Assertions.assertTrue(cardOptional.get().getClass() == Card.class);
    }
}
