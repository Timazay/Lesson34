package by.itstep.javalessons.lesson34.task01.model.entity;

public class WeekDay {
    private String dayName;
    private int dayNum;

    public WeekDay() {
        dayName = "Monday";
        dayNum = 1;
    }

    public WeekDay(String dayName, int dayNum) {
        this.dayName = dayName;
        this.dayNum = dayNum;
    }

    public String getDayName() {
        return dayName;
    }

    public int getDayNum() {
        return dayNum;
    }

    @Override
    public String toString() {
        return  dayName + "[" + dayNum + "]";
    }
}
