package io.github.jx2lee.getting.started.with.java.enum_example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.github.jx2lee.getting.started.with.java.enum_example.Day.*;
import static org.assertj.core.api.Assertions.assertThat;

class DayExampleTest {

    private DayExample dayExampleMonday;
    private DayExample dayExampleFriday;
    private DayExample dayExampleWeekend;
    private DayExample dayExampleDefault;

    @BeforeEach
    void dayExampleMonday() {
        dayExampleMonday = new DayExample(MONDAY);
        dayExampleFriday = new DayExample(FRIDAY);
        dayExampleWeekend = new DayExample(SATURDAY);
        dayExampleDefault = new DayExample(WEDNESDAY);
    }

    @Test
    void dayTellItLikeItIsTest() {
        // given
        // when
        String resultMonday = dayExampleMonday.tellItLikeItIs();
        String resultFriday = dayExampleFriday.tellItLikeItIs();
        String resultWeekend = dayExampleWeekend.tellItLikeItIs();
        String resultDefault = dayExampleDefault.tellItLikeItIs();

        // then
        assertThat(resultMonday)
                .isNotEmpty()
                .isNotNull()
                .isEqualTo(MONDAY.toString());
        assertThat(resultFriday)
                .isNotEmpty()
                .isNotNull()
                .isEqualTo(FRIDAY.toString());
        assertThat(resultWeekend)
                .isNotEmpty()
                .isNotNull()
                .isEqualTo("Weekends are best.");
        assertThat(resultDefault)
                .isNotEmpty()
                .isNotNull()
                .isEqualTo("Midweek days are so-so.");
    }
}
