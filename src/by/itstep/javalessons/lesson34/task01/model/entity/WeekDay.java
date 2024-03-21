package by.itstep.javalessons.lesson34.task01.model.entity;


public class WeekDay {
    public static final WeekDay MONDAY = new WeekDay();
    public static final WeekDay TUESDAY = new WeekDay("Tuesday", 2);
    public static final WeekDay WEDNESDAY = new WeekDay("Wednesday", 3);
    public static final WeekDay THURSDAY = new WeekDay("Thursday", 4);
    public static final WeekDay FRIDAY = new WeekDay("Friday", 5);
    public static final WeekDay SATURDAY = new WeekDay("Saturday", 6);
    public static final WeekDay SUNDAY = new WeekDay("Sunday", 7);


    private final String dayName;
    private final int dayNum;

    private WeekDay() {
        dayName = "Monday";
        dayNum = 1;
    }

    private WeekDay(String dayName, int dayNum) {
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
