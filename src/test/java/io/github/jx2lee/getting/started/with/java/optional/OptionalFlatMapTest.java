package io.github.jx2lee.getting.started.with.java.optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalFlatMapTest {

    @Test
    @DisplayName("Optional: flatMap 에 전달받은 함수 return 값을 Optional 로 반환한다: flatMap 에 전달한 함수는 리턴 타입이 Optional 이어야 한다")
    void optionalFlatmap() {
        Optional<OptionalMap> optionalMap = Optional.of(new OptionalMap("jaejun", 32, "1991-07-08"));
        Optional<LocalDate> birthOpt = optionalMap.flatMap(opt -> Optional.ofNullable(opt.getBirthday()));
        Optional<Long> pdOpt = birthOpt.map(birth -> OptionalMapCalculateDay.calDay(birth));
        assertTrue(pdOpt.get().getClass() == Long.class);
        assertTrue(pdOpt.isPresent());
        
        // map 으로 Optional 을 return 하는 경우
        // Optional 이 이중으로 중첩해서 반환
        Optional<Optional<LocalDate>> birthOptDuplicated = optionalMap.map(opt -> Optional.ofNullable(opt.getBirthday()));
    }
}
