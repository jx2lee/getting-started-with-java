package io.github.jx2lee.getting.started.with.java.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalCreationTest {
    @Test
    void createOptionalCaseOne() {
        // null 값으로 생성할 경우 NullPointerException
        assertThrows(NullPointerException.class, () -> {
            Optional.of(null);
        });

        // Optional - of
        Optional<String> optionalValue = Optional.of("value");
        assertTrue(optionalValue.getClass() == Optional.class);

        // Optional ofNullable()
        String testValue = "test";
        Optional<String> optionalValueOfNullable = Optional.ofNullable(testValue);
        assertTrue(optionalValueOfNullable.getClass() == Optional.class);

        // Optional empty()
        Optional<Object> optionalEmpty = Optional.empty();
        assertTrue(optionalEmpty.getClass() == Optional.class);
    }
}
