package io.github.jx2lee.getting.started.with.java.optional;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.MethodOrderer.*;

@TestMethodOrder(OrderAnnotation.class)
public class OptionalExceptionTest {
    OptionalBasic optionalBasic = new OptionalBasic("jaejun", null);

    @Test
    @DisplayName("Optional: orElseThrow: 값이 없으면 exception 을 반환하고, 있으면 값을 반환한다")
    @Order(1)
    void optionalOrElseThrow() {
        assertThrows(Exception.class, () -> optionalBasic.getAge().orElseThrow((Supplier<Throwable>) () -> new Exception()));
    }
}
