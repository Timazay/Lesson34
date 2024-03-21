package by.itstep.javalessons.lesson34.task01.model.entity;

public enum WeekDayType {
    MONDAY,
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String dayName;
    private final int dayNum;

    WeekDayType() {
        dayName = "Monday";
        dayNum = 1;
    }

    WeekDayType(String dayName, int dayNum) {
        this.dayName = dayName;
        this.dayNum = dayNum;
    }

    @Override
    public String toString() {
        return dayName + "[" + dayNum + "]";
    }
}
