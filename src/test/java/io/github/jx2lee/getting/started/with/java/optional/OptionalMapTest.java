package io.github.jx2lee.getting.started.with.java.optional;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OptionalMapTest {

    Optional<OptionalMap> optionalMap = Optional.of(new OptionalMap("jaejun", 32, "1991-07-08"));

    @Test
    @DisplayName("Optional: map: case1: map 에 전달 받은 함수를 실행하여 Optional 로 반환한다")
    @Order(1)
    void optionalMapCaseOne() {
        Optional<LocalDate> birthOpt = optionalMap.map(opt -> opt.getBirthday());
        Optional<Long> pdOpt = birthOpt.map(birth -> OptionalMapCalculateDay.calDay(birth));
        assertTrue(pdOpt.get().getClass() == Long.class);
        assertTrue(pdOpt.isPresent());
    }

    @Test
    @DisplayName("Optional: map: case2: map 에 전달 받은 함수를 실행하여 값을 Optional 로 반환한다")
    @Order(2)
    void optionalMapCaseTwo() {
        // map 중첩
        Optional<Long> duringDay = optionalMap.map(opt -> opt.getBirthday())
                .map(birth -> OptionalMapCalculateDay.calDay(birth));
        assertTrue(duringDay.get().getClass() == Long.class);
    }

    @Test
    @DisplayName("Optional: 빈 Optional 은 map 을 전달한 함수를 실행하지 않고 빈 Optional 을 반환한다")
    @Order(3)
    void optionalMapEmpty() {
        Optional<Object> empty = Optional.empty();
        Optional<String> mappedEmptyOpt = empty.map(str -> str.toString());
        assertTrue(mappedEmptyOpt.isEmpty());
    }
}
