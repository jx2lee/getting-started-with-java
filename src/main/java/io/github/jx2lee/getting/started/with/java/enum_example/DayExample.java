package io.github.jx2lee.getting.started.with.java.enum_example;

public class DayExample {
    private Day day;

    public DayExample(Day day) {
        this.day = day;
    }

    public String tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                return "MONDAY";
            case FRIDAY:
                return "FRIDAY";
            case SATURDAY: case SUNDAY:
                return "Weekends are best.";
            default:
                return "Midweek days are so-so.";
        }
    }
}
