package io.github.jx2lee.getting.started.with.java.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringBuilderStringBufferTest {

    private static final int MAX_LOOP_COUNT = 5_000_000;

    @Test
    @DisplayName("StringBuilder 수행속도를 측정한다")
    void builderTest() {
        StringBuilder builder = new StringBuilder();
        StringBuilderStringBuffer builderClock = new StringBuilderStringBuffer();

        builderClock.startClock();
        for (int i = 0; i < MAX_LOOP_COUNT; i++) {
            builder.append("jx2lee").append(i).append("test");
        }
        builderClock.stopClock();
        builderClock.printResultTime("StringBuilder");
    }

    @Test
    @DisplayName("StringBuffer 수행속도를 측정한다")
    void bufferTest() {
        StringBuffer buffer = new StringBuffer();
        StringBuilderStringBuffer bufferClock = new StringBuilderStringBuffer();

        bufferClock.startClock();
        for (int i = 0; i < MAX_LOOP_COUNT; i++) {
            buffer.append("jx2lee").append(i).append("test");
        }
        bufferClock.stopClock();
        bufferClock.printResultTime("StringBuffer");
    }
}
