package io.github.jx2lee.getting.started.with.java.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareMismatchTest {

    // given
    CompareMismatch compareMismatch = new CompareMismatch();
    @Test
    @DisplayName("Array.compare")
    void arraysCompare() {
        // when
        int value = compareMismatch.getCompare();
        Assertions.assertEquals(-1, value);
        System.out.println("compareValue = " + value);
    }

    @Test
    @DisplayName("Array.mismatch")
    void arraysMismatch() {
        //when
        int value = compareMismatch.getMismatch();

        // then
        Assertions.assertEquals(0, value);
        System.out.println("mismatchValue = " + value);
    }
}
