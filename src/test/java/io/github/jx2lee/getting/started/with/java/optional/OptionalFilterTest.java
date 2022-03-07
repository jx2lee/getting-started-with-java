package io.github.jx2lee.getting.started.with.java.optional;

import org.junit.jupiter.api.*;

import java.util.Optional;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OptionalFilterTest {

    @Test
    @DisplayName("Optional: filter: case1: 조건을 충족하면 값을 반환하고, 충족하지 못하면 빈 Optional 을 반환한다")
    @Order(1)
    void optionalFilterCaseOne() {
        Optional<OptionalFilter> optionalFilter = Optional.of(new OptionalFilter("jaejun"));
        Optional<OptionalFilter> filteredOpt = optionalFilter.filter(str -> str.length() > 3);

        Assertions.assertTrue(filteredOpt.isPresent());
        filteredOpt.ifPresent(str -> Assertions.assertTrue(str.length() > 3));
    }
}
