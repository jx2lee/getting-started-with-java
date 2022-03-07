package io.github.jx2lee.getting.started.with.java.optional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OptionalMapCalculateDay {
    public static Long calDay(LocalDate birthLocalDate) {
        return ChronoUnit.DAYS.between(birthLocalDate, LocalDate.now());
    }
}
