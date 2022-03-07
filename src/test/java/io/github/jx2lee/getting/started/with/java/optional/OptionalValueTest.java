package io.github.jx2lee.getting.started.with.java.optional;

import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OptionalValueTest {
    OptionalBasic optionalBasic = new OptionalBasic("jaejun", null);

    @Test
    @DisplayName("Optional: get: 값 사용하기")
    @Order(1)
    void optionalGetOptional() {
        assertTrue(optionalBasic.getName().getClass() == Optional.class);
        assertTrue(optionalBasic.getName().get() == "jaejun");

        // Null 값을 get 하면 NoSuchElementException 발생
        assertThrows(NoSuchElementException.class, () -> optionalBasic.getAge().get());
    }

    @Test
    @DisplayName("Optional: isPresent & isEmpty: 값이 있는지 없는지 확인")
    @Order(2)
    void optionalPresentOrEmpty() {
        Optional<String> optionalBasicName = optionalBasic.getName();
        assertTrue(optionalBasicName.isPresent());
        assertFalse(optionalBasicName.isEmpty());

        Optional<Integer> optionalBasicAge = optionalBasic.getAge();
        assertTrue(optionalBasicAge.isEmpty());
        assertFalse(optionalBasicAge.isPresent());
    }

    @Test
    @DisplayName("Optional: ifPresent & ifPresentOrElse: 값이 있으면 실행하기")
    @Order(3)
    void optionalIfPresent() {
        // ifPresent
        Optional<String> optionalBasicName = optionalBasic.getName();
        optionalBasicName.ifPresent(name -> System.out.println("value = " + name));

        // ifPresentOrElse
        Optional<Integer> optionalBasicAge = optionalBasic.getAge();
        optionalBasicAge.ifPresentOrElse(
                value -> System.out.println("value = " + value),
                () -> System.out.println("optionalBasicAge has no value."));
    }

    @Test
    @DisplayName("Optional: orElse & orElseGet & or: 값이 없을 때 다른 값으로 사용")
    @Order(4)
    void optionalOrElse() {
        Optional<Integer> optionalBasicAge = optionalBasic.getAge();
        Integer getAgeByOrElse = optionalBasicAge.orElse(50);
        assertTrue(getAgeByOrElse == 50);

        // 값 -> 함수로 지정 가능
        Integer getAgeByOrElseGet = optionalBasicAge.orElseGet(() -> 50);
        assertTrue(getAgeByOrElseGet == 50);

        // or: Optional 을 리턴
        Integer getAgeByOr = optionalBasicAge.or(() -> Optional.of(50)).get();
        assertTrue(getAgeByOr == 50);
    }
}
